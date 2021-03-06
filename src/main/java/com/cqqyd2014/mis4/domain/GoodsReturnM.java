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
 * GoodsReturnM generated by hbm2java
 */
@Entity
@Table(name = "goods_return_m", schema = "public")
public class GoodsReturnM implements java.io.Serializable {

	private GoodsReturnMId id;
	private Date RTime;
	private String memo;
	private String whId;

	public GoodsReturnM() {
	}

	public GoodsReturnM(GoodsReturnMId id) {
		this.id = id;
	}

	public GoodsReturnM(GoodsReturnMId id, Date RTime, String memo, String whId) {
		this.id = id;
		this.RTime = RTime;
		this.memo = memo;
		this.whId = whId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)),
			@AttributeOverride(name = "orderNo", column = @Column(name = "order_no", nullable = false, length = 20)),
			@AttributeOverride(name = "seq", column = @Column(name = "seq", nullable = false, length = 4)) })
	public GoodsReturnMId getId() {
		return this.id;
	}

	public void setId(GoodsReturnMId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "r_time", length = 35)
	public Date getRTime() {
		return this.RTime;
	}

	public void setRTime(Date RTime) {
		this.RTime = RTime;
	}

	@Column(name = "memo", length = 512)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "wh_id", length = 6)
	public String getWhId() {
		return this.whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

}
