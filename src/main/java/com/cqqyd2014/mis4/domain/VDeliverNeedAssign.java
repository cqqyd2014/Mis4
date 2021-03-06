package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VDeliverNeedAssign generated by hbm2java
 */
@Entity
@Table(name = "v_deliver_need_assign", schema = "public")
public class VDeliverNeedAssign implements java.io.Serializable {

	private VDeliverNeedAssignId id;

	public VDeliverNeedAssign() {
	}

	public VDeliverNeedAssign(VDeliverNeedAssignId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "orderNo", column = @Column(name = "order_no", length = 20)),
			@AttributeOverride(name = "seq", column = @Column(name = "seq", length = 4)),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 4)) })
	public VDeliverNeedAssignId getId() {
		return this.id;
	}

	public void setId(VDeliverNeedAssignId id) {
		this.id = id;
	}

}
