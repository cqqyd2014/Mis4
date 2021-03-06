package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VWeixinScanQrLog generated by hbm2java
 */
@Entity
@Table(name = "v_weixin_scan_qr_log", schema = "public")
public class VWeixinScanQrLog implements java.io.Serializable {

	private VWeixinScanQrLogId id;

	public VWeixinScanQrLog() {
	}

	public VWeixinScanQrLog(VWeixinScanQrLogId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 4)),
			@AttributeOverride(name = "goodsBarcode", column = @Column(name = "goods_barcode", length = 22)),
			@AttributeOverride(name = "scanTime", column = @Column(name = "scan_time", length = 35)),
			@AttributeOverride(name = "ipAddr", column = @Column(name = "ip_addr", length = 45)),
			@AttributeOverride(name = "effective", column = @Column(name = "effective")) })
	public VWeixinScanQrLogId getId() {
		return this.id;
	}

	public void setId(VWeixinScanQrLogId id) {
		this.id = id;
	}

}
