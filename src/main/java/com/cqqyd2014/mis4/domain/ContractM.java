package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ContractM generated by hbm2java
 */
@Entity
@Table(name = "contract_m", schema = "public")
public class ContractM implements java.io.Serializable {

	private ContractMId id;
	private String supply;
	private Date opDat;
	private Date paperDat;
	private BigDecimal amount;
	private Boolean arrival;
	private BigDecimal printCount;
	private Date lastPrintDat;
	private Boolean effective;
	private String userId;
	private Date uneffectiveDat;
	private String uneffectiveUserId;

	public ContractM() {
	}

	public ContractM(ContractMId id) {
		this.id = id;
	}

	public ContractM(ContractMId id, String supply, Date opDat, Date paperDat, BigDecimal amount, Boolean arrival,
			BigDecimal printCount, Date lastPrintDat, Boolean effective, String userId, Date uneffectiveDat,
			String uneffectiveUserId) {
		this.id = id;
		this.supply = supply;
		this.opDat = opDat;
		this.paperDat = paperDat;
		this.amount = amount;
		this.arrival = arrival;
		this.printCount = printCount;
		this.lastPrintDat = lastPrintDat;
		this.effective = effective;
		this.userId = userId;
		this.uneffectiveDat = uneffectiveDat;
		this.uneffectiveUserId = uneffectiveUserId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "contractNo", column = @Column(name = "contract_no", nullable = false, length = 45)),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)) })
	public ContractMId getId() {
		return this.id;
	}

	public void setId(ContractMId id) {
		this.id = id;
	}

	@Column(name = "supply", length = 45)
	public String getSupply() {
		return this.supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "op_dat", length = 35)
	public Date getOpDat() {
		return this.opDat;
	}

	public void setOpDat(Date opDat) {
		this.opDat = opDat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "paper_dat", length = 35)
	public Date getPaperDat() {
		return this.paperDat;
	}

	public void setPaperDat(Date paperDat) {
		this.paperDat = paperDat;
	}

	@Column(name = "amount", precision = 131089, scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "arrival")
	public Boolean getArrival() {
		return this.arrival;
	}

	public void setArrival(Boolean arrival) {
		this.arrival = arrival;
	}

	@Column(name = "print_count", precision = 131089, scale = 0)
	public BigDecimal getPrintCount() {
		return this.printCount;
	}

	public void setPrintCount(BigDecimal printCount) {
		this.printCount = printCount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_print_dat", length = 35)
	public Date getLastPrintDat() {
		return this.lastPrintDat;
	}

	public void setLastPrintDat(Date lastPrintDat) {
		this.lastPrintDat = lastPrintDat;
	}

	@Column(name = "effective")
	public Boolean getEffective() {
		return this.effective;
	}

	public void setEffective(Boolean effective) {
		this.effective = effective;
	}

	@Column(name = "user_id", length = 36)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uneffective_dat", length = 35)
	public Date getUneffectiveDat() {
		return this.uneffectiveDat;
	}

	public void setUneffectiveDat(Date uneffectiveDat) {
		this.uneffectiveDat = uneffectiveDat;
	}

	@Column(name = "uneffective_user_id", length = 36)
	public String getUneffectiveUserId() {
		return this.uneffectiveUserId;
	}

	public void setUneffectiveUserId(String uneffectiveUserId) {
		this.uneffectiveUserId = uneffectiveUserId;
	}

}