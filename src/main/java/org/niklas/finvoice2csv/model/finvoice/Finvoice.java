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
	@XmlElement(name = "DeliveryPartyDetails", type = DeliveryPartyDetails.class)
	private DeliveryPartyDetails deliveryPartyDetails;
	@XmlElement(name = "InvoiceDetails", type = InvoiceDetails.class)
	private InvoiceDetails invoiceDetails;
	@XmlElement(name="InvoiceRow")
	private List<InvoiceRow> invoiceRow;
	
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
	public List<InvoiceRow> getInvoiceRow() {
		return invoiceRow;
	}
	public void setInvoiceRow(List<InvoiceRow> invoiceRow) {
		this.invoiceRow = invoiceRow;
	}
	
}
