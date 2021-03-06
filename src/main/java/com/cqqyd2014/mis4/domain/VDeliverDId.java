package com.cqqyd2014.mis4.domain;
// Generated 2018-3-25 9:40:41 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VDeliverDId generated by hbm2java
 */
@Embeddable
public class VDeliverDId implements java.io.Serializable {

	private String sendUserName;
	private String receiverMobile;
	private String addrDistrict;
	private String addrCity;
	private String addrProvince;
	private String CTell;
	private String tell2;
	private String CUserAddr;
	private String CUserName;
	private Date orderDat;
	private String createUserName;
	private String originalId;
	private Boolean returned;
	private String returnedMemo;
	private Date returnedDat;
	private String returnedUserid;
	private Boolean effective;
	private Boolean sended;
	private String deliverBillStatus;
	private String whName;
	private String whId;
	private String comId;
	private String deliverExpressComName;
	private String deliverExpressCom;
	private String deliverExpressNo;
	private String deliverExpressVehicle;
	private String goodsBarcode;
	private String orderNo;
	private String seq;
	private String goodsId;
	private String CName;
	private BigDecimal netWeight;
	private BigDecimal grossWeight;
	private String deliverDUuid;
	private BigDecimal packageWeight;
	private String deliverNo;
	private String unit;

	public VDeliverDId() {
	}

	public VDeliverDId(String sendUserName, String receiverMobile, String addrDistrict, String addrCity,
			String addrProvince, String CTell, String tell2, String CUserAddr, String CUserName, Date orderDat,
			String createUserName, String originalId, Boolean returned, String returnedMemo, Date returnedDat,
			String returnedUserid, Boolean effective, Boolean sended, String deliverBillStatus, String whName,
			String whId, String comId, String deliverExpressComName, String deliverExpressCom, String deliverExpressNo,
			String deliverExpressVehicle, String goodsBarcode, String orderNo, String seq, String goodsId, String CName,
			BigDecimal netWeight, BigDecimal grossWeight, String deliverDUuid, BigDecimal packageWeight,
			String deliverNo, String unit) {
		this.sendUserName = sendUserName;
		this.receiverMobile = receiverMobile;
		this.addrDistrict = addrDistrict;
		this.addrCity = addrCity;
		this.addrProvince = addrProvince;
		this.CTell = CTell;
		this.tell2 = tell2;
		this.CUserAddr = CUserAddr;
		this.CUserName = CUserName;
		this.orderDat = orderDat;
		this.createUserName = createUserName;
		this.originalId = originalId;
		this.returned = returned;
		this.returnedMemo = returnedMemo;
		this.returnedDat = returnedDat;
		this.returnedUserid = returnedUserid;
		this.effective = effective;
		this.sended = sended;
		this.deliverBillStatus = deliverBillStatus;
		this.whName = whName;
		this.whId = whId;
		this.comId = comId;
		this.deliverExpressComName = deliverExpressComName;
		this.deliverExpressCom = deliverExpressCom;
		this.deliverExpressNo = deliverExpressNo;
		this.deliverExpressVehicle = deliverExpressVehicle;
		this.goodsBarcode = goodsBarcode;
		this.orderNo = orderNo;
		this.seq = seq;
		this.goodsId = goodsId;
		this.CName = CName;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
		this.deliverDUuid = deliverDUuid;
		this.packageWeight = packageWeight;
		this.deliverNo = deliverNo;
		this.unit = unit;
	}

	@Column(name = "send_user_name")
	public String getSendUserName() {
		return this.sendUserName;
	}

	public void setSendUserName(String sendUserName) {
		this.sendUserName = sendUserName;
	}

	@Column(name = "receiver_mobile", length = 45)
	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	@Column(name = "addr_district", length = 45)
	public String getAddrDistrict() {
		return this.addrDistrict;
	}

	public void setAddrDistrict(String addrDistrict) {
		this.addrDistrict = addrDistrict;
	}

	@Column(name = "addr_city", length = 45)
	public String getAddrCity() {
		return this.addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	@Column(name = "addr_province", length = 45)
	public String getAddrProvince() {
		return this.addrProvince;
	}

	public void setAddrProvince(String addrProvince) {
		this.addrProvince = addrProvince;
	}

	@Column(name = "c_tell", length = 45)
	public String getCTell() {
		return this.CTell;
	}

	public void setCTell(String CTell) {
		this.CTell = CTell;
	}

	@Column(name = "tell2", length = 45)
	public String getTell2() {
		return this.tell2;
	}

	public void setTell2(String tell2) {
		this.tell2 = tell2;
	}

	@Column(name = "c_user_addr", length = 450)
	public String getCUserAddr() {
		return this.CUserAddr;
	}

	public void setCUserAddr(String CUserAddr) {
		this.CUserAddr = CUserAddr;
	}

	@Column(name = "c_user_name", length = 45)
	public String getCUserName() {
		return this.CUserName;
	}

	public void setCUserName(String CUserName) {
		this.CUserName = CUserName;
	}

	@Column(name = "order_dat", length = 35)
	public Date getOrderDat() {
		return this.orderDat;
	}

	public void setOrderDat(Date orderDat) {
		this.orderDat = orderDat;
	}

	@Column(name = "create_user_name", length = 45)
	public String getCreateUserName() {
		return this.createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	@Column(name = "original_id", length = 45)
	public String getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}

	@Column(name = "returned")
	public Boolean getReturned() {
		return this.returned;
	}

	public void setReturned(Boolean returned) {
		this.returned = returned;
	}

	@Column(name = "returned_memo", length = 512)
	public String getReturnedMemo() {
		return this.returnedMemo;
	}

	public void setReturnedMemo(String returnedMemo) {
		this.returnedMemo = returnedMemo;
	}

	@Column(name = "returned_dat", length = 35)
	public Date getReturnedDat() {
		return this.returnedDat;
	}

	public void setReturnedDat(Date returnedDat) {
		this.returnedDat = returnedDat;
	}

	@Column(name = "returned_userid", length = 36)
	public String getReturnedUserid() {
		return this.returnedUserid;
	}

	public void setReturnedUserid(String returnedUserid) {
		this.returnedUserid = returnedUserid;
	}

	@Column(name = "effective")
	public Boolean getEffective() {
		return this.effective;
	}

	public void setEffective(Boolean effective) {
		this.effective = effective;
	}

	@Column(name = "sended")
	public Boolean getSended() {
		return this.sended;
	}

	public void setSended(Boolean sended) {
		this.sended = sended;
	}

	@Column(name = "deliver_bill_status", length = 4)
	public String getDeliverBillStatus() {
		return this.deliverBillStatus;
	}

	public void setDeliverBillStatus(String deliverBillStatus) {
		this.deliverBillStatus = deliverBillStatus;
	}

	@Column(name = "wh_name", length = 45)
	public String getWhName() {
		return this.whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
	}

	@Column(name = "wh_id", length = 6)
	public String getWhId() {
		return this.whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	@Column(name = "com_id", length = 4)
	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Column(name = "deliver_express_com_name", length = 45)
	public String getDeliverExpressComName() {
		return this.deliverExpressComName;
	}

	public void setDeliverExpressComName(String deliverExpressComName) {
		this.deliverExpressComName = deliverExpressComName;
	}

	@Column(name = "deliver_express_com", length = 45)
	public String getDeliverExpressCom() {
		return this.deliverExpressCom;
	}

	public void setDeliverExpressCom(String deliverExpressCom) {
		this.deliverExpressCom = deliverExpressCom;
	}

	@Column(name = "deliver_express_no", length = 45)
	public String getDeliverExpressNo() {
		return this.deliverExpressNo;
	}

	public void setDeliverExpressNo(String deliverExpressNo) {
		this.deliverExpressNo = deliverExpressNo;
	}

	@Column(name = "deliver_express_vehicle", length = 4)
	public String getDeliverExpressVehicle() {
		return this.deliverExpressVehicle;
	}

	public void setDeliverExpressVehicle(String deliverExpressVehicle) {
		this.deliverExpressVehicle = deliverExpressVehicle;
	}

	@Column(name = "goods_barcode", length = 22)
	public String getGoodsBarcode() {
		return this.goodsBarcode;
	}

	public void setGoodsBarcode(String goodsBarcode) {
		this.goodsBarcode = goodsBarcode;
	}

	@Column(name = "order_no", length = 20)
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "seq", length = 4)
	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	@Column(name = "goods_id", length = 45)
	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "c_name", length = 100)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "net_weight", precision = 131089, scale = 0)
	public BigDecimal getNetWeight() {
		return this.netWeight;
	}

	public void setNetWeight(BigDecimal netWeight) {
		this.netWeight = netWeight;
	}

	@Column(name = "gross_weight", precision = 131089, scale = 0)
	public BigDecimal getGrossWeight() {
		return this.grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}

	@Column(name = "deliver_d_uuid", length = 36)
	public String getDeliverDUuid() {
		return this.deliverDUuid;
	}

	public void setDeliverDUuid(String deliverDUuid) {
		this.deliverDUuid = deliverDUuid;
	}

	@Column(name = "package_weight", precision = 131089, scale = 0)
	public BigDecimal getPackageWeight() {
		return this.packageWeight;
	}

	public void setPackageWeight(BigDecimal packageWeight) {
		this.packageWeight = packageWeight;
	}

	@Column(name = "deliver_no", length = 45)
	public String getDeliverNo() {
		return this.deliverNo;
	}

	public void setDeliverNo(String deliverNo) {
		this.deliverNo = deliverNo;
	}

	@Column(name = "unit", length = 90)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VDeliverDId))
			return false;
		VDeliverDId castOther = (VDeliverDId) other;

		return ((this.getSendUserName() == castOther.getSendUserName()) || (this.getSendUserName() != null
				&& castOther.getSendUserName() != null && this.getSendUserName().equals(castOther.getSendUserName())))
				&& ((this.getReceiverMobile() == castOther.getReceiverMobile())
						|| (this.getReceiverMobile() != null && castOther.getReceiverMobile() != null
								&& this.getReceiverMobile().equals(castOther.getReceiverMobile())))
				&& ((this.getAddrDistrict() == castOther.getAddrDistrict())
						|| (this.getAddrDistrict() != null && castOther.getAddrDistrict() != null
								&& this.getAddrDistrict().equals(castOther.getAddrDistrict())))
				&& ((this.getAddrCity() == castOther.getAddrCity()) || (this.getAddrCity() != null
						&& castOther.getAddrCity() != null && this.getAddrCity().equals(castOther.getAddrCity())))
				&& ((this.getAddrProvince() == castOther.getAddrProvince())
						|| (this.getAddrProvince() != null && castOther.getAddrProvince() != null
								&& this.getAddrProvince().equals(castOther.getAddrProvince())))
				&& ((this.getCTell() == castOther.getCTell()) || (this.getCTell() != null
						&& castOther.getCTell() != null && this.getCTell().equals(castOther.getCTell())))
				&& ((this.getTell2() == castOther.getTell2()) || (this.getTell2() != null
						&& castOther.getTell2() != null && this.getTell2().equals(castOther.getTell2())))
				&& ((this.getCUserAddr() == castOther.getCUserAddr()) || (this.getCUserAddr() != null
						&& castOther.getCUserAddr() != null && this.getCUserAddr().equals(castOther.getCUserAddr())))
				&& ((this.getCUserName() == castOther.getCUserName()) || (this.getCUserName() != null
						&& castOther.getCUserName() != null && this.getCUserName().equals(castOther.getCUserName())))
				&& ((this.getOrderDat() == castOther.getOrderDat()) || (this.getOrderDat() != null
						&& castOther.getOrderDat() != null && this.getOrderDat().equals(castOther.getOrderDat())))
				&& ((this.getCreateUserName() == castOther.getCreateUserName())
						|| (this.getCreateUserName() != null && castOther.getCreateUserName() != null
								&& this.getCreateUserName().equals(castOther.getCreateUserName())))
				&& ((this.getOriginalId() == castOther.getOriginalId()) || (this.getOriginalId() != null
						&& castOther.getOriginalId() != null && this.getOriginalId().equals(castOther.getOriginalId())))
				&& ((this.getReturned() == castOther.getReturned()) || (this.getReturned() != null
						&& castOther.getReturned() != null && this.getReturned().equals(castOther.getReturned())))
				&& ((this.getReturnedMemo() == castOther.getReturnedMemo())
						|| (this.getReturnedMemo() != null && castOther.getReturnedMemo() != null
								&& this.getReturnedMemo().equals(castOther.getReturnedMemo())))
				&& ((this.getReturnedDat() == castOther.getReturnedDat())
						|| (this.getReturnedDat() != null && castOther.getReturnedDat() != null
								&& this.getReturnedDat().equals(castOther.getReturnedDat())))
				&& ((this.getReturnedUserid() == castOther.getReturnedUserid())
						|| (this.getReturnedUserid() != null && castOther.getReturnedUserid() != null
								&& this.getReturnedUserid().equals(castOther.getReturnedUserid())))
				&& ((this.getEffective() == castOther.getEffective()) || (this.getEffective() != null
						&& castOther.getEffective() != null && this.getEffective().equals(castOther.getEffective())))
				&& ((this.getSended() == castOther.getSended()) || (this.getSended() != null
						&& castOther.getSended() != null && this.getSended().equals(castOther.getSended())))
				&& ((this.getDeliverBillStatus() == castOther.getDeliverBillStatus())
						|| (this.getDeliverBillStatus() != null && castOther.getDeliverBillStatus() != null
								&& this.getDeliverBillStatus().equals(castOther.getDeliverBillStatus())))
				&& ((this.getWhName() == castOther.getWhName()) || (this.getWhName() != null
						&& castOther.getWhName() != null && this.getWhName().equals(castOther.getWhName())))
				&& ((this.getWhId() == castOther.getWhId()) || (this.getWhId() != null && castOther.getWhId() != null
						&& this.getWhId().equals(castOther.getWhId())))
				&& ((this.getComId() == castOther.getComId()) || (this.getComId() != null
						&& castOther.getComId() != null && this.getComId().equals(castOther.getComId())))
				&& ((this.getDeliverExpressComName() == castOther.getDeliverExpressComName())
						|| (this.getDeliverExpressComName() != null && castOther.getDeliverExpressComName() != null
								&& this.getDeliverExpressComName().equals(castOther.getDeliverExpressComName())))
				&& ((this.getDeliverExpressCom() == castOther.getDeliverExpressCom())
						|| (this.getDeliverExpressCom() != null && castOther.getDeliverExpressCom() != null
								&& this.getDeliverExpressCom().equals(castOther.getDeliverExpressCom())))
				&& ((this.getDeliverExpressNo() == castOther.getDeliverExpressNo())
						|| (this.getDeliverExpressNo() != null && castOther.getDeliverExpressNo() != null
								&& this.getDeliverExpressNo().equals(castOther.getDeliverExpressNo())))
				&& ((this.getDeliverExpressVehicle() == castOther.getDeliverExpressVehicle())
						|| (this.getDeliverExpressVehicle() != null && castOther.getDeliverExpressVehicle() != null
								&& this.getDeliverExpressVehicle().equals(castOther.getDeliverExpressVehicle())))
				&& ((this.getGoodsBarcode() == castOther.getGoodsBarcode())
						|| (this.getGoodsBarcode() != null && castOther.getGoodsBarcode() != null
								&& this.getGoodsBarcode().equals(castOther.getGoodsBarcode())))
				&& ((this.getOrderNo() == castOther.getOrderNo()) || (this.getOrderNo() != null
						&& castOther.getOrderNo() != null && this.getOrderNo().equals(castOther.getOrderNo())))
				&& ((this.getSeq() == castOther.getSeq()) || (this.getSeq() != null && castOther.getSeq() != null
						&& this.getSeq().equals(castOther.getSeq())))
				&& ((this.getGoodsId() == castOther.getGoodsId()) || (this.getGoodsId() != null
						&& castOther.getGoodsId() != null && this.getGoodsId().equals(castOther.getGoodsId())))
				&& ((this.getCName() == castOther.getCName()) || (this.getCName() != null
						&& castOther.getCName() != null && this.getCName().equals(castOther.getCName())))
				&& ((this.getNetWeight() == castOther.getNetWeight()) || (this.getNetWeight() != null
						&& castOther.getNetWeight() != null && this.getNetWeight().equals(castOther.getNetWeight())))
				&& ((this.getGrossWeight() == castOther.getGrossWeight())
						|| (this.getGrossWeight() != null && castOther.getGrossWeight() != null
								&& this.getGrossWeight().equals(castOther.getGrossWeight())))
				&& ((this.getDeliverDUuid() == castOther.getDeliverDUuid())
						|| (this.getDeliverDUuid() != null && castOther.getDeliverDUuid() != null
								&& this.getDeliverDUuid().equals(castOther.getDeliverDUuid())))
				&& ((this.getPackageWeight() == castOther.getPackageWeight())
						|| (this.getPackageWeight() != null && castOther.getPackageWeight() != null
								&& this.getPackageWeight().equals(castOther.getPackageWeight())))
				&& ((this.getDeliverNo() == castOther.getDeliverNo()) || (this.getDeliverNo() != null
						&& castOther.getDeliverNo() != null && this.getDeliverNo().equals(castOther.getDeliverNo())))
				&& ((this.getUnit() == castOther.getUnit()) || (this.getUnit() != null && castOther.getUnit() != null
						&& this.getUnit().equals(castOther.getUnit())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSendUserName() == null ? 0 : this.getSendUserName().hashCode());
		result = 37 * result + (getReceiverMobile() == null ? 0 : this.getReceiverMobile().hashCode());
		result = 37 * result + (getAddrDistrict() == null ? 0 : this.getAddrDistrict().hashCode());
		result = 37 * result + (getAddrCity() == null ? 0 : this.getAddrCity().hashCode());
		result = 37 * result + (getAddrProvince() == null ? 0 : this.getAddrProvince().hashCode());
		result = 37 * result + (getCTell() == null ? 0 : this.getCTell().hashCode());
		result = 37 * result + (getTell2() == null ? 0 : this.getTell2().hashCode());
		result = 37 * result + (getCUserAddr() == null ? 0 : this.getCUserAddr().hashCode());
		result = 37 * result + (getCUserName() == null ? 0 : this.getCUserName().hashCode());
		result = 37 * result + (getOrderDat() == null ? 0 : this.getOrderDat().hashCode());
		result = 37 * result + (getCreateUserName() == null ? 0 : this.getCreateUserName().hashCode());
		result = 37 * result + (getOriginalId() == null ? 0 : this.getOriginalId().hashCode());
		result = 37 * result + (getReturned() == null ? 0 : this.getReturned().hashCode());
		result = 37 * result + (getReturnedMemo() == null ? 0 : this.getReturnedMemo().hashCode());
		result = 37 * result + (getReturnedDat() == null ? 0 : this.getReturnedDat().hashCode());
		result = 37 * result + (getReturnedUserid() == null ? 0 : this.getReturnedUserid().hashCode());
		result = 37 * result + (getEffective() == null ? 0 : this.getEffective().hashCode());
		result = 37 * result + (getSended() == null ? 0 : this.getSended().hashCode());
		result = 37 * result + (getDeliverBillStatus() == null ? 0 : this.getDeliverBillStatus().hashCode());
		result = 37 * result + (getWhName() == null ? 0 : this.getWhName().hashCode());
		result = 37 * result + (getWhId() == null ? 0 : this.getWhId().hashCode());
		result = 37 * result + (getComId() == null ? 0 : this.getComId().hashCode());
		result = 37 * result + (getDeliverExpressComName() == null ? 0 : this.getDeliverExpressComName().hashCode());
		result = 37 * result + (getDeliverExpressCom() == null ? 0 : this.getDeliverExpressCom().hashCode());
		result = 37 * result + (getDeliverExpressNo() == null ? 0 : this.getDeliverExpressNo().hashCode());
		result = 37 * result + (getDeliverExpressVehicle() == null ? 0 : this.getDeliverExpressVehicle().hashCode());
		result = 37 * result + (getGoodsBarcode() == null ? 0 : this.getGoodsBarcode().hashCode());
		result = 37 * result + (getOrderNo() == null ? 0 : this.getOrderNo().hashCode());
		result = 37 * result + (getSeq() == null ? 0 : this.getSeq().hashCode());
		result = 37 * result + (getGoodsId() == null ? 0 : this.getGoodsId().hashCode());
		result = 37 * result + (getCName() == null ? 0 : this.getCName().hashCode());
		result = 37 * result + (getNetWeight() == null ? 0 : this.getNetWeight().hashCode());
		result = 37 * result + (getGrossWeight() == null ? 0 : this.getGrossWeight().hashCode());
		result = 37 * result + (getDeliverDUuid() == null ? 0 : this.getDeliverDUuid().hashCode());
		result = 37 * result + (getPackageWeight() == null ? 0 : this.getPackageWeight().hashCode());
		result = 37 * result + (getDeliverNo() == null ? 0 : this.getDeliverNo().hashCode());
		result = 37 * result + (getUnit() == null ? 0 : this.getUnit().hashCode());
		return result;
	}

}
