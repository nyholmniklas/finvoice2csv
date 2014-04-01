package org.niklas.finvoice2csv.model.finvoice;

import java.util.Date;

public class PaymentTermsDetails {
	private Date invoiceDueDate;
	private PaymentOverDueFineDetails paymentOverDueFineDetails;
	
	public Date getInvoiceDueDate() {
		return invoiceDueDate;
	}
	public void setInvoiceDueDate(Date invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}
	public PaymentOverDueFineDetails getPaymentOverDueFineDetails() {
		return paymentOverDueFineDetails;
	}
	public void setPaymentOverDueFineDetails(
			PaymentOverDueFineDetails paymentOverDueFineDetails) {
		this.paymentOverDueFineDetails = paymentOverDueFineDetails;
	}
	
	
}
