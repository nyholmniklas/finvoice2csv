package org.niklas.finvoice2csv.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.niklas.finvoice2csv.util.JaxbBigDecimalAdapter;

@XmlRootElement(name="InvoiceDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceDetails {
	@XmlElement(name = "InvoiceTypeCode")
	private String invoiceTypeCode;
	//TODO Annotate Date and set adapter
	private Date invoiceDate;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "InvoiceTotalVatExcludedAmount")
	private BigDecimal invoiceTotalVatExcludedAmount;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "InvoiceTotalVatAmount")
	private BigDecimal invoiceTotalVatAmount;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "InvoiceTotalVatIncludedAmount")
	private BigDecimal invoiceTotalVatIncludedAmount;
	@XmlElement(name = "InvoiceFreeText")
	private String invoiceFreeText;
	@XmlElement(name = "PaymentTermsDetails", type = PaymentTermsDetails.class)
	private PaymentTermsDetails paymentTermsDetails;
	
	public String getInvoiceTypeCode() {
		return invoiceTypeCode;
	}
	public void setInvoiceTypeCode(String invoiceTypeCode) {
		this.invoiceTypeCode = invoiceTypeCode;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public BigDecimal getInvoiceTotalVatExcludedAmount() {
		return invoiceTotalVatExcludedAmount;
	}
	public void setInvoiceTotalVatExcludedAmount(
			BigDecimal invoiceTotalVatExcludedAmount) {
		this.invoiceTotalVatExcludedAmount = invoiceTotalVatExcludedAmount;
	}
	public BigDecimal getInvoiceTotalVatAmount() {
		return invoiceTotalVatAmount;
	}
	public void setInvoiceTotalVatAmount(BigDecimal invoiceTotalVatAmount) {
		this.invoiceTotalVatAmount = invoiceTotalVatAmount;
	}
	public BigDecimal getInvoiceTotalVatIncludedAmount() {
		return invoiceTotalVatIncludedAmount;
	}
	public void setInvoiceTotalVatIncludedAmount(
			BigDecimal invoiceTotalVatIncludedAmount) {
		this.invoiceTotalVatIncludedAmount = invoiceTotalVatIncludedAmount;
	}
	public PaymentTermsDetails getPaymentTermsDetails() {
		return paymentTermsDetails;
	}
	public void setPaymentTermsDetails(PaymentTermsDetails paymentTermsDetails) {
		this.paymentTermsDetails = paymentTermsDetails;
	}
	public String getInvoiceFreeText() {
		return invoiceFreeText;
	}
	public void setInvoiceFreeText(String invoiceFreeText) {
		this.invoiceFreeText = invoiceFreeText;
	}
	
}
