package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VFinanceGoodsPriceId generated by hbm2java
 */
@Embeddable
public class VFinanceGoodsPriceId implements java.io.Serializable {

	private String CId;
	private String comId;
	private String CName;
	private String unit;
	private Date startDat;
	private Date endDat;
	private BigDecimal price;

	public VFinanceGoodsPriceId() {
	}

	public VFinanceGoodsPriceId(String CId, String comId, String CName, String unit, Date startDat, Date endDat,
			BigDecimal price) {
		this.CId = CId;
		this.comId = comId;
		this.CName = CName;
		this.unit = unit;
		this.startDat = startDat;
		this.endDat = endDat;
		this.price = price;
	}

	@Column(name = "c_id")
	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	@Column(name = "com_id", length = 45)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
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

	@Column(name = "start_dat", length = 35)
	public Date getStartDat() {
		return this.startDat;
	}

	public void setStartDat(Date startDat) {
		this.startDat = startDat;
	}

	@Column(name = "end_dat", length = 35)
	public Date getEndDat() {
		return this.endDat;
	}

	public void setEndDat(Date endDat) {
		this.endDat = endDat;
	}

	@Column(name = "price", precision = 131089, scale = 0)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VFinanceGoodsPriceId))
			return false;
		VFinanceGoodsPriceId castOther = (VFinanceGoodsPriceId) other;

		return ((this.getCId() == castOther.getCId())
				|| (this.getCId() != null && castOther.getCId() != null && this.getCId().equals(castOther.getCId())))
				&& ((this.getComId() == castOther.getComId()) || (this.getComId() != null
						&& castOther.getComId() != null && this.getComId().equals(castOther.getComId())))
				&& ((this.getCName() == castOther.getCName()) || (this.getCName() != null
						&& castOther.getCName() != null && this.getCName().equals(castOther.getCName())))
				&& ((this.getUnit() == castOther.getUnit()) || (this.getUnit() != null && castOther.getUnit() != null
						&& this.getUnit().equals(castOther.getUnit())))
				&& ((this.getStartDat() == castOther.getStartDat()) || (this.getStartDat() != null
						&& castOther.getStartDat() != null && this.getStartDat().equals(castOther.getStartDat())))
				&& ((this.getEndDat() == castOther.getEndDat()) || (this.getEndDat() != null
						&& castOther.getEndDat() != null && this.getEndDat().equals(castOther.getEndDat())))
				&& ((this.getPrice() == castOther.getPrice()) || (this.getPrice() != null
						&& castOther.getPrice() != null && this.getPrice().equals(castOther.getPrice())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCId() == null ? 0 : this.getCId().hashCode());
		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getCName() == null ? 0 : this.getCName().hashCode());
		result = 37 * result + (getUnit() == null ? 0 : this.getUnit().hashCode());
		result = 37 * result + (getStartDat() == null ? 0 : this.getStartDat().hashCode());
		result = 37 * result + (getEndDat() == null ? 0 : this.getEndDat().hashCode());
		result = 37 * result + (getPrice() == null ? 0 : this.getPrice().hashCode());
		return result;
	}

}
