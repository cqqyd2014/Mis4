package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VPrePackageNeedPrint generated by hbm2java
 */
@Entity
@Table(name = "v_pre_package_need_print", schema = "public")
public class VPrePackageNeedPrint implements java.io.Serializable {

	private VPrePackageNeedPrintId id;

	public VPrePackageNeedPrint() {
	}

	public VPrePackageNeedPrint(VPrePackageNeedPrintId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "sn", column = @Column(name = "sn", length = 18)),
			@AttributeOverride(name = "ifEffective", column = @Column(name = "if_effective")),
			@AttributeOverride(name = "ifPrint", column = @Column(name = "if_print")),
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", length = 4)),
			@AttributeOverride(name = "createDat", column = @Column(name = "create_dat", length = 35)),
			@AttributeOverride(name = "ifPackage", column = @Column(name = "if_package")),
			@AttributeOverride(name = "packageTime", column = @Column(name = "package_time", length = 35)),
			@AttributeOverride(name = "memoNames", column = @Column(name = "memo_names", length = 512)),
			@AttributeOverride(name = "memoBarcodes", column = @Column(name = "memo_barcodes", length = 512)) })
	public VPrePackageNeedPrintId getId() {
		return this.id;
	}

	public void setId(VPrePackageNeedPrintId id) {
		this.id = id;
	}

}
