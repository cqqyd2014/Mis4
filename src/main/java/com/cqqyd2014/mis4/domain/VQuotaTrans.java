package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VQuotaTrans generated by hbm2java
 */
@Entity
@Table(name = "v_quota_trans", schema = "public")
public class VQuotaTrans implements java.io.Serializable {

	private VQuotaTransId id;

	public VQuotaTrans() {
	}

	public VQuotaTrans(VQuotaTransId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 4)),
			@AttributeOverride(name = "uuid", column = @Column(name = "uuid", length = 36)),
			@AttributeOverride(name = "opTime", column = @Column(name = "op_time", length = 35)),
			@AttributeOverride(name = "beginAmount", column = @Column(name = "begin_amount", precision = 131089, scale = 0)),
			@AttributeOverride(name = "transAmount", column = @Column(name = "trans_amount", precision = 131089, scale = 0)),
			@AttributeOverride(name = "endAmount", column = @Column(name = "end_amount", precision = 131089, scale = 0)),
			@AttributeOverride(name = "transType", column = @Column(name = "trans_type", length = 4)),
			@AttributeOverride(name = "memo", column = @Column(name = "memo", length = 512)),
			@AttributeOverride(name = "orderno", column = @Column(name = "orderno", length = 20)),
			@AttributeOverride(name = "beginFreezAmount", column = @Column(name = "begin_freez_amount", precision = 131089, scale = 0)),
			@AttributeOverride(name = "transFreezAmount", column = @Column(name = "trans_freez_amount", precision = 131089, scale = 0)),
			@AttributeOverride(name = "endFreezAmount", column = @Column(name = "end_freez_amount", precision = 131089, scale = 0)),
			@AttributeOverride(name = "wrongUuid", column = @Column(name = "wrong_uuid", length = 36)),
			@AttributeOverride(name = "userid", column = @Column(name = "userid", length = 36)),
			@AttributeOverride(name = "opUserid", column = @Column(name = "op_userid", length = 36)),
			@AttributeOverride(name = "status", column = @Column(name = "status", length = 4)),
			@AttributeOverride(name = "transTypeName", column = @Column(name = "trans_type_name", length = 90)),
			@AttributeOverride(name = "opUserName", column = @Column(name = "op_user_name", length = 45)) })
	public VQuotaTransId getId() {
		return this.id;
	}

	public void setId(VQuotaTransId id) {
		this.id = id;
	}

}
