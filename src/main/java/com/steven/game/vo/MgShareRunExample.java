package com.steven.game.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MgShareRunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgShareRunExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIsNull() {
            addCriterion("user_openid is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIsNotNull() {
            addCriterion("user_openid is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidEqualTo(String value) {
            addCriterion("user_openid =", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotEqualTo(String value) {
            addCriterion("user_openid <>", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThan(String value) {
            addCriterion("user_openid >", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("user_openid >=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThan(String value) {
            addCriterion("user_openid <", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThanOrEqualTo(String value) {
            addCriterion("user_openid <=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLike(String value) {
            addCriterion("user_openid like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotLike(String value) {
            addCriterion("user_openid not like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIn(List<String> values) {
            addCriterion("user_openid in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotIn(List<String> values) {
            addCriterion("user_openid not in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidBetween(String value1, String value2) {
            addCriterion("user_openid between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotBetween(String value1, String value2) {
            addCriterion("user_openid not between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountIsNull() {
            addCriterion("share_run_amount is null");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountIsNotNull() {
            addCriterion("share_run_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountEqualTo(BigDecimal value) {
            addCriterion("share_run_amount =", value, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountNotEqualTo(BigDecimal value) {
            addCriterion("share_run_amount <>", value, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountGreaterThan(BigDecimal value) {
            addCriterion("share_run_amount >", value, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_run_amount >=", value, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountLessThan(BigDecimal value) {
            addCriterion("share_run_amount <", value, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_run_amount <=", value, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountIn(List<BigDecimal> values) {
            addCriterion("share_run_amount in", values, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountNotIn(List<BigDecimal> values) {
            addCriterion("share_run_amount not in", values, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_run_amount between", value1, value2, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andShareRunAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_run_amount not between", value1, value2, "shareRunAmount");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsIsNull() {
            addCriterion("source_accounts is null");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsIsNotNull() {
            addCriterion("source_accounts is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsEqualTo(String value) {
            addCriterion("source_accounts =", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsNotEqualTo(String value) {
            addCriterion("source_accounts <>", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsGreaterThan(String value) {
            addCriterion("source_accounts >", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsGreaterThanOrEqualTo(String value) {
            addCriterion("source_accounts >=", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsLessThan(String value) {
            addCriterion("source_accounts <", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsLessThanOrEqualTo(String value) {
            addCriterion("source_accounts <=", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsLike(String value) {
            addCriterion("source_accounts like", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsNotLike(String value) {
            addCriterion("source_accounts not like", value, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsIn(List<String> values) {
            addCriterion("source_accounts in", values, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsNotIn(List<String> values) {
            addCriterion("source_accounts not in", values, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsBetween(String value1, String value2) {
            addCriterion("source_accounts between", value1, value2, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andSourceAccountsNotBetween(String value1, String value2) {
            addCriterion("source_accounts not between", value1, value2, "sourceAccounts");
            return (Criteria) this;
        }

        public Criteria andGainTimeIsNull() {
            addCriterion("gain_time is null");
            return (Criteria) this;
        }

        public Criteria andGainTimeIsNotNull() {
            addCriterion("gain_time is not null");
            return (Criteria) this;
        }

        public Criteria andGainTimeEqualTo(String value) {
            addCriterion("gain_time =", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeNotEqualTo(String value) {
            addCriterion("gain_time <>", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeGreaterThan(String value) {
            addCriterion("gain_time >", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeGreaterThanOrEqualTo(String value) {
            addCriterion("gain_time >=", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeLessThan(String value) {
            addCriterion("gain_time <", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeLessThanOrEqualTo(String value) {
            addCriterion("gain_time <=", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeLike(String value) {
            addCriterion("gain_time like", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeNotLike(String value) {
            addCriterion("gain_time not like", value, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeIn(List<String> values) {
            addCriterion("gain_time in", values, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeNotIn(List<String> values) {
            addCriterion("gain_time not in", values, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeBetween(String value1, String value2) {
            addCriterion("gain_time between", value1, value2, "gainTime");
            return (Criteria) this;
        }

        public Criteria andGainTimeNotBetween(String value1, String value2) {
            addCriterion("gain_time not between", value1, value2, "gainTime");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNull() {
            addCriterion("cash_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNotNull() {
            addCriterion("cash_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashAmountEqualTo(BigDecimal value) {
            addCriterion("cash_amount =", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotEqualTo(BigDecimal value) {
            addCriterion("cash_amount <>", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThan(BigDecimal value) {
            addCriterion("cash_amount >", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_amount >=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThan(BigDecimal value) {
            addCriterion("cash_amount <", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_amount <=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIn(List<BigDecimal> values) {
            addCriterion("cash_amount in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotIn(List<BigDecimal> values) {
            addCriterion("cash_amount not in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_amount between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_amount not between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashTimeIsNull() {
            addCriterion("cash_time is null");
            return (Criteria) this;
        }

        public Criteria andCashTimeIsNotNull() {
            addCriterion("cash_time is not null");
            return (Criteria) this;
        }

        public Criteria andCashTimeEqualTo(String value) {
            addCriterion("cash_time =", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotEqualTo(String value) {
            addCriterion("cash_time <>", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeGreaterThan(String value) {
            addCriterion("cash_time >", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cash_time >=", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLessThan(String value) {
            addCriterion("cash_time <", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLessThanOrEqualTo(String value) {
            addCriterion("cash_time <=", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLike(String value) {
            addCriterion("cash_time like", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotLike(String value) {
            addCriterion("cash_time not like", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeIn(List<String> values) {
            addCriterion("cash_time in", values, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotIn(List<String> values) {
            addCriterion("cash_time not in", values, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeBetween(String value1, String value2) {
            addCriterion("cash_time between", value1, value2, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotBetween(String value1, String value2) {
            addCriterion("cash_time not between", value1, value2, "cashTime");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusIsNull() {
            addCriterion("share_run_surplus is null");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusIsNotNull() {
            addCriterion("share_run_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusEqualTo(BigDecimal value) {
            addCriterion("share_run_surplus =", value, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusNotEqualTo(BigDecimal value) {
            addCriterion("share_run_surplus <>", value, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusGreaterThan(BigDecimal value) {
            addCriterion("share_run_surplus >", value, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_run_surplus >=", value, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusLessThan(BigDecimal value) {
            addCriterion("share_run_surplus <", value, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_run_surplus <=", value, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusIn(List<BigDecimal> values) {
            addCriterion("share_run_surplus in", values, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusNotIn(List<BigDecimal> values) {
            addCriterion("share_run_surplus not in", values, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_run_surplus between", value1, value2, "shareRunSurplus");
            return (Criteria) this;
        }

        public Criteria andShareRunSurplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_run_surplus not between", value1, value2, "shareRunSurplus");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(String value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(String value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(String value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(String value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLike(String value) {
            addCriterion("last_update_time like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotLike(String value) {
            addCriterion("last_update_time not like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<String> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<String> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(String value1, String value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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