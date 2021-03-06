package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VPickupYue generated by hbm2java
 */
@Entity
@Table(name = "v_pickup_yue", schema = "public")
public class VPickupYue implements java.io.Serializable {

	private VPickupYueId id;

	public VPickupYue() {
	}

	public VPickupYue(VPickupYueId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "sendedCount", column = @Column(name = "sended_count")),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 4)),
			@AttributeOverride(name = "orderNo", column = @Column(name = "order_no", length = 45)),
			@AttributeOverride(name = "CGoodsId", column = @Column(name = "c_goods_id", length = 45)),
			@AttributeOverride(name = "CCount", column = @Column(name = "c_count", precision = 131089, scale = 0)),
			@AttributeOverride(name = "yue", column = @Column(name = "yue", precision = 131089, scale = 0)),
			@AttributeOverride(name = "CName", column = @Column(name = "c_name", length = 100)),
			@AttributeOverride(name = "unitName", column = @Column(name = "unit_name", length = 90)) })
	public VPickupYueId getId() {
		return this.id;
	}

	public void setId(VPickupYueId id) {
		this.id = id;
	}

}
