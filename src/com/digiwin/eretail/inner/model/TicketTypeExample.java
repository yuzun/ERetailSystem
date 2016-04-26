package com.digiwin.eretail.inner.model;

import java.util.ArrayList;
import java.util.List;

public class TicketTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketTypeExample() {
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

        public Criteria andTickettypeidIsNull() {
            addCriterion("ticketTypeID is null");
            return (Criteria) this;
        }

        public Criteria andTickettypeidIsNotNull() {
            addCriterion("ticketTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andTickettypeidEqualTo(String value) {
            addCriterion("ticketTypeID =", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidNotEqualTo(String value) {
            addCriterion("ticketTypeID <>", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidGreaterThan(String value) {
            addCriterion("ticketTypeID >", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ticketTypeID >=", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidLessThan(String value) {
            addCriterion("ticketTypeID <", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidLessThanOrEqualTo(String value) {
            addCriterion("ticketTypeID <=", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidLike(String value) {
            addCriterion("ticketTypeID like", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidNotLike(String value) {
            addCriterion("ticketTypeID not like", value, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidIn(List<String> values) {
            addCriterion("ticketTypeID in", values, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidNotIn(List<String> values) {
            addCriterion("ticketTypeID not in", values, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidBetween(String value1, String value2) {
            addCriterion("ticketTypeID between", value1, value2, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypeidNotBetween(String value1, String value2) {
            addCriterion("ticketTypeID not between", value1, value2, "tickettypeid");
            return (Criteria) this;
        }

        public Criteria andTickettypenameIsNull() {
            addCriterion("ticketTypeName is null");
            return (Criteria) this;
        }

        public Criteria andTickettypenameIsNotNull() {
            addCriterion("ticketTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andTickettypenameEqualTo(String value) {
            addCriterion("ticketTypeName =", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameNotEqualTo(String value) {
            addCriterion("ticketTypeName <>", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameGreaterThan(String value) {
            addCriterion("ticketTypeName >", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ticketTypeName >=", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameLessThan(String value) {
            addCriterion("ticketTypeName <", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameLessThanOrEqualTo(String value) {
            addCriterion("ticketTypeName <=", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameLike(String value) {
            addCriterion("ticketTypeName like", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameNotLike(String value) {
            addCriterion("ticketTypeName not like", value, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameIn(List<String> values) {
            addCriterion("ticketTypeName in", values, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameNotIn(List<String> values) {
            addCriterion("ticketTypeName not in", values, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameBetween(String value1, String value2) {
            addCriterion("ticketTypeName between", value1, value2, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andTickettypenameNotBetween(String value1, String value2) {
            addCriterion("ticketTypeName not between", value1, value2, "tickettypename");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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