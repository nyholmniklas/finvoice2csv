package org.niklas.finvoice2csv.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeliveryPartyDetails")
public class DeliveryPartyDetails {
	@XmlElement(name = "DeliveryOrganisationName")
	private String deliveryOrganisationName;
	@XmlElement(name = "DeliveryPostalAddressDetails", type = DeliveryPostalAddressDetails.class)
	private DeliveryPostalAddressDetails deliveryPostalAddressDetails;
	
	public String getDeliveryOrganisationName() {
		return deliveryOrganisationName;
	}
	public void setDeliveryOrganisationName(String deliveryOrganisationName) {
		this.deliveryOrganisationName = deliveryOrganisationName;
	}
	public DeliveryPostalAddressDetails getDeliveryPostalAddressDetails() {
		return deliveryPostalAddressDetails;
	}
	public void setDeliveryPostalAddressDetails(
			DeliveryPostalAddressDetails deliveryPostalAddressDetails) {
		this.deliveryPostalAddressDetails = deliveryPostalAddressDetails;
	}
}
