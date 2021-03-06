package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VInventoryByGoodsIdDefaulId generated by hbm2java
 */
@Embeddable
public class VInventoryByGoodsIdDefaulId implements java.io.Serializable {

	private String whId;
	private Integer priority;
	private String comId;
	private String goodsId;
	private String CName;
	private String unit;
	private BigDecimal sum;

	public VInventoryByGoodsIdDefaulId() {
	}

	public VInventoryByGoodsIdDefaulId(String whId, Integer priority, String comId, String goodsId, String CName,
			String unit, BigDecimal sum) {
		this.whId = whId;
		this.priority = priority;
		this.comId = comId;
		this.goodsId = goodsId;
		this.CName = CName;
		this.unit = unit;
		this.sum = sum;
	}

	@Column(name = "wh_id", length = 6)
	public String getWhId() {
		return this.whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	@Column(name = "priority")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "com_id", length = 45)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "goods_id", length = 45)
	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "c_name", length = 100)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "unit", length = 90)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "sum", precision = 131089, scale = 0)
	public BigDecimal getSum() {
		return this.sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VInventoryByGoodsIdDefaulId))
			return false;
		VInventoryByGoodsIdDefaulId castOther = (VInventoryByGoodsIdDefaulId) other;

		return ((this.getWhId() == castOther.getWhId()) || (this.getWhId() != null && castOther.getWhId() != null
				&& this.getWhId().equals(castOther.getWhId())))
				&& ((this.getPriority() == castOther.getPriority()) || (this.getPriority() != null
						&& castOther.getPriority() != null && this.getPriority().equals(castOther.getPriority())))
				&& ((this.getComId() == castOther.getComId()) || (this.getComId() != null
						&& castOther.getComId() != null && this.getComId().equals(castOther.getComId())))
				&& ((this.getGoodsId() == castOther.getGoodsId()) || (this.getGoodsId() != null
						&& castOther.getGoodsId() != null && this.getGoodsId().equals(castOther.getGoodsId())))
				&& ((this.getCName() == castOther.getCName()) || (this.getCName() != null
						&& castOther.getCName() != null && this.getCName().equals(castOther.getCName())))
				&& ((this.getUnit() == castOther.getUnit()) || (this.getUnit() != null && castOther.getUnit() != null
						&& this.getUnit().equals(castOther.getUnit())))
				&& ((this.getSum() == castOther.getSum()) || (this.getSum() != null && castOther.getSum() != null
						&& this.getSum().equals(castOther.getSum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWhId() == null ? 0 : this.getWhId().hashCode());
		result = 37 * result + (getPriority() == null ? 0 : this.getPriority().hashCode());
		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getGoodsId() == null ? 0 : this.getGoodsId().hashCode());
		result = 37 * result + (getCName() == null ? 0 : this.getCName().hashCode());
		result = 37 * result + (getUnit() == null ? 0 : this.getUnit().hashCode());
		result = 37 * result + (getSum() == null ? 0 : this.getSum().hashCode());
		return result;
	}

}
