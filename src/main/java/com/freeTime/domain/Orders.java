package com.freeTime.domain;

import java.util.Date;

public class Orders {
    private String orderNum;

    private Date orderCreateTime;

    private Date orderModifyTime;

    private String automobileFrameNumber;

    private String serviceStationNo;

    private String serviceStationSplitNo;

    private Integer partConsumeCount;

    private Integer partDiscount;

    private Integer partCountDiscount;

    private Integer manHourCount;

    private Integer manHourPrice;

    private Integer manHourDiscount;

    private Integer manHourDiscountCount;

    private Integer totalPrices;

    private Integer totalDiscount;

    private String repairPersonAllow;

    private String isHimself;

    private String customerDesc;

    private String automobileDoctorDiagnosisResult;

    private String doctorAdvice;

    private String replacePart;

    private String serviceType;

    private String serviceAdviser;

    private String doctorTeamNo;

    private String repairDoctorNo;

    private String checkDoctorNo;

    private String lastCheckDoctorNo;

    private String custCallBackNum;

    private String callBackResult;

    private String custCallBackMemo;

    private String custSatisfaction;

    private String custMemo;

    private String custAssessPic;

    private String isNeedInvoice;

    private String invoiceTitle;

    private String invoiceStatus;

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