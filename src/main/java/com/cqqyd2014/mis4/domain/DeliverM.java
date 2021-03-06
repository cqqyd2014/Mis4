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
 * DeliverM generated by hbm2java
 */
@Entity
@Table(name = "deliver_m", schema = "public")
public class DeliverM implements java.io.Serializable {

	private DeliverMId id;
	private Date DDat;
	private String expressCom;
	private String expressNo;
	private BigDecimal actualWeight;
	private String deliverNo;
	private String prePackageBarcode;
	private Boolean effective;
	private Boolean sended;
	private String packageUserid;
	private Date sendDat;
	private BigDecimal packageWeight;
	private String sendUserid;
	private String deliverBillStatus;
	private String whId;
	private String cancelRequestMemo;
	private Date cancelRequestDat;
	private Date cancelConfirmDat;
	private String cancelConfirmMemo;
	private String expressCurrentRouteFlag;
	private String expressCurrentRouteDetail;
	private String logisticsFbMemo;
	private Date logisticsFbDat;
	private Date sendUserAssignTime;
	private String logisticsVehicle;
	private String cancelStatus;
	private String cancelRequestUserid;
	private String cancelConfirmUserid;
	private String logisticsFbStatus;
	private String logisticsFbCode;
	private String cartonType;
	private BigDecimal cartonWeight;
	private BigDecimal num;
	private String memoBarcodes;
	private String memoNames;

	public DeliverM() {
	}

	public DeliverM(DeliverMId id) {
		this.id = id;
	}

	public DeliverM(DeliverMId id, Date DDat, String expressCom, String expressNo, BigDecimal actualWeight,
			String deliverNo, String prePackageBarcode, Boolean effective, Boolean sended, String packageUserid,
			Date sendDat, BigDecimal packageWeight, String sendUserid, String deliverBillStatus, String whId,
			String cancelRequestMemo, Date cancelRequestDat, Date cancelConfirmDat, String cancelConfirmMemo,
			String expressCurrentRouteFlag, String expressCurrentRouteDetail, String logisticsFbMemo,
			Date logisticsFbDat, Date sendUserAssignTime, String logisticsVehicle, String cancelStatus,
			String cancelRequestUserid, String cancelConfirmUserid, String logisticsFbStatus, String logisticsFbCode,
			String cartonType, BigDecimal cartonWeight, BigDecimal num, String memoBarcodes, String memoNames) {
		this.id = id;
		this.DDat = DDat;
		this.expressCom = expressCom;
		this.expressNo = expressNo;
		this.actualWeight = actualWeight;
		this.deliverNo = deliverNo;
		this.prePackageBarcode = prePackageBarcode;
		this.effective = effective;
		this.sended = sended;
		this.packageUserid = packageUserid;
		this.sendDat = sendDat;
		this.packageWeight = packageWeight;
		this.sendUserid = sendUserid;
		this.deliverBillStatus = deliverBillStatus;
		this.whId = whId;
		this.cancelRequestMemo = cancelRequestMemo;
		this.cancelRequestDat = cancelRequestDat;
		this.cancelConfirmDat = cancelConfirmDat;
		this.cancelConfirmMemo = cancelConfirmMemo;
		this.expressCurrentRouteFlag = expressCurrentRouteFlag;
		this.expressCurrentRouteDetail = expressCurrentRouteDetail;
		this.logisticsFbMemo = logisticsFbMemo;
		this.logisticsFbDat = logisticsFbDat;
		this.sendUserAssignTime = sendUserAssignTime;
		this.logisticsVehicle = logisticsVehicle;
		this.cancelStatus = cancelStatus;
		this.cancelRequestUserid = cancelRequestUserid;
		this.cancelConfirmUserid = cancelConfirmUserid;
		this.logisticsFbStatus = logisticsFbStatus;
		this.logisticsFbCode = logisticsFbCode;
		this.cartonType = cartonType;
		this.cartonWeight = cartonWeight;
		this.num = num;
		this.memoBarcodes = memoBarcodes;
		this.memoNames = memoNames;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "comId", column = @Column(name = "com_id", nullable = false, length = 4)),
			@AttributeOverride(name = "orderNo", column = @Column(name = "order_no", nullable = false, length = 20)),
			@AttributeOverride(name = "seq", column = @Column(name = "seq", nullable = false, length = 4)) })
	public DeliverMId getId() {
		return this.id;
	}

	public void setId(DeliverMId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "d_dat", length = 35)
	public Date getDDat() {
		return this.DDat;
	}

	public void setDDat(Date DDat) {
		this.DDat = DDat;
	}

	@Column(name = "express_com", length = 45)
	public String getExpressCom() {
		return this.expressCom;
	}

	public void setExpressCom(String expressCom) {
		this.expressCom = expressCom;
	}

	@Column(name = "express_no", length = 45)
	public String getExpressNo() {
		return this.expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	@Column(name = "actual_weight", precision = 131089, scale = 0)
	public BigDecimal getActualWeight() {
		return this.actualWeight;
	}

	public void setActualWeight(BigDecimal actualWeight) {
		this.actualWeight = actualWeight;
	}

	@Column(name = "deliver_no", length = 45)
	public String getDeliverNo() {
		return this.deliverNo;
	}

	public void setDeliverNo(String deliverNo) {
		this.deliverNo = deliverNo;
	}

	@Column(name = "pre_package_barcode", length = 18)
	public String getPrePackageBarcode() {
		return this.prePackageBarcode;
	}

	public void setPrePackageBarcode(String prePackageBarcode) {
		this.prePackageBarcode = prePackageBarcode;
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

	@Column(name = "package_userid", length = 36)
	public String getPackageUserid() {
		return this.packageUserid;
	}

	public void setPackageUserid(String packageUserid) {
		this.packageUserid = packageUserid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "send_dat", length = 35)
	public Date getSendDat() {
		return this.sendDat;
	}

	public void setSendDat(Date sendDat) {
		this.sendDat = sendDat;
	}

	@Column(name = "package_weight", precision = 131089, scale = 0)
	public BigDecimal getPackageWeight() {
		return this.packageWeight;
	}

	public void setPackageWeight(BigDecimal packageWeight) {
		this.packageWeight = packageWeight;
	}

	@Column(name = "send_userid", length = 36)
	public String getSendUserid() {
		return this.sendUserid;
	}

	public void setSendUserid(String sendUserid) {
		this.sendUserid = sendUserid;
	}

	@Column(name = "deliver_bill_status", length = 4)
	public String getDeliverBillStatus() {
		return this.deliverBillStatus;
	}

	public void setDeliverBillStatus(String deliverBillStatus) {
		this.deliverBillStatus = deliverBillStatus;
	}

	@Column(name = "wh_id", length = 6)
	public String getWhId() {
		return this.whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	@Column(name = "cancel_request_memo", length = 500)
	public String getCancelRequestMemo() {
		return this.cancelRequestMemo;
	}

	public void setCancelRequestMemo(String cancelRequestMemo) {
		this.cancelRequestMemo = cancelRequestMemo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cancel_request_dat", length = 35)
	public Date getCancelRequestDat() {
		return this.cancelRequestDat;
	}

	public void setCancelRequestDat(Date cancelRequestDat) {
		this.cancelRequestDat = cancelRequestDat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cancel_confirm_dat", length = 35)
	public Date getCancelConfirmDat() {
		return this.cancelConfirmDat;
	}

	public void setCancelConfirmDat(Date cancelConfirmDat) {
		this.cancelConfirmDat = cancelConfirmDat;
	}

	@Column(name = "cancel_confirm_memo", length = 500)
	public String getCancelConfirmMemo() {
		return this.cancelConfirmMemo;
	}

	public void setCancelConfirmMemo(String cancelConfirmMemo) {
		this.cancelConfirmMemo = cancelConfirmMemo;
	}

	@Column(name = "express_current_route_flag", length = 128)
	public String getExpressCurrentRouteFlag() {
		return this.expressCurrentRouteFlag;
	}

	public void setExpressCurrentRouteFlag(String expressCurrentRouteFlag) {
		this.expressCurrentRouteFlag = expressCurrentRouteFlag;
	}

	@Column(name = "express_current_route_detail", length = 512)
	public String getExpressCurrentRouteDetail() {
		return this.expressCurrentRouteDetail;
	}

	public void setExpressCurrentRouteDetail(String expressCurrentRouteDetail) {
		this.expressCurrentRouteDetail = expressCurrentRouteDetail;
	}

	@Column(name = "logistics_fb_memo", length = 1024)
	public String getLogisticsFbMemo() {
		return this.logisticsFbMemo;
	}

	public void setLogisticsFbMemo(String logisticsFbMemo) {
		this.logisticsFbMemo = logisticsFbMemo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "logistics_fb_dat", length = 35)
	public Date getLogisticsFbDat() {
		return this.logisticsFbDat;
	}

	public void setLogisticsFbDat(Date logisticsFbDat) {
		this.logisticsFbDat = logisticsFbDat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "send_user_assign_time", length = 35)
	public Date getSendUserAssignTime() {
		return this.sendUserAssignTime;
	}

	public void setSendUserAssignTime(Date sendUserAssignTime) {
		this.sendUserAssignTime = sendUserAssignTime;
	}

	@Column(name = "logistics_vehicle", length = 4)
	public String getLogisticsVehicle() {
		return this.logisticsVehicle;
	}

	public void setLogisticsVehicle(String logisticsVehicle) {
		this.logisticsVehicle = logisticsVehicle;
	}

	@Column(name = "cancel_status", length = 4)
	public String getCancelStatus() {
		return this.cancelStatus;
	}

	public void setCancelStatus(String cancelStatus) {
		this.cancelStatus = cancelStatus;
	}

	@Column(name = "cancel_request_userid", length = 36)
	public String getCancelRequestUserid() {
		return this.cancelRequestUserid;
	}

	public void setCancelRequestUserid(String cancelRequestUserid) {
		this.cancelRequestUserid = cancelRequestUserid;
	}

	@Column(name = "cancel_confirm_userid", length = 36)
	public String getCancelConfirmUserid() {
		return this.cancelConfirmUserid;
	}

	public void setCancelConfirmUserid(String cancelConfirmUserid) {
		this.cancelConfirmUserid = cancelConfirmUserid;
	}

	@Column(name = "logistics_fb_status", length = 4)
	public String getLogisticsFbStatus() {
		return this.logisticsFbStatus;
	}

	public void setLogisticsFbStatus(String logisticsFbStatus) {
		this.logisticsFbStatus = logisticsFbStatus;
	}

	@Column(name = "logistics_fb_code", length = 512)
	public String getLogisticsFbCode() {
		return this.logisticsFbCode;
	}

	public void setLogisticsFbCode(String logisticsFbCode) {
		this.logisticsFbCode = logisticsFbCode;
	}

	@Column(name = "carton_type", length = 4)
	public String getCartonType() {
		return this.cartonType;
	}

	public void setCartonType(String cartonType) {
		this.cartonType = cartonType;
	}

	@Column(name = "carton_weight", precision = 131089, scale = 0)
	public BigDecimal getCartonWeight() {
		return this.cartonWeight;
	}

	public void setCartonWeight(BigDecimal cartonWeight) {
		this.cartonWeight = cartonWeight;
	}

	@Column(name = "num", precision = 131089, scale = 0)
	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	@Column(name = "memo_barcodes", length = 8000)
	public String getMemoBarcodes() {
		return this.memoBarcodes;
	}

	public void setMemoBarcodes(String memoBarcodes) {
		this.memoBarcodes = memoBarcodes;
	}

	@Column(name = "memo_names", length = 8000)
	public String getMemoNames() {
		return this.memoNames;
	}

	public void setMemoNames(String memoNames) {
		this.memoNames = memoNames;
	}

}
