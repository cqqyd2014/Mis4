package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FinanceGoodsPrice generated by hbm2java
 */
@Entity
@Table(name = "finance_goods_price", schema = "public")
public class FinanceGoodsPrice implements java.io.Serializable {

	private FinanceGoodsPriceId id;
	private String goodsId;
	private Date startDat;
	private Date endDat;
	private BigDecimal price;

	public FinanceGoodsPrice() {
	}

	public FinanceGoodsPrice(FinanceGoodsPriceId id, String goodsId, Date startDat) {
		this.id = id;
		this.goodsId = goodsId;
		this.startDat = startDat;
	}

	public FinanceGoodsPrice(FinanceGoodsPriceId id, String goodsId, Date startDat, Date endDat, BigDecimal price) {
		this.id = id;
		this.goodsId = goodsId;
		this.startDat = startDat;
		this.endDat = endDat;
		this.price = price;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)),
			@AttributeOverride(name = "uuid", column = @Column(name = "uuid", nullable = false, length = 36)) })
	public FinanceGoodsPriceId getId() {
		return this.id;
	}

	public void setId(FinanceGoodsPriceId id) {
		this.id = id;
	}

	@Column(name = "goods_id", nullable = false, length = 45)
	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_dat", nullable = false, length = 35)
	public Date getStartDat() {
		return this.startDat;
	}

	public void setStartDat(Date startDat) {
		this.startDat = startDat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_dat", length = 35)
	public Date getEndDat() {
		return this.endDat;
	}

	public void setEndDat(Date endDat) {
		this.endDat = endDat;
	}

	@Column(name = "price", precision = 131089, scale = 0)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}