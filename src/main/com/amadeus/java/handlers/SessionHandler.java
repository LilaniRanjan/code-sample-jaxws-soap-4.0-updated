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

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import com.amadeus.xml._2010._06.session_v3.Session;

/**
 * This class builds the session elements in the SOAP header, and allows to manage sessions 
 */
public class SessionHandler extends HeaderHandler {

	private Holder<Session> mSession;
	private SecurityHandler mSecurity;

	public class TransactionStatusCode {
		public static final int NONE = 0;
		public static final int START = 1;
		public static final int CONTINUE = 2;
		public static final int END = 3;
	}

	public SessionHandler(BindingProvider binding, SecurityHandler h) {
		super(binding);
		mSession = null;
		mSecurity = h;
	}

	public void handleSessionStatus(int transactionStatusCode) {
		switch (transactionStatusCode) {
		case TransactionStatusCode.START:
			startSession();
			break;
		case TransactionStatusCode.CONTINUE:
			continueSession();
			break;
		case TransactionStatusCode.END:
			endSession();
			break;
		case TransactionStatusCode.NONE:
			mSecurity.fill();
			resetSession();
			break;
		default:
			break;
		}
	}

	private void startSession() {
		mSecurity.fill();
		mSession = new Holder<Session>();
		mSession.value = new Session();
		mSession.value.setTransactionStatusCode("Start");
	}

	private void continueSession() {
		mSecurity.reset();
		Integer sequenceNumber = Integer.parseInt(mSession.value
				.getSequenceNumber());
		sequenceNumber++;
		mSession.value.setSequenceNumber(sequenceNumber.toString());
	}

	private void endSession() {
		continueSession();
		mSession.value.setTransactionStatusCode("End");
	}

	private void resetSession() {
		mSession = null;
	}

	public Holder<Session> getSession() {
		return mSession;
	}
	
}
