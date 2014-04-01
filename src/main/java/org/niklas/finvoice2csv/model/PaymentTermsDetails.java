package org.niklas.finvoice2csv.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PaymentTermDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentTermsDetails {
	//TODO annotate date and add date adapater
	private Date invoiceDueDate;
	@XmlElement(name = "PaymentOverDueFineDetails", type = PaymentOverDueFineDetails.class)
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
