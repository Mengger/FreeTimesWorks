package com.freeTime.domain;

import java.util.Date;

public class Orders {
	/**
	 * 订单号
	 */
    private String orderNum;

    /**
	 * 订单创建时间
	 */
    private Date orderCreateTime;

    /**
	 * 订单修改时间
	 */
    private Date orderModifyTime;

    /**
	 * 车架号
	 */
    private String automobileFrameNumber;

    /**
	 * 服务站编号
	 */
    private String serviceStationNo;

    /**
	 * 分店编号
	 */
    private String serviceStationSplitNo;

    /**
	 * 配件总价格
	 */
    private Integer partConsumeCount;

    /**
	 * 配件折扣,打几折
	 */
    private Integer partDiscount;

    /**
	 * 配件折扣价格
	 */
    private Integer partCountDiscount;

    /**
	 * 工时数
	 */
    private Integer manHourCount;

    /**
	 * 工时单价
	 */
    private Integer manHourPrice;

    /**
	 * 工时折扣,打几折
	 */
    private Integer manHourDiscount;

    /**
	 * 工时折扣价格
	 */
    private Integer manHourDiscountCount;

    /**
	 * 总消费
	 */
    private Integer totalPrices;

    /**
	 * 总折扣
	 */
    private Integer totalDiscount;

    /**
	 * 送修人
	 */
    private String repairPersonAllow;

    /**
	 * 送修人是否为车主  0不是    1车主
	 */
    private String isHimself;

    /**
	 * 客户描述症状
	 */
    private String customerDesc;

    /**
	 * 维修技师诊断结果
	 */
    private String automobileDoctorDiagnosisResult;

    /**
	 * 维修技师建议
	 */
    private String doctorAdvice;

    /**
	 * 替换配件
	 */
    private String replacePart;

    /**
	 * 服务类型  0检测  1保养 2维修 3美容  4事故  1-2保养加维修
	 */
    private String serviceType;

    /**
	 * 服务顾问
	 */
    private String serviceAdviser;

    /**
	 * 维修团队
	 */
    private String doctorTeamNo;

    /**
	 * 主维修技师no
	 */
    private String repairDoctorNo;

    /**
	 * 复查技师no
	 */
    private String checkDoctorNo;

    /**
	 * 最终质检技师
	 */
    private String lastCheckDoctorNo;

    /**
	 * 客户回访电话
	 */
    private String custCallBackNum;

    /**
	 * 回访结果  客户打分分数
	 */
    private String callBackResult;

    /**
	 * 客户回访的应答
	 */
    private String custCallBackMemo;

    /**
	 * 客户满意度  客户自己评价
	 */
    private String custSatisfaction;

    /**
	 * 客户自己评价内容
	 */
    private String custMemo;

    /**
	 * 客户上传照片路径
	 */
    private String custAssessPic;

    /**
	 * 是否需要发票   0不需要   1需要
	 */
    private String isNeedInvoice;

    /**
	 * 发票抬头
	 */
    private String invoiceTitle;

    /**
	 * 发票状态  0未打印   1已打印
	 */
    private String invoiceStatus;

    /**
	 * 订单状态   1待接车  2待派单  3待检查  4待维修  5待完成   6待结账  7工单信息待完善  8待回访  9完成
	 */
    private String orderStatus;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderModifyTime() {
        return orderModifyTime;
    }

    public void setOrderModifyTime(Date orderModifyTime) {
        this.orderModifyTime = orderModifyTime;
    }

    public String getAutomobileFrameNumber() {
        return automobileFrameNumber;
    }

    public void setAutomobileFrameNumber(String automobileFrameNumber) {
        this.automobileFrameNumber = automobileFrameNumber == null ? null : automobileFrameNumber.trim();
    }

    public String getServiceStationNo() {
        return serviceStationNo;
    }

    public void setServiceStationNo(String serviceStationNo) {
        this.serviceStationNo = serviceStationNo == null ? null : serviceStationNo.trim();
    }

    public String getServiceStationSplitNo() {
        return serviceStationSplitNo;
    }

    public void setServiceStationSplitNo(String serviceStationSplitNo) {
        this.serviceStationSplitNo = serviceStationSplitNo == null ? null : serviceStationSplitNo.trim();
    }

    public Integer getPartConsumeCount() {
        return partConsumeCount;
    }

    public void setPartConsumeCount(Integer partConsumeCount) {
        this.partConsumeCount = partConsumeCount;
    }

    public Integer getPartDiscount() {
        return partDiscount;
    }

    public void setPartDiscount(Integer partDiscount) {
        this.partDiscount = partDiscount;
    }

    public Integer getPartCountDiscount() {
        return partCountDiscount;
    }

    public void setPartCountDiscount(Integer partCountDiscount) {
        this.partCountDiscount = partCountDiscount;
    }

    public Integer getManHourCount() {
        return manHourCount;
    }

    public void setManHourCount(Integer manHourCount) {
        this.manHourCount = manHourCount;
    }

    public Integer getManHourPrice() {
        return manHourPrice;
    }

    public void setManHourPrice(Integer manHourPrice) {
        this.manHourPrice = manHourPrice;
    }

    public Integer getManHourDiscount() {
        return manHourDiscount;
    }

    public void setManHourDiscount(Integer manHourDiscount) {
        this.manHourDiscount = manHourDiscount;
    }

    public Integer getManHourDiscountCount() {
        return manHourDiscountCount;
    }

    public void setManHourDiscountCount(Integer manHourDiscountCount) {
        this.manHourDiscountCount = manHourDiscountCount;
    }

    public Integer getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(Integer totalPrices) {
        this.totalPrices = totalPrices;
    }

    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getRepairPersonAllow() {
        return repairPersonAllow;
    }

    public void setRepairPersonAllow(String repairPersonAllow) {
        this.repairPersonAllow = repairPersonAllow == null ? null : repairPersonAllow.trim();
    }

    public String getIsHimself() {
        return isHimself;
    }

    public void setIsHimself(String isHimself) {
        this.isHimself = isHimself == null ? null : isHimself.trim();
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc == null ? null : customerDesc.trim();
    }

    public String getAutomobileDoctorDiagnosisResult() {
        return automobileDoctorDiagnosisResult;
    }

    public void setAutomobileDoctorDiagnosisResult(String automobileDoctorDiagnosisResult) {
        this.automobileDoctorDiagnosisResult = automobileDoctorDiagnosisResult == null ? null : automobileDoctorDiagnosisResult.trim();
    }

    public String getDoctorAdvice() {
        return doctorAdvice;
    }

    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice == null ? null : doctorAdvice.trim();
    }

    public String getReplacePart() {
        return replacePart;
    }

    public void setReplacePart(String replacePart) {
        this.replacePart = replacePart == null ? null : replacePart.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServiceAdviser() {
        return serviceAdviser;
    }

    public void setServiceAdviser(String serviceAdviser) {
        this.serviceAdviser = serviceAdviser == null ? null : serviceAdviser.trim();
    }

    public String getDoctorTeamNo() {
        return doctorTeamNo;
    }

    public void setDoctorTeamNo(String doctorTeamNo) {
        this.doctorTeamNo = doctorTeamNo == null ? null : doctorTeamNo.trim();
    }

    public String getRepairDoctorNo() {
        return repairDoctorNo;
    }

    public void setRepairDoctorNo(String repairDoctorNo) {
        this.repairDoctorNo = repairDoctorNo == null ? null : repairDoctorNo.trim();
    }

    public String getCheckDoctorNo() {
        return checkDoctorNo;
    }

    public void setCheckDoctorNo(String checkDoctorNo) {
        this.checkDoctorNo = checkDoctorNo == null ? null : checkDoctorNo.trim();
    }

    public String getLastCheckDoctorNo() {
        return lastCheckDoctorNo;
    }

    public void setLastCheckDoctorNo(String lastCheckDoctorNo) {
        this.lastCheckDoctorNo = lastCheckDoctorNo == null ? null : lastCheckDoctorNo.trim();
    }

    public String getCustCallBackNum() {
        return custCallBackNum;
    }

    public void setCustCallBackNum(String custCallBackNum) {
        this.custCallBackNum = custCallBackNum == null ? null : custCallBackNum.trim();
    }

    public String getCallBackResult() {
        return callBackResult;
    }

    public void setCallBackResult(String callBackResult) {
        this.callBackResult = callBackResult == null ? null : callBackResult.trim();
    }

    public String getCustCallBackMemo() {
        return custCallBackMemo;
    }

    public void setCustCallBackMemo(String custCallBackMemo) {
        this.custCallBackMemo = custCallBackMemo == null ? null : custCallBackMemo.trim();
    }

    public String getCustSatisfaction() {
        return custSatisfaction;
    }

    public void setCustSatisfaction(String custSatisfaction) {
        this.custSatisfaction = custSatisfaction == null ? null : custSatisfaction.trim();
    }

    public String getCustMemo() {
        return custMemo;
    }

    public void setCustMemo(String custMemo) {
        this.custMemo = custMemo == null ? null : custMemo.trim();
    }

    public String getCustAssessPic() {
        return custAssessPic;
    }

    public void setCustAssessPic(String custAssessPic) {
        this.custAssessPic = custAssessPic == null ? null : custAssessPic.trim();
    }

    public String getIsNeedInvoice() {
        return isNeedInvoice;
    }

    public void setIsNeedInvoice(String isNeedInvoice) {
        this.isNeedInvoice = isNeedInvoice == null ? null : isNeedInvoice.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus == null ? null : invoiceStatus.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }
}