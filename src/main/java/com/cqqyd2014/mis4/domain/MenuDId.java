package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MenuDId generated by hbm2java
 */
@Embeddable
public class MenuDId implements java.io.Serializable {

	private String menuId;
	private String menuDId;
	private String comId;

	public MenuDId() {
	}

	public MenuDId(String menuId, String menuDId, String comId) {
		this.menuId = menuId;
		this.menuDId = menuDId;
		this.comId = comId;
	}

	@Column(name = "menu_id", nullable = false, length = 4)
	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	@Column(name = "menu_d_id", nullable = false, length = 4)
	public String getMenuDId() {
		return this.menuDId;
	}

	public void setMenuDId(String menuDId) {
		this.menuDId = menuDId;
	}

	@Column(name = "com_id", nullable = false, length = 4)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MenuDId))
			return false;
		MenuDId castOther = (MenuDId) other;

		return ((this.getMenuId() == castOther.getMenuId()) || (this.getMenuId() != null
				&& castOther.getMenuId() != null && this.getMenuId().equals(castOther.getMenuId())))
				&& ((this.getMenuDId() == castOther.getMenuDId()) || (this.getMenuDId() != null
						&& castOther.getMenuDId() != null && this.getMenuDId().equals(castOther.getMenuDId())))
				&& ((this.getComId() == castOther.getComId()) || (this.getComId() != null
						&& castOther.getComId() != null && this.getComId().equals(castOther.getComId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMenuId() == null ? 0 : this.getMenuId().hashCode());
		result = 37 * result + (getMenuDId() == null ? 0 : this.getMenuDId().hashCode());
		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		return result;
	}

}
