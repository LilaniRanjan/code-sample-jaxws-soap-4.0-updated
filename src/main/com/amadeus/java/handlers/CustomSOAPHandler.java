/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Amadeus s.a.s.
 * Contributor (c) Tiago OLIVEIRA, Amadeus North America Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE * OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
*/

package com.amadeus.java.handlers;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.ws.security.WSConstants;
import org.apache.ws.security.message.WSSecHeader;
import org.apache.ws.security.message.WSSecUsernameToken;
import org.apache.ws.security.util.Base64;
import org.w3c.dom.Document;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amadeus.java.Constants;

/**
 * SOAP Handler used to manage security header and remove optional SOAP headers
 */
public class CustomSOAPHandler implements SOAPHandler<SOAPMessageContext> {

	private static final Logger logger = LogManager.getLogger(CustomSOAPHandler.class);
	private boolean mIsSecurityEnabled = false;

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	@Override
	public void close(MessageContext arg0) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		return true;
	}
	
	public void IsSecurityEnabled(boolean enabled){
		mIsSecurityEnabled = enabled;		
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		if (Boolean.TRUE.equals(context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))) {
			try {
				
				//--
				//-- ADD SECURITY HEADER
				//--
				if (mIsSecurityEnabled)
				{
					BuildSecurityHeader(context, Constants.WSAP_username, Constants.WSAP_password);
				}
				
				//-- REMOVE OPTIONAL SOAP HEADERS
				// See Issue http://java.net/jira/browse/JAX_WS-1079 for further details
				//--
				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();
				Iterator<?> iterator = soapHeader.examineAllHeaderElements();
				QName sessionQName = new QName(
						"http://xml.amadeus.com/2010/06/Session_v3", "Session");
				QName securityQName = new QName(
						"http://xml.amadeus.com/2010/06/Security_v1", "AMA_SecurityHostedUser");
				QName linkQName = new QName(
						"http://wsdl.amadeus.com/2010/06/ws/Link_v1", "TransactionFlowLink");
				for (; iterator.hasNext();) {
					SOAPHeaderElement header = (SOAPHeaderElement) iterator.next();					
					
					if ( !header.hasChildNodes() && (
							header.getElementQName().equals(securityQName)
							|| header.getElementQName().equals(linkQName)
							|| (header.getElementQName().equals(sessionQName)
									&& !header.hasAttribute("TransactionStatusCode"))
						)) {
						logger.debug("Remove " + header.getElementQName().getLocalPart());
						soapHeader.removeChild(header);
					}
				}
				
			} catch (Exception e) {
				System.err.println(e);
				return false;
			}
		}

		return true;
	}
	
	/**
	 * Build the WS-Security SOAP Header
	 * @param context the message context
	 * @throws Exception
	 */
	static private void BuildSecurityHeader(SOAPMessageContext context, String username, String password)
			throws Exception
	{
		// Auto-generate the WS-Security Header using WSS4J
		String passwordEncoded = Base64.encode(MessageDigest.getInstance("SHA-1").digest(password.getBytes()));
		WSSecUsernameToken builder = new WSSecUsernameToken();
        builder.setPasswordType(WSConstants.PASSWORD_DIGEST);
        builder.setPasswordsAreEncoded(true);
        builder.setUserInfo( username, passwordEncoded);        
        Document doc = context.getMessage().getSOAPPart().getEnvelope().getOwnerDocument();
        WSSecHeader secHeader = new WSSecHeader();
        secHeader.insertSecurityHeader(doc);
        builder.build(doc, secHeader);
	}

}
