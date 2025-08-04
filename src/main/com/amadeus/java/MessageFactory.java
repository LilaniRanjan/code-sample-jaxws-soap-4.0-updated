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

import java.text.SimpleDateFormat;
import java.util.Calendar;


import com.amadeus.xml.flireq_07_1_1a.AirFlightInfo;
import com.amadeus.xml.flireq_07_1_1a.AirFlightInfo.GeneralFlightInfo;
import com.amadeus.xml.flireq_07_1_1a.AirFlightInfo.GeneralFlightInfo.CompanyDetails;
import com.amadeus.xml.flireq_07_1_1a.AirFlightInfo.GeneralFlightInfo.FlightDate;
import com.amadeus.xml.flireq_07_1_1a.AirFlightInfo.GeneralFlightInfo.FlightIdentification;

/**
 * Generates the query messages as Java objects.
 */
public class MessageFactory {

	/*
	* Returns an AirFlightInfo object to be serialized into XML.
	* The subsequent serialized XML message will look like this:
	*
	* <Air_FlightInfo>
	* 	<generalFlightInfo>
    *		<flightDate>
    *			<departureDate>161117</departureDate>
    *		</flightDate>
    *		<companyDetails>
    *			<marketingCompany>6X</marketingCompany>
    *		</companyDetails>
    *		<flightIdentification>
    *			<flightNumber>7725</flightNumber>
    *		</flightIdentification>
	* 	</generalFlightInfo>
	* </Air_FlightInfo>
	*
	*/
	public static AirFlightInfo buildFlightRequest() {
		// build <flightDate> group and attach <departureDate> to it
		FlightDate flightDate = new FlightDate();
		SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_WEEK, 7);
		flightDate.setDepartureDate(format.format(date.getTime()));		
		
		// build <companyDetails> group and attach <marketingCompany> to it
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setMarketingCompany("6X");		
		
		// build <flightIdentification> group and attach <flightNumber> to it
		FlightIdentification flightIdentification = new FlightIdentification();
		flightIdentification.setFlightNumber("7725");

		// build <generalFlightInfo> group and attach groups created above to it.
		GeneralFlightInfo generalInfo = new GeneralFlightInfo();
		generalInfo.setFlightDate(flightDate);
		generalInfo.setCompanyDetails(companyDetails);
		generalInfo.setFlightIdentification(flightIdentification);

		// create an AirFlightInfo request from an AirFlightInfo object factory
		com.amadeus.xml.flireq_07_1_1a.ObjectFactory flightInfoObjectFactory = new com.amadeus.xml.flireq_07_1_1a.ObjectFactory();
		AirFlightInfo flightInfo = flightInfoObjectFactory.createAirFlightInfo();

		// attach <generalFlightInfo> group to the AirFlightInfo object created above.
		flightInfo.setGeneralFlightInfo(generalInfo);				

		return flightInfo;				
	}
}
