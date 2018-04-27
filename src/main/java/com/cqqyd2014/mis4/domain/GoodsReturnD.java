package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GoodsReturnD generated by hbm2java
 */
@Entity
@Table(name = "goods_return_d", schema = "public")
public class GoodsReturnD implements java.io.Serializable {

	private GoodsReturnDId id;

	public GoodsReturnD() {
	}

	public GoodsReturnD(GoodsReturnDId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)),
			@AttributeOverride(name = "orderNo", column = @Column(name = "order_no", nullable = false, length = 20)),
			@AttributeOverride(name = "seq", column = @Column(name = "seq", nullable = false, length = 4)),
			@AttributeOverride(name = "goodsBarcode", column = @Column(name = "goods_barcode", nullable = false, length = 22)) })
	public GoodsReturnDId getId() {
		return this.id;
	}

	public void setId(GoodsReturnDId id) {
		this.id = id;
	}

}
