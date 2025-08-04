
package com.amadeus.xml.fmptbq_24_6_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfUnit" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumberOfUnitsType" minOccurs="0"/>
 *         &lt;element name="globalOptions" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AttributeType" minOccurs="0"/>
 *         &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravellerReferenceInformationType_230874S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="passengerRange" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}RangeDetailsType" minOccurs="0"/>
 *         &lt;element name="customerRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ConsumerReferenceInformationType" minOccurs="0"/>
 *         &lt;element name="searchOptions" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AttributeListType" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="carbonEmissionBySourceDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CarbonEmissionSourceDetailType" minOccurs="0"/>
 *         &lt;element name="formOfPaymentByPassenger" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FOPRepresentationType" maxOccurs="60" minOccurs="0"/>
 *         &lt;element name="solutionFamily" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareInformationType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="passengerInfoGrp" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}GroupPassengerDetailsType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="fareFamilies" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="familyInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyType_80157S"/>
 *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                   &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
 *                             &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherPossibleCriteria" maxOccurs="20" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="logicalLink" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BooleanExpressionRuleType"/>
 *                             &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                             &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
 *                                       &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fareOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PricingTicketingDetailsType"/>
 *                   &lt;element name="corporate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CorporateIdentificationType" maxOccurs="20" minOccurs="0"/>
 *                   &lt;element name="ticketingPriceScheme" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TicketingPriceSchemeType" minOccurs="0"/>
 *                   &lt;element name="feeIdDescription" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CodedAttributeType_231453S" minOccurs="0"/>
 *                   &lt;element name="conversionRate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ConversionRateType" minOccurs="0"/>
 *                   &lt;element name="formOfPayment" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FormOfPaymentTypeI" minOccurs="0"/>
 *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FrequentTravellerIdentificationCodeType_223709S" minOccurs="0"/>
 *                   &lt;element name="monetaryCabinInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryAndCabinInformationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TaxType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="travelFlightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType_231130S" minOccurs="0"/>
 *         &lt;element name="valueSearch" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ValueSearchCriteriaType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="buckets" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bucketInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BucketInformationType"/>
 *                   &lt;element name="bucketDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BucketDetailsType" maxOccurs="15" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itinerary" maxOccurs="18" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
 *                   &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DepartureLocationType" minOccurs="0"/>
 *                   &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ArrivalLocalizationType" minOccurs="0"/>
 *                   &lt;element name="timeDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType_181295S" minOccurs="0"/>
 *                   &lt;element name="flightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType_231131S" minOccurs="0"/>
 *                   &lt;element name="familyInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyType" minOccurs="0"/>
 *                   &lt;element name="valueSearch" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ValueSearchCriteriaType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="groupOfFlights" maxOccurs="1000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
 *                             &lt;element name="distributionMethod" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MethodType" minOccurs="0"/>
 *                             &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
 *                             &lt;element name="flightDetails" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
 *                                       &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
 *                                       &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
 *                                       &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType_78540S" minOccurs="0"/>
 *                                       &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
 *                                       &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightInfoPNR" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travelResponseDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductInformationTypeI"/>
 *                             &lt;element name="timeTableDate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *                             &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI_78514S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="codeshareData" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
 *                             &lt;element name="disclosure" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FreeTextInformationType" minOccurs="0"/>
 *                             &lt;element name="stopDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}RoutingInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="trafficRestrictionData" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TrafficRestrictionTypeI" minOccurs="0"/>
 *                             &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
 *                             &lt;element name="incidentalStopInfo" maxOccurs="8" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationTypeI"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType_232221S" maxOccurs="6" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="requestedSegmentAction" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ActionIdentificationType" minOccurs="0"/>
 *                   &lt;element name="attributes" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CodedAttributeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itineraryGroup" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itineraryId" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelItineraryInformationTypeI"/>
 *                   &lt;element name="itinerary" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
 *                             &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DepartureLocationType" minOccurs="0"/>
 *                             &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ArrivalLocalizationType" minOccurs="0"/>
 *                             &lt;element name="timeDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType_181295S" minOccurs="0"/>
 *                             &lt;element name="groupOfFlights" maxOccurs="50" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
 *                                       &lt;element name="flightDetails" maxOccurs="4">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
 *                                                 &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
 *                                                 &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="travelSolution" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType_215731S" maxOccurs="50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ticketChangeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ticketNumberDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TicketNumberTypeI"/>
 *                   &lt;element name="ticketRequestedSegments" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="actionIdentification" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ActionIdentificationType"/>
 *                             &lt;element name="connectPointDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ConnectionTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="combinationFareFamilies" maxOccurs="2000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemFFCNumber" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ItemNumberType_80330S"/>
 *                   &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
 *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType" maxOccurs="6" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="feeOption" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SelectionDetailsType"/>
 *                   &lt;element name="rateTax" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType_80162S" minOccurs="0"/>
 *                   &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="feeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecificDataInformationType"/>
 *                             &lt;element name="associatedAmounts" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="feeDescriptionGrp" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ItemNumberType_80866S"/>
 *                                       &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AttributeType_61377S" minOccurs="0"/>
 *                                       &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stakeholder" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}Stakeholder" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="officeIdDetails" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}UserIdentificationType"/>
 *                   &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
 *                   &lt;element name="uidOption" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CodedAttributeType_78500S" minOccurs="0"/>
 *                   &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PricingTicketingDetailsType" minOccurs="0"/>
 *                   &lt;element name="corporateFareInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CorporateFareInformationType" minOccurs="0"/>
 *                   &lt;element name="travelFlightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType" minOccurs="0"/>
 *                   &lt;element name="airlineDistributionDetails" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
 *                             &lt;element name="flightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ndcQueryParameters" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}GroupType_369602G" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberOfUnit",
    "globalOptions",
    "paxReference",
    "passengerRange",
    "customerRef",
    "searchOptions",
    "carbonEmissionBySourceDetails",
    "formOfPaymentByPassenger",
    "solutionFamily",
    "passengerInfoGrp",
    "fareFamilies",
    "fareOptions",
    "priceToBeat",
    "taxInfo",
    "travelFlightInfo",
    "valueSearch",
    "buckets",
    "itinerary",
    "itineraryGroup",
    "ticketChangeInfo",
    "combinationFareFamilies",
    "feeOption",
    "stakeholder",
    "officeIdDetails",
    "ndcQueryParameters"
})
@XmlRootElement(name = "Fare_MasterPricerTravelBoardSearch")
public class FareMasterPricerTravelBoardSearch {

    protected NumberOfUnitsType numberOfUnit;
    protected AttributeType globalOptions;
    protected List<TravellerReferenceInformationType230874S> paxReference;
    protected RangeDetailsType passengerRange;
    protected ConsumerReferenceInformationType customerRef;
    protected List<AttributeListType> searchOptions;
    protected CarbonEmissionSourceDetailType carbonEmissionBySourceDetails;
    protected List<FOPRepresentationType> formOfPaymentByPassenger;
    protected List<FareInformationType> solutionFamily;
    protected List<GroupPassengerDetailsType> passengerInfoGrp;
    protected List<FareMasterPricerTravelBoardSearch.FareFamilies> fareFamilies;
    protected FareMasterPricerTravelBoardSearch.FareOptions fareOptions;
    protected MonetaryInformationType priceToBeat;
    protected List<TaxType> taxInfo;
    protected TravelFlightInformationType231130S travelFlightInfo;
    protected List<ValueSearchCriteriaType> valueSearch;
    protected List<FareMasterPricerTravelBoardSearch.Buckets> buckets;
    protected List<FareMasterPricerTravelBoardSearch.Itinerary> itinerary;
    protected List<FareMasterPricerTravelBoardSearch.ItineraryGroup> itineraryGroup;
    protected FareMasterPricerTravelBoardSearch.TicketChangeInfo ticketChangeInfo;
    protected List<FareMasterPricerTravelBoardSearch.CombinationFareFamilies> combinationFareFamilies;
    protected List<FareMasterPricerTravelBoardSearch.FeeOption> feeOption;
    protected List<Stakeholder> stakeholder;
    protected List<FareMasterPricerTravelBoardSearch.OfficeIdDetails> officeIdDetails;
    protected GroupType369602G ndcQueryParameters;

    /**
     * Gets the value of the numberOfUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getNumberOfUnit() {
        return numberOfUnit;
    }

    /**
     * Sets the value of the numberOfUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setNumberOfUnit(NumberOfUnitsType value) {
        this.numberOfUnit = value;
    }

    /**
     * Gets the value of the globalOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getGlobalOptions() {
        return globalOptions;
    }

    /**
     * Sets the value of the globalOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setGlobalOptions(AttributeType value) {
        this.globalOptions = value;
    }

    /**
     * Gets the value of the paxReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerReferenceInformationType230874S }
     * 
     * 
     */
    public List<TravellerReferenceInformationType230874S> getPaxReference() {
        if (paxReference == null) {
            paxReference = new ArrayList<TravellerReferenceInformationType230874S>();
        }
        return this.paxReference;
    }

    /**
     * Gets the value of the passengerRange property.
     * 
     * @return
     *     possible object is
     *     {@link RangeDetailsType }
     *     
     */
    public RangeDetailsType getPassengerRange() {
        return passengerRange;
    }

    /**
     * Sets the value of the passengerRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeDetailsType }
     *     
     */
    public void setPassengerRange(RangeDetailsType value) {
        this.passengerRange = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerReferenceInformationType }
     *     
     */
    public ConsumerReferenceInformationType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerReferenceInformationType }
     *     
     */
    public void setCustomerRef(ConsumerReferenceInformationType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeListType }
     * 
     * 
     */
    public List<AttributeListType> getSearchOptions() {
        if (searchOptions == null) {
            searchOptions = new ArrayList<AttributeListType>();
        }
        return this.searchOptions;
    }

    /**
     * Gets the value of the carbonEmissionBySourceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CarbonEmissionSourceDetailType }
     *     
     */
    public CarbonEmissionSourceDetailType getCarbonEmissionBySourceDetails() {
        return carbonEmissionBySourceDetails;
    }

    /**
     * Sets the value of the carbonEmissionBySourceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarbonEmissionSourceDetailType }
     *     
     */
    public void setCarbonEmissionBySourceDetails(CarbonEmissionSourceDetailType value) {
        this.carbonEmissionBySourceDetails = value;
    }

    /**
     * Gets the value of the formOfPaymentByPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPaymentByPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPaymentByPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOPRepresentationType }
     * 
     * 
     */
    public List<FOPRepresentationType> getFormOfPaymentByPassenger() {
        if (formOfPaymentByPassenger == null) {
            formOfPaymentByPassenger = new ArrayList<FOPRepresentationType>();
        }
        return this.formOfPaymentByPassenger;
    }

    /**
     * Gets the value of the solutionFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solutionFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolutionFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInformationType }
     * 
     * 
     */
    public List<FareInformationType> getSolutionFamily() {
        if (solutionFamily == null) {
            solutionFamily = new ArrayList<FareInformationType>();
        }
        return this.solutionFamily;
    }

    /**
     * Gets the value of the passengerInfoGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfoGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfoGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupPassengerDetailsType }
     * 
     * 
     */
    public List<GroupPassengerDetailsType> getPassengerInfoGrp() {
        if (passengerInfoGrp == null) {
            passengerInfoGrp = new ArrayList<GroupPassengerDetailsType>();
        }
        return this.passengerInfoGrp;
    }

    /**
     * Gets the value of the fareFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.FareFamilies }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.FareFamilies> getFareFamilies() {
        if (fareFamilies == null) {
            fareFamilies = new ArrayList<FareMasterPricerTravelBoardSearch.FareFamilies>();
        }
        return this.fareFamilies;
    }

    /**
     * Gets the value of the fareOptions property.
     * 
     * @return
     *     possible object is
     *     {@link FareMasterPricerTravelBoardSearch.FareOptions }
     *     
     */
    public FareMasterPricerTravelBoardSearch.FareOptions getFareOptions() {
        return fareOptions;
    }

    /**
     * Sets the value of the fareOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareMasterPricerTravelBoardSearch.FareOptions }
     *     
     */
    public void setFareOptions(FareMasterPricerTravelBoardSearch.FareOptions value) {
        this.fareOptions = value;
    }

    /**
     * Gets the value of the priceToBeat property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getPriceToBeat() {
        return priceToBeat;
    }

    /**
     * Sets the value of the priceToBeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setPriceToBeat(MonetaryInformationType value) {
        this.priceToBeat = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TaxType>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the travelFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelFlightInformationType231130S }
     *     
     */
    public TravelFlightInformationType231130S getTravelFlightInfo() {
        return travelFlightInfo;
    }

    /**
     * Sets the value of the travelFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelFlightInformationType231130S }
     *     
     */
    public void setTravelFlightInfo(TravelFlightInformationType231130S value) {
        this.travelFlightInfo = value;
    }

    /**
     * Gets the value of the valueSearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueSearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueSearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSearchCriteriaType }
     * 
     * 
     */
    public List<ValueSearchCriteriaType> getValueSearch() {
        if (valueSearch == null) {
            valueSearch = new ArrayList<ValueSearchCriteriaType>();
        }
        return this.valueSearch;
    }

    /**
     * Gets the value of the buckets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buckets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuckets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.Buckets }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.Buckets> getBuckets() {
        if (buckets == null) {
            buckets = new ArrayList<FareMasterPricerTravelBoardSearch.Buckets>();
        }
        return this.buckets;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.Itinerary }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.Itinerary> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<FareMasterPricerTravelBoardSearch.Itinerary>();
        }
        return this.itinerary;
    }

    /**
     * Gets the value of the itineraryGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.ItineraryGroup }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.ItineraryGroup> getItineraryGroup() {
        if (itineraryGroup == null) {
            itineraryGroup = new ArrayList<FareMasterPricerTravelBoardSearch.ItineraryGroup>();
        }
        return this.itineraryGroup;
    }

    /**
     * Gets the value of the ticketChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareMasterPricerTravelBoardSearch.TicketChangeInfo }
     *     
     */
    public FareMasterPricerTravelBoardSearch.TicketChangeInfo getTicketChangeInfo() {
        return ticketChangeInfo;
    }

    /**
     * Sets the value of the ticketChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareMasterPricerTravelBoardSearch.TicketChangeInfo }
     *     
     */
    public void setTicketChangeInfo(FareMasterPricerTravelBoardSearch.TicketChangeInfo value) {
        this.ticketChangeInfo = value;
    }

    /**
     * Gets the value of the combinationFareFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinationFareFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinationFareFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.CombinationFareFamilies }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.CombinationFareFamilies> getCombinationFareFamilies() {
        if (combinationFareFamilies == null) {
            combinationFareFamilies = new ArrayList<FareMasterPricerTravelBoardSearch.CombinationFareFamilies>();
        }
        return this.combinationFareFamilies;
    }

    /**
     * Gets the value of the feeOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.FeeOption }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.FeeOption> getFeeOption() {
        if (feeOption == null) {
            feeOption = new ArrayList<FareMasterPricerTravelBoardSearch.FeeOption>();
        }
        return this.feeOption;
    }

    /**
     * Gets the value of the stakeholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stakeholder }
     * 
     * 
     */
    public List<Stakeholder> getStakeholder() {
        if (stakeholder == null) {
            stakeholder = new ArrayList<Stakeholder>();
        }
        return this.stakeholder;
    }

    /**
     * Gets the value of the officeIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearch.OfficeIdDetails }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearch.OfficeIdDetails> getOfficeIdDetails() {
        if (officeIdDetails == null) {
            officeIdDetails = new ArrayList<FareMasterPricerTravelBoardSearch.OfficeIdDetails>();
        }
        return this.officeIdDetails;
    }

    /**
     * Gets the value of the ndcQueryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType369602G }
     *     
     */
    public GroupType369602G getNdcQueryParameters() {
        return ndcQueryParameters;
    }

    /**
     * Sets the value of the ndcQueryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType369602G }
     *     
     */
    public void setNdcQueryParameters(GroupType369602G value) {
        this.ndcQueryParameters = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="bucketInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BucketInformationType"/>
     *         &lt;element name="bucketDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BucketDetailsType" maxOccurs="15" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bucketInfo",
        "bucketDetails"
    })
    public static class Buckets {

        @XmlElement(required = true)
        protected BucketInformationType bucketInfo;
        protected List<BucketDetailsType> bucketDetails;

        /**
         * Gets the value of the bucketInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BucketInformationType }
         *     
         */
        public BucketInformationType getBucketInfo() {
            return bucketInfo;
        }

        /**
         * Sets the value of the bucketInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BucketInformationType }
         *     
         */
        public void setBucketInfo(BucketInformationType value) {
            this.bucketInfo = value;
        }

        /**
         * Gets the value of the bucketDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bucketDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBucketDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BucketDetailsType }
         * 
         * 
         */
        public List<BucketDetailsType> getBucketDetails() {
            if (bucketDetails == null) {
                bucketDetails = new ArrayList<BucketDetailsType>();
            }
            return this.bucketDetails;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="itemFFCNumber" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ItemNumberType_80330S"/>
     *         &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
     *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType" maxOccurs="6" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemFFCNumber",
        "nbOfUnits",
        "referenceInfo"
    })
    public static class CombinationFareFamilies {

        @XmlElement(required = true)
        protected ItemNumberType80330S itemFFCNumber;
        protected NumberOfUnitsType80154S nbOfUnits;
        protected List<ReferenceInfoType> referenceInfo;

        /**
         * Gets the value of the itemFFCNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ItemNumberType80330S }
         *     
         */
        public ItemNumberType80330S getItemFFCNumber() {
            return itemFFCNumber;
        }

        /**
         * Sets the value of the itemFFCNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemNumberType80330S }
         *     
         */
        public void setItemFFCNumber(ItemNumberType80330S value) {
            this.itemFFCNumber = value;
        }

        /**
         * Gets the value of the nbOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public NumberOfUnitsType80154S getNbOfUnits() {
            return nbOfUnits;
        }

        /**
         * Sets the value of the nbOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public void setNbOfUnits(NumberOfUnitsType80154S value) {
            this.nbOfUnits = value;
        }

        /**
         * Gets the value of the referenceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referenceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferenceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType }
         * 
         * 
         */
        public List<ReferenceInfoType> getReferenceInfo() {
            if (referenceInfo == null) {
                referenceInfo = new ArrayList<ReferenceInfoType>();
            }
            return this.referenceInfo;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="familyInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyType_80157S"/>
     *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *         &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
     *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherPossibleCriteria" maxOccurs="20" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="logicalLink" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BooleanExpressionRuleType"/>
     *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *                   &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
     *                             &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "familyInformation",
        "familyCriteria",
        "fareFamilySegment",
        "otherPossibleCriteria"
    })
    public static class FareFamilies {

        @XmlElement(required = true)
        protected FareFamilyType80157S familyInformation;
        protected FareFamilyCriteriaType familyCriteria;
        protected List<FareMasterPricerTravelBoardSearch.FareFamilies.FareFamilySegment> fareFamilySegment;
        protected List<FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria> otherPossibleCriteria;

        /**
         * Gets the value of the familyInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FareFamilyType80157S }
         *     
         */
        public FareFamilyType80157S getFamilyInformation() {
            return familyInformation;
        }

        /**
         * Sets the value of the familyInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFamilyType80157S }
         *     
         */
        public void setFamilyInformation(FareFamilyType80157S value) {
            this.familyInformation = value;
        }

        /**
         * Gets the value of the familyCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link FareFamilyCriteriaType }
         *     
         */
        public FareFamilyCriteriaType getFamilyCriteria() {
            return familyCriteria;
        }

        /**
         * Sets the value of the familyCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFamilyCriteriaType }
         *     
         */
        public void setFamilyCriteria(FareFamilyCriteriaType value) {
            this.familyCriteria = value;
        }

        /**
         * Gets the value of the fareFamilySegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareFamilySegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareFamilySegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.FareFamilies.FareFamilySegment }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.FareFamilies.FareFamilySegment> getFareFamilySegment() {
            if (fareFamilySegment == null) {
                fareFamilySegment = new ArrayList<FareMasterPricerTravelBoardSearch.FareFamilies.FareFamilySegment>();
            }
            return this.fareFamilySegment;
        }

        /**
         * Gets the value of the otherPossibleCriteria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherPossibleCriteria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherPossibleCriteria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria> getOtherPossibleCriteria() {
            if (otherPossibleCriteria == null) {
                otherPossibleCriteria = new ArrayList<FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria>();
            }
            return this.otherPossibleCriteria;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
         *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "referenceInfo",
            "familyCriteria"
        })
        public static class FareFamilySegment {

            @XmlElement(required = true)
            protected ReferenceInfoType referenceInfo;
            protected FareFamilyCriteriaType familyCriteria;

            /**
             * Gets the value of the referenceInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceInfo() {
                return referenceInfo;
            }

            /**
             * Sets the value of the referenceInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceInfo(ReferenceInfoType value) {
                this.referenceInfo = value;
            }

            /**
             * Gets the value of the familyCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public FareFamilyCriteriaType getFamilyCriteria() {
                return familyCriteria;
            }

            /**
             * Sets the value of the familyCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public void setFamilyCriteria(FareFamilyCriteriaType value) {
                this.familyCriteria = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="logicalLink" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}BooleanExpressionRuleType"/>
         *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
         *         &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
         *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "logicalLink",
            "familyCriteria",
            "fareFamilySegment"
        })
        public static class OtherPossibleCriteria {

            @XmlElement(required = true)
            protected BooleanExpressionRuleType logicalLink;
            protected FareFamilyCriteriaType familyCriteria;
            protected List<FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria.FareFamilySegment> fareFamilySegment;

            /**
             * Gets the value of the logicalLink property.
             * 
             * @return
             *     possible object is
             *     {@link BooleanExpressionRuleType }
             *     
             */
            public BooleanExpressionRuleType getLogicalLink() {
                return logicalLink;
            }

            /**
             * Sets the value of the logicalLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link BooleanExpressionRuleType }
             *     
             */
            public void setLogicalLink(BooleanExpressionRuleType value) {
                this.logicalLink = value;
            }

            /**
             * Gets the value of the familyCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public FareFamilyCriteriaType getFamilyCriteria() {
                return familyCriteria;
            }

            /**
             * Sets the value of the familyCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public void setFamilyCriteria(FareFamilyCriteriaType value) {
                this.familyCriteria = value;
            }

            /**
             * Gets the value of the fareFamilySegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareFamilySegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareFamilySegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria.FareFamilySegment }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria.FareFamilySegment> getFareFamilySegment() {
                if (fareFamilySegment == null) {
                    fareFamilySegment = new ArrayList<FareMasterPricerTravelBoardSearch.FareFamilies.OtherPossibleCriteria.FareFamilySegment>();
                }
                return this.fareFamilySegment;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType"/>
             *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyCriteriaType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "referenceInfo",
                "familyCriteria"
            })
            public static class FareFamilySegment {

                @XmlElement(required = true)
                protected ReferenceInfoType referenceInfo;
                protected FareFamilyCriteriaType familyCriteria;

                /**
                 * Gets the value of the referenceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType }
                 *     
                 */
                public ReferenceInfoType getReferenceInfo() {
                    return referenceInfo;
                }

                /**
                 * Sets the value of the referenceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType }
                 *     
                 */
                public void setReferenceInfo(ReferenceInfoType value) {
                    this.referenceInfo = value;
                }

                /**
                 * Gets the value of the familyCriteria property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareFamilyCriteriaType }
                 *     
                 */
                public FareFamilyCriteriaType getFamilyCriteria() {
                    return familyCriteria;
                }

                /**
                 * Sets the value of the familyCriteria property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareFamilyCriteriaType }
                 *     
                 */
                public void setFamilyCriteria(FareFamilyCriteriaType value) {
                    this.familyCriteria = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PricingTicketingDetailsType"/>
     *         &lt;element name="corporate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CorporateIdentificationType" maxOccurs="20" minOccurs="0"/>
     *         &lt;element name="ticketingPriceScheme" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TicketingPriceSchemeType" minOccurs="0"/>
     *         &lt;element name="feeIdDescription" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CodedAttributeType_231453S" minOccurs="0"/>
     *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ConversionRateType" minOccurs="0"/>
     *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FormOfPaymentTypeI" minOccurs="0"/>
     *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FrequentTravellerIdentificationCodeType_223709S" minOccurs="0"/>
     *         &lt;element name="monetaryCabinInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryAndCabinInformationType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricingTickInfo",
        "corporate",
        "ticketingPriceScheme",
        "feeIdDescription",
        "conversionRate",
        "formOfPayment",
        "frequentTravellerInfo",
        "monetaryCabinInfo"
    })
    public static class FareOptions {

        @XmlElement(required = true)
        protected PricingTicketingDetailsType pricingTickInfo;
        protected List<CorporateIdentificationType> corporate;
        protected TicketingPriceSchemeType ticketingPriceScheme;
        protected CodedAttributeType231453S feeIdDescription;
        protected ConversionRateType conversionRate;
        protected FormOfPaymentTypeI formOfPayment;
        protected FrequentTravellerIdentificationCodeType223709S frequentTravellerInfo;
        protected MonetaryAndCabinInformationType monetaryCabinInfo;

        /**
         * Gets the value of the pricingTickInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingTickInfo() {
            return pricingTickInfo;
        }

        /**
         * Sets the value of the pricingTickInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingTickInfo(PricingTicketingDetailsType value) {
            this.pricingTickInfo = value;
        }

        /**
         * Gets the value of the corporate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corporate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorporate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateIdentificationType }
         * 
         * 
         */
        public List<CorporateIdentificationType> getCorporate() {
            if (corporate == null) {
                corporate = new ArrayList<CorporateIdentificationType>();
            }
            return this.corporate;
        }

        /**
         * Gets the value of the ticketingPriceScheme property.
         * 
         * @return
         *     possible object is
         *     {@link TicketingPriceSchemeType }
         *     
         */
        public TicketingPriceSchemeType getTicketingPriceScheme() {
            return ticketingPriceScheme;
        }

        /**
         * Sets the value of the ticketingPriceScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingPriceSchemeType }
         *     
         */
        public void setTicketingPriceScheme(TicketingPriceSchemeType value) {
            this.ticketingPriceScheme = value;
        }

        /**
         * Gets the value of the feeIdDescription property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType231453S }
         *     
         */
        public CodedAttributeType231453S getFeeIdDescription() {
            return feeIdDescription;
        }

        /**
         * Sets the value of the feeIdDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType231453S }
         *     
         */
        public void setFeeIdDescription(CodedAttributeType231453S value) {
            this.feeIdDescription = value;
        }

        /**
         * Gets the value of the conversionRate property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateType }
         *     
         */
        public ConversionRateType getConversionRate() {
            return conversionRate;
        }

        /**
         * Sets the value of the conversionRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateType }
         *     
         */
        public void setConversionRate(ConversionRateType value) {
            this.conversionRate = value;
        }

        /**
         * Gets the value of the formOfPayment property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public FormOfPaymentTypeI getFormOfPayment() {
            return formOfPayment;
        }

        /**
         * Sets the value of the formOfPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public void setFormOfPayment(FormOfPaymentTypeI value) {
            this.formOfPayment = value;
        }

        /**
         * Gets the value of the frequentTravellerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType223709S }
         *     
         */
        public FrequentTravellerIdentificationCodeType223709S getFrequentTravellerInfo() {
            return frequentTravellerInfo;
        }

        /**
         * Sets the value of the frequentTravellerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType223709S }
         *     
         */
        public void setFrequentTravellerInfo(FrequentTravellerIdentificationCodeType223709S value) {
            this.frequentTravellerInfo = value;
        }

        /**
         * Gets the value of the monetaryCabinInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAndCabinInformationType }
         *     
         */
        public MonetaryAndCabinInformationType getMonetaryCabinInfo() {
            return monetaryCabinInfo;
        }

        /**
         * Sets the value of the monetaryCabinInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAndCabinInformationType }
         *     
         */
        public void setMonetaryCabinInfo(MonetaryAndCabinInformationType value) {
            this.monetaryCabinInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SelectionDetailsType"/>
     *         &lt;element name="rateTax" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType_80162S" minOccurs="0"/>
     *         &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="feeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecificDataInformationType"/>
     *                   &lt;element name="associatedAmounts" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="feeDescriptionGrp" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ItemNumberType_80866S"/>
     *                             &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AttributeType_61377S" minOccurs="0"/>
     *                             &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "feeTypeInfo",
        "rateTax",
        "feeDetails"
    })
    public static class FeeOption {

        @XmlElement(required = true)
        protected SelectionDetailsType feeTypeInfo;
        protected MonetaryInformationType80162S rateTax;
        protected List<FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails> feeDetails;

        /**
         * Gets the value of the feeTypeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsType }
         *     
         */
        public SelectionDetailsType getFeeTypeInfo() {
            return feeTypeInfo;
        }

        /**
         * Sets the value of the feeTypeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsType }
         *     
         */
        public void setFeeTypeInfo(SelectionDetailsType value) {
            this.feeTypeInfo = value;
        }

        /**
         * Gets the value of the rateTax property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType80162S }
         *     
         */
        public MonetaryInformationType80162S getRateTax() {
            return rateTax;
        }

        /**
         * Sets the value of the rateTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType80162S }
         *     
         */
        public void setRateTax(MonetaryInformationType80162S value) {
            this.rateTax = value;
        }

        /**
         * Gets the value of the feeDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails> getFeeDetails() {
            if (feeDetails == null) {
                feeDetails = new ArrayList<FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails>();
            }
            return this.feeDetails;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecificDataInformationType"/>
         *         &lt;element name="associatedAmounts" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
         *         &lt;element name="feeDescriptionGrp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ItemNumberType_80866S"/>
         *                   &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AttributeType_61377S" minOccurs="0"/>
         *                   &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "feeInfo",
            "associatedAmounts",
            "feeDescriptionGrp"
        })
        public static class FeeDetails {

            @XmlElement(required = true)
            protected SpecificDataInformationType feeInfo;
            protected MonetaryInformationTypeI associatedAmounts;
            protected FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails.FeeDescriptionGrp feeDescriptionGrp;

            /**
             * Gets the value of the feeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public SpecificDataInformationType getFeeInfo() {
                return feeInfo;
            }

            /**
             * Sets the value of the feeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public void setFeeInfo(SpecificDataInformationType value) {
                this.feeInfo = value;
            }

            /**
             * Gets the value of the associatedAmounts property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getAssociatedAmounts() {
                return associatedAmounts;
            }

            /**
             * Sets the value of the associatedAmounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setAssociatedAmounts(MonetaryInformationTypeI value) {
                this.associatedAmounts = value;
            }

            /**
             * Gets the value of the feeDescriptionGrp property.
             * 
             * @return
             *     possible object is
             *     {@link FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails.FeeDescriptionGrp }
             *     
             */
            public FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails.FeeDescriptionGrp getFeeDescriptionGrp() {
                return feeDescriptionGrp;
            }

            /**
             * Sets the value of the feeDescriptionGrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails.FeeDescriptionGrp }
             *     
             */
            public void setFeeDescriptionGrp(FareMasterPricerTravelBoardSearch.FeeOption.FeeDetails.FeeDescriptionGrp value) {
                this.feeDescriptionGrp = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ItemNumberType_80866S"/>
             *         &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AttributeType_61377S" minOccurs="0"/>
             *         &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "itemNumberInfo",
                "serviceAttributesInfo",
                "serviceDescriptionInfo"
            })
            public static class FeeDescriptionGrp {

                @XmlElement(required = true)
                protected ItemNumberType80866S itemNumberInfo;
                protected AttributeType61377S serviceAttributesInfo;
                protected SpecialRequirementsDetailsType serviceDescriptionInfo;

                /**
                 * Gets the value of the itemNumberInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumberType80866S }
                 *     
                 */
                public ItemNumberType80866S getItemNumberInfo() {
                    return itemNumberInfo;
                }

                /**
                 * Sets the value of the itemNumberInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumberType80866S }
                 *     
                 */
                public void setItemNumberInfo(ItemNumberType80866S value) {
                    this.itemNumberInfo = value;
                }

                /**
                 * Gets the value of the serviceAttributesInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AttributeType61377S }
                 *     
                 */
                public AttributeType61377S getServiceAttributesInfo() {
                    return serviceAttributesInfo;
                }

                /**
                 * Sets the value of the serviceAttributesInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttributeType61377S }
                 *     
                 */
                public void setServiceAttributesInfo(AttributeType61377S value) {
                    this.serviceAttributesInfo = value;
                }

                /**
                 * Gets the value of the serviceDescriptionInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public SpecialRequirementsDetailsType getServiceDescriptionInfo() {
                    return serviceDescriptionInfo;
                }

                /**
                 * Sets the value of the serviceDescriptionInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public void setServiceDescriptionInfo(SpecialRequirementsDetailsType value) {
                    this.serviceDescriptionInfo = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
     *         &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DepartureLocationType" minOccurs="0"/>
     *         &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ArrivalLocalizationType" minOccurs="0"/>
     *         &lt;element name="timeDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType_181295S" minOccurs="0"/>
     *         &lt;element name="flightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType_231131S" minOccurs="0"/>
     *         &lt;element name="familyInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FareFamilyType" minOccurs="0"/>
     *         &lt;element name="valueSearch" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ValueSearchCriteriaType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="groupOfFlights" maxOccurs="1000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
     *                   &lt;element name="distributionMethod" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MethodType" minOccurs="0"/>
     *                   &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
     *                   &lt;element name="flightDetails" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
     *                             &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
     *                             &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
     *                             &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType_78540S" minOccurs="0"/>
     *                             &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
     *                             &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightInfoPNR" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travelResponseDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductInformationTypeI"/>
     *                   &lt;element name="timeTableDate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}StructuredPeriodInformationType" minOccurs="0"/>
     *                   &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI_78514S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="codeshareData" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
     *                   &lt;element name="disclosure" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FreeTextInformationType" minOccurs="0"/>
     *                   &lt;element name="stopDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}RoutingInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="trafficRestrictionData" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TrafficRestrictionTypeI" minOccurs="0"/>
     *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
     *                   &lt;element name="incidentalStopInfo" maxOccurs="8" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationTypeI"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType_232221S" maxOccurs="6" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="requestedSegmentAction" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ActionIdentificationType" minOccurs="0"/>
     *         &lt;element name="attributes" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CodedAttributeType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestedSegmentRef",
        "departureLocalization",
        "arrivalLocalization",
        "timeDetails",
        "flightInfo",
        "familyInformation",
        "valueSearch",
        "groupOfFlights",
        "flightInfoPNR",
        "requestedSegmentAction",
        "attributes"
    })
    public static class Itinerary {

        @XmlElement(required = true)
        protected OriginAndDestinationRequestType requestedSegmentRef;
        protected DepartureLocationType departureLocalization;
        protected ArrivalLocalizationType arrivalLocalization;
        protected DateAndTimeInformationType181295S timeDetails;
        protected TravelFlightInformationType231131S flightInfo;
        protected FareFamilyType familyInformation;
        protected List<ValueSearchCriteriaType> valueSearch;
        protected List<FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights> groupOfFlights;
        protected List<FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR> flightInfoPNR;
        protected ActionIdentificationType requestedSegmentAction;
        protected CodedAttributeType attributes;

        /**
         * Gets the value of the requestedSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationRequestType }
         *     
         */
        public OriginAndDestinationRequestType getRequestedSegmentRef() {
            return requestedSegmentRef;
        }

        /**
         * Sets the value of the requestedSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationRequestType }
         *     
         */
        public void setRequestedSegmentRef(OriginAndDestinationRequestType value) {
            this.requestedSegmentRef = value;
        }

        /**
         * Gets the value of the departureLocalization property.
         * 
         * @return
         *     possible object is
         *     {@link DepartureLocationType }
         *     
         */
        public DepartureLocationType getDepartureLocalization() {
            return departureLocalization;
        }

        /**
         * Sets the value of the departureLocalization property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepartureLocationType }
         *     
         */
        public void setDepartureLocalization(DepartureLocationType value) {
            this.departureLocalization = value;
        }

        /**
         * Gets the value of the arrivalLocalization property.
         * 
         * @return
         *     possible object is
         *     {@link ArrivalLocalizationType }
         *     
         */
        public ArrivalLocalizationType getArrivalLocalization() {
            return arrivalLocalization;
        }

        /**
         * Sets the value of the arrivalLocalization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrivalLocalizationType }
         *     
         */
        public void setArrivalLocalization(ArrivalLocalizationType value) {
            this.arrivalLocalization = value;
        }

        /**
         * Gets the value of the timeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link DateAndTimeInformationType181295S }
         *     
         */
        public DateAndTimeInformationType181295S getTimeDetails() {
            return timeDetails;
        }

        /**
         * Sets the value of the timeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAndTimeInformationType181295S }
         *     
         */
        public void setTimeDetails(DateAndTimeInformationType181295S value) {
            this.timeDetails = value;
        }

        /**
         * Gets the value of the flightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelFlightInformationType231131S }
         *     
         */
        public TravelFlightInformationType231131S getFlightInfo() {
            return flightInfo;
        }

        /**
         * Sets the value of the flightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelFlightInformationType231131S }
         *     
         */
        public void setFlightInfo(TravelFlightInformationType231131S value) {
            this.flightInfo = value;
        }

        /**
         * Gets the value of the familyInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FareFamilyType }
         *     
         */
        public FareFamilyType getFamilyInformation() {
            return familyInformation;
        }

        /**
         * Sets the value of the familyInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFamilyType }
         *     
         */
        public void setFamilyInformation(FareFamilyType value) {
            this.familyInformation = value;
        }

        /**
         * Gets the value of the valueSearch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the valueSearch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValueSearch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValueSearchCriteriaType }
         * 
         * 
         */
        public List<ValueSearchCriteriaType> getValueSearch() {
            if (valueSearch == null) {
                valueSearch = new ArrayList<ValueSearchCriteriaType>();
            }
            return this.valueSearch;
        }

        /**
         * Gets the value of the groupOfFlights property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupOfFlights property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupOfFlights().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights> getGroupOfFlights() {
            if (groupOfFlights == null) {
                groupOfFlights = new ArrayList<FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights>();
            }
            return this.groupOfFlights;
        }

        /**
         * Gets the value of the flightInfoPNR property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightInfoPNR property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightInfoPNR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR> getFlightInfoPNR() {
            if (flightInfoPNR == null) {
                flightInfoPNR = new ArrayList<FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR>();
            }
            return this.flightInfoPNR;
        }

        /**
         * Gets the value of the requestedSegmentAction property.
         * 
         * @return
         *     possible object is
         *     {@link ActionIdentificationType }
         *     
         */
        public ActionIdentificationType getRequestedSegmentAction() {
            return requestedSegmentAction;
        }

        /**
         * Sets the value of the requestedSegmentAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionIdentificationType }
         *     
         */
        public void setRequestedSegmentAction(ActionIdentificationType value) {
            this.requestedSegmentAction = value;
        }

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setAttributes(CodedAttributeType value) {
            this.attributes = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="travelResponseDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductInformationTypeI"/>
         *         &lt;element name="timeTableDate" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}StructuredPeriodInformationType" minOccurs="0"/>
         *         &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI_78514S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="codeshareData" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
         *         &lt;element name="disclosure" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FreeTextInformationType" minOccurs="0"/>
         *         &lt;element name="stopDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}RoutingInformationTypeI" minOccurs="0"/>
         *         &lt;element name="trafficRestrictionData" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TrafficRestrictionTypeI" minOccurs="0"/>
         *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
         *         &lt;element name="incidentalStopInfo" maxOccurs="8" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationTypeI"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType_232221S" maxOccurs="6" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "travelResponseDetails",
            "timeTableDate",
            "terminalEquipmentDetails",
            "codeshareData",
            "disclosure",
            "stopDetails",
            "trafficRestrictionData",
            "reservationInfo",
            "incidentalStopInfo",
            "avlInfo"
        })
        public static class FlightInfoPNR {

            @XmlElement(required = true)
            protected TravelProductInformationTypeI travelResponseDetails;
            protected StructuredPeriodInformationType timeTableDate;
            protected List<AdditionalProductDetailsTypeI78514S> terminalEquipmentDetails;
            protected CommercialAgreementsType codeshareData;
            protected FreeTextInformationType disclosure;
            protected RoutingInformationTypeI stopDetails;
            protected TrafficRestrictionTypeI trafficRestrictionData;
            protected PassengerItineraryInformationType reservationInfo;
            protected List<FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR.IncidentalStopInfo> incidentalStopInfo;
            protected List<FlightProductInformationType232221S> avlInfo;

            /**
             * Gets the value of the travelResponseDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public TravelProductInformationTypeI getTravelResponseDetails() {
                return travelResponseDetails;
            }

            /**
             * Sets the value of the travelResponseDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public void setTravelResponseDetails(TravelProductInformationTypeI value) {
                this.travelResponseDetails = value;
            }

            /**
             * Gets the value of the timeTableDate property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredPeriodInformationType }
             *     
             */
            public StructuredPeriodInformationType getTimeTableDate() {
                return timeTableDate;
            }

            /**
             * Sets the value of the timeTableDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredPeriodInformationType }
             *     
             */
            public void setTimeTableDate(StructuredPeriodInformationType value) {
                this.timeTableDate = value;
            }

            /**
             * Gets the value of the terminalEquipmentDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the terminalEquipmentDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTerminalEquipmentDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AdditionalProductDetailsTypeI78514S }
             * 
             * 
             */
            public List<AdditionalProductDetailsTypeI78514S> getTerminalEquipmentDetails() {
                if (terminalEquipmentDetails == null) {
                    terminalEquipmentDetails = new ArrayList<AdditionalProductDetailsTypeI78514S>();
                }
                return this.terminalEquipmentDetails;
            }

            /**
             * Gets the value of the codeshareData property.
             * 
             * @return
             *     possible object is
             *     {@link CommercialAgreementsType }
             *     
             */
            public CommercialAgreementsType getCodeshareData() {
                return codeshareData;
            }

            /**
             * Sets the value of the codeshareData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommercialAgreementsType }
             *     
             */
            public void setCodeshareData(CommercialAgreementsType value) {
                this.codeshareData = value;
            }

            /**
             * Gets the value of the disclosure property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType }
             *     
             */
            public FreeTextInformationType getDisclosure() {
                return disclosure;
            }

            /**
             * Sets the value of the disclosure property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType }
             *     
             */
            public void setDisclosure(FreeTextInformationType value) {
                this.disclosure = value;
            }

            /**
             * Gets the value of the stopDetails property.
             * 
             * @return
             *     possible object is
             *     {@link RoutingInformationTypeI }
             *     
             */
            public RoutingInformationTypeI getStopDetails() {
                return stopDetails;
            }

            /**
             * Sets the value of the stopDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link RoutingInformationTypeI }
             *     
             */
            public void setStopDetails(RoutingInformationTypeI value) {
                this.stopDetails = value;
            }

            /**
             * Gets the value of the trafficRestrictionData property.
             * 
             * @return
             *     possible object is
             *     {@link TrafficRestrictionTypeI }
             *     
             */
            public TrafficRestrictionTypeI getTrafficRestrictionData() {
                return trafficRestrictionData;
            }

            /**
             * Sets the value of the trafficRestrictionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link TrafficRestrictionTypeI }
             *     
             */
            public void setTrafficRestrictionData(TrafficRestrictionTypeI value) {
                this.trafficRestrictionData = value;
            }

            /**
             * Gets the value of the reservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PassengerItineraryInformationType }
             *     
             */
            public PassengerItineraryInformationType getReservationInfo() {
                return reservationInfo;
            }

            /**
             * Sets the value of the reservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PassengerItineraryInformationType }
             *     
             */
            public void setReservationInfo(PassengerItineraryInformationType value) {
                this.reservationInfo = value;
            }

            /**
             * Gets the value of the incidentalStopInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the incidentalStopInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncidentalStopInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR.IncidentalStopInfo }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR.IncidentalStopInfo> getIncidentalStopInfo() {
                if (incidentalStopInfo == null) {
                    incidentalStopInfo = new ArrayList<FareMasterPricerTravelBoardSearch.Itinerary.FlightInfoPNR.IncidentalStopInfo>();
                }
                return this.incidentalStopInfo;
            }

            /**
             * Gets the value of the avlInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the avlInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAvlInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightProductInformationType232221S }
             * 
             * 
             */
            public List<FlightProductInformationType232221S> getAvlInfo() {
                if (avlInfo == null) {
                    avlInfo = new ArrayList<FlightProductInformationType232221S>();
                }
                return this.avlInfo;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationTypeI"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dateTimeInfo"
            })
            public static class IncidentalStopInfo {

                @XmlElement(required = true)
                protected DateAndTimeInformationTypeI dateTimeInfo;

                /**
                 * Gets the value of the dateTimeInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateAndTimeInformationTypeI }
                 *     
                 */
                public DateAndTimeInformationTypeI getDateTimeInfo() {
                    return dateTimeInfo;
                }

                /**
                 * Sets the value of the dateTimeInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateAndTimeInformationTypeI }
                 *     
                 */
                public void setDateTimeInfo(DateAndTimeInformationTypeI value) {
                    this.dateTimeInfo = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
         *         &lt;element name="distributionMethod" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MethodType" minOccurs="0"/>
         *         &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
         *         &lt;element name="flightDetails" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
         *                   &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
         *                   &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
         *                   &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType_78540S" minOccurs="0"/>
         *                   &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
         *                   &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "propFlightGrDetail",
            "distributionMethod",
            "priceToBeat",
            "flightDetails"
        })
        public static class GroupOfFlights {

            @XmlElement(required = true)
            protected ProposedSegmentType propFlightGrDetail;
            protected MethodType distributionMethod;
            protected MonetaryInformationType priceToBeat;
            @XmlElement(required = true)
            protected List<FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights.FlightDetails> flightDetails;

            /**
             * Gets the value of the propFlightGrDetail property.
             * 
             * @return
             *     possible object is
             *     {@link ProposedSegmentType }
             *     
             */
            public ProposedSegmentType getPropFlightGrDetail() {
                return propFlightGrDetail;
            }

            /**
             * Sets the value of the propFlightGrDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProposedSegmentType }
             *     
             */
            public void setPropFlightGrDetail(ProposedSegmentType value) {
                this.propFlightGrDetail = value;
            }

            /**
             * Gets the value of the distributionMethod property.
             * 
             * @return
             *     possible object is
             *     {@link MethodType }
             *     
             */
            public MethodType getDistributionMethod() {
                return distributionMethod;
            }

            /**
             * Sets the value of the distributionMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link MethodType }
             *     
             */
            public void setDistributionMethod(MethodType value) {
                this.distributionMethod = value;
            }

            /**
             * Gets the value of the priceToBeat property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType }
             *     
             */
            public MonetaryInformationType getPriceToBeat() {
                return priceToBeat;
            }

            /**
             * Sets the value of the priceToBeat property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType }
             *     
             */
            public void setPriceToBeat(MonetaryInformationType value) {
                this.priceToBeat = value;
            }

            /**
             * Gets the value of the flightDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights.FlightDetails }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights.FlightDetails> getFlightDetails() {
                if (flightDetails == null) {
                    flightDetails = new ArrayList<FareMasterPricerTravelBoardSearch.Itinerary.GroupOfFlights.FlightDetails>();
                }
                return this.flightDetails;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
             *         &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
             *         &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
             *         &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CommercialAgreementsType_78540S" minOccurs="0"/>
             *         &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
             *         &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PassengerItineraryInformationType" minOccurs="0"/>
             *         &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}MonetaryInformationType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "flightInformation",
                "avlInfo",
                "technicalStop",
                "commercialAgreement",
                "addInfo",
                "terminalEquipmentDetails",
                "reservationInfo",
                "priceToBeat"
            })
            public static class FlightDetails {

                @XmlElement(required = true)
                protected TravelProductType flightInformation;
                protected List<FlightProductInformationType> avlInfo;
                protected List<DateAndTimeInformationType> technicalStop;
                protected CommercialAgreementsType78540S commercialAgreement;
                protected HeaderInformationTypeI addInfo;
                protected List<AdditionalProductDetailsTypeI> terminalEquipmentDetails;
                protected PassengerItineraryInformationType reservationInfo;
                protected MonetaryInformationType priceToBeat;

                /**
                 * Gets the value of the flightInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductType }
                 *     
                 */
                public TravelProductType getFlightInformation() {
                    return flightInformation;
                }

                /**
                 * Sets the value of the flightInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductType }
                 *     
                 */
                public void setFlightInformation(TravelProductType value) {
                    this.flightInformation = value;
                }

                /**
                 * Gets the value of the avlInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the avlInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAvlInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightProductInformationType }
                 * 
                 * 
                 */
                public List<FlightProductInformationType> getAvlInfo() {
                    if (avlInfo == null) {
                        avlInfo = new ArrayList<FlightProductInformationType>();
                    }
                    return this.avlInfo;
                }

                /**
                 * Gets the value of the technicalStop property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the technicalStop property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTechnicalStop().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DateAndTimeInformationType }
                 * 
                 * 
                 */
                public List<DateAndTimeInformationType> getTechnicalStop() {
                    if (technicalStop == null) {
                        technicalStop = new ArrayList<DateAndTimeInformationType>();
                    }
                    return this.technicalStop;
                }

                /**
                 * Gets the value of the commercialAgreement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommercialAgreementsType78540S }
                 *     
                 */
                public CommercialAgreementsType78540S getCommercialAgreement() {
                    return commercialAgreement;
                }

                /**
                 * Sets the value of the commercialAgreement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommercialAgreementsType78540S }
                 *     
                 */
                public void setCommercialAgreement(CommercialAgreementsType78540S value) {
                    this.commercialAgreement = value;
                }

                /**
                 * Gets the value of the addInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link HeaderInformationTypeI }
                 *     
                 */
                public HeaderInformationTypeI getAddInfo() {
                    return addInfo;
                }

                /**
                 * Sets the value of the addInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link HeaderInformationTypeI }
                 *     
                 */
                public void setAddInfo(HeaderInformationTypeI value) {
                    this.addInfo = value;
                }

                /**
                 * Gets the value of the terminalEquipmentDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the terminalEquipmentDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTerminalEquipmentDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AdditionalProductDetailsTypeI }
                 * 
                 * 
                 */
                public List<AdditionalProductDetailsTypeI> getTerminalEquipmentDetails() {
                    if (terminalEquipmentDetails == null) {
                        terminalEquipmentDetails = new ArrayList<AdditionalProductDetailsTypeI>();
                    }
                    return this.terminalEquipmentDetails;
                }

                /**
                 * Gets the value of the reservationInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PassengerItineraryInformationType }
                 *     
                 */
                public PassengerItineraryInformationType getReservationInfo() {
                    return reservationInfo;
                }

                /**
                 * Sets the value of the reservationInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PassengerItineraryInformationType }
                 *     
                 */
                public void setReservationInfo(PassengerItineraryInformationType value) {
                    this.reservationInfo = value;
                }

                /**
                 * Gets the value of the priceToBeat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public MonetaryInformationType getPriceToBeat() {
                    return priceToBeat;
                }

                /**
                 * Sets the value of the priceToBeat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public void setPriceToBeat(MonetaryInformationType value) {
                    this.priceToBeat = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="itineraryId" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelItineraryInformationTypeI"/>
     *         &lt;element name="itinerary" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
     *                   &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DepartureLocationType" minOccurs="0"/>
     *                   &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ArrivalLocalizationType" minOccurs="0"/>
     *                   &lt;element name="timeDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType_181295S" minOccurs="0"/>
     *                   &lt;element name="groupOfFlights" maxOccurs="50" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
     *                             &lt;element name="flightDetails" maxOccurs="4">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
     *                                       &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
     *                                       &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="travelSolution" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ReferenceInfoType_215731S" maxOccurs="50" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itineraryId",
        "itinerary",
        "travelSolution"
    })
    public static class ItineraryGroup {

        @XmlElement(required = true)
        protected TravelItineraryInformationTypeI itineraryId;
        protected List<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary> itinerary;
        protected List<ReferenceInfoType215731S> travelSolution;

        /**
         * Gets the value of the itineraryId property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryInformationTypeI }
         *     
         */
        public TravelItineraryInformationTypeI getItineraryId() {
            return itineraryId;
        }

        /**
         * Sets the value of the itineraryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryInformationTypeI }
         *     
         */
        public void setItineraryId(TravelItineraryInformationTypeI value) {
            this.itineraryId = value;
        }

        /**
         * Gets the value of the itinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary> getItinerary() {
            if (itinerary == null) {
                itinerary = new ArrayList<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary>();
            }
            return this.itinerary;
        }

        /**
         * Gets the value of the travelSolution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelSolution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelSolution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType215731S }
         * 
         * 
         */
        public List<ReferenceInfoType215731S> getTravelSolution() {
            if (travelSolution == null) {
                travelSolution = new ArrayList<ReferenceInfoType215731S>();
            }
            return this.travelSolution;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
         *         &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DepartureLocationType" minOccurs="0"/>
         *         &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ArrivalLocalizationType" minOccurs="0"/>
         *         &lt;element name="timeDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType_181295S" minOccurs="0"/>
         *         &lt;element name="groupOfFlights" maxOccurs="50" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
         *                   &lt;element name="flightDetails" maxOccurs="4">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
         *                             &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
         *                             &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "requestedSegmentRef",
            "departureLocalization",
            "arrivalLocalization",
            "timeDetails",
            "groupOfFlights"
        })
        public static class Itinerary {

            @XmlElement(required = true)
            protected OriginAndDestinationRequestType requestedSegmentRef;
            protected DepartureLocationType departureLocalization;
            protected ArrivalLocalizationType arrivalLocalization;
            protected DateAndTimeInformationType181295S timeDetails;
            protected List<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights> groupOfFlights;

            /**
             * Gets the value of the requestedSegmentRef property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public OriginAndDestinationRequestType getRequestedSegmentRef() {
                return requestedSegmentRef;
            }

            /**
             * Sets the value of the requestedSegmentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public void setRequestedSegmentRef(OriginAndDestinationRequestType value) {
                this.requestedSegmentRef = value;
            }

            /**
             * Gets the value of the departureLocalization property.
             * 
             * @return
             *     possible object is
             *     {@link DepartureLocationType }
             *     
             */
            public DepartureLocationType getDepartureLocalization() {
                return departureLocalization;
            }

            /**
             * Sets the value of the departureLocalization property.
             * 
             * @param value
             *     allowed object is
             *     {@link DepartureLocationType }
             *     
             */
            public void setDepartureLocalization(DepartureLocationType value) {
                this.departureLocalization = value;
            }

            /**
             * Gets the value of the arrivalLocalization property.
             * 
             * @return
             *     possible object is
             *     {@link ArrivalLocalizationType }
             *     
             */
            public ArrivalLocalizationType getArrivalLocalization() {
                return arrivalLocalization;
            }

            /**
             * Sets the value of the arrivalLocalization property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrivalLocalizationType }
             *     
             */
            public void setArrivalLocalization(ArrivalLocalizationType value) {
                this.arrivalLocalization = value;
            }

            /**
             * Gets the value of the timeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType181295S }
             *     
             */
            public DateAndTimeInformationType181295S getTimeDetails() {
                return timeDetails;
            }

            /**
             * Sets the value of the timeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType181295S }
             *     
             */
            public void setTimeDetails(DateAndTimeInformationType181295S value) {
                this.timeDetails = value;
            }

            /**
             * Gets the value of the groupOfFlights property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the groupOfFlights property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroupOfFlights().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights> getGroupOfFlights() {
                if (groupOfFlights == null) {
                    groupOfFlights = new ArrayList<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights>();
                }
                return this.groupOfFlights;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ProposedSegmentType"/>
             *         &lt;element name="flightDetails" maxOccurs="4">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
             *                   &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
             *                   &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "propFlightGrDetail",
                "flightDetails"
            })
            public static class GroupOfFlights {

                @XmlElement(required = true)
                protected ProposedSegmentType propFlightGrDetail;
                @XmlElement(required = true)
                protected List<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights.FlightDetails> flightDetails;

                /**
                 * Gets the value of the propFlightGrDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProposedSegmentType }
                 *     
                 */
                public ProposedSegmentType getPropFlightGrDetail() {
                    return propFlightGrDetail;
                }

                /**
                 * Sets the value of the propFlightGrDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProposedSegmentType }
                 *     
                 */
                public void setPropFlightGrDetail(ProposedSegmentType value) {
                    this.propFlightGrDetail = value;
                }

                /**
                 * Gets the value of the flightDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFlightDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights.FlightDetails }
                 * 
                 * 
                 */
                public List<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights.FlightDetails> getFlightDetails() {
                    if (flightDetails == null) {
                        flightDetails = new ArrayList<FareMasterPricerTravelBoardSearch.ItineraryGroup.Itinerary.GroupOfFlights.FlightDetails>();
                    }
                    return this.flightDetails;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelProductType"/>
                 *         &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
                 *         &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "flightInformation",
                    "avlInfo",
                    "technicalStop"
                })
                public static class FlightDetails {

                    @XmlElement(required = true)
                    protected TravelProductType flightInformation;
                    protected List<FlightProductInformationType> avlInfo;
                    protected List<DateAndTimeInformationType> technicalStop;

                    /**
                     * Gets the value of the flightInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelProductType }
                     *     
                     */
                    public TravelProductType getFlightInformation() {
                        return flightInformation;
                    }

                    /**
                     * Sets the value of the flightInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelProductType }
                     *     
                     */
                    public void setFlightInformation(TravelProductType value) {
                        this.flightInformation = value;
                    }

                    /**
                     * Gets the value of the avlInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the avlInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAvlInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FlightProductInformationType }
                     * 
                     * 
                     */
                    public List<FlightProductInformationType> getAvlInfo() {
                        if (avlInfo == null) {
                            avlInfo = new ArrayList<FlightProductInformationType>();
                        }
                        return this.avlInfo;
                    }

                    /**
                     * Gets the value of the technicalStop property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the technicalStop property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTechnicalStop().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DateAndTimeInformationType }
                     * 
                     * 
                     */
                    public List<DateAndTimeInformationType> getTechnicalStop() {
                        if (technicalStop == null) {
                            technicalStop = new ArrayList<DateAndTimeInformationType>();
                        }
                        return this.technicalStop;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}UserIdentificationType"/>
     *         &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
     *         &lt;element name="uidOption" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CodedAttributeType_78500S" minOccurs="0"/>
     *         &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}PricingTicketingDetailsType" minOccurs="0"/>
     *         &lt;element name="corporateFareInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}CorporateFareInformationType" minOccurs="0"/>
     *         &lt;element name="travelFlightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType" minOccurs="0"/>
     *         &lt;element name="airlineDistributionDetails" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
     *                   &lt;element name="flightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "officeIdInformation",
        "nbOfUnits",
        "uidOption",
        "pricingTickInfo",
        "corporateFareInfo",
        "travelFlightInfo",
        "airlineDistributionDetails"
    })
    public static class OfficeIdDetails {

        @XmlElement(required = true)
        protected UserIdentificationType officeIdInformation;
        protected NumberOfUnitsType80154S nbOfUnits;
        protected CodedAttributeType78500S uidOption;
        protected PricingTicketingDetailsType pricingTickInfo;
        protected CorporateFareInformationType corporateFareInfo;
        protected TravelFlightInformationType travelFlightInfo;
        protected List<FareMasterPricerTravelBoardSearch.OfficeIdDetails.AirlineDistributionDetails> airlineDistributionDetails;

        /**
         * Gets the value of the officeIdInformation property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType }
         *     
         */
        public UserIdentificationType getOfficeIdInformation() {
            return officeIdInformation;
        }

        /**
         * Sets the value of the officeIdInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType }
         *     
         */
        public void setOfficeIdInformation(UserIdentificationType value) {
            this.officeIdInformation = value;
        }

        /**
         * Gets the value of the nbOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public NumberOfUnitsType80154S getNbOfUnits() {
            return nbOfUnits;
        }

        /**
         * Sets the value of the nbOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public void setNbOfUnits(NumberOfUnitsType80154S value) {
            this.nbOfUnits = value;
        }

        /**
         * Gets the value of the uidOption property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType78500S }
         *     
         */
        public CodedAttributeType78500S getUidOption() {
            return uidOption;
        }

        /**
         * Sets the value of the uidOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType78500S }
         *     
         */
        public void setUidOption(CodedAttributeType78500S value) {
            this.uidOption = value;
        }

        /**
         * Gets the value of the pricingTickInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingTickInfo() {
            return pricingTickInfo;
        }

        /**
         * Sets the value of the pricingTickInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingTickInfo(PricingTicketingDetailsType value) {
            this.pricingTickInfo = value;
        }

        /**
         * Gets the value of the corporateFareInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateFareInformationType }
         *     
         */
        public CorporateFareInformationType getCorporateFareInfo() {
            return corporateFareInfo;
        }

        /**
         * Sets the value of the corporateFareInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateFareInformationType }
         *     
         */
        public void setCorporateFareInfo(CorporateFareInformationType value) {
            this.corporateFareInfo = value;
        }

        /**
         * Gets the value of the travelFlightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelFlightInformationType }
         *     
         */
        public TravelFlightInformationType getTravelFlightInfo() {
            return travelFlightInfo;
        }

        /**
         * Sets the value of the travelFlightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelFlightInformationType }
         *     
         */
        public void setTravelFlightInfo(TravelFlightInformationType value) {
            this.travelFlightInfo = value;
        }

        /**
         * Gets the value of the airlineDistributionDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineDistributionDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineDistributionDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.OfficeIdDetails.AirlineDistributionDetails }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.OfficeIdDetails.AirlineDistributionDetails> getAirlineDistributionDetails() {
            if (airlineDistributionDetails == null) {
                airlineDistributionDetails = new ArrayList<FareMasterPricerTravelBoardSearch.OfficeIdDetails.AirlineDistributionDetails>();
            }
            return this.airlineDistributionDetails;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}OriginAndDestinationRequestType"/>
         *         &lt;element name="flightInfo" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TravelFlightInformationType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "requestedSegmentRef",
            "flightInfo"
        })
        public static class AirlineDistributionDetails {

            @XmlElement(required = true)
            protected OriginAndDestinationRequestType requestedSegmentRef;
            protected TravelFlightInformationType flightInfo;

            /**
             * Gets the value of the requestedSegmentRef property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public OriginAndDestinationRequestType getRequestedSegmentRef() {
                return requestedSegmentRef;
            }

            /**
             * Sets the value of the requestedSegmentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public void setRequestedSegmentRef(OriginAndDestinationRequestType value) {
                this.requestedSegmentRef = value;
            }

            /**
             * Gets the value of the flightInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TravelFlightInformationType }
             *     
             */
            public TravelFlightInformationType getFlightInfo() {
                return flightInfo;
            }

            /**
             * Sets the value of the flightInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelFlightInformationType }
             *     
             */
            public void setFlightInfo(TravelFlightInformationType value) {
                this.flightInfo = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ticketNumberDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}TicketNumberTypeI"/>
     *         &lt;element name="ticketRequestedSegments" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="actionIdentification" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ActionIdentificationType"/>
     *                   &lt;element name="connectPointDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ConnectionTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticketNumberDetails",
        "ticketRequestedSegments"
    })
    public static class TicketChangeInfo {

        @XmlElement(required = true)
        protected TicketNumberTypeI ticketNumberDetails;
        protected List<FareMasterPricerTravelBoardSearch.TicketChangeInfo.TicketRequestedSegments> ticketRequestedSegments;

        /**
         * Gets the value of the ticketNumberDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketNumberDetails() {
            return ticketNumberDetails;
        }

        /**
         * Sets the value of the ticketNumberDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketNumberDetails(TicketNumberTypeI value) {
            this.ticketNumberDetails = value;
        }

        /**
         * Gets the value of the ticketRequestedSegments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketRequestedSegments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketRequestedSegments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearch.TicketChangeInfo.TicketRequestedSegments }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearch.TicketChangeInfo.TicketRequestedSegments> getTicketRequestedSegments() {
            if (ticketRequestedSegments == null) {
                ticketRequestedSegments = new ArrayList<FareMasterPricerTravelBoardSearch.TicketChangeInfo.TicketRequestedSegments>();
            }
            return this.ticketRequestedSegments;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="actionIdentification" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ActionIdentificationType"/>
         *         &lt;element name="connectPointDetails" type="{http://xml.amadeus.com/FMPTBQ_24_6_1A}ConnectionTypeI" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "actionIdentification",
            "connectPointDetails"
        })
        public static class TicketRequestedSegments {

            @XmlElement(required = true)
            protected ActionIdentificationType actionIdentification;
            protected ConnectionTypeI connectPointDetails;

            /**
             * Gets the value of the actionIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link ActionIdentificationType }
             *     
             */
            public ActionIdentificationType getActionIdentification() {
                return actionIdentification;
            }

            /**
             * Sets the value of the actionIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionIdentificationType }
             *     
             */
            public void setActionIdentification(ActionIdentificationType value) {
                this.actionIdentification = value;
            }

            /**
             * Gets the value of the connectPointDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ConnectionTypeI }
             *     
             */
            public ConnectionTypeI getConnectPointDetails() {
                return connectPointDetails;
            }

            /**
             * Sets the value of the connectPointDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionTypeI }
             *     
             */
            public void setConnectPointDetails(ConnectionTypeI value) {
                this.connectPointDetails = value;
            }

        }

    }

}
