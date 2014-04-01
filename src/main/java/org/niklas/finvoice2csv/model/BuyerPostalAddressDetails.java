package org.niklas.finvoice2csv.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BuyerPostalAddressDetails")
public class BuyerPostalAddressDetails {
	@XmlElement(name = "BuyerStreetName")
	private String buyerStreetName;
	@XmlElement(name = "BuyerTownName")
	private String buyerTownName;
	@XmlElement(name = "BuyerPostCodeIdentifier")
	private String buyerPostCodeIdentifier;
	@XmlElement(name = "CountryCode")
	private String countryCode;

	public String getBuyerStreetName() {
		return buyerStreetName;
	}

	public void setBuyerStreetName(String buyerStreetName) {
		this.buyerStreetName = buyerStreetName;
	}

	public String getBuyerTownName() {
		return buyerTownName;
	}

	public void setBuyerTownName(String buyerTownName) {
		this.buyerTownName = buyerTownName;
	}

	public String getBuyerPostCodeIdentifier() {
		return buyerPostCodeIdentifier;
	}

	public void setBuyerPostCodeIdentifier(String buyerPostCodeIdentifier) {
		this.buyerPostCodeIdentifier = buyerPostCodeIdentifier;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
