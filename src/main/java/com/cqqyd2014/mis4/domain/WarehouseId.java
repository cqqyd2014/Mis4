package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WarehouseId generated by hbm2java
 */
@Embeddable
public class WarehouseId implements java.io.Serializable {

	private String comId;
	private String whId;

	public WarehouseId() {
	}

	public WarehouseId(String comId, String whId) {
		this.comId = comId;
		this.whId = whId;
	}

	@Column(name = "com_id", nullable = false, length = 45)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "wh_id", nullable = false, length = 6)
	public String getWhId() {
		return this.whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WarehouseId))
			return false;
		WarehouseId castOther = (WarehouseId) other;

		return ((this.getComId() == castOther.getComId()) || (this.getComId() != null && castOther.getComId() != null
				&& this.getComId().equals(castOther.getComId())))
				&& ((this.getWhId() == castOther.getWhId()) || (this.getWhId() != null && castOther.getWhId() != null
						&& this.getWhId().equals(castOther.getWhId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getWhId() == null ? 0 : this.getWhId().hashCode());
		return result;
	}

}