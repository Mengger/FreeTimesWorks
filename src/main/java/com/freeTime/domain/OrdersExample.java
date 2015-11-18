package com.freeTime.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeIsNull() {
            addCriterion("order_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeIsNotNull() {
            addCriterion("order_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("order_modify_time =", value, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_modify_time <>", value, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("order_modify_time >", value, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_modify_time >=", value, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("order_modify_time <", value, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_modify_time <=", value, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("order_modify_time in", values, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_modify_time not in", values, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_modify_time between", value1, value2, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andOrderModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_modify_time not between", value1, value2, "orderModifyTime");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberIsNull() {
            addCriterion("automobile_frame_number is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberIsNotNull() {
            addCriterion("automobile_frame_number is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberEqualTo(String value) {
            addCriterion("automobile_frame_number =", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberNotEqualTo(String value) {
            addCriterion("automobile_frame_number <>", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberGreaterThan(String value) {
            addCriterion("automobile_frame_number >", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_frame_number >=", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberLessThan(String value) {
            addCriterion("automobile_frame_number <", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberLessThanOrEqualTo(String value) {
            addCriterion("automobile_frame_number <=", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberLike(String value) {
            addCriterion("automobile_frame_number like", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberNotLike(String value) {
            addCriterion("automobile_frame_number not like", value, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberIn(List<String> values) {
            addCriterion("automobile_frame_number in", values, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberNotIn(List<String> values) {
            addCriterion("automobile_frame_number not in", values, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberBetween(String value1, String value2) {
            addCriterion("automobile_frame_number between", value1, value2, "automobileFrameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileFrameNumberNotBetween(String value1, String value2) {
            addCriterion("automobile_frame_number not between", value1, value2, "automobileFrameNumber");
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

        public Criteria andPartConsumeCountIsNull() {
            addCriterion("part_consume_count is null");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountIsNotNull() {
            addCriterion("part_consume_count is not null");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountEqualTo(Integer value) {
            addCriterion("part_consume_count =", value, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountNotEqualTo(Integer value) {
            addCriterion("part_consume_count <>", value, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountGreaterThan(Integer value) {
            addCriterion("part_consume_count >", value, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_consume_count >=", value, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountLessThan(Integer value) {
            addCriterion("part_consume_count <", value, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountLessThanOrEqualTo(Integer value) {
            addCriterion("part_consume_count <=", value, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountIn(List<Integer> values) {
            addCriterion("part_consume_count in", values, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountNotIn(List<Integer> values) {
            addCriterion("part_consume_count not in", values, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountBetween(Integer value1, Integer value2) {
            addCriterion("part_consume_count between", value1, value2, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartConsumeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("part_consume_count not between", value1, value2, "partConsumeCount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountIsNull() {
            addCriterion("part_discount is null");
            return (Criteria) this;
        }

        public Criteria andPartDiscountIsNotNull() {
            addCriterion("part_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPartDiscountEqualTo(Integer value) {
            addCriterion("part_discount =", value, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountNotEqualTo(Integer value) {
            addCriterion("part_discount <>", value, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountGreaterThan(Integer value) {
            addCriterion("part_discount >", value, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_discount >=", value, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountLessThan(Integer value) {
            addCriterion("part_discount <", value, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("part_discount <=", value, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountIn(List<Integer> values) {
            addCriterion("part_discount in", values, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountNotIn(List<Integer> values) {
            addCriterion("part_discount not in", values, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountBetween(Integer value1, Integer value2) {
            addCriterion("part_discount between", value1, value2, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("part_discount not between", value1, value2, "partDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountIsNull() {
            addCriterion("part_count_discount is null");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountIsNotNull() {
            addCriterion("part_count_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountEqualTo(Integer value) {
            addCriterion("part_count_discount =", value, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountNotEqualTo(Integer value) {
            addCriterion("part_count_discount <>", value, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountGreaterThan(Integer value) {
            addCriterion("part_count_discount >", value, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_count_discount >=", value, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountLessThan(Integer value) {
            addCriterion("part_count_discount <", value, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("part_count_discount <=", value, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountIn(List<Integer> values) {
            addCriterion("part_count_discount in", values, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountNotIn(List<Integer> values) {
            addCriterion("part_count_discount not in", values, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountBetween(Integer value1, Integer value2) {
            addCriterion("part_count_discount between", value1, value2, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andPartCountDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("part_count_discount not between", value1, value2, "partCountDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourCountIsNull() {
            addCriterion("man_hour_count is null");
            return (Criteria) this;
        }

        public Criteria andManHourCountIsNotNull() {
            addCriterion("man_hour_count is not null");
            return (Criteria) this;
        }

        public Criteria andManHourCountEqualTo(Integer value) {
            addCriterion("man_hour_count =", value, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountNotEqualTo(Integer value) {
            addCriterion("man_hour_count <>", value, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountGreaterThan(Integer value) {
            addCriterion("man_hour_count >", value, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_hour_count >=", value, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountLessThan(Integer value) {
            addCriterion("man_hour_count <", value, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountLessThanOrEqualTo(Integer value) {
            addCriterion("man_hour_count <=", value, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountIn(List<Integer> values) {
            addCriterion("man_hour_count in", values, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountNotIn(List<Integer> values) {
            addCriterion("man_hour_count not in", values, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_count between", value1, value2, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourCountNotBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_count not between", value1, value2, "manHourCount");
            return (Criteria) this;
        }

        public Criteria andManHourPriceIsNull() {
            addCriterion("man_hour_price is null");
            return (Criteria) this;
        }

        public Criteria andManHourPriceIsNotNull() {
            addCriterion("man_hour_price is not null");
            return (Criteria) this;
        }

        public Criteria andManHourPriceEqualTo(Integer value) {
            addCriterion("man_hour_price =", value, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceNotEqualTo(Integer value) {
            addCriterion("man_hour_price <>", value, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceGreaterThan(Integer value) {
            addCriterion("man_hour_price >", value, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_hour_price >=", value, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceLessThan(Integer value) {
            addCriterion("man_hour_price <", value, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceLessThanOrEqualTo(Integer value) {
            addCriterion("man_hour_price <=", value, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceIn(List<Integer> values) {
            addCriterion("man_hour_price in", values, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceNotIn(List<Integer> values) {
            addCriterion("man_hour_price not in", values, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_price between", value1, value2, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_price not between", value1, value2, "manHourPrice");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountIsNull() {
            addCriterion("man_hour_discount is null");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountIsNotNull() {
            addCriterion("man_hour_discount is not null");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountEqualTo(Integer value) {
            addCriterion("man_hour_discount =", value, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountNotEqualTo(Integer value) {
            addCriterion("man_hour_discount <>", value, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountGreaterThan(Integer value) {
            addCriterion("man_hour_discount >", value, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_hour_discount >=", value, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountLessThan(Integer value) {
            addCriterion("man_hour_discount <", value, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("man_hour_discount <=", value, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountIn(List<Integer> values) {
            addCriterion("man_hour_discount in", values, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountNotIn(List<Integer> values) {
            addCriterion("man_hour_discount not in", values, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_discount between", value1, value2, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_discount not between", value1, value2, "manHourDiscount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountIsNull() {
            addCriterion("man_hour_discount_count is null");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountIsNotNull() {
            addCriterion("man_hour_discount_count is not null");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountEqualTo(Integer value) {
            addCriterion("man_hour_discount_count =", value, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountNotEqualTo(Integer value) {
            addCriterion("man_hour_discount_count <>", value, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountGreaterThan(Integer value) {
            addCriterion("man_hour_discount_count >", value, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_hour_discount_count >=", value, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountLessThan(Integer value) {
            addCriterion("man_hour_discount_count <", value, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountLessThanOrEqualTo(Integer value) {
            addCriterion("man_hour_discount_count <=", value, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountIn(List<Integer> values) {
            addCriterion("man_hour_discount_count in", values, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountNotIn(List<Integer> values) {
            addCriterion("man_hour_discount_count not in", values, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_discount_count between", value1, value2, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andManHourDiscountCountNotBetween(Integer value1, Integer value2) {
            addCriterion("man_hour_discount_count not between", value1, value2, "manHourDiscountCount");
            return (Criteria) this;
        }

        public Criteria andTotalPricesIsNull() {
            addCriterion("total_prices is null");
            return (Criteria) this;
        }

        public Criteria andTotalPricesIsNotNull() {
            addCriterion("total_prices is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPricesEqualTo(Integer value) {
            addCriterion("total_prices =", value, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesNotEqualTo(Integer value) {
            addCriterion("total_prices <>", value, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesGreaterThan(Integer value) {
            addCriterion("total_prices >", value, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_prices >=", value, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesLessThan(Integer value) {
            addCriterion("total_prices <", value, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesLessThanOrEqualTo(Integer value) {
            addCriterion("total_prices <=", value, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesIn(List<Integer> values) {
            addCriterion("total_prices in", values, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesNotIn(List<Integer> values) {
            addCriterion("total_prices not in", values, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesBetween(Integer value1, Integer value2) {
            addCriterion("total_prices between", value1, value2, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalPricesNotBetween(Integer value1, Integer value2) {
            addCriterion("total_prices not between", value1, value2, "totalPrices");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNull() {
            addCriterion("total_discount is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNotNull() {
            addCriterion("total_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountEqualTo(Integer value) {
            addCriterion("total_discount =", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotEqualTo(Integer value) {
            addCriterion("total_discount <>", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThan(Integer value) {
            addCriterion("total_discount >", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_discount >=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThan(Integer value) {
            addCriterion("total_discount <", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("total_discount <=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIn(List<Integer> values) {
            addCriterion("total_discount in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotIn(List<Integer> values) {
            addCriterion("total_discount not in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountBetween(Integer value1, Integer value2) {
            addCriterion("total_discount between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_discount not between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowIsNull() {
            addCriterion("repair_person_allow is null");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowIsNotNull() {
            addCriterion("repair_person_allow is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowEqualTo(String value) {
            addCriterion("repair_person_allow =", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowNotEqualTo(String value) {
            addCriterion("repair_person_allow <>", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowGreaterThan(String value) {
            addCriterion("repair_person_allow >", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowGreaterThanOrEqualTo(String value) {
            addCriterion("repair_person_allow >=", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowLessThan(String value) {
            addCriterion("repair_person_allow <", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowLessThanOrEqualTo(String value) {
            addCriterion("repair_person_allow <=", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowLike(String value) {
            addCriterion("repair_person_allow like", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowNotLike(String value) {
            addCriterion("repair_person_allow not like", value, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowIn(List<String> values) {
            addCriterion("repair_person_allow in", values, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowNotIn(List<String> values) {
            addCriterion("repair_person_allow not in", values, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowBetween(String value1, String value2) {
            addCriterion("repair_person_allow between", value1, value2, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andRepairPersonAllowNotBetween(String value1, String value2) {
            addCriterion("repair_person_allow not between", value1, value2, "repairPersonAllow");
            return (Criteria) this;
        }

        public Criteria andIsHimselfIsNull() {
            addCriterion("is_himself is null");
            return (Criteria) this;
        }

        public Criteria andIsHimselfIsNotNull() {
            addCriterion("is_himself is not null");
            return (Criteria) this;
        }

        public Criteria andIsHimselfEqualTo(String value) {
            addCriterion("is_himself =", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfNotEqualTo(String value) {
            addCriterion("is_himself <>", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfGreaterThan(String value) {
            addCriterion("is_himself >", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfGreaterThanOrEqualTo(String value) {
            addCriterion("is_himself >=", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfLessThan(String value) {
            addCriterion("is_himself <", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfLessThanOrEqualTo(String value) {
            addCriterion("is_himself <=", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfLike(String value) {
            addCriterion("is_himself like", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfNotLike(String value) {
            addCriterion("is_himself not like", value, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfIn(List<String> values) {
            addCriterion("is_himself in", values, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfNotIn(List<String> values) {
            addCriterion("is_himself not in", values, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfBetween(String value1, String value2) {
            addCriterion("is_himself between", value1, value2, "isHimself");
            return (Criteria) this;
        }

        public Criteria andIsHimselfNotBetween(String value1, String value2) {
            addCriterion("is_himself not between", value1, value2, "isHimself");
            return (Criteria) this;
        }

        public Criteria andCustomerDescIsNull() {
            addCriterion("customer_desc is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDescIsNotNull() {
            addCriterion("customer_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDescEqualTo(String value) {
            addCriterion("customer_desc =", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotEqualTo(String value) {
            addCriterion("customer_desc <>", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescGreaterThan(String value) {
            addCriterion("customer_desc >", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescGreaterThanOrEqualTo(String value) {
            addCriterion("customer_desc >=", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescLessThan(String value) {
            addCriterion("customer_desc <", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescLessThanOrEqualTo(String value) {
            addCriterion("customer_desc <=", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescLike(String value) {
            addCriterion("customer_desc like", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotLike(String value) {
            addCriterion("customer_desc not like", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescIn(List<String> values) {
            addCriterion("customer_desc in", values, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotIn(List<String> values) {
            addCriterion("customer_desc not in", values, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescBetween(String value1, String value2) {
            addCriterion("customer_desc between", value1, value2, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotBetween(String value1, String value2) {
            addCriterion("customer_desc not between", value1, value2, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultIsNull() {
            addCriterion("automobile_doctor_diagnosis_result is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultIsNotNull() {
            addCriterion("automobile_doctor_diagnosis_result is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultEqualTo(String value) {
            addCriterion("automobile_doctor_diagnosis_result =", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultNotEqualTo(String value) {
            addCriterion("automobile_doctor_diagnosis_result <>", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultGreaterThan(String value) {
            addCriterion("automobile_doctor_diagnosis_result >", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_doctor_diagnosis_result >=", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultLessThan(String value) {
            addCriterion("automobile_doctor_diagnosis_result <", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultLessThanOrEqualTo(String value) {
            addCriterion("automobile_doctor_diagnosis_result <=", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultLike(String value) {
            addCriterion("automobile_doctor_diagnosis_result like", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultNotLike(String value) {
            addCriterion("automobile_doctor_diagnosis_result not like", value, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultIn(List<String> values) {
            addCriterion("automobile_doctor_diagnosis_result in", values, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultNotIn(List<String> values) {
            addCriterion("automobile_doctor_diagnosis_result not in", values, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultBetween(String value1, String value2) {
            addCriterion("automobile_doctor_diagnosis_result between", value1, value2, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andAutomobileDoctorDiagnosisResultNotBetween(String value1, String value2) {
            addCriterion("automobile_doctor_diagnosis_result not between", value1, value2, "automobileDoctorDiagnosisResult");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNull() {
            addCriterion("doctor_advice is null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNotNull() {
            addCriterion("doctor_advice is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceEqualTo(String value) {
            addCriterion("doctor_advice =", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotEqualTo(String value) {
            addCriterion("doctor_advice <>", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThan(String value) {
            addCriterion("doctor_advice >", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_advice >=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThan(String value) {
            addCriterion("doctor_advice <", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThanOrEqualTo(String value) {
            addCriterion("doctor_advice <=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLike(String value) {
            addCriterion("doctor_advice like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotLike(String value) {
            addCriterion("doctor_advice not like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIn(List<String> values) {
            addCriterion("doctor_advice in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotIn(List<String> values) {
            addCriterion("doctor_advice not in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceBetween(String value1, String value2) {
            addCriterion("doctor_advice between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotBetween(String value1, String value2) {
            addCriterion("doctor_advice not between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andReplacePartIsNull() {
            addCriterion("replace_part is null");
            return (Criteria) this;
        }

        public Criteria andReplacePartIsNotNull() {
            addCriterion("replace_part is not null");
            return (Criteria) this;
        }

        public Criteria andReplacePartEqualTo(String value) {
            addCriterion("replace_part =", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartNotEqualTo(String value) {
            addCriterion("replace_part <>", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartGreaterThan(String value) {
            addCriterion("replace_part >", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartGreaterThanOrEqualTo(String value) {
            addCriterion("replace_part >=", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartLessThan(String value) {
            addCriterion("replace_part <", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartLessThanOrEqualTo(String value) {
            addCriterion("replace_part <=", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartLike(String value) {
            addCriterion("replace_part like", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartNotLike(String value) {
            addCriterion("replace_part not like", value, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartIn(List<String> values) {
            addCriterion("replace_part in", values, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartNotIn(List<String> values) {
            addCriterion("replace_part not in", values, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartBetween(String value1, String value2) {
            addCriterion("replace_part between", value1, value2, "replacePart");
            return (Criteria) this;
        }

        public Criteria andReplacePartNotBetween(String value1, String value2) {
            addCriterion("replace_part not between", value1, value2, "replacePart");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserIsNull() {
            addCriterion("service_adviser is null");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserIsNotNull() {
            addCriterion("service_adviser is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserEqualTo(String value) {
            addCriterion("service_adviser =", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserNotEqualTo(String value) {
            addCriterion("service_adviser <>", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserGreaterThan(String value) {
            addCriterion("service_adviser >", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserGreaterThanOrEqualTo(String value) {
            addCriterion("service_adviser >=", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserLessThan(String value) {
            addCriterion("service_adviser <", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserLessThanOrEqualTo(String value) {
            addCriterion("service_adviser <=", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserLike(String value) {
            addCriterion("service_adviser like", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserNotLike(String value) {
            addCriterion("service_adviser not like", value, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserIn(List<String> values) {
            addCriterion("service_adviser in", values, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserNotIn(List<String> values) {
            addCriterion("service_adviser not in", values, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserBetween(String value1, String value2) {
            addCriterion("service_adviser between", value1, value2, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andServiceAdviserNotBetween(String value1, String value2) {
            addCriterion("service_adviser not between", value1, value2, "serviceAdviser");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoIsNull() {
            addCriterion("doctor_team_no is null");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoIsNotNull() {
            addCriterion("doctor_team_no is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoEqualTo(String value) {
            addCriterion("doctor_team_no =", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoNotEqualTo(String value) {
            addCriterion("doctor_team_no <>", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoGreaterThan(String value) {
            addCriterion("doctor_team_no >", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_team_no >=", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoLessThan(String value) {
            addCriterion("doctor_team_no <", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoLessThanOrEqualTo(String value) {
            addCriterion("doctor_team_no <=", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoLike(String value) {
            addCriterion("doctor_team_no like", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoNotLike(String value) {
            addCriterion("doctor_team_no not like", value, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoIn(List<String> values) {
            addCriterion("doctor_team_no in", values, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoNotIn(List<String> values) {
            addCriterion("doctor_team_no not in", values, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoBetween(String value1, String value2) {
            addCriterion("doctor_team_no between", value1, value2, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamNoNotBetween(String value1, String value2) {
            addCriterion("doctor_team_no not between", value1, value2, "doctorTeamNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoIsNull() {
            addCriterion("repair_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoIsNotNull() {
            addCriterion("repair_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoEqualTo(String value) {
            addCriterion("repair_doctor_no =", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoNotEqualTo(String value) {
            addCriterion("repair_doctor_no <>", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoGreaterThan(String value) {
            addCriterion("repair_doctor_no >", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoGreaterThanOrEqualTo(String value) {
            addCriterion("repair_doctor_no >=", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoLessThan(String value) {
            addCriterion("repair_doctor_no <", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoLessThanOrEqualTo(String value) {
            addCriterion("repair_doctor_no <=", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoLike(String value) {
            addCriterion("repair_doctor_no like", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoNotLike(String value) {
            addCriterion("repair_doctor_no not like", value, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoIn(List<String> values) {
            addCriterion("repair_doctor_no in", values, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoNotIn(List<String> values) {
            addCriterion("repair_doctor_no not in", values, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoBetween(String value1, String value2) {
            addCriterion("repair_doctor_no between", value1, value2, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andRepairDoctorNoNotBetween(String value1, String value2) {
            addCriterion("repair_doctor_no not between", value1, value2, "repairDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoIsNull() {
            addCriterion("check_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoIsNotNull() {
            addCriterion("check_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoEqualTo(String value) {
            addCriterion("check_doctor_no =", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoNotEqualTo(String value) {
            addCriterion("check_doctor_no <>", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoGreaterThan(String value) {
            addCriterion("check_doctor_no >", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoGreaterThanOrEqualTo(String value) {
            addCriterion("check_doctor_no >=", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoLessThan(String value) {
            addCriterion("check_doctor_no <", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoLessThanOrEqualTo(String value) {
            addCriterion("check_doctor_no <=", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoLike(String value) {
            addCriterion("check_doctor_no like", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoNotLike(String value) {
            addCriterion("check_doctor_no not like", value, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoIn(List<String> values) {
            addCriterion("check_doctor_no in", values, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoNotIn(List<String> values) {
            addCriterion("check_doctor_no not in", values, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoBetween(String value1, String value2) {
            addCriterion("check_doctor_no between", value1, value2, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCheckDoctorNoNotBetween(String value1, String value2) {
            addCriterion("check_doctor_no not between", value1, value2, "checkDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoIsNull() {
            addCriterion("last_check_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoIsNotNull() {
            addCriterion("last_check_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoEqualTo(String value) {
            addCriterion("last_check_doctor_no =", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoNotEqualTo(String value) {
            addCriterion("last_check_doctor_no <>", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoGreaterThan(String value) {
            addCriterion("last_check_doctor_no >", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoGreaterThanOrEqualTo(String value) {
            addCriterion("last_check_doctor_no >=", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoLessThan(String value) {
            addCriterion("last_check_doctor_no <", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoLessThanOrEqualTo(String value) {
            addCriterion("last_check_doctor_no <=", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoLike(String value) {
            addCriterion("last_check_doctor_no like", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoNotLike(String value) {
            addCriterion("last_check_doctor_no not like", value, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoIn(List<String> values) {
            addCriterion("last_check_doctor_no in", values, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoNotIn(List<String> values) {
            addCriterion("last_check_doctor_no not in", values, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoBetween(String value1, String value2) {
            addCriterion("last_check_doctor_no between", value1, value2, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andLastCheckDoctorNoNotBetween(String value1, String value2) {
            addCriterion("last_check_doctor_no not between", value1, value2, "lastCheckDoctorNo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumIsNull() {
            addCriterion("cust_call_back_num is null");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumIsNotNull() {
            addCriterion("cust_call_back_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumEqualTo(String value) {
            addCriterion("cust_call_back_num =", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumNotEqualTo(String value) {
            addCriterion("cust_call_back_num <>", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumGreaterThan(String value) {
            addCriterion("cust_call_back_num >", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumGreaterThanOrEqualTo(String value) {
            addCriterion("cust_call_back_num >=", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumLessThan(String value) {
            addCriterion("cust_call_back_num <", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumLessThanOrEqualTo(String value) {
            addCriterion("cust_call_back_num <=", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumLike(String value) {
            addCriterion("cust_call_back_num like", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumNotLike(String value) {
            addCriterion("cust_call_back_num not like", value, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumIn(List<String> values) {
            addCriterion("cust_call_back_num in", values, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumNotIn(List<String> values) {
            addCriterion("cust_call_back_num not in", values, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumBetween(String value1, String value2) {
            addCriterion("cust_call_back_num between", value1, value2, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCustCallBackNumNotBetween(String value1, String value2) {
            addCriterion("cust_call_back_num not between", value1, value2, "custCallBackNum");
            return (Criteria) this;
        }

        public Criteria andCallBackResultIsNull() {
            addCriterion("Call_back_result is null");
            return (Criteria) this;
        }

        public Criteria andCallBackResultIsNotNull() {
            addCriterion("Call_back_result is not null");
            return (Criteria) this;
        }

        public Criteria andCallBackResultEqualTo(String value) {
            addCriterion("Call_back_result =", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultNotEqualTo(String value) {
            addCriterion("Call_back_result <>", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultGreaterThan(String value) {
            addCriterion("Call_back_result >", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultGreaterThanOrEqualTo(String value) {
            addCriterion("Call_back_result >=", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultLessThan(String value) {
            addCriterion("Call_back_result <", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultLessThanOrEqualTo(String value) {
            addCriterion("Call_back_result <=", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultLike(String value) {
            addCriterion("Call_back_result like", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultNotLike(String value) {
            addCriterion("Call_back_result not like", value, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultIn(List<String> values) {
            addCriterion("Call_back_result in", values, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultNotIn(List<String> values) {
            addCriterion("Call_back_result not in", values, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultBetween(String value1, String value2) {
            addCriterion("Call_back_result between", value1, value2, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCallBackResultNotBetween(String value1, String value2) {
            addCriterion("Call_back_result not between", value1, value2, "callBackResult");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoIsNull() {
            addCriterion("cust_call_back_memo is null");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoIsNotNull() {
            addCriterion("cust_call_back_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoEqualTo(String value) {
            addCriterion("cust_call_back_memo =", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoNotEqualTo(String value) {
            addCriterion("cust_call_back_memo <>", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoGreaterThan(String value) {
            addCriterion("cust_call_back_memo >", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_call_back_memo >=", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoLessThan(String value) {
            addCriterion("cust_call_back_memo <", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoLessThanOrEqualTo(String value) {
            addCriterion("cust_call_back_memo <=", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoLike(String value) {
            addCriterion("cust_call_back_memo like", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoNotLike(String value) {
            addCriterion("cust_call_back_memo not like", value, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoIn(List<String> values) {
            addCriterion("cust_call_back_memo in", values, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoNotIn(List<String> values) {
            addCriterion("cust_call_back_memo not in", values, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoBetween(String value1, String value2) {
            addCriterion("cust_call_back_memo between", value1, value2, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustCallBackMemoNotBetween(String value1, String value2) {
            addCriterion("cust_call_back_memo not between", value1, value2, "custCallBackMemo");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionIsNull() {
            addCriterion("cust_satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionIsNotNull() {
            addCriterion("cust_satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionEqualTo(String value) {
            addCriterion("cust_satisfaction =", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionNotEqualTo(String value) {
            addCriterion("cust_satisfaction <>", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionGreaterThan(String value) {
            addCriterion("cust_satisfaction >", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionGreaterThanOrEqualTo(String value) {
            addCriterion("cust_satisfaction >=", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionLessThan(String value) {
            addCriterion("cust_satisfaction <", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionLessThanOrEqualTo(String value) {
            addCriterion("cust_satisfaction <=", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionLike(String value) {
            addCriterion("cust_satisfaction like", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionNotLike(String value) {
            addCriterion("cust_satisfaction not like", value, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionIn(List<String> values) {
            addCriterion("cust_satisfaction in", values, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionNotIn(List<String> values) {
            addCriterion("cust_satisfaction not in", values, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionBetween(String value1, String value2) {
            addCriterion("cust_satisfaction between", value1, value2, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustSatisfactionNotBetween(String value1, String value2) {
            addCriterion("cust_satisfaction not between", value1, value2, "custSatisfaction");
            return (Criteria) this;
        }

        public Criteria andCustMemoIsNull() {
            addCriterion("cust_memo is null");
            return (Criteria) this;
        }

        public Criteria andCustMemoIsNotNull() {
            addCriterion("cust_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCustMemoEqualTo(String value) {
            addCriterion("cust_memo =", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotEqualTo(String value) {
            addCriterion("cust_memo <>", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoGreaterThan(String value) {
            addCriterion("cust_memo >", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_memo >=", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLessThan(String value) {
            addCriterion("cust_memo <", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLessThanOrEqualTo(String value) {
            addCriterion("cust_memo <=", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLike(String value) {
            addCriterion("cust_memo like", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotLike(String value) {
            addCriterion("cust_memo not like", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoIn(List<String> values) {
            addCriterion("cust_memo in", values, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotIn(List<String> values) {
            addCriterion("cust_memo not in", values, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoBetween(String value1, String value2) {
            addCriterion("cust_memo between", value1, value2, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotBetween(String value1, String value2) {
            addCriterion("cust_memo not between", value1, value2, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicIsNull() {
            addCriterion("cust_assess_pic is null");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicIsNotNull() {
            addCriterion("cust_assess_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicEqualTo(String value) {
            addCriterion("cust_assess_pic =", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicNotEqualTo(String value) {
            addCriterion("cust_assess_pic <>", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicGreaterThan(String value) {
            addCriterion("cust_assess_pic >", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicGreaterThanOrEqualTo(String value) {
            addCriterion("cust_assess_pic >=", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicLessThan(String value) {
            addCriterion("cust_assess_pic <", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicLessThanOrEqualTo(String value) {
            addCriterion("cust_assess_pic <=", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicLike(String value) {
            addCriterion("cust_assess_pic like", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicNotLike(String value) {
            addCriterion("cust_assess_pic not like", value, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicIn(List<String> values) {
            addCriterion("cust_assess_pic in", values, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicNotIn(List<String> values) {
            addCriterion("cust_assess_pic not in", values, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicBetween(String value1, String value2) {
            addCriterion("cust_assess_pic between", value1, value2, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andCustAssessPicNotBetween(String value1, String value2) {
            addCriterion("cust_assess_pic not between", value1, value2, "custAssessPic");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceIsNull() {
            addCriterion("is_need_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceIsNotNull() {
            addCriterion("is_need_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceEqualTo(String value) {
            addCriterion("is_need_invoice =", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceNotEqualTo(String value) {
            addCriterion("is_need_invoice <>", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceGreaterThan(String value) {
            addCriterion("is_need_invoice >", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("is_need_invoice >=", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceLessThan(String value) {
            addCriterion("is_need_invoice <", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceLessThanOrEqualTo(String value) {
            addCriterion("is_need_invoice <=", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceLike(String value) {
            addCriterion("is_need_invoice like", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceNotLike(String value) {
            addCriterion("is_need_invoice not like", value, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceIn(List<String> values) {
            addCriterion("is_need_invoice in", values, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceNotIn(List<String> values) {
            addCriterion("is_need_invoice not in", values, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceBetween(String value1, String value2) {
            addCriterion("is_need_invoice between", value1, value2, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andIsNeedInvoiceNotBetween(String value1, String value2) {
            addCriterion("is_need_invoice not between", value1, value2, "isNeedInvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLike(String value) {
            addCriterion("invoice_status like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("invoice_status not like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
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