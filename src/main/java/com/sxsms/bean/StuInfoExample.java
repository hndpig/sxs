package com.sxsms.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuInfoExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNull() {
            addCriterion("s_age is null");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNotNull() {
            addCriterion("s_age is not null");
            return (Criteria) this;
        }

        public Criteria andSAgeEqualTo(Integer value) {
            addCriterion("s_age =", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotEqualTo(Integer value) {
            addCriterion("s_age <>", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThan(Integer value) {
            addCriterion("s_age >", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_age >=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThan(Integer value) {
            addCriterion("s_age <", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThanOrEqualTo(Integer value) {
            addCriterion("s_age <=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeIn(List<Integer> values) {
            addCriterion("s_age in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotIn(List<Integer> values) {
            addCriterion("s_age not in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeBetween(Integer value1, Integer value2) {
            addCriterion("s_age between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_age not between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSSchoolIsNull() {
            addCriterion("s_school is null");
            return (Criteria) this;
        }

        public Criteria andSSchoolIsNotNull() {
            addCriterion("s_school is not null");
            return (Criteria) this;
        }

        public Criteria andSSchoolEqualTo(String value) {
            addCriterion("s_school =", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotEqualTo(String value) {
            addCriterion("s_school <>", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolGreaterThan(String value) {
            addCriterion("s_school >", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("s_school >=", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLessThan(String value) {
            addCriterion("s_school <", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLessThanOrEqualTo(String value) {
            addCriterion("s_school <=", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLike(String value) {
            addCriterion("s_school like", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotLike(String value) {
            addCriterion("s_school not like", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolIn(List<String> values) {
            addCriterion("s_school in", values, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotIn(List<String> values) {
            addCriterion("s_school not in", values, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolBetween(String value1, String value2) {
            addCriterion("s_school between", value1, value2, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotBetween(String value1, String value2) {
            addCriterion("s_school not between", value1, value2, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNull() {
            addCriterion("s_number is null");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNotNull() {
            addCriterion("s_number is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberEqualTo(String value) {
            addCriterion("s_number =", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotEqualTo(String value) {
            addCriterion("s_number <>", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThan(String value) {
            addCriterion("s_number >", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThanOrEqualTo(String value) {
            addCriterion("s_number >=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThan(String value) {
            addCriterion("s_number <", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThanOrEqualTo(String value) {
            addCriterion("s_number <=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLike(String value) {
            addCriterion("s_number like", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotLike(String value) {
            addCriterion("s_number not like", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIn(List<String> values) {
            addCriterion("s_number in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotIn(List<String> values) {
            addCriterion("s_number not in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberBetween(String value1, String value2) {
            addCriterion("s_number between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotBetween(String value1, String value2) {
            addCriterion("s_number not between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNull() {
            addCriterion("s_phone is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("s_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("s_phone =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("s_phone <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("s_phone >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_phone >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("s_phone <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_phone <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("s_phone like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("s_phone not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("s_phone in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("s_phone not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("s_phone between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("s_phone not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNull() {
            addCriterion("s_status is null");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNotNull() {
            addCriterion("s_status is not null");
            return (Criteria) this;
        }

        public Criteria andSStatusEqualTo(Integer value) {
            addCriterion("s_status =", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotEqualTo(Integer value) {
            addCriterion("s_status <>", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThan(Integer value) {
            addCriterion("s_status >", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_status >=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThan(Integer value) {
            addCriterion("s_status <", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThanOrEqualTo(Integer value) {
            addCriterion("s_status <=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusIn(List<Integer> values) {
            addCriterion("s_status in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotIn(List<Integer> values) {
            addCriterion("s_status not in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusBetween(Integer value1, Integer value2) {
            addCriterion("s_status between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("s_status not between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeIsNull() {
            addCriterion("s_entryTime is null");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeIsNotNull() {
            addCriterion("s_entryTime is not null");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeEqualTo(Date value) {
            addCriterion("s_entryTime =", value, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeNotEqualTo(Date value) {
            addCriterion("s_entryTime <>", value, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeGreaterThan(Date value) {
            addCriterion("s_entryTime >", value, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_entryTime >=", value, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeLessThan(Date value) {
            addCriterion("s_entryTime <", value, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeLessThanOrEqualTo(Date value) {
            addCriterion("s_entryTime <=", value, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeIn(List<Date> values) {
            addCriterion("s_entryTime in", values, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeNotIn(List<Date> values) {
            addCriterion("s_entryTime not in", values, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeBetween(Date value1, Date value2) {
            addCriterion("s_entryTime between", value1, value2, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSEntrytimeNotBetween(Date value1, Date value2) {
            addCriterion("s_entryTime not between", value1, value2, "sEntrytime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeIsNull() {
            addCriterion("s_workingTime is null");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeIsNotNull() {
            addCriterion("s_workingTime is not null");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeEqualTo(String value) {
            addCriterion("s_workingTime =", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeNotEqualTo(String value) {
            addCriterion("s_workingTime <>", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeGreaterThan(String value) {
            addCriterion("s_workingTime >", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_workingTime >=", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeLessThan(String value) {
            addCriterion("s_workingTime <", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeLessThanOrEqualTo(String value) {
            addCriterion("s_workingTime <=", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeLike(String value) {
            addCriterion("s_workingTime like", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeNotLike(String value) {
            addCriterion("s_workingTime not like", value, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeIn(List<String> values) {
            addCriterion("s_workingTime in", values, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeNotIn(List<String> values) {
            addCriterion("s_workingTime not in", values, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeBetween(String value1, String value2) {
            addCriterion("s_workingTime between", value1, value2, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSWorkingtimeNotBetween(String value1, String value2) {
            addCriterion("s_workingTime not between", value1, value2, "sWorkingtime");
            return (Criteria) this;
        }

        public Criteria andSGroupIsNull() {
            addCriterion("s_group is null");
            return (Criteria) this;
        }

        public Criteria andSGroupIsNotNull() {
            addCriterion("s_group is not null");
            return (Criteria) this;
        }

        public Criteria andSGroupEqualTo(String value) {
            addCriterion("s_group =", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupNotEqualTo(String value) {
            addCriterion("s_group <>", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupGreaterThan(String value) {
            addCriterion("s_group >", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupGreaterThanOrEqualTo(String value) {
            addCriterion("s_group >=", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupLessThan(String value) {
            addCriterion("s_group <", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupLessThanOrEqualTo(String value) {
            addCriterion("s_group <=", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupLike(String value) {
            addCriterion("s_group like", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupNotLike(String value) {
            addCriterion("s_group not like", value, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupIn(List<String> values) {
            addCriterion("s_group in", values, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupNotIn(List<String> values) {
            addCriterion("s_group not in", values, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupBetween(String value1, String value2) {
            addCriterion("s_group between", value1, value2, "sGroup");
            return (Criteria) this;
        }

        public Criteria andSGroupNotBetween(String value1, String value2) {
            addCriterion("s_group not between", value1, value2, "sGroup");
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