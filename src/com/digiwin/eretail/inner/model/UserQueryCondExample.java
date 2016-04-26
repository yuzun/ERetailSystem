package com.digiwin.eretail.inner.model;

import java.util.ArrayList;
import java.util.List;

public class UserQueryCondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserQueryCondExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNull() {
            addCriterion("ticketId is null");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNotNull() {
            addCriterion("ticketId is not null");
            return (Criteria) this;
        }

        public Criteria andTicketidEqualTo(String value) {
            addCriterion("ticketId =", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotEqualTo(String value) {
            addCriterion("ticketId <>", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThan(String value) {
            addCriterion("ticketId >", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThanOrEqualTo(String value) {
            addCriterion("ticketId >=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThan(String value) {
            addCriterion("ticketId <", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThanOrEqualTo(String value) {
            addCriterion("ticketId <=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLike(String value) {
            addCriterion("ticketId like", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotLike(String value) {
            addCriterion("ticketId not like", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidIn(List<String> values) {
            addCriterion("ticketId in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotIn(List<String> values) {
            addCriterion("ticketId not in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidBetween(String value1, String value2) {
            addCriterion("ticketId between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotBetween(String value1, String value2) {
            addCriterion("ticketId not between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andSerialIsNull() {
            addCriterion("serial is null");
            return (Criteria) this;
        }

        public Criteria andSerialIsNotNull() {
            addCriterion("serial is not null");
            return (Criteria) this;
        }

        public Criteria andSerialEqualTo(Integer value) {
            addCriterion("serial =", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotEqualTo(Integer value) {
            addCriterion("serial <>", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialGreaterThan(Integer value) {
            addCriterion("serial >", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial >=", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLessThan(Integer value) {
            addCriterion("serial <", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLessThanOrEqualTo(Integer value) {
            addCriterion("serial <=", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialIn(List<Integer> values) {
            addCriterion("serial in", values, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotIn(List<Integer> values) {
            addCriterion("serial not in", values, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialBetween(Integer value1, Integer value2) {
            addCriterion("serial between", value1, value2, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("serial not between", value1, value2, "serial");
            return (Criteria) this;
        }

        public Criteria andQuerynameIsNull() {
            addCriterion("queryName is null");
            return (Criteria) this;
        }

        public Criteria andQuerynameIsNotNull() {
            addCriterion("queryName is not null");
            return (Criteria) this;
        }

        public Criteria andQuerynameEqualTo(String value) {
            addCriterion("queryName =", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameNotEqualTo(String value) {
            addCriterion("queryName <>", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameGreaterThan(String value) {
            addCriterion("queryName >", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameGreaterThanOrEqualTo(String value) {
            addCriterion("queryName >=", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameLessThan(String value) {
            addCriterion("queryName <", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameLessThanOrEqualTo(String value) {
            addCriterion("queryName <=", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameLike(String value) {
            addCriterion("queryName like", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameNotLike(String value) {
            addCriterion("queryName not like", value, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameIn(List<String> values) {
            addCriterion("queryName in", values, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameNotIn(List<String> values) {
            addCriterion("queryName not in", values, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameBetween(String value1, String value2) {
            addCriterion("queryName between", value1, value2, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerynameNotBetween(String value1, String value2) {
            addCriterion("queryName not between", value1, value2, "queryname");
            return (Criteria) this;
        }

        public Criteria andQuerycondIsNull() {
            addCriterion("queryCond is null");
            return (Criteria) this;
        }

        public Criteria andQuerycondIsNotNull() {
            addCriterion("queryCond is not null");
            return (Criteria) this;
        }

        public Criteria andQuerycondEqualTo(String value) {
            addCriterion("queryCond =", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondNotEqualTo(String value) {
            addCriterion("queryCond <>", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondGreaterThan(String value) {
            addCriterion("queryCond >", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondGreaterThanOrEqualTo(String value) {
            addCriterion("queryCond >=", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondLessThan(String value) {
            addCriterion("queryCond <", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondLessThanOrEqualTo(String value) {
            addCriterion("queryCond <=", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondLike(String value) {
            addCriterion("queryCond like", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondNotLike(String value) {
            addCriterion("queryCond not like", value, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondIn(List<String> values) {
            addCriterion("queryCond in", values, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondNotIn(List<String> values) {
            addCriterion("queryCond not in", values, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondBetween(String value1, String value2) {
            addCriterion("queryCond between", value1, value2, "querycond");
            return (Criteria) this;
        }

        public Criteria andQuerycondNotBetween(String value1, String value2) {
            addCriterion("queryCond not between", value1, value2, "querycond");
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