package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VPrepackageD generated by hbm2java
 */
@Entity
@Table(name = "v_prepackage_d", schema = "public")
public class VPrepackageD implements java.io.Serializable {

	private VPrepackageDId id;

	public VPrepackageD() {
	}

	public VPrepackageD(VPrepackageDId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "packageBarcode", column = @Column(name = "package_barcode", length = 18)),
			@AttributeOverride(name = "goodsBarcode", column = @Column(name = "goods_barcode", length = 22)),
			@AttributeOverride(name = "CId", column = @Column(name = "c_id")),
			@AttributeOverride(name = "CName", column = @Column(name = "c_name", length = 100)),
			@AttributeOverride(name = "CSpec", column = @Column(name = "c_spec")),
			@AttributeOverride(name = "CHs", column = @Column(name = "c_hs", length = 45)),
			@AttributeOverride(name = "CMemo", column = @Column(name = "c_memo")),
			@AttributeOverride(name = "grossWeight", column = @Column(name = "gross_weight", precision = 131089, scale = 0)),
			@AttributeOverride(name = "barcode", column = @Column(name = "barcode", length = 45)),
			@AttributeOverride(name = "unit", column = @Column(name = "unit", length = 45)),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 45)),
			@AttributeOverride(name = "origin", column = @Column(name = "origin", length = 45)),
			@AttributeOverride(name = "snCode", column = @Column(name = "sn_code", length = 4)),
			@AttributeOverride(name = "shortName", column = @Column(name = "short_name", length = 45)),
			@AttributeOverride(name = "inUse", column = @Column(name = "in_use")),
			@AttributeOverride(name = "notAir", column = @Column(name = "not_air")),
			@AttributeOverride(name = "netWeight", column = @Column(name = "net_weight", precision = 131089, scale = 0)),
			@AttributeOverride(name = "packageWeight", column = @Column(name = "package_weight", precision = 131089, scale = 0)) })
	public VPrepackageDId getId() {
		return this.id;
	}

	public void setId(VPrepackageDId id) {
		this.id = id;
	}

}
