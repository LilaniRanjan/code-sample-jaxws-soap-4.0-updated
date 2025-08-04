
package com.amadeus.xml.fmptbr_24_6_1a;

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
 *         &lt;element name="replyStatus" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}StatusType_224999S" minOccurs="0"/>
 *         &lt;element name="carbonEmissionBySourceDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonEmissionSourceDetailType" minOccurs="0"/>
 *         &lt;element name="errorMessage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ApplicationErrorInformationType_78543S"/>
 *                   &lt;element name="errorMessageText" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78544S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ConversionRateTypeI" minOccurs="0"/>
 *         &lt;element name="solutionFamily" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="familyInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareFamilyType" maxOccurs="200" minOccurs="0"/>
 *         &lt;element name="amountInfoForAllPax" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itineraryAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S"/>
 *                   &lt;element name="amountsPerSgt" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S"/>
 *                             &lt;element name="amounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
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
 *         &lt;element name="amountInfoPerPax" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paxRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
 *                   &lt;element name="paxAttributes" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
 *                   &lt;element name="itineraryAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S"/>
 *                   &lt;element name="amountsPerSgt" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S"/>
 *                             &lt;element name="amounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
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
 *         &lt;element name="feeDetails" maxOccurs="2099" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="feeReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType_78564S"/>
 *                   &lt;element name="feeInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *                   &lt;element name="feeParameters" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeType_78561S" minOccurs="0"/>
 *                   &lt;element name="convertedOrOriginalInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ConversionRateTypeI_78562S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bucketInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}BucketInformationType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="themeIdText" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ThemeTextType" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="dictionary" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="category" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductGroupInformationType"/>
 *                   &lt;element name="element" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}KeywordType" maxOccurs="200" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" maxOccurs="1000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductIdentificationType"/>
 *                   &lt;element name="dateInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateTimePeriodType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="companyIdText" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CompanyIdentificationTextType" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="officeIdDetails" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}UserIdentificationType"/>
 *                   &lt;element name="officeIdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType_78536S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="programDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProgramCodeType" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="milesAccrual" maxOccurs="1000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="milesAccrualId" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemDescriptionType"/>
 *                   &lt;element name="milesAccrualDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProgramCodeType_209757S" maxOccurs="20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="initialEMDInfo" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="emdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CouponInformationType"/>
 *                   &lt;element name="emdPaxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" minOccurs="0"/>
 *                   &lt;element name="emdAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212668S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="emdRecommendation" maxOccurs="100000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="edmRecoId" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ElementManagementSegmentType"/>
 *                   &lt;element name="emdRecoAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
 *                   &lt;element name="emdRecoPaxDetails" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="emdPaxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType"/>
 *                             &lt;element name="emdPaxAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
 *                             &lt;element name="emdRecoDetails" maxOccurs="100" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="emdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CouponInformationType"/>
 *                                       &lt;element name="srvCoverageRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_212767S" minOccurs="0"/>
 *                                       &lt;element name="emdDetailAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
 *                                       &lt;element name="emdError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ErrorGroupType" minOccurs="0"/>
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
 *         &lt;element name="flightIndex" maxOccurs="6" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
 *                   &lt;element name="referenceCarbonEmission" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonFootprintType" minOccurs="0"/>
 *                   &lt;element name="groupOfFlights" maxOccurs="100000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProposedSegmentType"/>
 *                             &lt;element name="flightDetails" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravelProductType"/>
 *                                       &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
 *                                       &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
 *                                       &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
 *                                       &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="flightCharacteristics" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightCharacteristicsType" minOccurs="0"/>
 *                                       &lt;element name="flightServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightServicesType" maxOccurs="9" minOccurs="0"/>
 *                                       &lt;element name="mealServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MealServicesType" minOccurs="0"/>
 *                                       &lt;element name="flightRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227042S" minOccurs="0"/>
 *                                       &lt;element name="estimatedCarbonEmission" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonFootprintType" minOccurs="0"/>
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
 *                   &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumberOfUnitsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recommendation" maxOccurs="100000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemNumber" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_232143S"/>
 *                   &lt;element name="emdError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ErrorGroupType_366245G" minOccurs="0"/>
 *                   &lt;element name="warningMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78544S" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="fareFamilyRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S" minOccurs="0"/>
 *                   &lt;element name="recPriceInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S"/>
 *                   &lt;element name="miniRule" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MiniRulesType_78547S" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="segmentFlightRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType" maxOccurs="100009" minOccurs="0"/>
 *                   &lt;element name="recommandationSegmentsFareDetails" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="recommendationSegRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
 *                             &lt;element name="segmentMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
 *                             &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_224557S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="paxFareProduct" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paxFareDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType_228122S"/>
 *                             &lt;element name="feeRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_214315S" minOccurs="0"/>
 *                             &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="6" minOccurs="0"/>
 *                             &lt;element name="passengerRange" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}RangeDetailsType" minOccurs="0"/>
 *                             &lt;element name="passengerTaxDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TaxType" minOccurs="0"/>
 *                             &lt;element name="tourInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TourInformationType" minOccurs="0"/>
 *                             &lt;element name="fare" maxOccurs="7" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78559S"/>
 *                                       &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_199534S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fareDetails" maxOccurs="6">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="segmentRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
 *                                       &lt;element name="groupOfFares" maxOccurs="4" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="productInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_227082S"/>
 *                                                 &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
 *                                                 &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareQualifierDetailsType" minOccurs="0"/>
 *                                                 &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227141S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
 *                                       &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInformationType" minOccurs="0"/>
 *                                       &lt;element name="majCabin" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductInformationType" maxOccurs="10" minOccurs="0"/>
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
 *                   &lt;element name="specificRecDetails" maxOccurs="100000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="specificRecItem" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType"/>
 *                             &lt;element name="specificProductDetails" maxOccurs="10" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="productReferences" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType"/>
 *                                       &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType_134833S"/>
 *                                                 &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_223656S"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                   &lt;element name="distributionMethod" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MethodType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="otherSolutions" maxOccurs="100009" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SequenceDetailsTypeU"/>
 *                   &lt;element name="amtGroup" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ref" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S"/>
 *                             &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="psgInfo" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ref" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SegmentRepetitionControlTypeI"/>
 *                             &lt;element name="description" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="freqTraveller" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
 *                             &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="fare" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_161491S" minOccurs="0"/>
 *                             &lt;element name="attribute" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeTypeU" maxOccurs="10" minOccurs="0"/>
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
 *         &lt;element name="warningInfo" maxOccurs="1000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DummySegmentTypeI"/>
 *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ApplicationErrorInformationType_232919S" minOccurs="0"/>
 *                   &lt;element name="globalMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_231140S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="globalInformation" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributes" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType_78535S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceFeesGrp" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceTypeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SelectionDetailsType"/>
 *                   &lt;element name="serviceFeeRefGrp" maxOccurs="100000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="serviceCoverageInfoGrp" maxOccurs="100000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType"/>
 *                             &lt;element name="serviceCovInfoGrp" maxOccurs="200" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
 *                                       &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
 *                                       &lt;element name="carrierInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TransportIdentifierType" minOccurs="0"/>
 *                                       &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S" minOccurs="0"/>
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
 *                   &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DummySegmentTypeI"/>
 *                   &lt;element name="serviceFeeInfoGrp" maxOccurs="100000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType"/>
 *                             &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S"/>
 *                                       &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
 *                                                 &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
 *                                                 &lt;element name="amountInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S" minOccurs="0"/>
 *                                                 &lt;element name="attributeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType" maxOccurs="10" minOccurs="0"/>
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
 *                   &lt;element name="serviceDetailsGrp" maxOccurs="1000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceOptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificDataInformationType"/>
 *                             &lt;element name="feeDescriptionGrp" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_80866S"/>
 *                                       &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeType" minOccurs="0"/>
 *                                       &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
 *                                       &lt;element name="commercialName" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType" minOccurs="0"/>
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
 *                   &lt;element name="freeBagAllowanceGrp" maxOccurs="100000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="freeBagAllownceInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ExcessBaggageType"/>
 *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_166130S" minOccurs="0"/>
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
 *         &lt;element name="multiDimensionRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MultiDimensionalValueType" maxOccurs="100000" minOccurs="0"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ValueSearchCriteriaType" maxOccurs="100009" minOccurs="0"/>
 *         &lt;element name="mnrGrp" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mnr" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MiniRulesType"/>
 *                   &lt;element name="mnrDetails" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mnrRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_176648S"/>
 *                             &lt;element name="dateInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType_182345S" maxOccurs="16" minOccurs="0"/>
 *                             &lt;element name="catGrp" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="catInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CategDescrType"/>
 *                                       &lt;element name="monInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType" minOccurs="0"/>
 *                                       &lt;element name="mnrTimeBoundPenalties" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PenaltyDetailsType_232330S" maxOccurs="8" minOccurs="0"/>
 *                                       &lt;element name="statusInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}StatusType" minOccurs="0"/>
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
 *         &lt;element name="offersGroup" maxOccurs="70" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="response" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ApplicationType"/>
 *                   &lt;element name="warningMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78544S" minOccurs="0"/>
 *                   &lt;element name="offers" maxOccurs="100000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="offerDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferType"/>
 *                             &lt;element name="timeLimits" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType_220498S" minOccurs="0"/>
 *                             &lt;element name="offerItems" maxOccurs="1000" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="offerItemDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferItemType"/>
 *                                       &lt;element name="references" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S" maxOccurs="10" minOccurs="0"/>
 *                                       &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="9" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="combinabilityIds" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CombinabilityReferencesType" minOccurs="0"/>
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
 *         &lt;element name="virtualInterlining" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itinerary" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TopologyType"/>
 *                   &lt;element name="recommendation" maxOccurs="1000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="details" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}VirtualInterlineRecommendationType"/>
 *                             &lt;element name="element" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}VirtualInterliningCombinationType" maxOccurs="50" minOccurs="0"/>
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
 *         &lt;element name="amenitiesGroup" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}GroupAmenities" minOccurs="0"/>
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
    "replyStatus",
    "carbonEmissionBySourceDetails",
    "errorMessage",
    "conversionRate",
    "solutionFamily",
    "familyInformation",
    "amountInfoForAllPax",
    "amountInfoPerPax",
    "feeDetails",
    "bucketInfo",
    "themeIdText",
    "dictionary",
    "additionalInfo",
    "companyIdText",
    "officeIdDetails",
    "programDetails",
    "milesAccrual",
    "initialEMDInfo",
    "emdRecommendation",
    "flightIndex",
    "recommendation",
    "otherSolutions",
    "warningInfo",
    "globalInformation",
    "serviceFeesGrp",
    "multiDimensionRef",
    "value",
    "mnrGrp",
    "offersGroup",
    "virtualInterlining",
    "amenitiesGroup"
})
@XmlRootElement(name = "Fare_MasterPricerTravelBoardSearchReply")
public class FareMasterPricerTravelBoardSearchReply {

    protected StatusType224999S replyStatus;
    protected CarbonEmissionSourceDetailType carbonEmissionBySourceDetails;
    protected FareMasterPricerTravelBoardSearchReply.ErrorMessage errorMessage;
    protected ConversionRateTypeI conversionRate;
    protected List<FareInformationType> solutionFamily;
    protected List<FareFamilyType> familyInformation;
    protected FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax amountInfoForAllPax;
    protected List<FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax> amountInfoPerPax;
    protected List<FareMasterPricerTravelBoardSearchReply.FeeDetails> feeDetails;
    protected List<BucketInformationType> bucketInfo;
    protected List<ThemeTextType> themeIdText;
    protected List<FareMasterPricerTravelBoardSearchReply.Dictionary> dictionary;
    protected List<FareMasterPricerTravelBoardSearchReply.AdditionalInfo> additionalInfo;
    protected List<CompanyIdentificationTextType> companyIdText;
    protected List<FareMasterPricerTravelBoardSearchReply.OfficeIdDetails> officeIdDetails;
    protected List<ProgramCodeType> programDetails;
    protected List<FareMasterPricerTravelBoardSearchReply.MilesAccrual> milesAccrual;
    protected List<FareMasterPricerTravelBoardSearchReply.InitialEMDInfo> initialEMDInfo;
    protected List<FareMasterPricerTravelBoardSearchReply.EmdRecommendation> emdRecommendation;
    protected List<FareMasterPricerTravelBoardSearchReply.FlightIndex> flightIndex;
    protected List<FareMasterPricerTravelBoardSearchReply.Recommendation> recommendation;
    protected List<FareMasterPricerTravelBoardSearchReply.OtherSolutions> otherSolutions;
    protected List<FareMasterPricerTravelBoardSearchReply.WarningInfo> warningInfo;
    protected List<FareMasterPricerTravelBoardSearchReply.GlobalInformation> globalInformation;
    protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp> serviceFeesGrp;
    protected List<MultiDimensionalValueType> multiDimensionRef;
    protected List<ValueSearchCriteriaType> value;
    protected FareMasterPricerTravelBoardSearchReply.MnrGrp mnrGrp;
    protected List<FareMasterPricerTravelBoardSearchReply.OffersGroup> offersGroup;
    protected List<FareMasterPricerTravelBoardSearchReply.VirtualInterlining> virtualInterlining;
    protected GroupAmenities amenitiesGroup;

    /**
     * Gets the value of the replyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType224999S }
     *     
     */
    public StatusType224999S getReplyStatus() {
        return replyStatus;
    }

    /**
     * Sets the value of the replyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType224999S }
     *     
     */
    public void setReplyStatus(StatusType224999S value) {
        this.replyStatus = value;
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
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FareMasterPricerTravelBoardSearchReply.ErrorMessage }
     *     
     */
    public FareMasterPricerTravelBoardSearchReply.ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareMasterPricerTravelBoardSearchReply.ErrorMessage }
     *     
     */
    public void setErrorMessage(FareMasterPricerTravelBoardSearchReply.ErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public ConversionRateTypeI getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public void setConversionRate(ConversionRateTypeI value) {
        this.conversionRate = value;
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
     * Gets the value of the familyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareFamilyType }
     * 
     * 
     */
    public List<FareFamilyType> getFamilyInformation() {
        if (familyInformation == null) {
            familyInformation = new ArrayList<FareFamilyType>();
        }
        return this.familyInformation;
    }

    /**
     * Gets the value of the amountInfoForAllPax property.
     * 
     * @return
     *     possible object is
     *     {@link FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax }
     *     
     */
    public FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax getAmountInfoForAllPax() {
        return amountInfoForAllPax;
    }

    /**
     * Sets the value of the amountInfoForAllPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax }
     *     
     */
    public void setAmountInfoForAllPax(FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax value) {
        this.amountInfoForAllPax = value;
    }

    /**
     * Gets the value of the amountInfoPerPax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountInfoPerPax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountInfoPerPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax> getAmountInfoPerPax() {
        if (amountInfoPerPax == null) {
            amountInfoPerPax = new ArrayList<FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax>();
        }
        return this.amountInfoPerPax;
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
     * {@link FareMasterPricerTravelBoardSearchReply.FeeDetails }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.FeeDetails> getFeeDetails() {
        if (feeDetails == null) {
            feeDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.FeeDetails>();
        }
        return this.feeDetails;
    }

    /**
     * Gets the value of the bucketInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bucketInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBucketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BucketInformationType }
     * 
     * 
     */
    public List<BucketInformationType> getBucketInfo() {
        if (bucketInfo == null) {
            bucketInfo = new ArrayList<BucketInformationType>();
        }
        return this.bucketInfo;
    }

    /**
     * Gets the value of the themeIdText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeIdText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeIdText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeTextType }
     * 
     * 
     */
    public List<ThemeTextType> getThemeIdText() {
        if (themeIdText == null) {
            themeIdText = new ArrayList<ThemeTextType>();
        }
        return this.themeIdText;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.Dictionary }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.Dictionary> getDictionary() {
        if (dictionary == null) {
            dictionary = new ArrayList<FareMasterPricerTravelBoardSearchReply.Dictionary>();
        }
        return this.dictionary;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.AdditionalInfo }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<FareMasterPricerTravelBoardSearchReply.AdditionalInfo>();
        }
        return this.additionalInfo;
    }

    /**
     * Gets the value of the companyIdText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyIdText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyIdText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyIdentificationTextType }
     * 
     * 
     */
    public List<CompanyIdentificationTextType> getCompanyIdText() {
        if (companyIdText == null) {
            companyIdText = new ArrayList<CompanyIdentificationTextType>();
        }
        return this.companyIdText;
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
     * {@link FareMasterPricerTravelBoardSearchReply.OfficeIdDetails }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.OfficeIdDetails> getOfficeIdDetails() {
        if (officeIdDetails == null) {
            officeIdDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.OfficeIdDetails>();
        }
        return this.officeIdDetails;
    }

    /**
     * Gets the value of the programDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramCodeType }
     * 
     * 
     */
    public List<ProgramCodeType> getProgramDetails() {
        if (programDetails == null) {
            programDetails = new ArrayList<ProgramCodeType>();
        }
        return this.programDetails;
    }

    /**
     * Gets the value of the milesAccrual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milesAccrual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilesAccrual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.MilesAccrual }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.MilesAccrual> getMilesAccrual() {
        if (milesAccrual == null) {
            milesAccrual = new ArrayList<FareMasterPricerTravelBoardSearchReply.MilesAccrual>();
        }
        return this.milesAccrual;
    }

    /**
     * Gets the value of the initialEMDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialEMDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialEMDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.InitialEMDInfo }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.InitialEMDInfo> getInitialEMDInfo() {
        if (initialEMDInfo == null) {
            initialEMDInfo = new ArrayList<FareMasterPricerTravelBoardSearchReply.InitialEMDInfo>();
        }
        return this.initialEMDInfo;
    }

    /**
     * Gets the value of the emdRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmdRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.EmdRecommendation }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.EmdRecommendation> getEmdRecommendation() {
        if (emdRecommendation == null) {
            emdRecommendation = new ArrayList<FareMasterPricerTravelBoardSearchReply.EmdRecommendation>();
        }
        return this.emdRecommendation;
    }

    /**
     * Gets the value of the flightIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.FlightIndex }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.FlightIndex> getFlightIndex() {
        if (flightIndex == null) {
            flightIndex = new ArrayList<FareMasterPricerTravelBoardSearchReply.FlightIndex>();
        }
        return this.flightIndex;
    }

    /**
     * Gets the value of the recommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.Recommendation }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.Recommendation> getRecommendation() {
        if (recommendation == null) {
            recommendation = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation>();
        }
        return this.recommendation;
    }

    /**
     * Gets the value of the otherSolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.OtherSolutions }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.OtherSolutions> getOtherSolutions() {
        if (otherSolutions == null) {
            otherSolutions = new ArrayList<FareMasterPricerTravelBoardSearchReply.OtherSolutions>();
        }
        return this.otherSolutions;
    }

    /**
     * Gets the value of the warningInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.WarningInfo }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.WarningInfo> getWarningInfo() {
        if (warningInfo == null) {
            warningInfo = new ArrayList<FareMasterPricerTravelBoardSearchReply.WarningInfo>();
        }
        return this.warningInfo;
    }

    /**
     * Gets the value of the globalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.GlobalInformation }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.GlobalInformation> getGlobalInformation() {
        if (globalInformation == null) {
            globalInformation = new ArrayList<FareMasterPricerTravelBoardSearchReply.GlobalInformation>();
        }
        return this.globalInformation;
    }

    /**
     * Gets the value of the serviceFeesGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeesGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeesGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp> getServiceFeesGrp() {
        if (serviceFeesGrp == null) {
            serviceFeesGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp>();
        }
        return this.serviceFeesGrp;
    }

    /**
     * Gets the value of the multiDimensionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiDimensionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiDimensionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiDimensionalValueType }
     * 
     * 
     */
    public List<MultiDimensionalValueType> getMultiDimensionRef() {
        if (multiDimensionRef == null) {
            multiDimensionRef = new ArrayList<MultiDimensionalValueType>();
        }
        return this.multiDimensionRef;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSearchCriteriaType }
     * 
     * 
     */
    public List<ValueSearchCriteriaType> getValue() {
        if (value == null) {
            value = new ArrayList<ValueSearchCriteriaType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the mnrGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FareMasterPricerTravelBoardSearchReply.MnrGrp }
     *     
     */
    public FareMasterPricerTravelBoardSearchReply.MnrGrp getMnrGrp() {
        return mnrGrp;
    }

    /**
     * Sets the value of the mnrGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareMasterPricerTravelBoardSearchReply.MnrGrp }
     *     
     */
    public void setMnrGrp(FareMasterPricerTravelBoardSearchReply.MnrGrp value) {
        this.mnrGrp = value;
    }

    /**
     * Gets the value of the offersGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offersGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffersGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.OffersGroup }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.OffersGroup> getOffersGroup() {
        if (offersGroup == null) {
            offersGroup = new ArrayList<FareMasterPricerTravelBoardSearchReply.OffersGroup>();
        }
        return this.offersGroup;
    }

    /**
     * Gets the value of the virtualInterlining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualInterlining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualInterlining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareMasterPricerTravelBoardSearchReply.VirtualInterlining }
     * 
     * 
     */
    public List<FareMasterPricerTravelBoardSearchReply.VirtualInterlining> getVirtualInterlining() {
        if (virtualInterlining == null) {
            virtualInterlining = new ArrayList<FareMasterPricerTravelBoardSearchReply.VirtualInterlining>();
        }
        return this.virtualInterlining;
    }

    /**
     * Gets the value of the amenitiesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GroupAmenities }
     *     
     */
    public GroupAmenities getAmenitiesGroup() {
        return amenitiesGroup;
    }

    /**
     * Sets the value of the amenitiesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAmenities }
     *     
     */
    public void setAmenitiesGroup(GroupAmenities value) {
        this.amenitiesGroup = value;
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
     *         &lt;element name="identDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductIdentificationType"/>
     *         &lt;element name="dateInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateTimePeriodType" minOccurs="0"/>
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
        "identDetails",
        "dateInfo"
    })
    public static class AdditionalInfo {

        @XmlElement(required = true)
        protected ProductIdentificationType identDetails;
        protected DateTimePeriodType dateInfo;

        /**
         * Gets the value of the identDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ProductIdentificationType }
         *     
         */
        public ProductIdentificationType getIdentDetails() {
            return identDetails;
        }

        /**
         * Sets the value of the identDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductIdentificationType }
         *     
         */
        public void setIdentDetails(ProductIdentificationType value) {
            this.identDetails = value;
        }

        /**
         * Gets the value of the dateInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimePeriodType }
         *     
         */
        public DateTimePeriodType getDateInfo() {
            return dateInfo;
        }

        /**
         * Sets the value of the dateInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimePeriodType }
         *     
         */
        public void setDateInfo(DateTimePeriodType value) {
            this.dateInfo = value;
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
     *         &lt;element name="itineraryAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S"/>
     *         &lt;element name="amountsPerSgt" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S"/>
     *                   &lt;element name="amounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
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
        "itineraryAmounts",
        "amountsPerSgt"
    })
    public static class AmountInfoForAllPax {

        @XmlElement(required = true)
        protected MonetaryInformationType228104S itineraryAmounts;
        protected List<FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt> amountsPerSgt;

        /**
         * Gets the value of the itineraryAmounts property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType228104S }
         *     
         */
        public MonetaryInformationType228104S getItineraryAmounts() {
            return itineraryAmounts;
        }

        /**
         * Sets the value of the itineraryAmounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType228104S }
         *     
         */
        public void setItineraryAmounts(MonetaryInformationType228104S value) {
            this.itineraryAmounts = value;
        }

        /**
         * Gets the value of the amountsPerSgt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amountsPerSgt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmountsPerSgt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt> getAmountsPerSgt() {
            if (amountsPerSgt == null) {
                amountsPerSgt = new ArrayList<FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt>();
            }
            return this.amountsPerSgt;
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
         *         &lt;element name="sgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S"/>
         *         &lt;element name="amounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
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
            "sgtRef",
            "amounts"
        })
        public static class AmountsPerSgt {

            @XmlElement(required = true)
            protected ReferenceInfoType133176S sgtRef;
            protected MonetaryInformationType228104S amounts;

            /**
             * Gets the value of the sgtRef property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType133176S }
             *     
             */
            public ReferenceInfoType133176S getSgtRef() {
                return sgtRef;
            }

            /**
             * Sets the value of the sgtRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType133176S }
             *     
             */
            public void setSgtRef(ReferenceInfoType133176S value) {
                this.sgtRef = value;
            }

            /**
             * Gets the value of the amounts property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType228104S }
             *     
             */
            public MonetaryInformationType228104S getAmounts() {
                return amounts;
            }

            /**
             * Sets the value of the amounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType228104S }
             *     
             */
            public void setAmounts(MonetaryInformationType228104S value) {
                this.amounts = value;
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
     *         &lt;element name="paxRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
     *         &lt;element name="paxAttributes" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
     *         &lt;element name="itineraryAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S"/>
     *         &lt;element name="amountsPerSgt" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S"/>
     *                   &lt;element name="amounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
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
        "paxRef",
        "paxAttributes",
        "itineraryAmounts",
        "amountsPerSgt"
    })
    public static class AmountInfoPerPax {

        @XmlElement(required = true)
        protected SpecificTravellerType paxRef;
        protected FareInformationType80868S paxAttributes;
        @XmlElement(required = true)
        protected MonetaryInformationType228104S itineraryAmounts;
        protected List<FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt> amountsPerSgt;

        /**
         * Gets the value of the paxRef property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificTravellerType }
         *     
         */
        public SpecificTravellerType getPaxRef() {
            return paxRef;
        }

        /**
         * Sets the value of the paxRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificTravellerType }
         *     
         */
        public void setPaxRef(SpecificTravellerType value) {
            this.paxRef = value;
        }

        /**
         * Gets the value of the paxAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationType80868S }
         *     
         */
        public FareInformationType80868S getPaxAttributes() {
            return paxAttributes;
        }

        /**
         * Sets the value of the paxAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationType80868S }
         *     
         */
        public void setPaxAttributes(FareInformationType80868S value) {
            this.paxAttributes = value;
        }

        /**
         * Gets the value of the itineraryAmounts property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType228104S }
         *     
         */
        public MonetaryInformationType228104S getItineraryAmounts() {
            return itineraryAmounts;
        }

        /**
         * Sets the value of the itineraryAmounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType228104S }
         *     
         */
        public void setItineraryAmounts(MonetaryInformationType228104S value) {
            this.itineraryAmounts = value;
        }

        /**
         * Gets the value of the amountsPerSgt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amountsPerSgt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmountsPerSgt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt> getAmountsPerSgt() {
            if (amountsPerSgt == null) {
                amountsPerSgt = new ArrayList<FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt>();
            }
            return this.amountsPerSgt;
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
         *         &lt;element name="sgtRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S"/>
         *         &lt;element name="amounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
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
            "sgtRef",
            "amounts"
        })
        public static class AmountsPerSgt {

            @XmlElement(required = true)
            protected ReferenceInfoType133176S sgtRef;
            protected MonetaryInformationType228104S amounts;

            /**
             * Gets the value of the sgtRef property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType133176S }
             *     
             */
            public ReferenceInfoType133176S getSgtRef() {
                return sgtRef;
            }

            /**
             * Sets the value of the sgtRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType133176S }
             *     
             */
            public void setSgtRef(ReferenceInfoType133176S value) {
                this.sgtRef = value;
            }

            /**
             * Gets the value of the amounts property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType228104S }
             *     
             */
            public MonetaryInformationType228104S getAmounts() {
                return amounts;
            }

            /**
             * Sets the value of the amounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType228104S }
             *     
             */
            public void setAmounts(MonetaryInformationType228104S value) {
                this.amounts = value;
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
     *         &lt;element name="category" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductGroupInformationType"/>
     *         &lt;element name="element" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}KeywordType" maxOccurs="200" minOccurs="0"/>
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
        "category",
        "element"
    })
    public static class Dictionary {

        @XmlElement(required = true)
        protected ProductGroupInformationType category;
        protected List<KeywordType> element;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link ProductGroupInformationType }
         *     
         */
        public ProductGroupInformationType getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductGroupInformationType }
         *     
         */
        public void setCategory(ProductGroupInformationType value) {
            this.category = value;
        }

        /**
         * Gets the value of the element property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KeywordType }
         * 
         * 
         */
        public List<KeywordType> getElement() {
            if (element == null) {
                element = new ArrayList<KeywordType>();
            }
            return this.element;
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
     *         &lt;element name="edmRecoId" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ElementManagementSegmentType"/>
     *         &lt;element name="emdRecoAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
     *         &lt;element name="emdRecoPaxDetails" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="emdPaxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType"/>
     *                   &lt;element name="emdPaxAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
     *                   &lt;element name="emdRecoDetails" maxOccurs="100" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="emdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CouponInformationType"/>
     *                             &lt;element name="srvCoverageRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_212767S" minOccurs="0"/>
     *                             &lt;element name="emdDetailAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
     *                             &lt;element name="emdError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ErrorGroupType" minOccurs="0"/>
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
        "edmRecoId",
        "emdRecoAmounts",
        "emdRecoPaxDetails"
    })
    public static class EmdRecommendation {

        @XmlElement(required = true)
        protected ElementManagementSegmentType edmRecoId;
        protected MonetaryInformationType212672S emdRecoAmounts;
        protected List<FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails> emdRecoPaxDetails;

        /**
         * Gets the value of the edmRecoId property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public ElementManagementSegmentType getEdmRecoId() {
            return edmRecoId;
        }

        /**
         * Sets the value of the edmRecoId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public void setEdmRecoId(ElementManagementSegmentType value) {
            this.edmRecoId = value;
        }

        /**
         * Gets the value of the emdRecoAmounts property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType212672S }
         *     
         */
        public MonetaryInformationType212672S getEmdRecoAmounts() {
            return emdRecoAmounts;
        }

        /**
         * Sets the value of the emdRecoAmounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType212672S }
         *     
         */
        public void setEmdRecoAmounts(MonetaryInformationType212672S value) {
            this.emdRecoAmounts = value;
        }

        /**
         * Gets the value of the emdRecoPaxDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emdRecoPaxDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmdRecoPaxDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails> getEmdRecoPaxDetails() {
            if (emdRecoPaxDetails == null) {
                emdRecoPaxDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails>();
            }
            return this.emdRecoPaxDetails;
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
         *         &lt;element name="emdPaxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType"/>
         *         &lt;element name="emdPaxAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
         *         &lt;element name="emdRecoDetails" maxOccurs="100" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="emdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CouponInformationType"/>
         *                   &lt;element name="srvCoverageRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_212767S" minOccurs="0"/>
         *                   &lt;element name="emdDetailAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
         *                   &lt;element name="emdError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ErrorGroupType" minOccurs="0"/>
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
            "emdPaxReference",
            "emdPaxAmounts",
            "emdRecoDetails"
        })
        public static class EmdRecoPaxDetails {

            @XmlElement(required = true)
            protected TravellerReferenceInformationType emdPaxReference;
            protected MonetaryInformationType212672S emdPaxAmounts;
            protected List<FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails.EmdRecoDetails> emdRecoDetails;

            /**
             * Gets the value of the emdPaxReference property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerReferenceInformationType }
             *     
             */
            public TravellerReferenceInformationType getEmdPaxReference() {
                return emdPaxReference;
            }

            /**
             * Sets the value of the emdPaxReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerReferenceInformationType }
             *     
             */
            public void setEmdPaxReference(TravellerReferenceInformationType value) {
                this.emdPaxReference = value;
            }

            /**
             * Gets the value of the emdPaxAmounts property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType212672S }
             *     
             */
            public MonetaryInformationType212672S getEmdPaxAmounts() {
                return emdPaxAmounts;
            }

            /**
             * Sets the value of the emdPaxAmounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType212672S }
             *     
             */
            public void setEmdPaxAmounts(MonetaryInformationType212672S value) {
                this.emdPaxAmounts = value;
            }

            /**
             * Gets the value of the emdRecoDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the emdRecoDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmdRecoDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails.EmdRecoDetails }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails.EmdRecoDetails> getEmdRecoDetails() {
                if (emdRecoDetails == null) {
                    emdRecoDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.EmdRecommendation.EmdRecoPaxDetails.EmdRecoDetails>();
                }
                return this.emdRecoDetails;
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
             *         &lt;element name="emdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CouponInformationType"/>
             *         &lt;element name="srvCoverageRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_212767S" minOccurs="0"/>
             *         &lt;element name="emdDetailAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212672S" minOccurs="0"/>
             *         &lt;element name="emdError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ErrorGroupType" minOccurs="0"/>
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
                "emdReference",
                "srvCoverageRef",
                "emdDetailAmounts",
                "emdError"
            })
            public static class EmdRecoDetails {

                @XmlElement(required = true)
                protected CouponInformationType emdReference;
                protected ReferenceInfoType212767S srvCoverageRef;
                protected MonetaryInformationType212672S emdDetailAmounts;
                protected ErrorGroupType emdError;

                /**
                 * Gets the value of the emdReference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CouponInformationType }
                 *     
                 */
                public CouponInformationType getEmdReference() {
                    return emdReference;
                }

                /**
                 * Sets the value of the emdReference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CouponInformationType }
                 *     
                 */
                public void setEmdReference(CouponInformationType value) {
                    this.emdReference = value;
                }

                /**
                 * Gets the value of the srvCoverageRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType212767S }
                 *     
                 */
                public ReferenceInfoType212767S getSrvCoverageRef() {
                    return srvCoverageRef;
                }

                /**
                 * Sets the value of the srvCoverageRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType212767S }
                 *     
                 */
                public void setSrvCoverageRef(ReferenceInfoType212767S value) {
                    this.srvCoverageRef = value;
                }

                /**
                 * Gets the value of the emdDetailAmounts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType212672S }
                 *     
                 */
                public MonetaryInformationType212672S getEmdDetailAmounts() {
                    return emdDetailAmounts;
                }

                /**
                 * Sets the value of the emdDetailAmounts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType212672S }
                 *     
                 */
                public void setEmdDetailAmounts(MonetaryInformationType212672S value) {
                    this.emdDetailAmounts = value;
                }

                /**
                 * Gets the value of the emdError property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ErrorGroupType }
                 *     
                 */
                public ErrorGroupType getEmdError() {
                    return emdError;
                }

                /**
                 * Sets the value of the emdError property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ErrorGroupType }
                 *     
                 */
                public void setEmdError(ErrorGroupType value) {
                    this.emdError = value;
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
     *         &lt;element name="applicationError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ApplicationErrorInformationType_78543S"/>
     *         &lt;element name="errorMessageText" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78544S" minOccurs="0"/>
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
        "applicationError",
        "errorMessageText"
    })
    public static class ErrorMessage {

        @XmlElement(required = true)
        protected ApplicationErrorInformationType78543S applicationError;
        protected InteractiveFreeTextType78544S errorMessageText;

        /**
         * Gets the value of the applicationError property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationType78543S }
         *     
         */
        public ApplicationErrorInformationType78543S getApplicationError() {
            return applicationError;
        }

        /**
         * Sets the value of the applicationError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationType78543S }
         *     
         */
        public void setApplicationError(ApplicationErrorInformationType78543S value) {
            this.applicationError = value;
        }

        /**
         * Gets the value of the errorMessageText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextType78544S }
         *     
         */
        public InteractiveFreeTextType78544S getErrorMessageText() {
            return errorMessageText;
        }

        /**
         * Sets the value of the errorMessageText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextType78544S }
         *     
         */
        public void setErrorMessageText(InteractiveFreeTextType78544S value) {
            this.errorMessageText = value;
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
     *         &lt;element name="feeReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType_78564S"/>
     *         &lt;element name="feeInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
     *         &lt;element name="feeParameters" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeType_78561S" minOccurs="0"/>
     *         &lt;element name="convertedOrOriginalInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ConversionRateTypeI_78562S" minOccurs="0"/>
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
        "feeReference",
        "feeInformation",
        "feeParameters",
        "convertedOrOriginalInfo"
    })
    public static class FeeDetails {

        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType78564S feeReference;
        protected DiscountAndPenaltyInformationType feeInformation;
        protected AttributeType78561S feeParameters;
        protected ConversionRateTypeI78562S convertedOrOriginalInfo;

        /**
         * Gets the value of the feeReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType78564S }
         *     
         */
        public ItemReferencesAndVersionsType78564S getFeeReference() {
            return feeReference;
        }

        /**
         * Sets the value of the feeReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType78564S }
         *     
         */
        public void setFeeReference(ItemReferencesAndVersionsType78564S value) {
            this.feeReference = value;
        }

        /**
         * Gets the value of the feeInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public DiscountAndPenaltyInformationType getFeeInformation() {
            return feeInformation;
        }

        /**
         * Sets the value of the feeInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public void setFeeInformation(DiscountAndPenaltyInformationType value) {
            this.feeInformation = value;
        }

        /**
         * Gets the value of the feeParameters property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType78561S }
         *     
         */
        public AttributeType78561S getFeeParameters() {
            return feeParameters;
        }

        /**
         * Sets the value of the feeParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType78561S }
         *     
         */
        public void setFeeParameters(AttributeType78561S value) {
            this.feeParameters = value;
        }

        /**
         * Gets the value of the convertedOrOriginalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI78562S }
         *     
         */
        public ConversionRateTypeI78562S getConvertedOrOriginalInfo() {
            return convertedOrOriginalInfo;
        }

        /**
         * Sets the value of the convertedOrOriginalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI78562S }
         *     
         */
        public void setConvertedOrOriginalInfo(ConversionRateTypeI78562S value) {
            this.convertedOrOriginalInfo = value;
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
     *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
     *         &lt;element name="referenceCarbonEmission" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonFootprintType" minOccurs="0"/>
     *         &lt;element name="groupOfFlights" maxOccurs="100000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProposedSegmentType"/>
     *                   &lt;element name="flightDetails" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravelProductType"/>
     *                             &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
     *                             &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
     *                             &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
     *                             &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="flightCharacteristics" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightCharacteristicsType" minOccurs="0"/>
     *                             &lt;element name="flightServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightServicesType" maxOccurs="9" minOccurs="0"/>
     *                             &lt;element name="mealServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MealServicesType" minOccurs="0"/>
     *                             &lt;element name="flightRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227042S" minOccurs="0"/>
     *                             &lt;element name="estimatedCarbonEmission" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonFootprintType" minOccurs="0"/>
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
     *         &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}NumberOfUnitsType" minOccurs="0"/>
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
        "referenceCarbonEmission",
        "groupOfFlights",
        "nbOfUnits"
    })
    public static class FlightIndex {

        @XmlElement(required = true)
        protected OriginAndDestinationRequestType requestedSegmentRef;
        protected CarbonFootprintType referenceCarbonEmission;
        @XmlElement(required = true)
        protected List<FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights> groupOfFlights;
        protected NumberOfUnitsType nbOfUnits;

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
         * Gets the value of the referenceCarbonEmission property.
         * 
         * @return
         *     possible object is
         *     {@link CarbonFootprintType }
         *     
         */
        public CarbonFootprintType getReferenceCarbonEmission() {
            return referenceCarbonEmission;
        }

        /**
         * Sets the value of the referenceCarbonEmission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CarbonFootprintType }
         *     
         */
        public void setReferenceCarbonEmission(CarbonFootprintType value) {
            this.referenceCarbonEmission = value;
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
         * {@link FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights> getGroupOfFlights() {
            if (groupOfFlights == null) {
                groupOfFlights = new ArrayList<FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights>();
            }
            return this.groupOfFlights;
        }

        /**
         * Gets the value of the nbOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getNbOfUnits() {
            return nbOfUnits;
        }

        /**
         * Sets the value of the nbOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setNbOfUnits(NumberOfUnitsType value) {
            this.nbOfUnits = value;
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
         *         &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProposedSegmentType"/>
         *         &lt;element name="flightDetails" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravelProductType"/>
         *                   &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
         *                   &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
         *                   &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
         *                   &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="flightCharacteristics" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightCharacteristicsType" minOccurs="0"/>
         *                   &lt;element name="flightServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightServicesType" maxOccurs="9" minOccurs="0"/>
         *                   &lt;element name="mealServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MealServicesType" minOccurs="0"/>
         *                   &lt;element name="flightRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227042S" minOccurs="0"/>
         *                   &lt;element name="estimatedCarbonEmission" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonFootprintType" minOccurs="0"/>
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
            protected List<FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights.FlightDetails> flightDetails;

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
             * {@link FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights.FlightDetails }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights.FlightDetails> getFlightDetails() {
                if (flightDetails == null) {
                    flightDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights.FlightDetails>();
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
             *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravelProductType"/>
             *         &lt;element name="avlInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType" maxOccurs="6" minOccurs="0"/>
             *         &lt;element name="technicalStop" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
             *         &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CommercialAgreementsType" minOccurs="0"/>
             *         &lt;element name="addInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}HeaderInformationTypeI" minOccurs="0"/>
             *         &lt;element name="flightCharacteristics" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightCharacteristicsType" minOccurs="0"/>
             *         &lt;element name="flightServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightServicesType" maxOccurs="9" minOccurs="0"/>
             *         &lt;element name="mealServices" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MealServicesType" minOccurs="0"/>
             *         &lt;element name="flightRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227042S" minOccurs="0"/>
             *         &lt;element name="estimatedCarbonEmission" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CarbonFootprintType" minOccurs="0"/>
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
                "flightCharacteristics",
                "flightServices",
                "mealServices",
                "flightRef",
                "estimatedCarbonEmission"
            })
            public static class FlightDetails {

                @XmlElement(required = true)
                protected TravelProductType flightInformation;
                protected List<FlightProductInformationType> avlInfo;
                protected List<DateAndTimeInformationType> technicalStop;
                protected CommercialAgreementsType commercialAgreement;
                protected HeaderInformationTypeI addInfo;
                protected FlightCharacteristicsType flightCharacteristics;
                protected List<FlightServicesType> flightServices;
                protected MealServicesType mealServices;
                protected ReferenceInfoType227042S flightRef;
                protected CarbonFootprintType estimatedCarbonEmission;

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
                 *     {@link CommercialAgreementsType }
                 *     
                 */
                public CommercialAgreementsType getCommercialAgreement() {
                    return commercialAgreement;
                }

                /**
                 * Sets the value of the commercialAgreement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommercialAgreementsType }
                 *     
                 */
                public void setCommercialAgreement(CommercialAgreementsType value) {
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
                 * Gets the value of the flightCharacteristics property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightCharacteristicsType }
                 *     
                 */
                public FlightCharacteristicsType getFlightCharacteristics() {
                    return flightCharacteristics;
                }

                /**
                 * Sets the value of the flightCharacteristics property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightCharacteristicsType }
                 *     
                 */
                public void setFlightCharacteristics(FlightCharacteristicsType value) {
                    this.flightCharacteristics = value;
                }

                /**
                 * Gets the value of the flightServices property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the flightServices property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFlightServices().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightServicesType }
                 * 
                 * 
                 */
                public List<FlightServicesType> getFlightServices() {
                    if (flightServices == null) {
                        flightServices = new ArrayList<FlightServicesType>();
                    }
                    return this.flightServices;
                }

                /**
                 * Gets the value of the mealServices property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MealServicesType }
                 *     
                 */
                public MealServicesType getMealServices() {
                    return mealServices;
                }

                /**
                 * Sets the value of the mealServices property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MealServicesType }
                 *     
                 */
                public void setMealServices(MealServicesType value) {
                    this.mealServices = value;
                }

                /**
                 * Gets the value of the flightRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType227042S }
                 *     
                 */
                public ReferenceInfoType227042S getFlightRef() {
                    return flightRef;
                }

                /**
                 * Sets the value of the flightRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType227042S }
                 *     
                 */
                public void setFlightRef(ReferenceInfoType227042S value) {
                    this.flightRef = value;
                }

                /**
                 * Gets the value of the estimatedCarbonEmission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CarbonFootprintType }
                 *     
                 */
                public CarbonFootprintType getEstimatedCarbonEmission() {
                    return estimatedCarbonEmission;
                }

                /**
                 * Sets the value of the estimatedCarbonEmission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CarbonFootprintType }
                 *     
                 */
                public void setEstimatedCarbonEmission(CarbonFootprintType value) {
                    this.estimatedCarbonEmission = value;
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
     *         &lt;element name="attributes" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType_78535S"/>
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
        "attributes"
    })
    public static class GlobalInformation {

        @XmlElement(required = true)
        protected CodedAttributeType78535S attributes;

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType78535S }
         *     
         */
        public CodedAttributeType78535S getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType78535S }
         *     
         */
        public void setAttributes(CodedAttributeType78535S value) {
            this.attributes = value;
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
     *         &lt;element name="emdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CouponInformationType"/>
     *         &lt;element name="emdPaxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" minOccurs="0"/>
     *         &lt;element name="emdAmounts" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_212668S" minOccurs="0"/>
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
        "emdReference",
        "emdPaxReference",
        "emdAmounts"
    })
    public static class InitialEMDInfo {

        @XmlElement(required = true)
        protected CouponInformationType emdReference;
        protected TravellerReferenceInformationType emdPaxReference;
        protected MonetaryInformationType212668S emdAmounts;

        /**
         * Gets the value of the emdReference property.
         * 
         * @return
         *     possible object is
         *     {@link CouponInformationType }
         *     
         */
        public CouponInformationType getEmdReference() {
            return emdReference;
        }

        /**
         * Sets the value of the emdReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link CouponInformationType }
         *     
         */
        public void setEmdReference(CouponInformationType value) {
            this.emdReference = value;
        }

        /**
         * Gets the value of the emdPaxReference property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerReferenceInformationType }
         *     
         */
        public TravellerReferenceInformationType getEmdPaxReference() {
            return emdPaxReference;
        }

        /**
         * Sets the value of the emdPaxReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerReferenceInformationType }
         *     
         */
        public void setEmdPaxReference(TravellerReferenceInformationType value) {
            this.emdPaxReference = value;
        }

        /**
         * Gets the value of the emdAmounts property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType212668S }
         *     
         */
        public MonetaryInformationType212668S getEmdAmounts() {
            return emdAmounts;
        }

        /**
         * Sets the value of the emdAmounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType212668S }
         *     
         */
        public void setEmdAmounts(MonetaryInformationType212668S value) {
            this.emdAmounts = value;
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
     *         &lt;element name="milesAccrualId" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemDescriptionType"/>
     *         &lt;element name="milesAccrualDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProgramCodeType_209757S" maxOccurs="20" minOccurs="0"/>
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
        "milesAccrualId",
        "milesAccrualDetails"
    })
    public static class MilesAccrual {

        @XmlElement(required = true)
        protected ItemDescriptionType milesAccrualId;
        protected List<ProgramCodeType209757S> milesAccrualDetails;

        /**
         * Gets the value of the milesAccrualId property.
         * 
         * @return
         *     possible object is
         *     {@link ItemDescriptionType }
         *     
         */
        public ItemDescriptionType getMilesAccrualId() {
            return milesAccrualId;
        }

        /**
         * Sets the value of the milesAccrualId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemDescriptionType }
         *     
         */
        public void setMilesAccrualId(ItemDescriptionType value) {
            this.milesAccrualId = value;
        }

        /**
         * Gets the value of the milesAccrualDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the milesAccrualDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMilesAccrualDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramCodeType209757S }
         * 
         * 
         */
        public List<ProgramCodeType209757S> getMilesAccrualDetails() {
            if (milesAccrualDetails == null) {
                milesAccrualDetails = new ArrayList<ProgramCodeType209757S>();
            }
            return this.milesAccrualDetails;
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
     *         &lt;element name="mnr" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MiniRulesType"/>
     *         &lt;element name="mnrDetails" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mnrRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_176648S"/>
     *                   &lt;element name="dateInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType_182345S" maxOccurs="16" minOccurs="0"/>
     *                   &lt;element name="catGrp" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="catInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CategDescrType"/>
     *                             &lt;element name="monInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType" minOccurs="0"/>
     *                             &lt;element name="mnrTimeBoundPenalties" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PenaltyDetailsType_232330S" maxOccurs="8" minOccurs="0"/>
     *                             &lt;element name="statusInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}StatusType" minOccurs="0"/>
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
        "mnr",
        "mnrDetails"
    })
    public static class MnrGrp {

        @XmlElement(required = true)
        protected MiniRulesType mnr;
        protected List<FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails> mnrDetails;

        /**
         * Gets the value of the mnr property.
         * 
         * @return
         *     possible object is
         *     {@link MiniRulesType }
         *     
         */
        public MiniRulesType getMnr() {
            return mnr;
        }

        /**
         * Sets the value of the mnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiniRulesType }
         *     
         */
        public void setMnr(MiniRulesType value) {
            this.mnr = value;
        }

        /**
         * Gets the value of the mnrDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnrDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMnrDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails> getMnrDetails() {
            if (mnrDetails == null) {
                mnrDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails>();
            }
            return this.mnrDetails;
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
         *         &lt;element name="mnrRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_176648S"/>
         *         &lt;element name="dateInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType_182345S" maxOccurs="16" minOccurs="0"/>
         *         &lt;element name="catGrp" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="catInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CategDescrType"/>
         *                   &lt;element name="monInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType" minOccurs="0"/>
         *                   &lt;element name="mnrTimeBoundPenalties" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PenaltyDetailsType_232330S" maxOccurs="8" minOccurs="0"/>
         *                   &lt;element name="statusInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}StatusType" minOccurs="0"/>
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
            "mnrRef",
            "dateInfo",
            "catGrp"
        })
        public static class MnrDetails {

            @XmlElement(required = true)
            protected ItemNumberType176648S mnrRef;
            protected List<DateAndTimeInformationType182345S> dateInfo;
            protected List<FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails.CatGrp> catGrp;

            /**
             * Gets the value of the mnrRef property.
             * 
             * @return
             *     possible object is
             *     {@link ItemNumberType176648S }
             *     
             */
            public ItemNumberType176648S getMnrRef() {
                return mnrRef;
            }

            /**
             * Sets the value of the mnrRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemNumberType176648S }
             *     
             */
            public void setMnrRef(ItemNumberType176648S value) {
                this.mnrRef = value;
            }

            /**
             * Gets the value of the dateInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dateInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDateInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DateAndTimeInformationType182345S }
             * 
             * 
             */
            public List<DateAndTimeInformationType182345S> getDateInfo() {
                if (dateInfo == null) {
                    dateInfo = new ArrayList<DateAndTimeInformationType182345S>();
                }
                return this.dateInfo;
            }

            /**
             * Gets the value of the catGrp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the catGrp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCatGrp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails.CatGrp }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails.CatGrp> getCatGrp() {
                if (catGrp == null) {
                    catGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails.CatGrp>();
                }
                return this.catGrp;
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
             *         &lt;element name="catInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CategDescrType"/>
             *         &lt;element name="monInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType" minOccurs="0"/>
             *         &lt;element name="mnrTimeBoundPenalties" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PenaltyDetailsType_232330S" maxOccurs="8" minOccurs="0"/>
             *         &lt;element name="statusInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}StatusType" minOccurs="0"/>
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
                "catInfo",
                "monInfo",
                "mnrTimeBoundPenalties",
                "statusInfo"
            })
            public static class CatGrp {

                @XmlElement(required = true)
                protected CategDescrType catInfo;
                protected MonetaryInformationType monInfo;
                protected List<PenaltyDetailsType232330S> mnrTimeBoundPenalties;
                protected StatusType statusInfo;

                /**
                 * Gets the value of the catInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CategDescrType }
                 *     
                 */
                public CategDescrType getCatInfo() {
                    return catInfo;
                }

                /**
                 * Sets the value of the catInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CategDescrType }
                 *     
                 */
                public void setCatInfo(CategDescrType value) {
                    this.catInfo = value;
                }

                /**
                 * Gets the value of the monInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public MonetaryInformationType getMonInfo() {
                    return monInfo;
                }

                /**
                 * Sets the value of the monInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public void setMonInfo(MonetaryInformationType value) {
                    this.monInfo = value;
                }

                /**
                 * Gets the value of the mnrTimeBoundPenalties property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mnrTimeBoundPenalties property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMnrTimeBoundPenalties().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PenaltyDetailsType232330S }
                 * 
                 * 
                 */
                public List<PenaltyDetailsType232330S> getMnrTimeBoundPenalties() {
                    if (mnrTimeBoundPenalties == null) {
                        mnrTimeBoundPenalties = new ArrayList<PenaltyDetailsType232330S>();
                    }
                    return this.mnrTimeBoundPenalties;
                }

                /**
                 * Gets the value of the statusInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType }
                 *     
                 */
                public StatusType getStatusInfo() {
                    return statusInfo;
                }

                /**
                 * Sets the value of the statusInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType }
                 *     
                 */
                public void setStatusInfo(StatusType value) {
                    this.statusInfo = value;
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
     *         &lt;element name="response" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ApplicationType"/>
     *         &lt;element name="warningMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78544S" minOccurs="0"/>
     *         &lt;element name="offers" maxOccurs="100000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="offerDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferType"/>
     *                   &lt;element name="timeLimits" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType_220498S" minOccurs="0"/>
     *                   &lt;element name="offerItems" maxOccurs="1000" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="offerItemDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferItemType"/>
     *                             &lt;element name="references" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S" maxOccurs="10" minOccurs="0"/>
     *                             &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="9" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="combinabilityIds" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CombinabilityReferencesType" minOccurs="0"/>
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
        "response",
        "warningMessage",
        "offers"
    })
    public static class OffersGroup {

        @XmlElement(required = true)
        protected ApplicationType response;
        protected InteractiveFreeTextType78544S warningMessage;
        protected List<FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers> offers;

        /**
         * Gets the value of the response property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationType }
         *     
         */
        public ApplicationType getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationType }
         *     
         */
        public void setResponse(ApplicationType value) {
            this.response = value;
        }

        /**
         * Gets the value of the warningMessage property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextType78544S }
         *     
         */
        public InteractiveFreeTextType78544S getWarningMessage() {
            return warningMessage;
        }

        /**
         * Sets the value of the warningMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextType78544S }
         *     
         */
        public void setWarningMessage(InteractiveFreeTextType78544S value) {
            this.warningMessage = value;
        }

        /**
         * Gets the value of the offers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers> getOffers() {
            if (offers == null) {
                offers = new ArrayList<FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers>();
            }
            return this.offers;
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
         *         &lt;element name="offerDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferType"/>
         *         &lt;element name="timeLimits" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DateAndTimeInformationType_220498S" minOccurs="0"/>
         *         &lt;element name="offerItems" maxOccurs="1000" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="offerItemDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferItemType"/>
         *                   &lt;element name="references" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S" maxOccurs="10" minOccurs="0"/>
         *                   &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="9" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="combinabilityIds" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CombinabilityReferencesType" minOccurs="0"/>
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
            "offerDetails",
            "timeLimits",
            "offerItems",
            "combinabilityIds"
        })
        public static class Offers {

            @XmlElement(required = true)
            protected OfferType offerDetails;
            protected DateAndTimeInformationType220498S timeLimits;
            protected List<FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers.OfferItems> offerItems;
            protected CombinabilityReferencesType combinabilityIds;

            /**
             * Gets the value of the offerDetails property.
             * 
             * @return
             *     possible object is
             *     {@link OfferType }
             *     
             */
            public OfferType getOfferDetails() {
                return offerDetails;
            }

            /**
             * Sets the value of the offerDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferType }
             *     
             */
            public void setOfferDetails(OfferType value) {
                this.offerDetails = value;
            }

            /**
             * Gets the value of the timeLimits property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType220498S }
             *     
             */
            public DateAndTimeInformationType220498S getTimeLimits() {
                return timeLimits;
            }

            /**
             * Sets the value of the timeLimits property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType220498S }
             *     
             */
            public void setTimeLimits(DateAndTimeInformationType220498S value) {
                this.timeLimits = value;
            }

            /**
             * Gets the value of the offerItems property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offerItems property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOfferItems().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers.OfferItems }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers.OfferItems> getOfferItems() {
                if (offerItems == null) {
                    offerItems = new ArrayList<FareMasterPricerTravelBoardSearchReply.OffersGroup.Offers.OfferItems>();
                }
                return this.offerItems;
            }

            /**
             * Gets the value of the combinabilityIds property.
             * 
             * @return
             *     possible object is
             *     {@link CombinabilityReferencesType }
             *     
             */
            public CombinabilityReferencesType getCombinabilityIds() {
                return combinabilityIds;
            }

            /**
             * Sets the value of the combinabilityIds property.
             * 
             * @param value
             *     allowed object is
             *     {@link CombinabilityReferencesType }
             *     
             */
            public void setCombinabilityIds(CombinabilityReferencesType value) {
                this.combinabilityIds = value;
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
             *         &lt;element name="offerItemDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OfferItemType"/>
             *         &lt;element name="references" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S" maxOccurs="10" minOccurs="0"/>
             *         &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="9" minOccurs="0"/>
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
                "offerItemDetails",
                "references",
                "paxReference"
            })
            public static class OfferItems {

                @XmlElement(required = true)
                protected OfferItemType offerItemDetails;
                protected List<ReferenceInfoType165972S> references;
                protected List<TravellerReferenceInformationType> paxReference;

                /**
                 * Gets the value of the offerItemDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferItemType }
                 *     
                 */
                public OfferItemType getOfferItemDetails() {
                    return offerItemDetails;
                }

                /**
                 * Sets the value of the offerItemDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferItemType }
                 *     
                 */
                public void setOfferItemDetails(OfferItemType value) {
                    this.offerItemDetails = value;
                }

                /**
                 * Gets the value of the references property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the references property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReferences().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReferenceInfoType165972S }
                 * 
                 * 
                 */
                public List<ReferenceInfoType165972S> getReferences() {
                    if (references == null) {
                        references = new ArrayList<ReferenceInfoType165972S>();
                    }
                    return this.references;
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
                 * {@link TravellerReferenceInformationType }
                 * 
                 * 
                 */
                public List<TravellerReferenceInformationType> getPaxReference() {
                    if (paxReference == null) {
                        paxReference = new ArrayList<TravellerReferenceInformationType>();
                    }
                    return this.paxReference;
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
     *         &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}UserIdentificationType"/>
     *         &lt;element name="officeIdReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType_78536S"/>
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
        "officeIdReference"
    })
    public static class OfficeIdDetails {

        @XmlElement(required = true)
        protected UserIdentificationType officeIdInformation;
        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType78536S officeIdReference;

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
         * Gets the value of the officeIdReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType78536S }
         *     
         */
        public ItemReferencesAndVersionsType78536S getOfficeIdReference() {
            return officeIdReference;
        }

        /**
         * Sets the value of the officeIdReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType78536S }
         *     
         */
        public void setOfficeIdReference(ItemReferencesAndVersionsType78536S value) {
            this.officeIdReference = value;
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
     *         &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SequenceDetailsTypeU"/>
     *         &lt;element name="amtGroup" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ref" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S"/>
     *                   &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="psgInfo" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ref" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SegmentRepetitionControlTypeI"/>
     *                   &lt;element name="description" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="freqTraveller" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
     *                   &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="fare" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_161491S" minOccurs="0"/>
     *                   &lt;element name="attribute" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeTypeU" maxOccurs="10" minOccurs="0"/>
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
        "reference",
        "amtGroup",
        "psgInfo"
    })
    public static class OtherSolutions {

        @XmlElement(required = true)
        protected SequenceDetailsTypeU reference;
        protected List<FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup> amtGroup;
        protected List<FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo> psgInfo;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link SequenceDetailsTypeU }
         *     
         */
        public SequenceDetailsTypeU getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link SequenceDetailsTypeU }
         *     
         */
        public void setReference(SequenceDetailsTypeU value) {
            this.reference = value;
        }

        /**
         * Gets the value of the amtGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amtGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmtGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup> getAmtGroup() {
            if (amtGroup == null) {
                amtGroup = new ArrayList<FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup>();
            }
            return this.amtGroup;
        }

        /**
         * Gets the value of the psgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the psgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPsgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo> getPsgInfo() {
            if (psgInfo == null) {
                psgInfo = new ArrayList<FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo>();
            }
            return this.psgInfo;
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
         *         &lt;element name="ref" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_165972S"/>
         *         &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
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
            "ref",
            "amount"
        })
        public static class AmtGroup {

            @XmlElement(required = true)
            protected ReferenceInfoType165972S ref;
            protected MonetaryInformationTypeI amount;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType165972S }
             *     
             */
            public ReferenceInfoType165972S getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType165972S }
             *     
             */
            public void setRef(ReferenceInfoType165972S value) {
                this.ref = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setAmount(MonetaryInformationTypeI value) {
                this.amount = value;
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
         *         &lt;element name="ref" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SegmentRepetitionControlTypeI"/>
         *         &lt;element name="description" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationTypeI" minOccurs="0"/>
         *         &lt;element name="freqTraveller" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
         *         &lt;element name="amount" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationTypeI" minOccurs="0"/>
         *         &lt;element name="fare" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_161491S" minOccurs="0"/>
         *         &lt;element name="attribute" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeTypeU" maxOccurs="10" minOccurs="0"/>
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
            "ref",
            "description",
            "freqTraveller",
            "amount",
            "fare",
            "attribute"
        })
        public static class PsgInfo {

            @XmlElement(required = true)
            protected SegmentRepetitionControlTypeI ref;
            protected FareInformationTypeI description;
            protected FrequentTravellerIdentificationCodeType freqTraveller;
            protected MonetaryInformationTypeI amount;
            protected FlightProductInformationType161491S fare;
            protected List<AttributeTypeU> attribute;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentRepetitionControlTypeI }
             *     
             */
            public SegmentRepetitionControlTypeI getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentRepetitionControlTypeI }
             *     
             */
            public void setRef(SegmentRepetitionControlTypeI value) {
                this.ref = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link FareInformationTypeI }
             *     
             */
            public FareInformationTypeI getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareInformationTypeI }
             *     
             */
            public void setDescription(FareInformationTypeI value) {
                this.description = value;
            }

            /**
             * Gets the value of the freqTraveller property.
             * 
             * @return
             *     possible object is
             *     {@link FrequentTravellerIdentificationCodeType }
             *     
             */
            public FrequentTravellerIdentificationCodeType getFreqTraveller() {
                return freqTraveller;
            }

            /**
             * Sets the value of the freqTraveller property.
             * 
             * @param value
             *     allowed object is
             *     {@link FrequentTravellerIdentificationCodeType }
             *     
             */
            public void setFreqTraveller(FrequentTravellerIdentificationCodeType value) {
                this.freqTraveller = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setAmount(MonetaryInformationTypeI value) {
                this.amount = value;
            }

            /**
             * Gets the value of the fare property.
             * 
             * @return
             *     possible object is
             *     {@link FlightProductInformationType161491S }
             *     
             */
            public FlightProductInformationType161491S getFare() {
                return fare;
            }

            /**
             * Sets the value of the fare property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightProductInformationType161491S }
             *     
             */
            public void setFare(FlightProductInformationType161491S value) {
                this.fare = value;
            }

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttributeTypeU }
             * 
             * 
             */
            public List<AttributeTypeU> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<AttributeTypeU>();
                }
                return this.attribute;
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
     *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_232143S"/>
     *         &lt;element name="emdError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ErrorGroupType_366245G" minOccurs="0"/>
     *         &lt;element name="warningMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78544S" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="fareFamilyRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_133176S" minOccurs="0"/>
     *         &lt;element name="recPriceInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S"/>
     *         &lt;element name="miniRule" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MiniRulesType_78547S" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="segmentFlightRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType" maxOccurs="100009" minOccurs="0"/>
     *         &lt;element name="recommandationSegmentsFareDetails" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="recommendationSegRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
     *                   &lt;element name="segmentMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
     *                   &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_224557S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="paxFareProduct" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paxFareDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType_228122S"/>
     *                   &lt;element name="feeRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_214315S" minOccurs="0"/>
     *                   &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="6" minOccurs="0"/>
     *                   &lt;element name="passengerRange" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}RangeDetailsType" minOccurs="0"/>
     *                   &lt;element name="passengerTaxDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TaxType" minOccurs="0"/>
     *                   &lt;element name="tourInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TourInformationType" minOccurs="0"/>
     *                   &lt;element name="fare" maxOccurs="7" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78559S"/>
     *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_199534S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fareDetails" maxOccurs="6">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="segmentRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
     *                             &lt;element name="groupOfFares" maxOccurs="4" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="productInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_227082S"/>
     *                                       &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
     *                                       &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareQualifierDetailsType" minOccurs="0"/>
     *                                       &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227141S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
     *                             &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInformationType" minOccurs="0"/>
     *                             &lt;element name="majCabin" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductInformationType" maxOccurs="10" minOccurs="0"/>
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
     *         &lt;element name="specificRecDetails" maxOccurs="100000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="specificRecItem" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType"/>
     *                   &lt;element name="specificProductDetails" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="productReferences" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType"/>
     *                             &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType_134833S"/>
     *                                       &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_223656S"/>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="distributionMethod" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MethodType" minOccurs="0"/>
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
        "itemNumber",
        "emdError",
        "warningMessage",
        "fareFamilyRef",
        "recPriceInfo",
        "miniRule",
        "segmentFlightRef",
        "recommandationSegmentsFareDetails",
        "paxFareProduct",
        "specificRecDetails",
        "distributionMethod"
    })
    public static class Recommendation {

        @XmlElement(required = true)
        protected ItemNumberType232143S itemNumber;
        protected ErrorGroupType366245G emdError;
        protected List<InteractiveFreeTextType78544S> warningMessage;
        protected ReferenceInfoType133176S fareFamilyRef;
        @XmlElement(required = true)
        protected MonetaryInformationType204470S recPriceInfo;
        protected List<MiniRulesType78547S> miniRule;
        protected List<ReferenceInfoType> segmentFlightRef;
        protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails> recommandationSegmentsFareDetails;
        @XmlElement(required = true)
        protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct> paxFareProduct;
        protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails> specificRecDetails;
        protected MethodType distributionMethod;

        /**
         * Gets the value of the itemNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ItemNumberType232143S }
         *     
         */
        public ItemNumberType232143S getItemNumber() {
            return itemNumber;
        }

        /**
         * Sets the value of the itemNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemNumberType232143S }
         *     
         */
        public void setItemNumber(ItemNumberType232143S value) {
            this.itemNumber = value;
        }

        /**
         * Gets the value of the emdError property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorGroupType366245G }
         *     
         */
        public ErrorGroupType366245G getEmdError() {
            return emdError;
        }

        /**
         * Sets the value of the emdError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorGroupType366245G }
         *     
         */
        public void setEmdError(ErrorGroupType366245G value) {
            this.emdError = value;
        }

        /**
         * Gets the value of the warningMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractiveFreeTextType78544S }
         * 
         * 
         */
        public List<InteractiveFreeTextType78544S> getWarningMessage() {
            if (warningMessage == null) {
                warningMessage = new ArrayList<InteractiveFreeTextType78544S>();
            }
            return this.warningMessage;
        }

        /**
         * Gets the value of the fareFamilyRef property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType133176S }
         *     
         */
        public ReferenceInfoType133176S getFareFamilyRef() {
            return fareFamilyRef;
        }

        /**
         * Sets the value of the fareFamilyRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType133176S }
         *     
         */
        public void setFareFamilyRef(ReferenceInfoType133176S value) {
            this.fareFamilyRef = value;
        }

        /**
         * Gets the value of the recPriceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType204470S }
         *     
         */
        public MonetaryInformationType204470S getRecPriceInfo() {
            return recPriceInfo;
        }

        /**
         * Sets the value of the recPriceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType204470S }
         *     
         */
        public void setRecPriceInfo(MonetaryInformationType204470S value) {
            this.recPriceInfo = value;
        }

        /**
         * Gets the value of the miniRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the miniRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiniRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRulesType78547S }
         * 
         * 
         */
        public List<MiniRulesType78547S> getMiniRule() {
            if (miniRule == null) {
                miniRule = new ArrayList<MiniRulesType78547S>();
            }
            return this.miniRule;
        }

        /**
         * Gets the value of the segmentFlightRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentFlightRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentFlightRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType }
         * 
         * 
         */
        public List<ReferenceInfoType> getSegmentFlightRef() {
            if (segmentFlightRef == null) {
                segmentFlightRef = new ArrayList<ReferenceInfoType>();
            }
            return this.segmentFlightRef;
        }

        /**
         * Gets the value of the recommandationSegmentsFareDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommandationSegmentsFareDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommandationSegmentsFareDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails> getRecommandationSegmentsFareDetails() {
            if (recommandationSegmentsFareDetails == null) {
                recommandationSegmentsFareDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails>();
            }
            return this.recommandationSegmentsFareDetails;
        }

        /**
         * Gets the value of the paxFareProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxFareProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxFareProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct> getPaxFareProduct() {
            if (paxFareProduct == null) {
                paxFareProduct = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct>();
            }
            return this.paxFareProduct;
        }

        /**
         * Gets the value of the specificRecDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specificRecDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecificRecDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails> getSpecificRecDetails() {
            if (specificRecDetails == null) {
                specificRecDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails>();
            }
            return this.specificRecDetails;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="paxFareDetail" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType_228122S"/>
         *         &lt;element name="feeRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_214315S" minOccurs="0"/>
         *         &lt;element name="paxReference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TravellerReferenceInformationType" maxOccurs="6" minOccurs="0"/>
         *         &lt;element name="passengerRange" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}RangeDetailsType" minOccurs="0"/>
         *         &lt;element name="passengerTaxDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TaxType" minOccurs="0"/>
         *         &lt;element name="tourInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TourInformationType" minOccurs="0"/>
         *         &lt;element name="fare" maxOccurs="7" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78559S"/>
         *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_199534S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fareDetails" maxOccurs="6">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="segmentRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
         *                   &lt;element name="groupOfFares" maxOccurs="4" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="productInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_227082S"/>
         *                             &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
         *                             &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareQualifierDetailsType" minOccurs="0"/>
         *                             &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227141S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
         *                   &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInformationType" minOccurs="0"/>
         *                   &lt;element name="majCabin" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductInformationType" maxOccurs="10" minOccurs="0"/>
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
            "paxFareDetail",
            "feeRef",
            "paxReference",
            "passengerRange",
            "passengerTaxDetails",
            "tourInformation",
            "fare",
            "fareDetails"
        })
        public static class PaxFareProduct {

            @XmlElement(required = true)
            protected PricingTicketingSubsequentType228122S paxFareDetail;
            protected ReferenceInfoType214315S feeRef;
            protected List<TravellerReferenceInformationType> paxReference;
            protected RangeDetailsType passengerRange;
            protected TaxType passengerTaxDetails;
            protected TourInformationType tourInformation;
            protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.Fare> fare;
            @XmlElement(required = true)
            protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails> fareDetails;

            /**
             * Gets the value of the paxFareDetail property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingSubsequentType228122S }
             *     
             */
            public PricingTicketingSubsequentType228122S getPaxFareDetail() {
                return paxFareDetail;
            }

            /**
             * Sets the value of the paxFareDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingSubsequentType228122S }
             *     
             */
            public void setPaxFareDetail(PricingTicketingSubsequentType228122S value) {
                this.paxFareDetail = value;
            }

            /**
             * Gets the value of the feeRef property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType214315S }
             *     
             */
            public ReferenceInfoType214315S getFeeRef() {
                return feeRef;
            }

            /**
             * Sets the value of the feeRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType214315S }
             *     
             */
            public void setFeeRef(ReferenceInfoType214315S value) {
                this.feeRef = value;
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
             * {@link TravellerReferenceInformationType }
             * 
             * 
             */
            public List<TravellerReferenceInformationType> getPaxReference() {
                if (paxReference == null) {
                    paxReference = new ArrayList<TravellerReferenceInformationType>();
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
             * Gets the value of the passengerTaxDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TaxType }
             *     
             */
            public TaxType getPassengerTaxDetails() {
                return passengerTaxDetails;
            }

            /**
             * Sets the value of the passengerTaxDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxType }
             *     
             */
            public void setPassengerTaxDetails(TaxType value) {
                this.passengerTaxDetails = value;
            }

            /**
             * Gets the value of the tourInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TourInformationType }
             *     
             */
            public TourInformationType getTourInformation() {
                return tourInformation;
            }

            /**
             * Sets the value of the tourInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TourInformationType }
             *     
             */
            public void setTourInformation(TourInformationType value) {
                this.tourInformation = value;
            }

            /**
             * Gets the value of the fare property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fare property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFare().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.Fare }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.Fare> getFare() {
                if (fare == null) {
                    fare = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.Fare>();
                }
                return this.fare;
            }

            /**
             * Gets the value of the fareDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails> getFareDetails() {
                if (fareDetails == null) {
                    fareDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails>();
                }
                return this.fareDetails;
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
             *         &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_78559S"/>
             *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_199534S" minOccurs="0"/>
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
                "pricingMessage",
                "monetaryInformation"
            })
            public static class Fare {

                @XmlElement(required = true)
                protected InteractiveFreeTextType78559S pricingMessage;
                protected MonetaryInformationType199534S monetaryInformation;

                /**
                 * Gets the value of the pricingMessage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeTextType78559S }
                 *     
                 */
                public InteractiveFreeTextType78559S getPricingMessage() {
                    return pricingMessage;
                }

                /**
                 * Sets the value of the pricingMessage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeTextType78559S }
                 *     
                 */
                public void setPricingMessage(InteractiveFreeTextType78559S value) {
                    this.pricingMessage = value;
                }

                /**
                 * Gets the value of the monetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType199534S }
                 *     
                 */
                public MonetaryInformationType199534S getMonetaryInformation() {
                    return monetaryInformation;
                }

                /**
                 * Sets the value of the monetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType199534S }
                 *     
                 */
                public void setMonetaryInformation(MonetaryInformationType199534S value) {
                    this.monetaryInformation = value;
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
             *         &lt;element name="segmentRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
             *         &lt;element name="groupOfFares" maxOccurs="4" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="productInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_227082S"/>
             *                   &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
             *                   &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareQualifierDetailsType" minOccurs="0"/>
             *                   &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227141S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
             *         &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInformationType" minOccurs="0"/>
             *         &lt;element name="majCabin" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ProductInformationType" maxOccurs="10" minOccurs="0"/>
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
                "segmentRef",
                "groupOfFares",
                "psgSegMonetaryInformation",
                "reference",
                "majCabin"
            })
            public static class FareDetails {

                @XmlElement(required = true)
                protected OriginAndDestinationRequestType segmentRef;
                protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares> groupOfFares;
                protected MonetaryInformationType228104S psgSegMonetaryInformation;
                protected ReferenceInformationType reference;
                protected List<ProductInformationType> majCabin;

                /**
                 * Gets the value of the segmentRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginAndDestinationRequestType }
                 *     
                 */
                public OriginAndDestinationRequestType getSegmentRef() {
                    return segmentRef;
                }

                /**
                 * Sets the value of the segmentRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginAndDestinationRequestType }
                 *     
                 */
                public void setSegmentRef(OriginAndDestinationRequestType value) {
                    this.segmentRef = value;
                }

                /**
                 * Gets the value of the groupOfFares property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the groupOfFares property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGroupOfFares().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares }
                 * 
                 * 
                 */
                public List<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares> getGroupOfFares() {
                    if (groupOfFares == null) {
                        groupOfFares = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares>();
                    }
                    return this.groupOfFares;
                }

                /**
                 * Gets the value of the psgSegMonetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType228104S }
                 *     
                 */
                public MonetaryInformationType228104S getPsgSegMonetaryInformation() {
                    return psgSegMonetaryInformation;
                }

                /**
                 * Sets the value of the psgSegMonetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType228104S }
                 *     
                 */
                public void setPsgSegMonetaryInformation(MonetaryInformationType228104S value) {
                    this.psgSegMonetaryInformation = value;
                }

                /**
                 * Gets the value of the reference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformationType }
                 *     
                 */
                public ReferenceInformationType getReference() {
                    return reference;
                }

                /**
                 * Sets the value of the reference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformationType }
                 *     
                 */
                public void setReference(ReferenceInformationType value) {
                    this.reference = value;
                }

                /**
                 * Gets the value of the majCabin property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the majCabin property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMajCabin().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProductInformationType }
                 * 
                 * 
                 */
                public List<ProductInformationType> getMajCabin() {
                    if (majCabin == null) {
                        majCabin = new ArrayList<ProductInformationType>();
                    }
                    return this.majCabin;
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
                 *         &lt;element name="productInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_227082S"/>
                 *         &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
                 *         &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareQualifierDetailsType" minOccurs="0"/>
                 *         &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_227141S" minOccurs="0"/>
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
                    "productInformation",
                    "fareCalculationCodeDetails",
                    "ticketInfos",
                    "fareFamiliesRef"
                })
                public static class GroupOfFares {

                    @XmlElement(required = true)
                    protected FlightProductInformationType227082S productInformation;
                    protected List<FareCalculationCodeDetailsType> fareCalculationCodeDetails;
                    protected FareQualifierDetailsType ticketInfos;
                    protected ReferenceInfoType227141S fareFamiliesRef;

                    /**
                     * Gets the value of the productInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FlightProductInformationType227082S }
                     *     
                     */
                    public FlightProductInformationType227082S getProductInformation() {
                        return productInformation;
                    }

                    /**
                     * Sets the value of the productInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FlightProductInformationType227082S }
                     *     
                     */
                    public void setProductInformation(FlightProductInformationType227082S value) {
                        this.productInformation = value;
                    }

                    /**
                     * Gets the value of the fareCalculationCodeDetails property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fareCalculationCodeDetails property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFareCalculationCodeDetails().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FareCalculationCodeDetailsType }
                     * 
                     * 
                     */
                    public List<FareCalculationCodeDetailsType> getFareCalculationCodeDetails() {
                        if (fareCalculationCodeDetails == null) {
                            fareCalculationCodeDetails = new ArrayList<FareCalculationCodeDetailsType>();
                        }
                        return this.fareCalculationCodeDetails;
                    }

                    /**
                     * Gets the value of the ticketInfos property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetailsType }
                     *     
                     */
                    public FareQualifierDetailsType getTicketInfos() {
                        return ticketInfos;
                    }

                    /**
                     * Sets the value of the ticketInfos property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetailsType }
                     *     
                     */
                    public void setTicketInfos(FareQualifierDetailsType value) {
                        this.ticketInfos = value;
                    }

                    /**
                     * Gets the value of the fareFamiliesRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReferenceInfoType227141S }
                     *     
                     */
                    public ReferenceInfoType227141S getFareFamiliesRef() {
                        return fareFamiliesRef;
                    }

                    /**
                     * Sets the value of the fareFamiliesRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReferenceInfoType227141S }
                     *     
                     */
                    public void setFareFamiliesRef(ReferenceInfoType227141S value) {
                        this.fareFamiliesRef = value;
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
         *         &lt;element name="recommendationSegRef" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType"/>
         *         &lt;element name="segmentMonetaryInformation" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_228104S" minOccurs="0"/>
         *         &lt;element name="reference" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_224557S" minOccurs="0"/>
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
            "recommendationSegRef",
            "segmentMonetaryInformation",
            "reference"
        })
        public static class RecommandationSegmentsFareDetails {

            @XmlElement(required = true)
            protected OriginAndDestinationRequestType recommendationSegRef;
            protected MonetaryInformationType228104S segmentMonetaryInformation;
            protected ReferenceInfoType224557S reference;

            /**
             * Gets the value of the recommendationSegRef property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public OriginAndDestinationRequestType getRecommendationSegRef() {
                return recommendationSegRef;
            }

            /**
             * Sets the value of the recommendationSegRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public void setRecommendationSegRef(OriginAndDestinationRequestType value) {
                this.recommendationSegRef = value;
            }

            /**
             * Gets the value of the segmentMonetaryInformation property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType228104S }
             *     
             */
            public MonetaryInformationType228104S getSegmentMonetaryInformation() {
                return segmentMonetaryInformation;
            }

            /**
             * Sets the value of the segmentMonetaryInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType228104S }
             *     
             */
            public void setSegmentMonetaryInformation(MonetaryInformationType228104S value) {
                this.segmentMonetaryInformation = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType224557S }
             *     
             */
            public ReferenceInfoType224557S getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType224557S }
             *     
             */
            public void setReference(ReferenceInfoType224557S value) {
                this.reference = value;
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
         *         &lt;element name="specificRecItem" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemReferencesAndVersionsType"/>
         *         &lt;element name="specificProductDetails" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="productReferences" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType"/>
         *                   &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType_134833S"/>
         *                             &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_223656S"/>
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
            "specificRecItem",
            "specificProductDetails"
        })
        public static class SpecificRecDetails {

            @XmlElement(required = true)
            protected ItemReferencesAndVersionsType specificRecItem;
            protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails> specificProductDetails;

            /**
             * Gets the value of the specificRecItem property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getSpecificRecItem() {
                return specificRecItem;
            }

            /**
             * Sets the value of the specificRecItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setSpecificRecItem(ItemReferencesAndVersionsType value) {
                this.specificRecItem = value;
            }

            /**
             * Gets the value of the specificProductDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specificProductDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecificProductDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails> getSpecificProductDetails() {
                if (specificProductDetails == null) {
                    specificProductDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails>();
                }
                return this.specificProductDetails;
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
             *         &lt;element name="productReferences" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}PricingTicketingSubsequentType"/>
             *         &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType_134833S"/>
             *                   &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_223656S"/>
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
                "productReferences",
                "fareContextDetails"
            })
            public static class SpecificProductDetails {

                @XmlElement(required = true)
                protected PricingTicketingSubsequentType productReferences;
                protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails> fareContextDetails;

                /**
                 * Gets the value of the productReferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricingTicketingSubsequentType }
                 *     
                 */
                public PricingTicketingSubsequentType getProductReferences() {
                    return productReferences;
                }

                /**
                 * Sets the value of the productReferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingTicketingSubsequentType }
                 *     
                 */
                public void setProductReferences(PricingTicketingSubsequentType value) {
                    this.productReferences = value;
                }

                /**
                 * Gets the value of the fareContextDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fareContextDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFareContextDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails }
                 * 
                 * 
                 */
                public List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails> getFareContextDetails() {
                    if (fareContextDetails == null) {
                        fareContextDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails>();
                    }
                    return this.fareContextDetails;
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
                 *         &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}OriginAndDestinationRequestType_134833S"/>
                 *         &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_223656S"/>
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
                    "requestedSegmentInfo",
                    "cnxContextDetails"
                })
                public static class FareContextDetails {

                    @XmlElement(required = true)
                    protected OriginAndDestinationRequestType134833S requestedSegmentInfo;
                    protected List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails> cnxContextDetails;

                    /**
                     * Gets the value of the requestedSegmentInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OriginAndDestinationRequestType134833S }
                     *     
                     */
                    public OriginAndDestinationRequestType134833S getRequestedSegmentInfo() {
                        return requestedSegmentInfo;
                    }

                    /**
                     * Sets the value of the requestedSegmentInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OriginAndDestinationRequestType134833S }
                     *     
                     */
                    public void setRequestedSegmentInfo(OriginAndDestinationRequestType134833S value) {
                        this.requestedSegmentInfo = value;
                    }

                    /**
                     * Gets the value of the cnxContextDetails property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the cnxContextDetails property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCnxContextDetails().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails }
                     * 
                     * 
                     */
                    public List<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails> getCnxContextDetails() {
                        if (cnxContextDetails == null) {
                            cnxContextDetails = new ArrayList<FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails>();
                        }
                        return this.cnxContextDetails;
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
                     *         &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FlightProductInformationType_223656S"/>
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
                        "fareCnxInfo"
                    })
                    public static class CnxContextDetails {

                        @XmlElement(required = true)
                        protected FlightProductInformationType223656S fareCnxInfo;

                        /**
                         * Gets the value of the fareCnxInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FlightProductInformationType223656S }
                         *     
                         */
                        public FlightProductInformationType223656S getFareCnxInfo() {
                            return fareCnxInfo;
                        }

                        /**
                         * Sets the value of the fareCnxInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FlightProductInformationType223656S }
                         *     
                         */
                        public void setFareCnxInfo(FlightProductInformationType223656S value) {
                            this.fareCnxInfo = value;
                        }

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
     *         &lt;element name="serviceTypeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SelectionDetailsType"/>
     *         &lt;element name="serviceFeeRefGrp" maxOccurs="100000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="serviceCoverageInfoGrp" maxOccurs="100000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType"/>
     *                   &lt;element name="serviceCovInfoGrp" maxOccurs="200" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
     *                             &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
     *                             &lt;element name="carrierInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TransportIdentifierType" minOccurs="0"/>
     *                             &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S" minOccurs="0"/>
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
     *         &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DummySegmentTypeI"/>
     *         &lt;element name="serviceFeeInfoGrp" maxOccurs="100000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType"/>
     *                   &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S"/>
     *                             &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
     *                                       &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
     *                                       &lt;element name="amountInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S" minOccurs="0"/>
     *                                       &lt;element name="attributeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType" maxOccurs="10" minOccurs="0"/>
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
     *         &lt;element name="serviceDetailsGrp" maxOccurs="1000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceOptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificDataInformationType"/>
     *                   &lt;element name="feeDescriptionGrp" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_80866S"/>
     *                             &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeType" minOccurs="0"/>
     *                             &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
     *                             &lt;element name="commercialName" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType" minOccurs="0"/>
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
     *         &lt;element name="freeBagAllowanceGrp" maxOccurs="100000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="freeBagAllownceInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ExcessBaggageType"/>
     *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_166130S" minOccurs="0"/>
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
        "serviceTypeInfo",
        "serviceFeeRefGrp",
        "serviceCoverageInfoGrp",
        "globalMessageMarker",
        "serviceFeeInfoGrp",
        "serviceDetailsGrp",
        "freeBagAllowanceGrp"
    })
    public static class ServiceFeesGrp {

        @XmlElement(required = true)
        protected SelectionDetailsType serviceTypeInfo;
        protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp> serviceFeeRefGrp;
        protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp> serviceCoverageInfoGrp;
        @XmlElement(required = true)
        protected DummySegmentTypeI globalMessageMarker;
        protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp> serviceFeeInfoGrp;
        protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp> serviceDetailsGrp;
        protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp> freeBagAllowanceGrp;

        /**
         * Gets the value of the serviceTypeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsType }
         *     
         */
        public SelectionDetailsType getServiceTypeInfo() {
            return serviceTypeInfo;
        }

        /**
         * Sets the value of the serviceTypeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsType }
         *     
         */
        public void setServiceTypeInfo(SelectionDetailsType value) {
            this.serviceTypeInfo = value;
        }

        /**
         * Gets the value of the serviceFeeRefGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeeRefGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeeRefGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp> getServiceFeeRefGrp() {
            if (serviceFeeRefGrp == null) {
                serviceFeeRefGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp>();
            }
            return this.serviceFeeRefGrp;
        }

        /**
         * Gets the value of the serviceCoverageInfoGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCoverageInfoGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCoverageInfoGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp> getServiceCoverageInfoGrp() {
            if (serviceCoverageInfoGrp == null) {
                serviceCoverageInfoGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp>();
            }
            return this.serviceCoverageInfoGrp;
        }

        /**
         * Gets the value of the globalMessageMarker property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getGlobalMessageMarker() {
            return globalMessageMarker;
        }

        /**
         * Sets the value of the globalMessageMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setGlobalMessageMarker(DummySegmentTypeI value) {
            this.globalMessageMarker = value;
        }

        /**
         * Gets the value of the serviceFeeInfoGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfoGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeeInfoGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp> getServiceFeeInfoGrp() {
            if (serviceFeeInfoGrp == null) {
                serviceFeeInfoGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp>();
            }
            return this.serviceFeeInfoGrp;
        }

        /**
         * Gets the value of the serviceDetailsGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceDetailsGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceDetailsGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp> getServiceDetailsGrp() {
            if (serviceDetailsGrp == null) {
                serviceDetailsGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp>();
            }
            return this.serviceDetailsGrp;
        }

        /**
         * Gets the value of the freeBagAllowanceGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeBagAllowanceGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeBagAllowanceGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp> getFreeBagAllowanceGrp() {
            if (freeBagAllowanceGrp == null) {
                freeBagAllowanceGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp>();
            }
            return this.freeBagAllowanceGrp;
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
         *         &lt;element name="freeBagAllownceInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ExcessBaggageType"/>
         *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_166130S" minOccurs="0"/>
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
            "freeBagAllownceInfo",
            "itemNumberInfo"
        })
        public static class FreeBagAllowanceGrp {

            @XmlElement(required = true)
            protected ExcessBaggageType freeBagAllownceInfo;
            protected ItemNumberType166130S itemNumberInfo;

            /**
             * Gets the value of the freeBagAllownceInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ExcessBaggageType }
             *     
             */
            public ExcessBaggageType getFreeBagAllownceInfo() {
                return freeBagAllownceInfo;
            }

            /**
             * Sets the value of the freeBagAllownceInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExcessBaggageType }
             *     
             */
            public void setFreeBagAllownceInfo(ExcessBaggageType value) {
                this.freeBagAllownceInfo = value;
            }

            /**
             * Gets the value of the itemNumberInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ItemNumberType166130S }
             *     
             */
            public ItemNumberType166130S getItemNumberInfo() {
                return itemNumberInfo;
            }

            /**
             * Sets the value of the itemNumberInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemNumberType166130S }
             *     
             */
            public void setItemNumberInfo(ItemNumberType166130S value) {
                this.itemNumberInfo = value;
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
         *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType"/>
         *         &lt;element name="serviceCovInfoGrp" maxOccurs="200" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
         *                   &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
         *                   &lt;element name="carrierInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TransportIdentifierType" minOccurs="0"/>
         *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S" minOccurs="0"/>
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
            "itemNumberInfo",
            "serviceCovInfoGrp"
        })
        public static class ServiceCoverageInfoGrp {

            @XmlElement(required = true)
            protected ItemNumberType itemNumberInfo;
            protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp> serviceCovInfoGrp;

            /**
             * Gets the value of the itemNumberInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ItemNumberType }
             *     
             */
            public ItemNumberType getItemNumberInfo() {
                return itemNumberInfo;
            }

            /**
             * Sets the value of the itemNumberInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemNumberType }
             *     
             */
            public void setItemNumberInfo(ItemNumberType value) {
                this.itemNumberInfo = value;
            }

            /**
             * Gets the value of the serviceCovInfoGrp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceCovInfoGrp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceCovInfoGrp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp> getServiceCovInfoGrp() {
                if (serviceCovInfoGrp == null) {
                    serviceCovInfoGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp>();
                }
                return this.serviceCovInfoGrp;
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
             *         &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
             *         &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
             *         &lt;element name="carrierInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TransportIdentifierType" minOccurs="0"/>
             *         &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S" minOccurs="0"/>
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
                "paxRefInfo",
                "coveragePerFlightsInfo",
                "carrierInfo",
                "refInfo"
            })
            public static class ServiceCovInfoGrp {

                @XmlElement(required = true)
                protected SpecificTravellerType paxRefInfo;
                protected List<ActionDetailsType> coveragePerFlightsInfo;
                protected TransportIdentifierType carrierInfo;
                protected ReferenceInfoType134840S refInfo;

                /**
                 * Gets the value of the paxRefInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecificTravellerType }
                 *     
                 */
                public SpecificTravellerType getPaxRefInfo() {
                    return paxRefInfo;
                }

                /**
                 * Sets the value of the paxRefInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecificTravellerType }
                 *     
                 */
                public void setPaxRefInfo(SpecificTravellerType value) {
                    this.paxRefInfo = value;
                }

                /**
                 * Gets the value of the coveragePerFlightsInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the coveragePerFlightsInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCoveragePerFlightsInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ActionDetailsType }
                 * 
                 * 
                 */
                public List<ActionDetailsType> getCoveragePerFlightsInfo() {
                    if (coveragePerFlightsInfo == null) {
                        coveragePerFlightsInfo = new ArrayList<ActionDetailsType>();
                    }
                    return this.coveragePerFlightsInfo;
                }

                /**
                 * Gets the value of the carrierInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransportIdentifierType }
                 *     
                 */
                public TransportIdentifierType getCarrierInfo() {
                    return carrierInfo;
                }

                /**
                 * Sets the value of the carrierInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransportIdentifierType }
                 *     
                 */
                public void setCarrierInfo(TransportIdentifierType value) {
                    this.carrierInfo = value;
                }

                /**
                 * Gets the value of the refInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType134840S }
                 *     
                 */
                public ReferenceInfoType134840S getRefInfo() {
                    return refInfo;
                }

                /**
                 * Sets the value of the refInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType134840S }
                 *     
                 */
                public void setRefInfo(ReferenceInfoType134840S value) {
                    this.refInfo = value;
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
         *         &lt;element name="serviceOptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificDataInformationType"/>
         *         &lt;element name="feeDescriptionGrp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_80866S"/>
         *                   &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeType" minOccurs="0"/>
         *                   &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
         *                   &lt;element name="commercialName" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType" minOccurs="0"/>
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
            "serviceOptionInfo",
            "feeDescriptionGrp"
        })
        public static class ServiceDetailsGrp {

            @XmlElement(required = true)
            protected SpecificDataInformationType serviceOptionInfo;
            protected FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp feeDescriptionGrp;

            /**
             * Gets the value of the serviceOptionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public SpecificDataInformationType getServiceOptionInfo() {
                return serviceOptionInfo;
            }

            /**
             * Sets the value of the serviceOptionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public void setServiceOptionInfo(SpecificDataInformationType value) {
                this.serviceOptionInfo = value;
            }

            /**
             * Gets the value of the feeDescriptionGrp property.
             * 
             * @return
             *     possible object is
             *     {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp }
             *     
             */
            public FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp getFeeDescriptionGrp() {
                return feeDescriptionGrp;
            }

            /**
             * Sets the value of the feeDescriptionGrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp }
             *     
             */
            public void setFeeDescriptionGrp(FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp value) {
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
             *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType_80866S"/>
             *         &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}AttributeType" minOccurs="0"/>
             *         &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
             *         &lt;element name="commercialName" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType" minOccurs="0"/>
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
                "serviceDescriptionInfo",
                "commercialName"
            })
            public static class FeeDescriptionGrp {

                @XmlElement(required = true)
                protected ItemNumberType80866S itemNumberInfo;
                protected AttributeType serviceAttributesInfo;
                protected SpecialRequirementsDetailsType serviceDescriptionInfo;
                protected InteractiveFreeTextType commercialName;

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
                 *     {@link AttributeType }
                 *     
                 */
                public AttributeType getServiceAttributesInfo() {
                    return serviceAttributesInfo;
                }

                /**
                 * Sets the value of the serviceAttributesInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttributeType }
                 *     
                 */
                public void setServiceAttributesInfo(AttributeType value) {
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

                /**
                 * Gets the value of the commercialName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeTextType }
                 *     
                 */
                public InteractiveFreeTextType getCommercialName() {
                    return commercialName;
                }

                /**
                 * Sets the value of the commercialName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeTextType }
                 *     
                 */
                public void setCommercialName(InteractiveFreeTextType value) {
                    this.commercialName = value;
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
         *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ItemNumberType"/>
         *         &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S"/>
         *                   &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
         *                             &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
         *                             &lt;element name="amountInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S" minOccurs="0"/>
         *                             &lt;element name="attributeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType" maxOccurs="10" minOccurs="0"/>
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
            "itemNumberInfo",
            "serviceDetailsGrp"
        })
        public static class ServiceFeeInfoGrp {

            @XmlElement(required = true)
            protected ItemNumberType itemNumberInfo;
            protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp> serviceDetailsGrp;

            /**
             * Gets the value of the itemNumberInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ItemNumberType }
             *     
             */
            public ItemNumberType getItemNumberInfo() {
                return itemNumberInfo;
            }

            /**
             * Sets the value of the itemNumberInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemNumberType }
             *     
             */
            public void setItemNumberInfo(ItemNumberType value) {
                this.itemNumberInfo = value;
            }

            /**
             * Gets the value of the serviceDetailsGrp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceDetailsGrp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceDetailsGrp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp }
             * 
             * 
             */
            public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp> getServiceDetailsGrp() {
                if (serviceDetailsGrp == null) {
                    serviceDetailsGrp = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp>();
                }
                return this.serviceDetailsGrp;
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
             *         &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType_134840S"/>
             *         &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
             *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
             *                   &lt;element name="amountInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S" minOccurs="0"/>
             *                   &lt;element name="attributeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType" maxOccurs="10" minOccurs="0"/>
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
                "refInfo",
                "serviceMatchedInfoGroup"
            })
            public static class ServiceDetailsGrp {

                @XmlElement(required = true)
                protected ReferenceInfoType134840S refInfo;
                protected List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup> serviceMatchedInfoGroup;

                /**
                 * Gets the value of the refInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType134840S }
                 *     
                 */
                public ReferenceInfoType134840S getRefInfo() {
                    return refInfo;
                }

                /**
                 * Sets the value of the refInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType134840S }
                 *     
                 */
                public void setRefInfo(ReferenceInfoType134840S value) {
                    this.refInfo = value;
                }

                /**
                 * Gets the value of the serviceMatchedInfoGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serviceMatchedInfoGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getServiceMatchedInfoGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup }
                 * 
                 * 
                 */
                public List<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup> getServiceMatchedInfoGroup() {
                    if (serviceMatchedInfoGroup == null) {
                        serviceMatchedInfoGroup = new ArrayList<FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup>();
                    }
                    return this.serviceMatchedInfoGroup;
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
                 *         &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}SpecificTravellerType"/>
                 *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}FareInformationType_80868S" minOccurs="0"/>
                 *         &lt;element name="amountInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}MonetaryInformationType_204470S" minOccurs="0"/>
                 *         &lt;element name="attributeInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}CodedAttributeType" maxOccurs="10" minOccurs="0"/>
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
                    "paxRefInfo",
                    "pricingInfo",
                    "amountInfo",
                    "attributeInfo"
                })
                public static class ServiceMatchedInfoGroup {

                    @XmlElement(required = true)
                    protected SpecificTravellerType paxRefInfo;
                    protected FareInformationType80868S pricingInfo;
                    protected MonetaryInformationType204470S amountInfo;
                    protected List<CodedAttributeType> attributeInfo;

                    /**
                     * Gets the value of the paxRefInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SpecificTravellerType }
                     *     
                     */
                    public SpecificTravellerType getPaxRefInfo() {
                        return paxRefInfo;
                    }

                    /**
                     * Sets the value of the paxRefInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SpecificTravellerType }
                     *     
                     */
                    public void setPaxRefInfo(SpecificTravellerType value) {
                        this.paxRefInfo = value;
                    }

                    /**
                     * Gets the value of the pricingInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareInformationType80868S }
                     *     
                     */
                    public FareInformationType80868S getPricingInfo() {
                        return pricingInfo;
                    }

                    /**
                     * Sets the value of the pricingInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareInformationType80868S }
                     *     
                     */
                    public void setPricingInfo(FareInformationType80868S value) {
                        this.pricingInfo = value;
                    }

                    /**
                     * Gets the value of the amountInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MonetaryInformationType204470S }
                     *     
                     */
                    public MonetaryInformationType204470S getAmountInfo() {
                        return amountInfo;
                    }

                    /**
                     * Sets the value of the amountInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MonetaryInformationType204470S }
                     *     
                     */
                    public void setAmountInfo(MonetaryInformationType204470S value) {
                        this.amountInfo = value;
                    }

                    /**
                     * Gets the value of the attributeInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the attributeInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAttributeInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CodedAttributeType }
                     * 
                     * 
                     */
                    public List<CodedAttributeType> getAttributeInfo() {
                        if (attributeInfo == null) {
                            attributeInfo = new ArrayList<CodedAttributeType>();
                        }
                        return this.attributeInfo;
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
         *         &lt;element name="refInfo" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ReferenceInfoType"/>
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
            "refInfo"
        })
        public static class ServiceFeeRefGrp {

            @XmlElement(required = true)
            protected ReferenceInfoType refInfo;

            /**
             * Gets the value of the refInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getRefInfo() {
                return refInfo;
            }

            /**
             * Sets the value of the refInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setRefInfo(ReferenceInfoType value) {
                this.refInfo = value;
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
     *         &lt;element name="itinerary" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}TopologyType"/>
     *         &lt;element name="recommendation" maxOccurs="1000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="details" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}VirtualInterlineRecommendationType"/>
     *                   &lt;element name="element" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}VirtualInterliningCombinationType" maxOccurs="50" minOccurs="0"/>
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
        "itinerary",
        "recommendation"
    })
    public static class VirtualInterlining {

        @XmlElement(required = true)
        protected TopologyType itinerary;
        protected List<FareMasterPricerTravelBoardSearchReply.VirtualInterlining.Recommendation> recommendation;

        /**
         * Gets the value of the itinerary property.
         * 
         * @return
         *     possible object is
         *     {@link TopologyType }
         *     
         */
        public TopologyType getItinerary() {
            return itinerary;
        }

        /**
         * Sets the value of the itinerary property.
         * 
         * @param value
         *     allowed object is
         *     {@link TopologyType }
         *     
         */
        public void setItinerary(TopologyType value) {
            this.itinerary = value;
        }

        /**
         * Gets the value of the recommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareMasterPricerTravelBoardSearchReply.VirtualInterlining.Recommendation }
         * 
         * 
         */
        public List<FareMasterPricerTravelBoardSearchReply.VirtualInterlining.Recommendation> getRecommendation() {
            if (recommendation == null) {
                recommendation = new ArrayList<FareMasterPricerTravelBoardSearchReply.VirtualInterlining.Recommendation>();
            }
            return this.recommendation;
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
         *         &lt;element name="details" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}VirtualInterlineRecommendationType"/>
         *         &lt;element name="element" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}VirtualInterliningCombinationType" maxOccurs="50" minOccurs="0"/>
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
            "details",
            "element"
        })
        public static class Recommendation {

            @XmlElement(required = true)
            protected VirtualInterlineRecommendationType details;
            protected List<VirtualInterliningCombinationType> element;

            /**
             * Gets the value of the details property.
             * 
             * @return
             *     possible object is
             *     {@link VirtualInterlineRecommendationType }
             *     
             */
            public VirtualInterlineRecommendationType getDetails() {
                return details;
            }

            /**
             * Sets the value of the details property.
             * 
             * @param value
             *     allowed object is
             *     {@link VirtualInterlineRecommendationType }
             *     
             */
            public void setDetails(VirtualInterlineRecommendationType value) {
                this.details = value;
            }

            /**
             * Gets the value of the element property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the element property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VirtualInterliningCombinationType }
             * 
             * 
             */
            public List<VirtualInterliningCombinationType> getElement() {
                if (element == null) {
                    element = new ArrayList<VirtualInterliningCombinationType>();
                }
                return this.element;
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
     *         &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}DummySegmentTypeI"/>
     *         &lt;element name="applicationError" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}ApplicationErrorInformationType_232919S" minOccurs="0"/>
     *         &lt;element name="globalMessage" type="{http://xml.amadeus.com/FMPTBR_24_6_1A}InteractiveFreeTextType_231140S"/>
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
        "globalMessageMarker",
        "applicationError",
        "globalMessage"
    })
    public static class WarningInfo {

        @XmlElement(required = true)
        protected DummySegmentTypeI globalMessageMarker;
        protected ApplicationErrorInformationType232919S applicationError;
        @XmlElement(required = true)
        protected InteractiveFreeTextType231140S globalMessage;

        /**
         * Gets the value of the globalMessageMarker property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getGlobalMessageMarker() {
            return globalMessageMarker;
        }

        /**
         * Sets the value of the globalMessageMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setGlobalMessageMarker(DummySegmentTypeI value) {
            this.globalMessageMarker = value;
        }

        /**
         * Gets the value of the applicationError property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationType232919S }
         *     
         */
        public ApplicationErrorInformationType232919S getApplicationError() {
            return applicationError;
        }

        /**
         * Sets the value of the applicationError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationType232919S }
         *     
         */
        public void setApplicationError(ApplicationErrorInformationType232919S value) {
            this.applicationError = value;
        }

        /**
         * Gets the value of the globalMessage property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextType231140S }
         *     
         */
        public InteractiveFreeTextType231140S getGlobalMessage() {
            return globalMessage;
        }

        /**
         * Sets the value of the globalMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextType231140S }
         *     
         */
        public void setGlobalMessage(InteractiveFreeTextType231140S value) {
            this.globalMessage = value;
        }

    }

}
