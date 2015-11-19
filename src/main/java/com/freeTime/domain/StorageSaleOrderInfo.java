package com.freeTime.domain;

import java.util.Date;

public class StorageSaleOrderInfo {
	/**
	 * 配件订单创建时间
	 */
    private Date partOrderCreateTime;

    /**
	 * 配件订单编号
	 */
    private String partOrderNo;

    /**
	 * 配件编号
	 */
    private String partNo;

    /**
	 * 配件名称
	 */
    private String partName;

    /**
	 * 服务站编号
	 */
    private String serviceStationNo;

    /**
	 * 分店编号
	 */
    private String serviceStationSplitNo;

    /**
	 * 库区
	 */
    private String warehouseArea;

    /**
	 * 仓位
	 */
    private String positionItems;

    /**
	 * 供应商编号
	 */
    private String partSupplierNo;

    /**
	 * 供应商名称
	 */
    private String partSupplierName;

    /**
	 * 数量
	 */
    private Integer purchaseNum;

    /**
	 * 单价
	 */
    private Integer purchaseUnitPrice;

    /**
	 * 总价
	 */
    private Integer purchaseCountPrice;

    /**
	 * 订单状态  0挂账  1现付  2财务已结账
	 */
    private String orderStatus;

    /**
	 * 订单类型  0入库订单   1出库订单
	 */
    private String orderType;

    /**
	 * 出库时的订单号
	 */
    private String orderNum;

    /**
	 * 操作人
	 */
    private String operator;

    public Date getPartOrderCreateTime() {
        return partOrderCreateTime;
    }

    public void setPartOrderCreateTime(Date partOrderCreateTime) {
        this.partOrderCreateTime = partOrderCreateTime;
    }

    public String getPartOrderNo() {
        return partOrderNo;
    }

    public void setPartOrderNo(String partOrderNo) {
        this.partOrderNo = partOrderNo == null ? null : partOrderNo.trim();
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo == null ? null : partNo.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
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

    public String getWarehouseArea() {
        return warehouseArea;
    }

    public void setWarehouseArea(String warehouseArea) {
        this.warehouseArea = warehouseArea == null ? null : warehouseArea.trim();
    }

    public String getPositionItems() {
        return positionItems;
    }

    public void setPositionItems(String positionItems) {
        this.positionItems = positionItems == null ? null : positionItems.trim();
    }

    public String getPartSupplierNo() {
        return partSupplierNo;
    }

    public void setPartSupplierNo(String partSupplierNo) {
        this.partSupplierNo = partSupplierNo == null ? null : partSupplierNo.trim();
    }

    public String getPartSupplierName() {
        return partSupplierName;
    }

    public void setPartSupplierName(String partSupplierName) {
        this.partSupplierName = partSupplierName == null ? null : partSupplierName.trim();
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Integer getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public void setPurchaseUnitPrice(Integer purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public Integer getPurchaseCountPrice() {
        return purchaseCountPrice;
    }

    public void setPurchaseCountPrice(Integer purchaseCountPrice) {
        this.purchaseCountPrice = purchaseCountPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}