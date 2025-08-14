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

import java.util.UUID;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amadeus.wsdl._2010._06.ws.link_v1.ConsumerType;
import com.amadeus.wsdl._2010._06.ws.link_v1.TransactionFlowLinkType;

/**
 * Manage Transaction Flow Link
 */
public class TransactionFlowLinkHandler extends HeaderHandler {

	private Holder<TransactionFlowLinkType> mLink;

	private static final Logger logger = LogManager
			.getLogger(TransactionFlowLinkHandler.class);

	public class TransactionFlowLinkAction {
		public static final int NONE = 0;
		public static final int NEW = 1;
		public static final int FOLLOW_UP = 2;
		public static final int RESET = 3;
	}

	public TransactionFlowLinkHandler(BindingProvider binding) {
		super(binding);
		mLink = new Holder<TransactionFlowLinkType>();
	}

	public void handleLinkAction(int linkAction) {
		switch (linkAction) {
		case TransactionFlowLinkAction.NEW:
			newLink();
			break;
		case TransactionFlowLinkAction.FOLLOW_UP:
			followUpLink();
			break;
		case TransactionFlowLinkAction.RESET:
			resetLink();
			break;
		case TransactionFlowLinkAction.NONE:
			noLink();
			break;
		default:
			break;
		}

	}

	private void newLink() {
		logger.debug("New link");
		mLink.value = new TransactionFlowLinkType();
		ConsumerType consumer = new ConsumerType();
		consumer.setUniqueID(UUID.randomUUID().toString());
		mLink.value.setConsumer(consumer);
	}

	private void followUpLink() {
		logger.debug("Follow-up link");
		// Nothing to do
	}

	private void resetLink() {
		logger.debug("Reset link");
		mLink.value.setReceiver(null);
	}
	
	private void noLink() {
		logger.debug("No link");
		mLink.value = null;
	}

	public Holder<TransactionFlowLinkType> getLink() {
		return mLink;
	}

}
