package org.niklas.finvoice2csv.model.finvoice;

import java.util.ArrayList;
import java.util.List;

public class Finvoice {

	private BuyerPartyDetails buyerPartyDetails;
	private DeliveryPartyDetails deliveryPartyDetails;
	private InvoiceDetails invoiceDetails;
	private List<InvoiceRow> invoiceRows;
	
	public Finvoice(){
		invoiceRows = new ArrayList<InvoiceRow>();
	}
	
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
	
	public void addInvoiceRow(InvoiceRow row) {
		invoiceRows.add(row);
	}
	
}
