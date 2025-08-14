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

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.SOAPFaultException;

import com.amadeus.java.MessageFactory;
import com.amadeus.xml.AmadeusWebServices;
import com.amadeus.xml.AmadeusWebServicesPT;
import com.amadeus.xml.flires_07_1_1a.AirFlightInfoReply;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class serializes the query object into XML and sends it via HTTP.
 * It also handles the receiving and deserialization of the XML reply into an object.
 * This class requires special attention as it envelopes most of the HTTP communication
 * between your application and Amadeus backends, so any errors should be properly logged.
 */
public class ServiceHandler {
	private static final Logger logger = LogManager.getLogger(ServiceHandler.class);

	private AmadeusWebServicesPT mPort;
	private SessionHandler mSession;
	private TransactionFlowLinkHandler mLink;
	private SecurityHandler mSecurity;
	private AddressingHandler mAddressing;
	private CustomSOAPHandler mSoapHandler = new CustomSOAPHandler();

	public ServiceHandler(String WSAP) throws Exception {
		AmadeusWebServices proxy = new AmadeusWebServices();
		mPort = proxy.getAmadeusWebServicesPort(new AddressingFeature());
		mSecurity = new SecurityHandler((BindingProvider) mPort, mSoapHandler);
		mSession = new SessionHandler((BindingProvider) mPort, mSecurity);
		mLink = new TransactionFlowLinkHandler((BindingProvider) mPort);
		mAddressing = new AddressingHandler((BindingProvider) mPort, WSAP);

		// Add a handler to manage security header and remove optional SOAP headers
		@SuppressWarnings("rawtypes")
		List<Handler> chain = new ArrayList<Handler>();
		chain.add(mSoapHandler);
		((BindingProvider) mPort).getBinding().setHandlerChain(chain);
		
	}

	public AirFlightInfoReply air_FlightInfo(
			int transactionStatusCode, int linkStatusCode) throws Exception {
		mSession.handleSessionStatus(transactionStatusCode);
		mLink.handleLinkAction(linkStatusCode);
		mAddressing.update();

		AirFlightInfoReply reply = null;
		try {
			reply = mPort.airFlightInfo(MessageFactory.buildFlightRequest(),
				mSession.getSession(), mLink.getLink(), mSecurity.getHostedUser());
			// Please take the time to create a logging layer in your application so you
			// can log any SOAP or applications faults your application might encounter.
			// Logging errors and timestamps is critical for sucessful problem
			// investigation and troubleshooting by the Amadeus Helpdesk team.
                        
                        System.out.println(reply.toString());
		} catch (SOAPFaultException soapFault) {
			logger.error(soapFault.toString());
			throw new Exception("AirFlightInfo call failed due to SOAP fault.");
		} catch (Throwable t) {
			logger.error(t.toString());
			throw new Exception("AirFlightInfo call failed due to unknown error.");
		}

		return reply;
	}
	
	public void setWSAP(String WSAP) {
		mAddressing.setWSAP(WSAP);
	}
	public String getWSAP() {
		return mAddressing.getWSAP();
	}

}
