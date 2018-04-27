package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VPickupYueId generated by hbm2java
 */
@Embeddable
public class VPickupYueId implements java.io.Serializable {

	private Long sendedCount;
	private String comId;
	private String orderNo;
	private String CGoodsId;
	private BigDecimal CCount;
	private BigDecimal yue;
	private String CName;
	private String unitName;

	public VPickupYueId() {
	}

	public VPickupYueId(Long sendedCount, String comId, String orderNo, String CGoodsId, BigDecimal CCount,
			BigDecimal yue, String CName, String unitName) {
		this.sendedCount = sendedCount;
		this.comId = comId;
		this.orderNo = orderNo;
		this.CGoodsId = CGoodsId;
		this.CCount = CCount;
		this.yue = yue;
		this.CName = CName;
		this.unitName = unitName;
	}

	@Column(name = "sended_count")
	public Long getSendedCount() {
		return this.sendedCount;
	}

	public void setSendedCount(Long sendedCount) {
		this.sendedCount = sendedCount;
	}

	@Column(name = "com_id", length = 4)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "order_no", length = 45)
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "c_goods_id", length = 45)
	public String getCGoodsId() {
		return this.CGoodsId;
	}

	public void setCGoodsId(String CGoodsId) {
		this.CGoodsId = CGoodsId;
	}

	@Column(name = "c_count", precision = 131089, scale = 0)
	public BigDecimal getCCount() {
		return this.CCount;
	}

	public void setCCount(BigDecimal CCount) {
		this.CCount = CCount;
	}

	@Column(name = "yue", precision = 131089, scale = 0)
	public BigDecimal getYue() {
		return this.yue;
	}

	public void setYue(BigDecimal yue) {
		this.yue = yue;
	}

	@Column(name = "c_name", length = 100)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "unit_name", length = 90)
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VPickupYueId))
			return false;
		VPickupYueId castOther = (VPickupYueId) other;

		return ((this.getSendedCount() == castOther.getSendedCount()) || (this.getSendedCount() != null
				&& castOther.getSendedCount() != null && this.getSendedCount().equals(castOther.getSendedCount())))
				&& ((this.getComId() == castOther.getComId()) || (this.getComId() != null
						&& castOther.getComId() != null && this.getComId().equals(castOther.getComId())))
				&& ((this.getOrderNo() == castOther.getOrderNo()) || (this.getOrderNo() != null
						&& castOther.getOrderNo() != null && this.getOrderNo().equals(castOther.getOrderNo())))
				&& ((this.getCGoodsId() == castOther.getCGoodsId()) || (this.getCGoodsId() != null
						&& castOther.getCGoodsId() != null && this.getCGoodsId().equals(castOther.getCGoodsId())))
				&& ((this.getCCount() == castOther.getCCount()) || (this.getCCount() != null
						&& castOther.getCCount() != null && this.getCCount().equals(castOther.getCCount())))
				&& ((this.getYue() == castOther.getYue()) || (this.getYue() != null && castOther.getYue() != null
						&& this.getYue().equals(castOther.getYue())))
				&& ((this.getCName() == castOther.getCName()) || (this.getCName() != null
						&& castOther.getCName() != null && this.getCName().equals(castOther.getCName())))
				&& ((this.getUnitName() == castOther.getUnitName()) || (this.getUnitName() != null
						&& castOther.getUnitName() != null && this.getUnitName().equals(castOther.getUnitName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSendedCount() == null ? 0 : this.getSendedCount().hashCode());
		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getOrderNo() == null ? 0 : this.getOrderNo().hashCode());
		result = 37 * result + (getCGoodsId() == null ? 0 : this.getCGoodsId().hashCode());
		result = 37 * result + (getCCount() == null ? 0 : this.getCCount().hashCode());
		result = 37 * result + (getYue() == null ? 0 : this.getYue().hashCode());
		result = 37 * result + (getCName() == null ? 0 : this.getCName().hashCode());
		result = 37 * result + (getUnitName() == null ? 0 : this.getUnitName().hashCode());
		return result;
	}

}
