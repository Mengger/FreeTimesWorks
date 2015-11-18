package com.freeTime.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PartInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartInfoExample() {
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

        public Criteria andPartCreateTimeIsNull() {
            addCriterion("part_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeIsNotNull() {
            addCriterion("part_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("part_create_time =", value, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("part_create_time <>", value, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("part_create_time >", value, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("part_create_time >=", value, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("part_create_time <", value, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("part_create_time <=", value, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("part_create_time in", values, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("part_create_time not in", values, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("part_create_time between", value1, value2, "partCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("part_create_time not between", value1, value2, "partCreateTime");
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

        public Criteria andStockAmountIsNull() {
            addCriterion("stock_amount is null");
            return (Criteria) this;
        }

        public Criteria andStockAmountIsNotNull() {
            addCriterion("stock_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStockAmountEqualTo(Integer value) {
            addCriterion("stock_amount =", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotEqualTo(Integer value) {
            addCriterion("stock_amount <>", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThan(Integer value) {
            addCriterion("stock_amount >", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_amount >=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThan(Integer value) {
            addCriterion("stock_amount <", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThanOrEqualTo(Integer value) {
            addCriterion("stock_amount <=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountIn(List<Integer> values) {
            addCriterion("stock_amount in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotIn(List<Integer> values) {
            addCriterion("stock_amount not in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountBetween(Integer value1, Integer value2) {
            addCriterion("stock_amount between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_amount not between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceIsNull() {
            addCriterion("last_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceIsNotNull() {
            addCriterion("last_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceEqualTo(Integer value) {
            addCriterion("last_buy_price =", value, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceNotEqualTo(Integer value) {
            addCriterion("last_buy_price <>", value, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceGreaterThan(Integer value) {
            addCriterion("last_buy_price >", value, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_buy_price >=", value, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceLessThan(Integer value) {
            addCriterion("last_buy_price <", value, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("last_buy_price <=", value, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceIn(List<Integer> values) {
            addCriterion("last_buy_price in", values, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceNotIn(List<Integer> values) {
            addCriterion("last_buy_price not in", values, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceBetween(Integer value1, Integer value2) {
            addCriterion("last_buy_price between", value1, value2, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andLastBuyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("last_buy_price not between", value1, value2, "lastBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceIsNull() {
            addCriterion("max_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceIsNotNull() {
            addCriterion("max_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceEqualTo(Integer value) {
            addCriterion("max_buy_price =", value, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceNotEqualTo(Integer value) {
            addCriterion("max_buy_price <>", value, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceGreaterThan(Integer value) {
            addCriterion("max_buy_price >", value, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_buy_price >=", value, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceLessThan(Integer value) {
            addCriterion("max_buy_price <", value, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("max_buy_price <=", value, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceIn(List<Integer> values) {
            addCriterion("max_buy_price in", values, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceNotIn(List<Integer> values) {
            addCriterion("max_buy_price not in", values, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceBetween(Integer value1, Integer value2) {
            addCriterion("max_buy_price between", value1, value2, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andMaxBuyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("max_buy_price not between", value1, value2, "maxBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceIsNull() {
            addCriterion("average_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceIsNotNull() {
            addCriterion("average_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceEqualTo(Integer value) {
            addCriterion("average_buy_price =", value, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceNotEqualTo(Integer value) {
            addCriterion("average_buy_price <>", value, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceGreaterThan(Integer value) {
            addCriterion("average_buy_price >", value, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("average_buy_price >=", value, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceLessThan(Integer value) {
            addCriterion("average_buy_price <", value, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("average_buy_price <=", value, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceIn(List<Integer> values) {
            addCriterion("average_buy_price in", values, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceNotIn(List<Integer> values) {
            addCriterion("average_buy_price not in", values, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceBetween(Integer value1, Integer value2) {
            addCriterion("average_buy_price between", value1, value2, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andAverageBuyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("average_buy_price not between", value1, value2, "averageBuyPrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceIsNull() {
            addCriterion("near_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceIsNotNull() {
            addCriterion("near_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceEqualTo(Integer value) {
            addCriterion("near_sale_price =", value, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceNotEqualTo(Integer value) {
            addCriterion("near_sale_price <>", value, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceGreaterThan(Integer value) {
            addCriterion("near_sale_price >", value, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("near_sale_price >=", value, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceLessThan(Integer value) {
            addCriterion("near_sale_price <", value, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceLessThanOrEqualTo(Integer value) {
            addCriterion("near_sale_price <=", value, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceIn(List<Integer> values) {
            addCriterion("near_sale_price in", values, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceNotIn(List<Integer> values) {
            addCriterion("near_sale_price not in", values, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceBetween(Integer value1, Integer value2) {
            addCriterion("near_sale_price between", value1, value2, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andNearSalePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("near_sale_price not between", value1, value2, "nearSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceIsNull() {
            addCriterion("average_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceIsNotNull() {
            addCriterion("average_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceEqualTo(Integer value) {
            addCriterion("average_sale_price =", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceNotEqualTo(Integer value) {
            addCriterion("average_sale_price <>", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceGreaterThan(Integer value) {
            addCriterion("average_sale_price >", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("average_sale_price >=", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceLessThan(Integer value) {
            addCriterion("average_sale_price <", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceLessThanOrEqualTo(Integer value) {
            addCriterion("average_sale_price <=", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceIn(List<Integer> values) {
            addCriterion("average_sale_price in", values, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceNotIn(List<Integer> values) {
            addCriterion("average_sale_price not in", values, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceBetween(Integer value1, Integer value2) {
            addCriterion("average_sale_price between", value1, value2, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("average_sale_price not between", value1, value2, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceIsNull() {
            addCriterion("top_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceIsNotNull() {
            addCriterion("top_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceEqualTo(Integer value) {
            addCriterion("top_sale_price =", value, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceNotEqualTo(Integer value) {
            addCriterion("top_sale_price <>", value, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceGreaterThan(Integer value) {
            addCriterion("top_sale_price >", value, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_sale_price >=", value, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceLessThan(Integer value) {
            addCriterion("top_sale_price <", value, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceLessThanOrEqualTo(Integer value) {
            addCriterion("top_sale_price <=", value, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceIn(List<Integer> values) {
            addCriterion("top_sale_price in", values, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceNotIn(List<Integer> values) {
            addCriterion("top_sale_price not in", values, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceBetween(Integer value1, Integer value2) {
            addCriterion("top_sale_price between", value1, value2, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andTopSalePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("top_sale_price not between", value1, value2, "topSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceIsNull() {
            addCriterion("low_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceIsNotNull() {
            addCriterion("low_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceEqualTo(Integer value) {
            addCriterion("low_sale_price =", value, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceNotEqualTo(Integer value) {
            addCriterion("low_sale_price <>", value, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceGreaterThan(Integer value) {
            addCriterion("low_sale_price >", value, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("low_sale_price >=", value, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceLessThan(Integer value) {
            addCriterion("low_sale_price <", value, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceLessThanOrEqualTo(Integer value) {
            addCriterion("low_sale_price <=", value, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceIn(List<Integer> values) {
            addCriterion("low_sale_price in", values, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceNotIn(List<Integer> values) {
            addCriterion("low_sale_price not in", values, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceBetween(Integer value1, Integer value2) {
            addCriterion("low_sale_price between", value1, value2, "lowSalePrice");
            return (Criteria) this;
        }

        public Criteria andLowSalePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("low_sale_price not between", value1, value2, "lowSalePrice");
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