package com.freeTime.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andProjectDescIsNull() {
            addCriterion("project_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescIsNotNull() {
            addCriterion("project_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescEqualTo(String value) {
            addCriterion("project_desc =", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotEqualTo(String value) {
            addCriterion("project_desc <>", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThan(String value) {
            addCriterion("project_desc >", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_desc >=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThan(String value) {
            addCriterion("project_desc <", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLessThanOrEqualTo(String value) {
            addCriterion("project_desc <=", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescLike(String value) {
            addCriterion("project_desc like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotLike(String value) {
            addCriterion("project_desc not like", value, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescIn(List<String> values) {
            addCriterion("project_desc in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotIn(List<String> values) {
            addCriterion("project_desc not in", values, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescBetween(String value1, String value2) {
            addCriterion("project_desc between", value1, value2, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDescNotBetween(String value1, String value2) {
            addCriterion("project_desc not between", value1, value2, "projectDesc");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourIsNull() {
            addCriterion("replace_part_man_hour is null");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourIsNotNull() {
            addCriterion("replace_part_man_hour is not null");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourEqualTo(Integer value) {
            addCriterion("replace_part_man_hour =", value, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourNotEqualTo(Integer value) {
            addCriterion("replace_part_man_hour <>", value, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourGreaterThan(Integer value) {
            addCriterion("replace_part_man_hour >", value, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("replace_part_man_hour >=", value, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourLessThan(Integer value) {
            addCriterion("replace_part_man_hour <", value, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourLessThanOrEqualTo(Integer value) {
            addCriterion("replace_part_man_hour <=", value, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourIn(List<Integer> values) {
            addCriterion("replace_part_man_hour in", values, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourNotIn(List<Integer> values) {
            addCriterion("replace_part_man_hour not in", values, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourBetween(Integer value1, Integer value2) {
            addCriterion("replace_part_man_hour between", value1, value2, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andReplacePartManHourNotBetween(Integer value1, Integer value2) {
            addCriterion("replace_part_man_hour not between", value1, value2, "replacePartManHour");
            return (Criteria) this;
        }

        public Criteria andDoctorNoIsNull() {
            addCriterion("doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNoIsNotNull() {
            addCriterion("doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNoEqualTo(String value) {
            addCriterion("doctor_no =", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoNotEqualTo(String value) {
            addCriterion("doctor_no <>", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoGreaterThan(String value) {
            addCriterion("doctor_no >", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_no >=", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoLessThan(String value) {
            addCriterion("doctor_no <", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoLessThanOrEqualTo(String value) {
            addCriterion("doctor_no <=", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoLike(String value) {
            addCriterion("doctor_no like", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoNotLike(String value) {
            addCriterion("doctor_no not like", value, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoIn(List<String> values) {
            addCriterion("doctor_no in", values, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoNotIn(List<String> values) {
            addCriterion("doctor_no not in", values, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoBetween(String value1, String value2) {
            addCriterion("doctor_no between", value1, value2, "doctorNo");
            return (Criteria) this;
        }

        public Criteria andDoctorNoNotBetween(String value1, String value2) {
            addCriterion("doctor_no not between", value1, value2, "doctorNo");
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