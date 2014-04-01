package org.niklas.finvoice2csv.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.niklas.finvoice2csv.util.jaxbadapters.JaxbBigDecimalAdapter;

@XmlRootElement(name="InvoiceRow")
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceRow {
	@XmlElement(name = "ArticleIdentifier")
	private String articleIdentifier;
	@XmlElement(name = "ArticleName")
	private String articleName;
	@XmlElement(name = "OrderedQuantity")
	private int orderedQuantity;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "UnitPriceAmount")
	private BigDecimal unitPriceAmount;
	@XmlElement(name = "rowVatRatePercent")
	private int rowVatRatePercent;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "rowVatAmount")
	private BigDecimal rowVatAmount;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "RowVatExcludedAmount")
	private BigDecimal rowVatExcludedAmount;
	@XmlJavaTypeAdapter(JaxbBigDecimalAdapter.class)
	@XmlElement(name = "RowAmount")
	private BigDecimal rowAmount;
	
	public String getArticleIdentifier() {
		return articleIdentifier;
	}
	public void setArticleIdentifier(String articleIdentifier) {
		this.articleIdentifier = articleIdentifier;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public int getOrderedQuantity() {
		return orderedQuantity;
	}
	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}
	public BigDecimal getUnitPriceAmount() {
		return unitPriceAmount;
	}
	public void setUnitPriceAmount(BigDecimal unitPriceAmount) {
		this.unitPriceAmount = unitPriceAmount;
	}
	public int getRowVatRatePercent() {
		return rowVatRatePercent;
	}
	public void setRowVatRatePercent(int rowVatRatePercent) {
		this.rowVatRatePercent = rowVatRatePercent;
	}
	public BigDecimal getRowVatAmount() {
		return rowVatAmount;
	}
	public void setRowVatAmount(BigDecimal rowVatAmount) {
		this.rowVatAmount = rowVatAmount;
	}
	public BigDecimal getRowVatExcludedAmount() {
		return rowVatExcludedAmount;
	}
	public void setRowVatExcludedAmount(BigDecimal rowVatExcludedAmount) {
		this.rowVatExcludedAmount = rowVatExcludedAmount;
	}
	public BigDecimal getRowAmount() {
		return rowAmount;
	}
	public void setRowAmount(BigDecimal rowAmount) {
		this.rowAmount = rowAmount;
	}
	
	
}
