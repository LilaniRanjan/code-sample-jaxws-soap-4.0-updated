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

import java.util.Map;
import javax.xml.ws.BindingProvider;

import com.amadeus.java.Constants;

/**
 * This class allows to dynamically change the SAP, or to override the one defined into the wsdl
 */
public class AddressingHandler extends HeaderHandler {
	
	private String mWSAP;
	private String mAddress;	
	
	public AddressingHandler(BindingProvider binding, 
			String WSAP) {
		super(binding);
		mWSAP = WSAP;
		mAddress = Constants.WSAP_hostAddress;
		if(mAddress == null || mAddress.length() == 0) {
			mAddress =  (String) binding.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
			// remove the default wsap from address
			mAddress = mAddress.substring(0, mAddress.lastIndexOf('/'));
		}
	}

	public void setWSAP(String WSAP) {
		mWSAP = WSAP;
	}
	
	public String getWSAP() {
		return mWSAP;
	}

	public void update() {
		setWSAP();		
	}

	private void setWSAP() {
		Map<String, Object> context = mClient.getRequestContext();
		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, mAddress + "/" + mWSAP);
	}

}
