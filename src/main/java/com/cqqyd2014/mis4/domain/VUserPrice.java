package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VUserPrice generated by hbm2java
 */
@Entity
@Table(name = "v_user_price", schema = "public")
public class VUserPrice implements java.io.Serializable {

	private VUserPriceId id;

	public VUserPrice() {
	}

	public VUserPrice(VUserPriceId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userpriceUuid", column = @Column(name = "userprice_uuid", length = 36)),
			@AttributeOverride(name = "effective", column = @Column(name = "effective")),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 45)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", length = 45)),
			@AttributeOverride(name = "goodsId", column = @Column(name = "goods_id", length = 45)),
			@AttributeOverride(name = "userPrice", column = @Column(name = "user_price", precision = 131089, scale = 0)),
			@AttributeOverride(name = "startTime", column = @Column(name = "start_time", length = 35)),
			@AttributeOverride(name = "endTime", column = @Column(name = "end_time", length = 35)),
			@AttributeOverride(name = "CName", column = @Column(name = "c_name", length = 100)),
			@AttributeOverride(name = "unit", column = @Column(name = "unit", length = 90)) })
	public VUserPriceId getId() {
		return this.id;
	}

	public void setId(VUserPriceId id) {
		this.id = id;
	}

}