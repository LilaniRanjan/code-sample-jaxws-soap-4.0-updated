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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.ws.BindingProvider;
import org.iata.iata._2007._00.iata2010.CompanyNameType;
import org.iata.iata._2007._00.iata2010.UniqueIDType;

import com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser;
import com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser.UserID;

import com.amadeus.java.Constants;

/**
 * This class builds the OASIS security and Amadeus hostedUser elements in the SOAP header.
 * These elements are used for authentication and officeID / pseudoCityCode identification.
 */
public class SecurityHandler extends HeaderHandler {

	/**
	 * <code>AMA_SecurityHostedUser</code> header
	 */
	private AMASecurityHostedUser mHostedUser;
	private CustomSOAPHandler mSoapHandler;

	private static final Logger logger = LogManager
			.getLogger(SecurityHandler.class);

	/**
	 * Default constructor
	 * @param binding
	 * @param soapHandler
	 */
	public SecurityHandler(BindingProvider binding, CustomSOAPHandler soapHandler) {
		super(binding);
		mSoapHandler = soapHandler;
	}

	/**
	 * Fills the security headers
	 * <p>
	 * Adds the WS-Security header according to the policy and sets the
	 * <code>AMA_SecurityHostedUser</code> with the relevant values.
	 */
	public void fill() {
		addWSSecurity();
		setHostedUser();
	}

	/**
	 * Removes all the security headers
	 */
	public void reset() {
		mHostedUser = null;
		removeWSSecurity();
	}

	private void removeWSSecurity() {
		logger.debug("Remove WS-Security");
		mSoapHandler.IsSecurityEnabled(false);
	}

	private void addWSSecurity() {
		logger.debug("Add WS-Security");
		mSoapHandler.IsSecurityEnabled(true);
	}

	/**
	 * Adds the <code>AMA_SecurityHostedUser</code> header to the outgoing
	 * message.
	 * <p>
	 * Sets the following values:
	 * <ul>
	 * <li><b>Office ID</b> in the <code>PseudoCityCode</code> attribute</li>
	 * <li><b>Duty code</b> in the <code>AgentDutyCode</code> attribute</li>
	 * <li><b>RequestorType</b> to "U" as the LSS user is used</li>
	 * <li><b>Organization</b> in the <code>CompanyName</code> element</li>
	 * </ul>
	 */
	private void setHostedUser() {
		logger.debug("Set Security hosted user");
		com.amadeus.xml._2010._06.security_v1.ObjectFactory securityFactory = new com.amadeus.xml._2010._06.security_v1.ObjectFactory();
		mHostedUser = securityFactory.createAMASecurityHostedUser();
		UserID userId = securityFactory.createAMASecurityHostedUserUserID();
		userId.setAgentDutyCode(Constants.WSAP_agentDutyCode);
		userId.setRequestorType(Constants.WSAP_requestorType);
		userId.setPOSType(Constants.WSAP_POSType);
		userId.setPseudoCityCode(Constants.WSAP_officeID);
		org.iata.iata._2007._00.iata2010.ObjectFactory iataFactory = new org.iata.iata._2007._00.iata2010.ObjectFactory();
		UniqueIDType uniqueId = iataFactory.createUniqueIDType();
		CompanyNameType organization = iataFactory.createCompanyNameType();
		organization.setValue(Constants.WSAP_organization);
		uniqueId.setCompanyName(organization);
		userId.setRequestorID(uniqueId);
		mHostedUser.setUserID(userId);
	}

	/**
	 * Returns the container for <code>AMA_SecurityHostedUser</code> header
	 */
	public AMASecurityHostedUser getHostedUser() {
		return mHostedUser;
	}

}
