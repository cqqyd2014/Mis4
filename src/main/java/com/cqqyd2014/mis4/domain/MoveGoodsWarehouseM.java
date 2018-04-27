package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MoveGoodsWarehouseM generated by hbm2java
 */
@Entity
@Table(name = "move_goods_warehouse_m", schema = "public")
public class MoveGoodsWarehouseM implements java.io.Serializable {

	private MoveGoodsWarehouseMId id;
	private String whFrom;
	private String whTo;
	private String memo;

	public MoveGoodsWarehouseM() {
	}

	public MoveGoodsWarehouseM(MoveGoodsWarehouseMId id) {
		this.id = id;
	}

	public MoveGoodsWarehouseM(MoveGoodsWarehouseMId id, String whFrom, String whTo, String memo) {
		this.id = id;
		this.whFrom = whFrom;
		this.whTo = whTo;
		this.memo = memo;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false, length = 36)),
			@AttributeOverride(name = "moveDate", column = @Column(name = "move_date", nullable = false, length = 35)) })
	public MoveGoodsWarehouseMId getId() {
		return this.id;
	}

	public void setId(MoveGoodsWarehouseMId id) {
		this.id = id;
	}

	@Column(name = "wh_from", length = 6)
	public String getWhFrom() {
		return this.whFrom;
	}

	public void setWhFrom(String whFrom) {
		this.whFrom = whFrom;
	}

	@Column(name = "wh_to", length = 6)
	public String getWhTo() {
		return this.whTo;
	}

	public void setWhTo(String whTo) {
		this.whTo = whTo;
	}

	@Column(name = "memo", length = 450)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
