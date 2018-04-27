package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MoveGoodsWarehouseMId generated by hbm2java
 */
@Embeddable
public class MoveGoodsWarehouseMId implements java.io.Serializable {

	private String comId;
	private String userId;
	private Date moveDate;

	public MoveGoodsWarehouseMId() {
	}

	public MoveGoodsWarehouseMId(String comId, String userId, Date moveDate) {
		this.comId = comId;
		this.userId = userId;
		this.moveDate = moveDate;
	}

	@Column(name = "com_id", nullable = false, length = 4)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "user_id", nullable = false, length = 36)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "move_date", nullable = false, length = 35)
	public Date getMoveDate() {
		return this.moveDate;
	}

	public void setMoveDate(Date moveDate) {
		this.moveDate = moveDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MoveGoodsWarehouseMId))
			return false;
		MoveGoodsWarehouseMId castOther = (MoveGoodsWarehouseMId) other;

		return ((this.getComId() == castOther.getComId()) || (this.getComId() != null && castOther.getComId() != null
				&& this.getComId().equals(castOther.getComId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getMoveDate() == castOther.getMoveDate()) || (this.getMoveDate() != null
						&& castOther.getMoveDate() != null && this.getMoveDate().equals(castOther.getMoveDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getMoveDate() == null ? 0 : this.getMoveDate().hashCode());
		return result;
	}

}