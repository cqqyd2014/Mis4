package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FinanceItems generated by hbm2java
 */
@Entity
@Table(name = "finance_items", schema = "public")
public class FinanceItems implements java.io.Serializable {

	private FinanceItemsId id;
	private String itemValue;

	public FinanceItems() {
	}

	public FinanceItems(FinanceItemsId id) {
		this.id = id;
	}

	public FinanceItems(FinanceItemsId id, String itemValue) {
		this.id = id;
		this.itemValue = itemValue;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 45)),
			@AttributeOverride(name = "bookId", column = @Column(name = "book_id", nullable = false, length = 45)),
			@AttributeOverride(name = "itemId", column = @Column(name = "item_id", nullable = false, length = 45)),
			@AttributeOverride(name = "itemCode", column = @Column(name = "item_code", nullable = false, length = 45)) })
	public FinanceItemsId getId() {
		return this.id;
	}

	public void setId(FinanceItemsId id) {
		this.id = id;
	}

	@Column(name = "item_value", length = 45)
	public String getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

}
