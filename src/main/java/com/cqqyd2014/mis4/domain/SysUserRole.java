package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SysUserRole generated by hbm2java
 */
@Entity
@Table(name = "sys_user_role", schema = "public")
public class SysUserRole implements java.io.Serializable {

	private SysUserRoleId id;

	public SysUserRole() {
	}

	public SysUserRole(SysUserRoleId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false, length = 45)),
			@AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false, length = 45)),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 45)) })
	public SysUserRoleId getId() {
		return this.id;
	}

	public void setId(SysUserRoleId id) {
		this.id = id;
	}

}
