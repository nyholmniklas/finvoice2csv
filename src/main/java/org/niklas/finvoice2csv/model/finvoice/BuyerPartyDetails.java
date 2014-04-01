package org.niklas.finvoice2csv.model.finvoice;

public class BuyerPartyDetails {
	private String buyerPartyIdentifier;
	private String buyerOrganisationName;
	private PostalAddressDetails buyerPostalAddressDetails;
	
	public String getBuyerPartyIdentifier() {
		return buyerPartyIdentifier;
	}
	public void setBuyerPartyIdentifier(String buyerPartyIdentifier) {
		this.buyerPartyIdentifier = buyerPartyIdentifier;
	}
	public String getBuyerOrganisationName() {
		return buyerOrganisationName;
	}
	public void setBuyerOrganisationName(String buyerOrganisationName) {
		this.buyerOrganisationName = buyerOrganisationName;
	}
	public PostalAddressDetails getBuyerPostalAddressDetails() {
		return buyerPostalAddressDetails;
	}
	public void setBuyerPostalAddressDetails(
			PostalAddressDetails buyerPostalAddressDetails) {
		this.buyerPostalAddressDetails = buyerPostalAddressDetails;
	}
	
	
}
