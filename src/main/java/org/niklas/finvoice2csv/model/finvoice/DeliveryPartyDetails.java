package org.niklas.finvoice2csv.model.finvoice;

public class DeliveryPartyDetails {

	private String deliveryOrganisationName;
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
