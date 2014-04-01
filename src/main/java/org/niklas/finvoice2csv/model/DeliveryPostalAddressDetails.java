package org.niklas.finvoice2csv.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeliveryPostalAddressDetails")
public class DeliveryPostalAddressDetails {
	@XmlElement(name = "DeliveryStreetName")
	private String deliveryStreetName;
	@XmlElement(name = "DeliveryTownName")
	private String deliveryTownName;
	@XmlElement(name = "DeliveryPostCodeIdentifier")
	private String deliveryPostCodeIdentifier;
	@XmlElement(name = "CountryCode")
	private String countryCode;

	public String getDeliveryStreetName() {
		return deliveryStreetName;
	}

	public void setDeliveryStreetName(String deliveryStreetName) {
		this.deliveryStreetName = deliveryStreetName;
	}

	public String getDeliveryTownName() {
		return deliveryTownName;
	}

	public void setDeliveryTownName(String deliveryTownName) {
		this.deliveryTownName = deliveryTownName;
	}

	public String getDeliveryPostCodeIdentifier() {
		return deliveryPostCodeIdentifier;
	}

	public void setDeliveryPostCodeIdentifier(String deliveryPostCodeIdentifier) {
		this.deliveryPostCodeIdentifier = deliveryPostCodeIdentifier;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
