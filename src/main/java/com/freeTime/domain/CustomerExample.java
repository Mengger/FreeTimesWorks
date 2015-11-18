package com.freeTime.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_Card_No is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_Card_No is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_Card_No =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_Card_No <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_Card_No >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_Card_No >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_Card_No <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_Card_No <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_Card_No like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_Card_No not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_Card_No in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_Card_No not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_Card_No between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_Card_No not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_Num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_Num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_Num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_Num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_Num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_Num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_Num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_Num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_Num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_Num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_Num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_Num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_Num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_Num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumIsNull() {
            addCriterion("second_phone_num is null");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumIsNotNull() {
            addCriterion("second_phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumEqualTo(String value) {
            addCriterion("second_phone_num =", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumNotEqualTo(String value) {
            addCriterion("second_phone_num <>", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumGreaterThan(String value) {
            addCriterion("second_phone_num >", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("second_phone_num >=", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumLessThan(String value) {
            addCriterion("second_phone_num <", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("second_phone_num <=", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumLike(String value) {
            addCriterion("second_phone_num like", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumNotLike(String value) {
            addCriterion("second_phone_num not like", value, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumIn(List<String> values) {
            addCriterion("second_phone_num in", values, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumNotIn(List<String> values) {
            addCriterion("second_phone_num not in", values, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumBetween(String value1, String value2) {
            addCriterion("second_phone_num between", value1, value2, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNumNotBetween(String value1, String value2) {
            addCriterion("second_phone_num not between", value1, value2, "secondPhoneNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumIsNull() {
            addCriterion("home_Num is null");
            return (Criteria) this;
        }

        public Criteria andHomeNumIsNotNull() {
            addCriterion("home_Num is not null");
            return (Criteria) this;
        }

        public Criteria andHomeNumEqualTo(String value) {
            addCriterion("home_Num =", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotEqualTo(String value) {
            addCriterion("home_Num <>", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumGreaterThan(String value) {
            addCriterion("home_Num >", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumGreaterThanOrEqualTo(String value) {
            addCriterion("home_Num >=", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLessThan(String value) {
            addCriterion("home_Num <", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLessThanOrEqualTo(String value) {
            addCriterion("home_Num <=", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLike(String value) {
            addCriterion("home_Num like", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotLike(String value) {
            addCriterion("home_Num not like", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumIn(List<String> values) {
            addCriterion("home_Num in", values, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotIn(List<String> values) {
            addCriterion("home_Num not in", values, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumBetween(String value1, String value2) {
            addCriterion("home_Num between", value1, value2, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotBetween(String value1, String value2) {
            addCriterion("home_Num not between", value1, value2, "homeNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumIsNull() {
            addCriterion("emergency_Num is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumIsNotNull() {
            addCriterion("emergency_Num is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumEqualTo(String value) {
            addCriterion("emergency_Num =", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumNotEqualTo(String value) {
            addCriterion("emergency_Num <>", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumGreaterThan(String value) {
            addCriterion("emergency_Num >", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_Num >=", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumLessThan(String value) {
            addCriterion("emergency_Num <", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumLessThanOrEqualTo(String value) {
            addCriterion("emergency_Num <=", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumLike(String value) {
            addCriterion("emergency_Num like", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumNotLike(String value) {
            addCriterion("emergency_Num not like", value, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumIn(List<String> values) {
            addCriterion("emergency_Num in", values, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumNotIn(List<String> values) {
            addCriterion("emergency_Num not in", values, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumBetween(String value1, String value2) {
            addCriterion("emergency_Num between", value1, value2, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andEmergencyNumNotBetween(String value1, String value2) {
            addCriterion("emergency_Num not between", value1, value2, "emergencyNum");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyIsNull() {
            addCriterion("works_Property is null");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyIsNotNull() {
            addCriterion("works_Property is not null");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyEqualTo(String value) {
            addCriterion("works_Property =", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyNotEqualTo(String value) {
            addCriterion("works_Property <>", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyGreaterThan(String value) {
            addCriterion("works_Property >", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("works_Property >=", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyLessThan(String value) {
            addCriterion("works_Property <", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyLessThanOrEqualTo(String value) {
            addCriterion("works_Property <=", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyLike(String value) {
            addCriterion("works_Property like", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyNotLike(String value) {
            addCriterion("works_Property not like", value, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyIn(List<String> values) {
            addCriterion("works_Property in", values, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyNotIn(List<String> values) {
            addCriterion("works_Property not in", values, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyBetween(String value1, String value2) {
            addCriterion("works_Property between", value1, value2, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andWorksPropertyNotBetween(String value1, String value2) {
            addCriterion("works_Property not between", value1, value2, "worksProperty");
            return (Criteria) this;
        }

        public Criteria andQqNumIsNull() {
            addCriterion("QQ_num is null");
            return (Criteria) this;
        }

        public Criteria andQqNumIsNotNull() {
            addCriterion("QQ_num is not null");
            return (Criteria) this;
        }

        public Criteria andQqNumEqualTo(String value) {
            addCriterion("QQ_num =", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotEqualTo(String value) {
            addCriterion("QQ_num <>", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumGreaterThan(String value) {
            addCriterion("QQ_num >", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumGreaterThanOrEqualTo(String value) {
            addCriterion("QQ_num >=", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLessThan(String value) {
            addCriterion("QQ_num <", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLessThanOrEqualTo(String value) {
            addCriterion("QQ_num <=", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLike(String value) {
            addCriterion("QQ_num like", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotLike(String value) {
            addCriterion("QQ_num not like", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumIn(List<String> values) {
            addCriterion("QQ_num in", values, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotIn(List<String> values) {
            addCriterion("QQ_num not in", values, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumBetween(String value1, String value2) {
            addCriterion("QQ_num between", value1, value2, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotBetween(String value1, String value2) {
            addCriterion("QQ_num not between", value1, value2, "qqNum");
            return (Criteria) this;
        }

        public Criteria andNikeNameIsNull() {
            addCriterion("nike_name is null");
            return (Criteria) this;
        }

        public Criteria andNikeNameIsNotNull() {
            addCriterion("nike_name is not null");
            return (Criteria) this;
        }

        public Criteria andNikeNameEqualTo(String value) {
            addCriterion("nike_name =", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotEqualTo(String value) {
            addCriterion("nike_name <>", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameGreaterThan(String value) {
            addCriterion("nike_name >", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameGreaterThanOrEqualTo(String value) {
            addCriterion("nike_name >=", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameLessThan(String value) {
            addCriterion("nike_name <", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameLessThanOrEqualTo(String value) {
            addCriterion("nike_name <=", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameLike(String value) {
            addCriterion("nike_name like", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotLike(String value) {
            addCriterion("nike_name not like", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameIn(List<String> values) {
            addCriterion("nike_name in", values, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotIn(List<String> values) {
            addCriterion("nike_name not in", values, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameBetween(String value1, String value2) {
            addCriterion("nike_name between", value1, value2, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotBetween(String value1, String value2) {
            addCriterion("nike_name not between", value1, value2, "nikeName");
            return (Criteria) this;
        }

        public Criteria andAutoMobileIsNull() {
            addCriterion("auto_mobile is null");
            return (Criteria) this;
        }

        public Criteria andAutoMobileIsNotNull() {
            addCriterion("auto_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andAutoMobileEqualTo(String value) {
            addCriterion("auto_mobile =", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileNotEqualTo(String value) {
            addCriterion("auto_mobile <>", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileGreaterThan(String value) {
            addCriterion("auto_mobile >", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileGreaterThanOrEqualTo(String value) {
            addCriterion("auto_mobile >=", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileLessThan(String value) {
            addCriterion("auto_mobile <", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileLessThanOrEqualTo(String value) {
            addCriterion("auto_mobile <=", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileLike(String value) {
            addCriterion("auto_mobile like", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileNotLike(String value) {
            addCriterion("auto_mobile not like", value, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileIn(List<String> values) {
            addCriterion("auto_mobile in", values, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileNotIn(List<String> values) {
            addCriterion("auto_mobile not in", values, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileBetween(String value1, String value2) {
            addCriterion("auto_mobile between", value1, value2, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andAutoMobileNotBetween(String value1, String value2) {
            addCriterion("auto_mobile not between", value1, value2, "autoMobile");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
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