package org.niklas.finvoice2csv.model.finvoice;

public class DeliveryPartyDetails {

	private String deliveryOrganisationName;
	private PostalAddressDetails deliveryPostalAddressDetails;
	
	public String getDeliveryOrganisationName() {
		return deliveryOrganisationName;
	}
	public void setDeliveryOrganisationName(String deliveryOrganisationName) {
		this.deliveryOrganisationName = deliveryOrganisationName;
	}
	public PostalAddressDetails getDeliveryPostalAddressDetails() {
		return deliveryPostalAddressDetails;
	}
	public void setDeliveryPostalAddressDetails(
			PostalAddressDetails deliveryPostalAddressDetails) {
		this.deliveryPostalAddressDetails = deliveryPostalAddressDetails;
	}
}
