package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderFromUserId generated by hbm2java
 */
@Embeddable
public class OrderFromUserId implements java.io.Serializable {

	private String comId;
	private String orderTypeCode;
	private String userId;

	public OrderFromUserId() {
	}

	public OrderFromUserId(String comId, String orderTypeCode, String userId) {
		this.comId = comId;
		this.orderTypeCode = orderTypeCode;
		this.userId = userId;
	}

	@Column(name = "com_id", nullable = false, length = 4)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "order_type_code", nullable = false, length = 2)
	public String getOrderTypeCode() {
		return this.orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	@Column(name = "user_id", nullable = false, length = 36)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderFromUserId))
			return false;
		OrderFromUserId castOther = (OrderFromUserId) other;

		return ((this.getComId() == castOther.getComId()) || (this.getComId() != null && castOther.getComId() != null
				&& this.getComId().equals(castOther.getComId())))
				&& ((this.getOrderTypeCode() == castOther.getOrderTypeCode())
						|| (this.getOrderTypeCode() != null && castOther.getOrderTypeCode() != null
								&& this.getOrderTypeCode().equals(castOther.getOrderTypeCode())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getOrderTypeCode() == null ? 0 : this.getOrderTypeCode().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		return result;
	}

}
