package org.niklas.finvoice2csv.model.finvoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BuyerPartyDetails")
public class BuyerPartyDetails {
	@XmlElement(name = "BuyerPartyIdentifier")
	private String buyerPartyIdentifier;
	private String buyerOrganisationName;
	private BuyerPostalAddressDetails buyerPostalAddressDetails;
	
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
	public BuyerPostalAddressDetails getBuyerPostalAddressDetails() {
		return buyerPostalAddressDetails;
	}
	public void setBuyerPostalAddressDetails(
			BuyerPostalAddressDetails buyerPostalAddressDetails) {
		this.buyerPostalAddressDetails = buyerPostalAddressDetails;
	}
	
}
