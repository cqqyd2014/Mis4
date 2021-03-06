package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WeixinScanQrLogId generated by hbm2java
 */
@Embeddable
public class WeixinScanQrLogId implements java.io.Serializable {

	private String comId;
	private String goodsBarcode;
	private Date scanTime;

	public WeixinScanQrLogId() {
	}

	public WeixinScanQrLogId(String comId, String goodsBarcode, Date scanTime) {
		this.comId = comId;
		this.goodsBarcode = goodsBarcode;
		this.scanTime = scanTime;
	}

	@Column(name = "com_id", nullable = false, length = 4)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "goods_barcode", nullable = false, length = 22)
	public String getGoodsBarcode() {
		return this.goodsBarcode;
	}

	public void setGoodsBarcode(String goodsBarcode) {
		this.goodsBarcode = goodsBarcode;
	}

	@Column(name = "scan_time", nullable = false, length = 35)
	public Date getScanTime() {
		return this.scanTime;
	}

	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeixinScanQrLogId))
			return false;
		WeixinScanQrLogId castOther = (WeixinScanQrLogId) other;

		return ((this.getComId() == castOther.getComId()) || (this.getComId() != null && castOther.getComId() != null
				&& this.getComId().equals(castOther.getComId())))
				&& ((this.getGoodsBarcode() == castOther.getGoodsBarcode())
						|| (this.getGoodsBarcode() != null && castOther.getGoodsBarcode() != null
								&& this.getGoodsBarcode().equals(castOther.getGoodsBarcode())))
				&& ((this.getScanTime() == castOther.getScanTime()) || (this.getScanTime() != null
						&& castOther.getScanTime() != null && this.getScanTime().equals(castOther.getScanTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getGoodsBarcode() == null ? 0 : this.getGoodsBarcode().hashCode());
		result = 37 * result + (getScanTime() == null ? 0 : this.getScanTime().hashCode());
		return result;
	}

}
