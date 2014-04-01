package org.niklas.finvoice2csv.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.niklas.finvoice2csv.util.jaxbadapters.JaxbDateAdapter;

@XmlRootElement(name="PaymentTermsDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentTermsDetails {
	@XmlJavaTypeAdapter(JaxbDateAdapter.class)
	@XmlElement(name = "InvoiceDueDate")
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
