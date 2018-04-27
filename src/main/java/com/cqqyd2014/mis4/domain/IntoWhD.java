package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * IntoWhD generated by hbm2java
 */
@Entity
@Table(name = "into_wh_d", schema = "public")
public class IntoWhD implements java.io.Serializable {

	private IntoWhDId id;
	private BigDecimal buy;
	private BigDecimal out;
	private BigDecimal yue;
	private BigDecimal price;

	public IntoWhD() {
	}

	public IntoWhD(IntoWhDId id) {
		this.id = id;
	}

	public IntoWhD(IntoWhDId id, BigDecimal buy, BigDecimal out, BigDecimal yue, BigDecimal price) {
		this.id = id;
		this.buy = buy;
		this.out = out;
		this.yue = yue;
		this.price = price;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 45)),
			@AttributeOverride(name = "uuid", column = @Column(name = "uuid", nullable = false, length = 45)),
			@AttributeOverride(name = "goodsId", column = @Column(name = "goods_id", nullable = false, length = 45)) })
	public IntoWhDId getId() {
		return this.id;
	}

	public void setId(IntoWhDId id) {
		this.id = id;
	}

	@Column(name = "buy", precision = 131089, scale = 0)
	public BigDecimal getBuy() {
		return this.buy;
	}

	public void setBuy(BigDecimal buy) {
		this.buy = buy;
	}

	@Column(name = "out", precision = 131089, scale = 0)
	public BigDecimal getOut() {
		return this.out;
	}

	public void setOut(BigDecimal out) {
		this.out = out;
	}

	@Column(name = "yue", precision = 131089, scale = 0)
	public BigDecimal getYue() {
		return this.yue;
	}

	public void setYue(BigDecimal yue) {
		this.yue = yue;
	}

	@Column(name = "price", precision = 131089, scale = 0)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
