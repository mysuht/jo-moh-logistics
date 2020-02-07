package com.suht.logistics_backend.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CTF_ITEM")
public class CTFItem {

	@Id
	@Column(name="CTF_ITEM_ID")
	Long id;
	
	@Column(name="CTF_MAIN_ID")
	Long ctfMainId;
	
	@Column(name="PROD_ID")
	int productId;
	
	@Column(name="OPEN_BAL", precision = 10)
	BigDecimal openBalance;
	
	@Column(name="RECEIPTS", precision = 10)
	BigDecimal receipts;
	
	@Column(name="ISSUES", precision = 10)
	BigDecimal issues;
	
	@Column(name="ADJUSTMENTS", precision = 8)
	BigDecimal adjustments;
	
	@Column(name="ADJ_TYPE_ID")
	Integer adjustmentTypeId;
	
	@Column(name="CLOSING_BAL", precision = 10)
	BigDecimal closingBalance;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ctfMainId
	 */
	public Long getCtfMainId() {
		return ctfMainId;
	}

	/**
	 * @param ctfMainId the ctfMainId to set
	 */
	public void setCtfMainId(Long ctfMainId) {
		this.ctfMainId = ctfMainId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the openBalance
	 */
	public BigDecimal getOpenBalance() {
		return openBalance;
	}

	/**
	 * @param openBalance the openBalance to set
	 */
	public void setOpenBalance(BigDecimal openBalance) {
		this.openBalance = openBalance;
	}

	/**
	 * @return the receipts
	 */
	public BigDecimal getReceipts() {
		return receipts;
	}

	/**
	 * @param receipts the receipts to set
	 */
	public void setReceipts(BigDecimal receipts) {
		this.receipts = receipts;
	}

	/**
	 * @return the issues
	 */
	public BigDecimal getIssues() {
		return issues;
	}

	/**
	 * @param issues the issues to set
	 */
	public void setIssues(BigDecimal issues) {
		this.issues = issues;
	}

	/**
	 * @return the adjustments
	 */
	public BigDecimal getAdjustments() {
		return adjustments;
	}

	/**
	 * @param adjustments the adjustments to set
	 */
	public void setAdjustments(BigDecimal adjustments) {
		this.adjustments = adjustments;
	}

	/**
	 * @return the adjustmentTypeId
	 */
	public Integer getAdjustmentTypeId() {
		return adjustmentTypeId;
	}

	/**
	 * @param adjustmentTypeId the adjustmentTypeId to set
	 */
	public void setAdjustmentTypeId(Integer adjustmentTypeId) {
		this.adjustmentTypeId = adjustmentTypeId;
	}

	/**
	 * @return the closingBalance
	 */
	public BigDecimal getClosingBalance() {
		return closingBalance;
	}

	/**
	 * @param closingBalance the closingBalance to set
	 */
	public void setClosingBalance(BigDecimal closingBalance) {
		this.closingBalance = closingBalance;
	}

	@Override
	public String toString() {
		return "CTFItem [id=" + id + ", ctfMainId=" + ctfMainId + ", productId=" + productId + ", openBalance="
				+ openBalance + ", receipts=" + receipts + ", issues=" + issues + ", adjustments=" + adjustments
				+ ", adjustmentTypeId=" + adjustmentTypeId + ", closingBalance=" + closingBalance + "]";
	}

	
	
}
