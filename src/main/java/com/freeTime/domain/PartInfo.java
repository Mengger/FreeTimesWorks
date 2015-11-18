package com.freeTime.domain;

import java.util.Date;

public class PartInfo {
    private Date partCreateTime;

    private String serviceStationNo;

    private String serviceStationSplitNo;

    private String warehouseArea;

    private String positionItems;

    private String partNo;

    private String partName;

    private Integer stockAmount;

    private Integer lastBuyPrice;

    private Integer maxBuyPrice;

    private Integer averageBuyPrice;

    private Integer nearSalePrice;

    private Integer averageSalePrice;

    private Integer topSalePrice;

    private Integer lowSalePrice;

    public Date getPartCreateTime() {
        return partCreateTime;
    }

    public void setPartCreateTime(Date partCreateTime) {
        this.partCreateTime = partCreateTime;
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

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Integer getLastBuyPrice() {
        return lastBuyPrice;
    }

    public void setLastBuyPrice(Integer lastBuyPrice) {
        this.lastBuyPrice = lastBuyPrice;
    }

    public Integer getMaxBuyPrice() {
        return maxBuyPrice;
    }

    public void setMaxBuyPrice(Integer maxBuyPrice) {
        this.maxBuyPrice = maxBuyPrice;
    }

    public Integer getAverageBuyPrice() {
        return averageBuyPrice;
    }

    public void setAverageBuyPrice(Integer averageBuyPrice) {
        this.averageBuyPrice = averageBuyPrice;
    }

    public Integer getNearSalePrice() {
        return nearSalePrice;
    }

    public void setNearSalePrice(Integer nearSalePrice) {
        this.nearSalePrice = nearSalePrice;
    }

    public Integer getAverageSalePrice() {
        return averageSalePrice;
    }

    public void setAverageSalePrice(Integer averageSalePrice) {
        this.averageSalePrice = averageSalePrice;
    }

    public Integer getTopSalePrice() {
        return topSalePrice;
    }

    public void setTopSalePrice(Integer topSalePrice) {
        this.topSalePrice = topSalePrice;
    }

    public Integer getLowSalePrice() {
        return lowSalePrice;
    }

    public void setLowSalePrice(Integer lowSalePrice) {
        this.lowSalePrice = lowSalePrice;
    }
}