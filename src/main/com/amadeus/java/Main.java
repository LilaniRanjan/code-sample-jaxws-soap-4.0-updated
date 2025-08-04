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

package com.amadeus.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amadeus.java.handlers.ServiceHandler;
import com.amadeus.java.handlers.SessionHandler.TransactionStatusCode;
import com.amadeus.java.handlers.TransactionFlowLinkHandler.TransactionFlowLinkAction;

/**
 * This class contains the main method for Java execution.
 * It also contains an example flow showing message exchanges with
 * Amadeus using different session and transaction flow link settings.
 */
public class Main {
	
	private final static Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		
		/*
		 * Show XML requests and responses :
		 * Add a VM argument according to your JDK version:
		 *
		 * JDK 1.7: 
		 * -Dcom.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump="true"
		 * JDK 1.8: 
		 * -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump="true"
		 *
		 * or uncomment one of the lines below according to your JDK version :
		 */
		
		// JDK 1.7
		// com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump=true;
		
		// JDK 1.8
		// com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true;
		
		try {
			Constants.init();
		} catch(Throwable t) {
			logger.error("Failed setup due to: " + t.toString());
			return;
		}
		try {
			// TLSv1.2 is used by default in JDK 1.8, but not in JDK <= 1.7
			System.setProperty("https.protocols", "TLSv1.2");
			RunExample();
		} catch(Throwable t) {
			logger.error("Failed execution due to: " + t.toString());
			return;
		}
		System.exit(0);
	}
	
	public static void RunExample() throws Exception {
		
		// WSAP in SOAP header
		ServiceHandler serviceHandler = new ServiceHandler(Constants.WSAP_name);

		// Stateless call
		logger.info("Stateless call");
		serviceHandler.air_FlightInfo(TransactionStatusCode.NONE, TransactionFlowLinkAction.NONE);
                
		
		// Stateful call
		logger.info("Stateful call");
		serviceHandler.air_FlightInfo(TransactionStatusCode.START, TransactionFlowLinkAction.NONE);
		serviceHandler.air_FlightInfo(TransactionStatusCode.CONTINUE, TransactionFlowLinkAction.NONE);
		serviceHandler.air_FlightInfo(TransactionStatusCode.END, TransactionFlowLinkAction.NONE);
		
		// Link usage over stateless
		logger.info("Link usage over stateless");
		serviceHandler.air_FlightInfo(TransactionStatusCode.NONE, TransactionFlowLinkAction.NEW);
		serviceHandler.air_FlightInfo(TransactionStatusCode.NONE, TransactionFlowLinkAction.FOLLOW_UP);
		serviceHandler.air_FlightInfo(TransactionStatusCode.NONE, TransactionFlowLinkAction.RESET);

		// Link usage over stateful
		logger.info("Link usage over statefull");
		serviceHandler.air_FlightInfo(TransactionStatusCode.START, TransactionFlowLinkAction.NEW);	
		serviceHandler.air_FlightInfo(TransactionStatusCode.END, TransactionFlowLinkAction.FOLLOW_UP);
		serviceHandler.air_FlightInfo(TransactionStatusCode.START, TransactionFlowLinkAction.FOLLOW_UP);
		serviceHandler.air_FlightInfo(TransactionStatusCode.END, TransactionFlowLinkAction.FOLLOW_UP);
		
		// Link usage over stateful
		logger.info("Link usage over stateless and stateful");
		serviceHandler.air_FlightInfo(TransactionStatusCode.NONE, TransactionFlowLinkAction.NEW);
		serviceHandler.air_FlightInfo(TransactionStatusCode.START, TransactionFlowLinkAction.FOLLOW_UP);
		serviceHandler.air_FlightInfo(TransactionStatusCode.END, TransactionFlowLinkAction.FOLLOW_UP);

		logger.info("Done.");	
		
	}

}
