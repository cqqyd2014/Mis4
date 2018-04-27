package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WxReturnVoiceTxt generated by hbm2java
 */
@Entity
@Table(name = "wx_return_voice_txt", schema = "public")
public class WxReturnVoiceTxt implements java.io.Serializable {

	private int id;
	private String msg;
	private String comId;

	public WxReturnVoiceTxt() {
	}

	public WxReturnVoiceTxt(int id) {
		this.id = id;
	}

	public WxReturnVoiceTxt(int id, String msg, String comId) {
		this.id = id;
		this.msg = msg;
		this.comId = comId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "msg")
	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Column(name = "com_id", length = 45)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

}