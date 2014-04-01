package org.niklas.finvoice2csv.model.finvoice;

import java.math.BigDecimal;

public class InvoiceRow {
	private String articleIdentifier;
	private String articleName;
	private int orderedQuantity;
	private BigDecimal unitPriceAmount;
	private int rowVatRatePercent;
	private BigDecimal rowVatAmount;
	private BigDecimal rowVatExcludedAmount;
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
