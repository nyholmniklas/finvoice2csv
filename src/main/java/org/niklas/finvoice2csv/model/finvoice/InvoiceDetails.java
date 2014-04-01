package org.niklas.finvoice2csv.model.finvoice;

import java.math.BigDecimal;
import java.util.Date;

public class InvoiceDetails {
	private String invoiceTypeCode;
	private Date invoiceDate;
	private BigDecimal invoiceTotalVatExcludedAmount;
	private BigDecimal invoiceTotalVatAmount;
	private BigDecimal invoiceTotalVatIncludedAmount;
	private BigDecimal invoiceFreeText;
	private PaymentTermsDetails paymentTermDetails;
	
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
	public BigDecimal getInvoiceFreeText() {
		return invoiceFreeText;
	}
	public void setInvoiceFreeText(BigDecimal invoiceFreeText) {
		this.invoiceFreeText = invoiceFreeText;
	}
	public PaymentTermsDetails getPaymentTermDetails() {
		return paymentTermDetails;
	}
	public void setPaymentTermDetails(PaymentTermsDetails paymentTermDetails) {
		this.paymentTermDetails = paymentTermDetails;
	}
	
	
}
