package org.niklas.finvoice2csv.model.finvoice;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Finvoice")
public class Finvoice {
	@XmlElement(name = "BuyerPartyDetails", type = BuyerPartyDetails.class)
	private BuyerPartyDetails buyerPartyDetails;
	private DeliveryPartyDetails deliveryPartyDetails;
	private InvoiceDetails invoiceDetails;
	private List<InvoiceRow> invoiceRows;
	
	public BuyerPartyDetails getBuyerPartyDetails() {
		return buyerPartyDetails;
	}
	public void setBuyerPartyDetails(BuyerPartyDetails buyerPartyDetails) {
		this.buyerPartyDetails = buyerPartyDetails;
	}
	public DeliveryPartyDetails getDeliveryPartyDetails() {
		return deliveryPartyDetails;
	}
	public void setDeliveryPartyDetails(DeliveryPartyDetails deliveryPartyDetails) {
		this.deliveryPartyDetails = deliveryPartyDetails;
	}
	public InvoiceDetails getInvoiceDetails() {
		return invoiceDetails;
	}
	public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
	public List<InvoiceRow> getInvoiceRows() {
		return invoiceRows;
	}
	public void setInvoiceRows(List<InvoiceRow> invoiceRows) {
		this.invoiceRows = invoiceRows;
	}
	
}
