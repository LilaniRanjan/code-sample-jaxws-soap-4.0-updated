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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Access constant data from a .properties file.
 */
public class Constants {

	private static final Logger logger = LogManager.getLogger(Constants.class);

	private static final String AMADEUS_CONFIG_PROPERTIES_FILENAME = "amadeus.WSAP.configuration.properties";

	public static String WSAP_hostAddress;
	public static String WSAP_name;
	public static String WSAP_username;
	public static String WSAP_password;
	public static String WSAP_agentDutyCode;
	public static String WSAP_requestorType;
	public static String WSAP_POSType;
	public static String WSAP_officeID;
	public static String WSAP_organization;

	public static void init() {
		Properties prop = new Properties();
    	InputStream input = null;

    	try {

    		input = Constants.class.getClassLoader().getResourceAsStream(AMADEUS_CONFIG_PROPERTIES_FILENAME);
    		if(input==null){
    	        logger.error("Unable to access " + AMADEUS_CONFIG_PROPERTIES_FILENAME);
    		    return;
    		}

    		//load a properties file from class path, inside static method
    		prop.load(input);

			WSAP_hostAddress = prop.getProperty("wsap.hostAddress");
			WSAP_name = prop.getProperty("wsap.name");
			WSAP_username = prop.getProperty("wsap.username");
			WSAP_password = prop.getProperty("wsap.password");
			WSAP_agentDutyCode = prop.getProperty("wsap.agentDutyCode");
			WSAP_requestorType = prop.getProperty("wsap.requestorType");
			WSAP_POSType = prop.getProperty("wsap.POSType");
			WSAP_officeID = prop.getProperty("wsap.officeID");
			WSAP_organization = prop.getProperty("wsap.organization");

    	} catch (IOException ex) {
    		logger.error(ex.getStackTrace());
        } finally{
        	if(input!=null){
        		try {
				input.close();
			} catch (IOException e) {
				logger.error(e.getStackTrace());
			}
        	}
        }
	}
}