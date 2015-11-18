package com.freeTime.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AutoMobileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AutoMobileExample() {
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

        public Criteria andFrameNumberIsNull() {
            addCriterion("frame_number is null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNotNull() {
            addCriterion("frame_number is not null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberEqualTo(String value) {
            addCriterion("frame_number =", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotEqualTo(String value) {
            addCriterion("frame_number <>", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThan(String value) {
            addCriterion("frame_number >", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThanOrEqualTo(String value) {
            addCriterion("frame_number >=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThan(String value) {
            addCriterion("frame_number <", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThanOrEqualTo(String value) {
            addCriterion("frame_number <=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLike(String value) {
            addCriterion("frame_number like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotLike(String value) {
            addCriterion("frame_number not like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIn(List<String> values) {
            addCriterion("frame_number in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotIn(List<String> values) {
            addCriterion("frame_number not in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberBetween(String value1, String value2) {
            addCriterion("frame_number between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotBetween(String value1, String value2) {
            addCriterion("frame_number not between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseIsNull() {
            addCriterion("automobile_license is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseIsNotNull() {
            addCriterion("automobile_license is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseEqualTo(String value) {
            addCriterion("automobile_license =", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseNotEqualTo(String value) {
            addCriterion("automobile_license <>", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseGreaterThan(String value) {
            addCriterion("automobile_license >", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_license >=", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseLessThan(String value) {
            addCriterion("automobile_license <", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseLessThanOrEqualTo(String value) {
            addCriterion("automobile_license <=", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseLike(String value) {
            addCriterion("automobile_license like", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseNotLike(String value) {
            addCriterion("automobile_license not like", value, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseIn(List<String> values) {
            addCriterion("automobile_license in", values, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseNotIn(List<String> values) {
            addCriterion("automobile_license not in", values, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseBetween(String value1, String value2) {
            addCriterion("automobile_license between", value1, value2, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andAutomobileLicenseNotBetween(String value1, String value2) {
            addCriterion("automobile_license not between", value1, value2, "automobileLicense");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("engine_number is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("engine_number =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("engine_number <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("engine_number >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("engine_number >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("engine_number <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("engine_number <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("engine_number like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("engine_number not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("engine_number in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("engine_number not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("engine_number between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("engine_number not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandIsNull() {
            addCriterion("automobile_brand is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandIsNotNull() {
            addCriterion("automobile_brand is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandEqualTo(String value) {
            addCriterion("automobile_brand =", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandNotEqualTo(String value) {
            addCriterion("automobile_brand <>", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandGreaterThan(String value) {
            addCriterion("automobile_brand >", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_brand >=", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandLessThan(String value) {
            addCriterion("automobile_brand <", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandLessThanOrEqualTo(String value) {
            addCriterion("automobile_brand <=", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandLike(String value) {
            addCriterion("automobile_brand like", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandNotLike(String value) {
            addCriterion("automobile_brand not like", value, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandIn(List<String> values) {
            addCriterion("automobile_brand in", values, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandNotIn(List<String> values) {
            addCriterion("automobile_brand not in", values, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandBetween(String value1, String value2) {
            addCriterion("automobile_brand between", value1, value2, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileBrandNotBetween(String value1, String value2) {
            addCriterion("automobile_brand not between", value1, value2, "automobileBrand");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelIsNull() {
            addCriterion("automobile_model is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelIsNotNull() {
            addCriterion("automobile_model is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelEqualTo(String value) {
            addCriterion("automobile_model =", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelNotEqualTo(String value) {
            addCriterion("automobile_model <>", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelGreaterThan(String value) {
            addCriterion("automobile_model >", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_model >=", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelLessThan(String value) {
            addCriterion("automobile_model <", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelLessThanOrEqualTo(String value) {
            addCriterion("automobile_model <=", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelLike(String value) {
            addCriterion("automobile_model like", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelNotLike(String value) {
            addCriterion("automobile_model not like", value, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelIn(List<String> values) {
            addCriterion("automobile_model in", values, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelNotIn(List<String> values) {
            addCriterion("automobile_model not in", values, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelBetween(String value1, String value2) {
            addCriterion("automobile_model between", value1, value2, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileModelNotBetween(String value1, String value2) {
            addCriterion("automobile_model not between", value1, value2, "automobileModel");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueIsNull() {
            addCriterion("automobile_output_value is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueIsNotNull() {
            addCriterion("automobile_output_value is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueEqualTo(String value) {
            addCriterion("automobile_output_value =", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueNotEqualTo(String value) {
            addCriterion("automobile_output_value <>", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueGreaterThan(String value) {
            addCriterion("automobile_output_value >", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_output_value >=", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueLessThan(String value) {
            addCriterion("automobile_output_value <", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueLessThanOrEqualTo(String value) {
            addCriterion("automobile_output_value <=", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueLike(String value) {
            addCriterion("automobile_output_value like", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueNotLike(String value) {
            addCriterion("automobile_output_value not like", value, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueIn(List<String> values) {
            addCriterion("automobile_output_value in", values, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueNotIn(List<String> values) {
            addCriterion("automobile_output_value not in", values, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueBetween(String value1, String value2) {
            addCriterion("automobile_output_value between", value1, value2, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileOutputValueNotBetween(String value1, String value2) {
            addCriterion("automobile_output_value not between", value1, value2, "automobileOutputValue");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorIsNull() {
            addCriterion("automobile_color is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorIsNotNull() {
            addCriterion("automobile_color is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorEqualTo(String value) {
            addCriterion("automobile_color =", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorNotEqualTo(String value) {
            addCriterion("automobile_color <>", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorGreaterThan(String value) {
            addCriterion("automobile_color >", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_color >=", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorLessThan(String value) {
            addCriterion("automobile_color <", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorLessThanOrEqualTo(String value) {
            addCriterion("automobile_color <=", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorLike(String value) {
            addCriterion("automobile_color like", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorNotLike(String value) {
            addCriterion("automobile_color not like", value, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorIn(List<String> values) {
            addCriterion("automobile_color in", values, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorNotIn(List<String> values) {
            addCriterion("automobile_color not in", values, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorBetween(String value1, String value2) {
            addCriterion("automobile_color between", value1, value2, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andAutomobileColorNotBetween(String value1, String value2) {
            addCriterion("automobile_color not between", value1, value2, "automobileColor");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(Integer value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(Integer value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(Integer value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(Integer value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(Integer value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<Integer> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<Integer> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(Integer value1, Integer value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyIsNull() {
            addCriterion("automobile_insurance_company is null");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyIsNotNull() {
            addCriterion("automobile_insurance_company is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyEqualTo(String value) {
            addCriterion("automobile_insurance_company =", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyNotEqualTo(String value) {
            addCriterion("automobile_insurance_company <>", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyGreaterThan(String value) {
            addCriterion("automobile_insurance_company >", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_insurance_company >=", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyLessThan(String value) {
            addCriterion("automobile_insurance_company <", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyLessThanOrEqualTo(String value) {
            addCriterion("automobile_insurance_company <=", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyLike(String value) {
            addCriterion("automobile_insurance_company like", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyNotLike(String value) {
            addCriterion("automobile_insurance_company not like", value, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyIn(List<String> values) {
            addCriterion("automobile_insurance_company in", values, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyNotIn(List<String> values) {
            addCriterion("automobile_insurance_company not in", values, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyBetween(String value1, String value2) {
            addCriterion("automobile_insurance_company between", value1, value2, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andAutomobileInsuranceCompanyNotBetween(String value1, String value2) {
            addCriterion("automobile_insurance_company not between", value1, value2, "automobileInsuranceCompany");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeIsNull() {
            addCriterion("compulsory_insurance_time is null");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeIsNotNull() {
            addCriterion("compulsory_insurance_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("compulsory_insurance_time =", value, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("compulsory_insurance_time <>", value, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("compulsory_insurance_time >", value, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("compulsory_insurance_time >=", value, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeLessThan(Date value) {
            addCriterionForJDBCDate("compulsory_insurance_time <", value, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("compulsory_insurance_time <=", value, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("compulsory_insurance_time in", values, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("compulsory_insurance_time not in", values, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("compulsory_insurance_time between", value1, value2, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCompulsoryInsuranceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("compulsory_insurance_time not between", value1, value2, "compulsoryInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeIsNull() {
            addCriterion("other_insurance_time is null");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeIsNotNull() {
            addCriterion("other_insurance_time is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("other_insurance_time =", value, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("other_insurance_time <>", value, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("other_insurance_time >", value, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("other_insurance_time >=", value, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeLessThan(Date value) {
            addCriterionForJDBCDate("other_insurance_time <", value, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("other_insurance_time <=", value, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("other_insurance_time in", values, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("other_insurance_time not in", values, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("other_insurance_time between", value1, value2, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andOtherInsuranceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("other_insurance_time not between", value1, value2, "otherInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNull() {
            addCriterion("insurance_type is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNotNull() {
            addCriterion("insurance_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeEqualTo(String value) {
            addCriterion("insurance_type =", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotEqualTo(String value) {
            addCriterion("insurance_type <>", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThan(String value) {
            addCriterion("insurance_type >", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_type >=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThan(String value) {
            addCriterion("insurance_type <", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThanOrEqualTo(String value) {
            addCriterion("insurance_type <=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLike(String value) {
            addCriterion("insurance_type like", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotLike(String value) {
            addCriterion("insurance_type not like", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIn(List<String> values) {
            addCriterion("insurance_type in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotIn(List<String> values) {
            addCriterion("insurance_type not in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeBetween(String value1, String value2) {
            addCriterion("insurance_type between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotBetween(String value1, String value2) {
            addCriterion("insurance_type not between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicIsNull() {
            addCriterion("automobile_pic is null");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicIsNotNull() {
            addCriterion("automobile_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicEqualTo(String value) {
            addCriterion("automobile_pic =", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicNotEqualTo(String value) {
            addCriterion("automobile_pic <>", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicGreaterThan(String value) {
            addCriterion("automobile_pic >", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicGreaterThanOrEqualTo(String value) {
            addCriterion("automobile_pic >=", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicLessThan(String value) {
            addCriterion("automobile_pic <", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicLessThanOrEqualTo(String value) {
            addCriterion("automobile_pic <=", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicLike(String value) {
            addCriterion("automobile_pic like", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicNotLike(String value) {
            addCriterion("automobile_pic not like", value, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicIn(List<String> values) {
            addCriterion("automobile_pic in", values, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicNotIn(List<String> values) {
            addCriterion("automobile_pic not in", values, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicBetween(String value1, String value2) {
            addCriterion("automobile_pic between", value1, value2, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andAutomobilePicNotBetween(String value1, String value2) {
            addCriterion("automobile_pic not between", value1, value2, "automobilePic");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("ext5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(Date value) {
            addCriterionForJDBCDate("ext5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(Date value) {
            addCriterionForJDBCDate("ext5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(Date value) {
            addCriterionForJDBCDate("ext5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ext5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(Date value) {
            addCriterionForJDBCDate("ext5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ext5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<Date> values) {
            addCriterionForJDBCDate("ext5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<Date> values) {
            addCriterionForJDBCDate("ext5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("ext5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ext5 not between", value1, value2, "ext5");
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