package com.freeTime.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StorageSaleOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageSaleOrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPartOrderCreateTimeIsNull() {
            addCriterion("part_order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeIsNotNull() {
            addCriterion("part_order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("part_order_create_time =", value, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("part_order_create_time <>", value, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("part_order_create_time >", value, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("part_order_create_time >=", value, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("part_order_create_time <", value, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("part_order_create_time <=", value, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("part_order_create_time in", values, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("part_order_create_time not in", values, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("part_order_create_time between", value1, value2, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("part_order_create_time not between", value1, value2, "partOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoIsNull() {
            addCriterion("part_order_no is null");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoIsNotNull() {
            addCriterion("part_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoEqualTo(String value) {
            addCriterion("part_order_no =", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoNotEqualTo(String value) {
            addCriterion("part_order_no <>", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoGreaterThan(String value) {
            addCriterion("part_order_no >", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("part_order_no >=", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoLessThan(String value) {
            addCriterion("part_order_no <", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoLessThanOrEqualTo(String value) {
            addCriterion("part_order_no <=", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoLike(String value) {
            addCriterion("part_order_no like", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoNotLike(String value) {
            addCriterion("part_order_no not like", value, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoIn(List<String> values) {
            addCriterion("part_order_no in", values, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoNotIn(List<String> values) {
            addCriterion("part_order_no not in", values, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoBetween(String value1, String value2) {
            addCriterion("part_order_no between", value1, value2, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartOrderNoNotBetween(String value1, String value2) {
            addCriterion("part_order_no not between", value1, value2, "partOrderNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNull() {
            addCriterion("part_no is null");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNotNull() {
            addCriterion("part_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartNoEqualTo(String value) {
            addCriterion("part_no =", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotEqualTo(String value) {
            addCriterion("part_no <>", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThan(String value) {
            addCriterion("part_no >", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThanOrEqualTo(String value) {
            addCriterion("part_no >=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThan(String value) {
            addCriterion("part_no <", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThanOrEqualTo(String value) {
            addCriterion("part_no <=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLike(String value) {
            addCriterion("part_no like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotLike(String value) {
            addCriterion("part_no not like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIn(List<String> values) {
            addCriterion("part_no in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotIn(List<String> values) {
            addCriterion("part_no not in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoBetween(String value1, String value2) {
            addCriterion("part_no between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotBetween(String value1, String value2) {
            addCriterion("part_no not between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoIsNull() {
            addCriterion("service_station_no is null");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoIsNotNull() {
            addCriterion("service_station_no is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoEqualTo(String value) {
            addCriterion("service_station_no =", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoNotEqualTo(String value) {
            addCriterion("service_station_no <>", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoGreaterThan(String value) {
            addCriterion("service_station_no >", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("service_station_no >=", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoLessThan(String value) {
            addCriterion("service_station_no <", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoLessThanOrEqualTo(String value) {
            addCriterion("service_station_no <=", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoLike(String value) {
            addCriterion("service_station_no like", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoNotLike(String value) {
            addCriterion("service_station_no not like", value, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoIn(List<String> values) {
            addCriterion("service_station_no in", values, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoNotIn(List<String> values) {
            addCriterion("service_station_no not in", values, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoBetween(String value1, String value2) {
            addCriterion("service_station_no between", value1, value2, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationNoNotBetween(String value1, String value2) {
            addCriterion("service_station_no not between", value1, value2, "serviceStationNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoIsNull() {
            addCriterion("service_station_split_no is null");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoIsNotNull() {
            addCriterion("service_station_split_no is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoEqualTo(String value) {
            addCriterion("service_station_split_no =", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoNotEqualTo(String value) {
            addCriterion("service_station_split_no <>", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoGreaterThan(String value) {
            addCriterion("service_station_split_no >", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoGreaterThanOrEqualTo(String value) {
            addCriterion("service_station_split_no >=", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoLessThan(String value) {
            addCriterion("service_station_split_no <", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoLessThanOrEqualTo(String value) {
            addCriterion("service_station_split_no <=", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoLike(String value) {
            addCriterion("service_station_split_no like", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoNotLike(String value) {
            addCriterion("service_station_split_no not like", value, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoIn(List<String> values) {
            addCriterion("service_station_split_no in", values, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoNotIn(List<String> values) {
            addCriterion("service_station_split_no not in", values, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoBetween(String value1, String value2) {
            addCriterion("service_station_split_no between", value1, value2, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andServiceStationSplitNoNotBetween(String value1, String value2) {
            addCriterion("service_station_split_no not between", value1, value2, "serviceStationSplitNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIsNull() {
            addCriterion("warehouse_area is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIsNotNull() {
            addCriterion("warehouse_area is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaEqualTo(String value) {
            addCriterion("warehouse_area =", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotEqualTo(String value) {
            addCriterion("warehouse_area <>", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaGreaterThan(String value) {
            addCriterion("warehouse_area >", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_area >=", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLessThan(String value) {
            addCriterion("warehouse_area <", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLessThanOrEqualTo(String value) {
            addCriterion("warehouse_area <=", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaLike(String value) {
            addCriterion("warehouse_area like", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotLike(String value) {
            addCriterion("warehouse_area not like", value, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaIn(List<String> values) {
            addCriterion("warehouse_area in", values, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotIn(List<String> values) {
            addCriterion("warehouse_area not in", values, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaBetween(String value1, String value2) {
            addCriterion("warehouse_area between", value1, value2, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andWarehouseAreaNotBetween(String value1, String value2) {
            addCriterion("warehouse_area not between", value1, value2, "warehouseArea");
            return (Criteria) this;
        }

        public Criteria andPositionItemsIsNull() {
            addCriterion("position_items is null");
            return (Criteria) this;
        }

        public Criteria andPositionItemsIsNotNull() {
            addCriterion("position_items is not null");
            return (Criteria) this;
        }

        public Criteria andPositionItemsEqualTo(String value) {
            addCriterion("position_items =", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsNotEqualTo(String value) {
            addCriterion("position_items <>", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsGreaterThan(String value) {
            addCriterion("position_items >", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsGreaterThanOrEqualTo(String value) {
            addCriterion("position_items >=", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsLessThan(String value) {
            addCriterion("position_items <", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsLessThanOrEqualTo(String value) {
            addCriterion("position_items <=", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsLike(String value) {
            addCriterion("position_items like", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsNotLike(String value) {
            addCriterion("position_items not like", value, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsIn(List<String> values) {
            addCriterion("position_items in", values, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsNotIn(List<String> values) {
            addCriterion("position_items not in", values, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsBetween(String value1, String value2) {
            addCriterion("position_items between", value1, value2, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPositionItemsNotBetween(String value1, String value2) {
            addCriterion("position_items not between", value1, value2, "positionItems");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoIsNull() {
            addCriterion("part_supplier_no is null");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoIsNotNull() {
            addCriterion("part_supplier_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoEqualTo(String value) {
            addCriterion("part_supplier_no =", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoNotEqualTo(String value) {
            addCriterion("part_supplier_no <>", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoGreaterThan(String value) {
            addCriterion("part_supplier_no >", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoGreaterThanOrEqualTo(String value) {
            addCriterion("part_supplier_no >=", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoLessThan(String value) {
            addCriterion("part_supplier_no <", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoLessThanOrEqualTo(String value) {
            addCriterion("part_supplier_no <=", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoLike(String value) {
            addCriterion("part_supplier_no like", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoNotLike(String value) {
            addCriterion("part_supplier_no not like", value, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoIn(List<String> values) {
            addCriterion("part_supplier_no in", values, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoNotIn(List<String> values) {
            addCriterion("part_supplier_no not in", values, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoBetween(String value1, String value2) {
            addCriterion("part_supplier_no between", value1, value2, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNoNotBetween(String value1, String value2) {
            addCriterion("part_supplier_no not between", value1, value2, "partSupplierNo");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameIsNull() {
            addCriterion("part_supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameIsNotNull() {
            addCriterion("part_supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameEqualTo(String value) {
            addCriterion("part_supplier_name =", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameNotEqualTo(String value) {
            addCriterion("part_supplier_name <>", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameGreaterThan(String value) {
            addCriterion("part_supplier_name >", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_supplier_name >=", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameLessThan(String value) {
            addCriterion("part_supplier_name <", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("part_supplier_name <=", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameLike(String value) {
            addCriterion("part_supplier_name like", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameNotLike(String value) {
            addCriterion("part_supplier_name not like", value, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameIn(List<String> values) {
            addCriterion("part_supplier_name in", values, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameNotIn(List<String> values) {
            addCriterion("part_supplier_name not in", values, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameBetween(String value1, String value2) {
            addCriterion("part_supplier_name between", value1, value2, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPartSupplierNameNotBetween(String value1, String value2) {
            addCriterion("part_supplier_name not between", value1, value2, "partSupplierName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNull() {
            addCriterion("purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNotNull() {
            addCriterion("purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumEqualTo(Integer value) {
            addCriterion("purchase_num =", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotEqualTo(Integer value) {
            addCriterion("purchase_num <>", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThan(Integer value) {
            addCriterion("purchase_num >", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_num >=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThan(Integer value) {
            addCriterion("purchase_num <", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_num <=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIn(List<Integer> values) {
            addCriterion("purchase_num in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotIn(List<Integer> values) {
            addCriterion("purchase_num not in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumBetween(Integer value1, Integer value2) {
            addCriterion("purchase_num between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_num not between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceIsNull() {
            addCriterion("purchase_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceIsNotNull() {
            addCriterion("purchase_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceEqualTo(Integer value) {
            addCriterion("purchase_unit_price =", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceNotEqualTo(Integer value) {
            addCriterion("purchase_unit_price <>", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceGreaterThan(Integer value) {
            addCriterion("purchase_unit_price >", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_unit_price >=", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceLessThan(Integer value) {
            addCriterion("purchase_unit_price <", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_unit_price <=", value, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceIn(List<Integer> values) {
            addCriterion("purchase_unit_price in", values, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceNotIn(List<Integer> values) {
            addCriterion("purchase_unit_price not in", values, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceBetween(Integer value1, Integer value2) {
            addCriterion("purchase_unit_price between", value1, value2, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_unit_price not between", value1, value2, "purchaseUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceIsNull() {
            addCriterion("purchase_count_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceIsNotNull() {
            addCriterion("purchase_count_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceEqualTo(Integer value) {
            addCriterion("purchase_count_price =", value, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceNotEqualTo(Integer value) {
            addCriterion("purchase_count_price <>", value, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceGreaterThan(Integer value) {
            addCriterion("purchase_count_price >", value, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_count_price >=", value, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceLessThan(Integer value) {
            addCriterion("purchase_count_price <", value, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_count_price <=", value, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceIn(List<Integer> values) {
            addCriterion("purchase_count_price in", values, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceNotIn(List<Integer> values) {
            addCriterion("purchase_count_price not in", values, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceBetween(Integer value1, Integer value2) {
            addCriterion("purchase_count_price between", value1, value2, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_count_price not between", value1, value2, "purchaseCountPrice");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}