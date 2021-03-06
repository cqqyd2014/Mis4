package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * OrderFrom generated by hbm2java
 */
@Entity
@Table(name = "order_from", schema = "public")
public class OrderFrom implements java.io.Serializable {

	private OrderFromId id;
	private String orderTypeName;
	private String orderTypeDesc;
	private String seq;
	private String sender;
	private String senderCom;
	private String senderTell;
	private String senderFullAddr;
	private String senderProvince;
	private String senderCity;
	private String senderDistrict;
	private String senderAddr;

	public OrderFrom() {
	}

	public OrderFrom(OrderFromId id) {
		this.id = id;
	}

	public OrderFrom(OrderFromId id, String orderTypeName, String orderTypeDesc, String seq, String sender,
			String senderCom, String senderTell, String senderFullAddr, String senderProvince, String senderCity,
			String senderDistrict, String senderAddr) {
		this.id = id;
		this.orderTypeName = orderTypeName;
		this.orderTypeDesc = orderTypeDesc;
		this.seq = seq;
		this.sender = sender;
		this.senderCom = senderCom;
		this.senderTell = senderTell;
		this.senderFullAddr = senderFullAddr;
		this.senderProvince = senderProvince;
		this.senderCity = senderCity;
		this.senderDistrict = senderDistrict;
		this.senderAddr = senderAddr;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 45)),
			@AttributeOverride(name = "orderTypeCode", column = @Column(name = "order_type_code", nullable = false, length = 2)),
			@AttributeOverride(name = "EId", column = @Column(name = "e_id", nullable = false, length = 4)) })
	public OrderFromId getId() {
		return this.id;
	}

	public void setId(OrderFromId id) {
		this.id = id;
	}

	@Column(name = "order_type_name", length = 45)
	public String getOrderTypeName() {
		return this.orderTypeName;
	}

	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}

	@Column(name = "order_type_desc", length = 45)
	public String getOrderTypeDesc() {
		return this.orderTypeDesc;
	}

	public void setOrderTypeDesc(String orderTypeDesc) {
		this.orderTypeDesc = orderTypeDesc;
	}

	@Column(name = "seq", length = 4)
	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	@Column(name = "sender", length = 45)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Column(name = "sender_com", length = 45)
	public String getSenderCom() {
		return this.senderCom;
	}

	public void setSenderCom(String senderCom) {
		this.senderCom = senderCom;
	}

	@Column(name = "sender_tell", length = 45)
	public String getSenderTell() {
		return this.senderTell;
	}

	public void setSenderTell(String senderTell) {
		this.senderTell = senderTell;
	}

	@Column(name = "sender_full_addr", length = 512)
	public String getSenderFullAddr() {
		return this.senderFullAddr;
	}

	public void setSenderFullAddr(String senderFullAddr) {
		this.senderFullAddr = senderFullAddr;
	}

	@Column(name = "sender_province", length = 45)
	public String getSenderProvince() {
		return this.senderProvince;
	}

	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}

	@Column(name = "sender_city", length = 45)
	public String getSenderCity() {
		return this.senderCity;
	}

	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	@Column(name = "sender_district", length = 45)
	public String getSenderDistrict() {
		return this.senderDistrict;
	}

	public void setSenderDistrict(String senderDistrict) {
		this.senderDistrict = senderDistrict;
	}

	@Column(name = "sender_addr", length = 256)
	public String getSenderAddr() {
		return this.senderAddr;
	}

	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
