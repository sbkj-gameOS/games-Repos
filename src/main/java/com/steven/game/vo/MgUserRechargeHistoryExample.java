package com.steven.game.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MgUserRechargeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgUserRechargeHistoryExample() {
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

        public Criteria andChargeTimeIsNull() {
            addCriterion("charge_time is null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNotNull() {
            addCriterion("charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeEqualTo(String value) {
            addCriterion("charge_time =", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotEqualTo(String value) {
            addCriterion("charge_time <>", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThan(String value) {
            addCriterion("charge_time >", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_time >=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThan(String value) {
            addCriterion("charge_time <", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThanOrEqualTo(String value) {
            addCriterion("charge_time <=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLike(String value) {
            addCriterion("charge_time like", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotLike(String value) {
            addCriterion("charge_time not like", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIn(List<String> values) {
            addCriterion("charge_time in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotIn(List<String> values) {
            addCriterion("charge_time not in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeBetween(String value1, String value2) {
            addCriterion("charge_time between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotBetween(String value1, String value2) {
            addCriterion("charge_time not between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumIsNull() {
            addCriterion("room_card_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumIsNotNull() {
            addCriterion("room_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumEqualTo(Integer value) {
            addCriterion("room_card_num =", value, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumNotEqualTo(Integer value) {
            addCriterion("room_card_num <>", value, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumGreaterThan(Integer value) {
            addCriterion("room_card_num >", value, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_card_num >=", value, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumLessThan(Integer value) {
            addCriterion("room_card_num <", value, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_card_num <=", value, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumIn(List<Integer> values) {
            addCriterion("room_card_num in", values, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumNotIn(List<Integer> values) {
            addCriterion("room_card_num not in", values, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumBetween(Integer value1, Integer value2) {
            addCriterion("room_card_num between", value1, value2, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andRoomCardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_card_num not between", value1, value2, "roomCardNum");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(BigDecimal value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andPreferAmountIsNull() {
            addCriterion("prefer_amount is null");
            return (Criteria) this;
        }

        public Criteria andPreferAmountIsNotNull() {
            addCriterion("prefer_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPreferAmountEqualTo(BigDecimal value) {
            addCriterion("prefer_amount =", value, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountNotEqualTo(BigDecimal value) {
            addCriterion("prefer_amount <>", value, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountGreaterThan(BigDecimal value) {
            addCriterion("prefer_amount >", value, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prefer_amount >=", value, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountLessThan(BigDecimal value) {
            addCriterion("prefer_amount <", value, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prefer_amount <=", value, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountIn(List<BigDecimal> values) {
            addCriterion("prefer_amount in", values, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountNotIn(List<BigDecimal> values) {
            addCriterion("prefer_amount not in", values, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prefer_amount between", value1, value2, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPreferAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prefer_amount not between", value1, value2, "preferAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountIsNull() {
            addCriterion("dir_home_amount is null");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountIsNotNull() {
            addCriterion("dir_home_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountEqualTo(BigDecimal value) {
            addCriterion("dir_home_amount =", value, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountNotEqualTo(BigDecimal value) {
            addCriterion("dir_home_amount <>", value, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountGreaterThan(BigDecimal value) {
            addCriterion("dir_home_amount >", value, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dir_home_amount >=", value, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountLessThan(BigDecimal value) {
            addCriterion("dir_home_amount <", value, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dir_home_amount <=", value, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountIn(List<BigDecimal> values) {
            addCriterion("dir_home_amount in", values, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountNotIn(List<BigDecimal> values) {
            addCriterion("dir_home_amount not in", values, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dir_home_amount between", value1, value2, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andDirHomeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dir_home_amount not between", value1, value2, "dirHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountIsNull() {
            addCriterion("ind_home_amount is null");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountIsNotNull() {
            addCriterion("ind_home_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountEqualTo(BigDecimal value) {
            addCriterion("ind_home_amount =", value, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountNotEqualTo(BigDecimal value) {
            addCriterion("ind_home_amount <>", value, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountGreaterThan(BigDecimal value) {
            addCriterion("ind_home_amount >", value, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ind_home_amount >=", value, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountLessThan(BigDecimal value) {
            addCriterion("ind_home_amount <", value, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ind_home_amount <=", value, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountIn(List<BigDecimal> values) {
            addCriterion("ind_home_amount in", values, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountNotIn(List<BigDecimal> values) {
            addCriterion("ind_home_amount not in", values, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ind_home_amount between", value1, value2, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andIndHomeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ind_home_amount not between", value1, value2, "indHomeAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
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