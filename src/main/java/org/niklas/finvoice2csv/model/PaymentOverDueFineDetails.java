package org.niklas.finvoice2csv.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.niklas.finvoice2csv.util.JaxbBigDecimalAdapter;

@XmlRootElement(name="PaymentOverDueFineDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentOverDueFineDetails {
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "PaymentOverDueFinePercent")
	private BigDecimal paymentOverDueFinePercent;

	public BigDecimal getPaymentOverDueFinePercent() {
		return paymentOverDueFinePercent;
	}

	public void setPaymentOverDueFinePercent(BigDecimal paymentOverDueFinePercent) {
		this.paymentOverDueFinePercent = paymentOverDueFinePercent;
	}
	
	
}
