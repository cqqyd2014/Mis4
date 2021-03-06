package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ExpressPrintId generated by hbm2java
 */
@Embeddable
public class ExpressPrintId implements java.io.Serializable {

	private String uuid;
	private String parCode;

	public ExpressPrintId() {
	}

	public ExpressPrintId(String uuid, String parCode) {
		this.uuid = uuid;
		this.parCode = parCode;
	}

	@Column(name = "uuid", nullable = false, length = 45)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "par_code", nullable = false, length = 45)
	public String getParCode() {
		return this.parCode;
	}

	public void setParCode(String parCode) {
		this.parCode = parCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExpressPrintId))
			return false;
		ExpressPrintId castOther = (ExpressPrintId) other;

		return ((this.getUuid() == castOther.getUuid()) || (this.getUuid() != null && castOther.getUuid() != null
				&& this.getUuid().equals(castOther.getUuid())))
				&& ((this.getParCode() == castOther.getParCode()) || (this.getParCode() != null
						&& castOther.getParCode() != null && this.getParCode().equals(castOther.getParCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUuid() == null ? 0 : this.getUuid().hashCode());
		result = 37 * result + (getParCode() == null ? 0 : this.getParCode().hashCode());
		return result;
	}

}
