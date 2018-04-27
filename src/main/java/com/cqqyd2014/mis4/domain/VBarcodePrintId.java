package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VBarcodePrintId generated by hbm2java
 */
@Embeddable
public class VBarcodePrintId implements java.io.Serializable {

	private String goodsBarcode;
	private String CName;
	private String CSpec;
	private String url;

	public VBarcodePrintId() {
	}

	public VBarcodePrintId(String goodsBarcode, String CName, String CSpec, String url) {
		this.goodsBarcode = goodsBarcode;
		this.CName = CName;
		this.CSpec = CSpec;
		this.url = url;
	}

	@Column(name = "goods_barcode", length = 22)
	public String getGoodsBarcode() {
		return this.goodsBarcode;
	}

	public void setGoodsBarcode(String goodsBarcode) {
		this.goodsBarcode = goodsBarcode;
	}

	@Column(name = "c_name", length = 100)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "c_spec", length = 45)
	public String getCSpec() {
		return this.CSpec;
	}

	public void setCSpec(String CSpec) {
		this.CSpec = CSpec;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VBarcodePrintId))
			return false;
		VBarcodePrintId castOther = (VBarcodePrintId) other;

		return ((this.getGoodsBarcode() == castOther.getGoodsBarcode()) || (this.getGoodsBarcode() != null
				&& castOther.getGoodsBarcode() != null && this.getGoodsBarcode().equals(castOther.getGoodsBarcode())))
				&& ((this.getCName() == castOther.getCName()) || (this.getCName() != null
						&& castOther.getCName() != null && this.getCName().equals(castOther.getCName())))
				&& ((this.getCSpec() == castOther.getCSpec()) || (this.getCSpec() != null
						&& castOther.getCSpec() != null && this.getCSpec().equals(castOther.getCSpec())))
				&& ((this.getUrl() == castOther.getUrl()) || (this.getUrl() != null && castOther.getUrl() != null
						&& this.getUrl().equals(castOther.getUrl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGoodsBarcode() == null ? 0 : this.getGoodsBarcode().hashCode());
		result = 37 * result + (getCName() == null ? 0 : this.getCName().hashCode());
		result = 37 * result + (getCSpec() == null ? 0 : this.getCSpec().hashCode());
		result = 37 * result + (getUrl() == null ? 0 : this.getUrl().hashCode());
		return result;
	}

}
