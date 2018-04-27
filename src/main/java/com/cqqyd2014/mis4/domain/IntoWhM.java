package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

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
 * IntoWhM generated by hbm2java
 */
@Entity
@Table(name = "into_wh_m", schema = "public")
public class IntoWhM implements java.io.Serializable {

	private IntoWhMId id;
	private Date opDat;
	private String whId;
	private String contractId;
	private Date inDat;
	private String memo;
	private String userId;

	public IntoWhM() {
	}

	public IntoWhM(IntoWhMId id) {
		this.id = id;
	}

	public IntoWhM(IntoWhMId id, Date opDat, String whId, String contractId, Date inDat, String memo, String userId) {
		this.id = id;
		this.opDat = opDat;
		this.whId = whId;
		this.contractId = contractId;
		this.inDat = inDat;
		this.memo = memo;
		this.userId = userId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "uuid", column = @Column(name = "uuid", nullable = false, length = 36)),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)) })
	public IntoWhMId getId() {
		return this.id;
	}

	public void setId(IntoWhMId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "op_dat", length = 35)
	public Date getOpDat() {
		return this.opDat;
	}

	public void setOpDat(Date opDat) {
		this.opDat = opDat;
	}

	@Column(name = "wh_id", length = 6)
	public String getWhId() {
		return this.whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	@Column(name = "contract_id", length = 45)
	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "in_dat", length = 35)
	public Date getInDat() {
		return this.inDat;
	}

	public void setInDat(Date inDat) {
		this.inDat = inDat;
	}

	@Column(name = "memo", length = 512)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "user_id", length = 36)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
