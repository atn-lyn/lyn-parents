package com.lyn.order.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OrderInfoExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdIsNull() {
            addCriterion("specs_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecsIdIsNotNull() {
            addCriterion("specs_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsIdEqualTo(Integer value) {
            addCriterion("specs_id =", value, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdNotEqualTo(Integer value) {
            addCriterion("specs_id <>", value, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdGreaterThan(Integer value) {
            addCriterion("specs_id >", value, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("specs_id >=", value, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdLessThan(Integer value) {
            addCriterion("specs_id <", value, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdLessThanOrEqualTo(Integer value) {
            addCriterion("specs_id <=", value, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdIn(List<Integer> values) {
            addCriterion("specs_id in", values, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdNotIn(List<Integer> values) {
            addCriterion("specs_id not in", values, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdBetween(Integer value1, Integer value2) {
            addCriterion("specs_id between", value1, value2, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("specs_id not between", value1, value2, "specsId");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIsNull() {
            addCriterion("specs_desc is null");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIsNotNull() {
            addCriterion("specs_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsDescEqualTo(String value) {
            addCriterion("specs_desc =", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescNotEqualTo(String value) {
            addCriterion("specs_desc <>", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescGreaterThan(String value) {
            addCriterion("specs_desc >", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescGreaterThanOrEqualTo(String value) {
            addCriterion("specs_desc >=", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescLessThan(String value) {
            addCriterion("specs_desc <", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescLessThanOrEqualTo(String value) {
            addCriterion("specs_desc <=", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescLike(String value) {
            addCriterion("specs_desc like", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescNotLike(String value) {
            addCriterion("specs_desc not like", value, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescIn(List<String> values) {
            addCriterion("specs_desc in", values, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescNotIn(List<String> values) {
            addCriterion("specs_desc not in", values, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescBetween(String value1, String value2) {
            addCriterion("specs_desc between", value1, value2, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSpecsDescNotBetween(String value1, String value2) {
            addCriterion("specs_desc not between", value1, value2, "specsDesc");
            return (Criteria) this;
        }

        public Criteria andSellPriceIsNull() {
            addCriterion("sell_price is null");
            return (Criteria) this;
        }

        public Criteria andSellPriceIsNotNull() {
            addCriterion("sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellPriceEqualTo(BigDecimal value) {
            addCriterion("sell_price =", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotEqualTo(BigDecimal value) {
            addCriterion("sell_price <>", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceGreaterThan(BigDecimal value) {
            addCriterion("sell_price >", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_price >=", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceLessThan(BigDecimal value) {
            addCriterion("sell_price <", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_price <=", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceIn(List<BigDecimal> values) {
            addCriterion("sell_price in", values, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotIn(List<BigDecimal> values) {
            addCriterion("sell_price not in", values, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_price between", value1, value2, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_price not between", value1, value2, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNull() {
            addCriterion("sell_num is null");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNotNull() {
            addCriterion("sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andSellNumEqualTo(Integer value) {
            addCriterion("sell_num =", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotEqualTo(Integer value) {
            addCriterion("sell_num <>", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThan(Integer value) {
            addCriterion("sell_num >", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_num >=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThan(Integer value) {
            addCriterion("sell_num <", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("sell_num <=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumIn(List<Integer> values) {
            addCriterion("sell_num in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotIn(List<Integer> values) {
            addCriterion("sell_num not in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumBetween(Integer value1, Integer value2) {
            addCriterion("sell_num between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_num not between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellAmountIsNull() {
            addCriterion("sell_amount is null");
            return (Criteria) this;
        }

        public Criteria andSellAmountIsNotNull() {
            addCriterion("sell_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSellAmountEqualTo(BigDecimal value) {
            addCriterion("sell_amount =", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountNotEqualTo(BigDecimal value) {
            addCriterion("sell_amount <>", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountGreaterThan(BigDecimal value) {
            addCriterion("sell_amount >", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_amount >=", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountLessThan(BigDecimal value) {
            addCriterion("sell_amount <", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_amount <=", value, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountIn(List<BigDecimal> values) {
            addCriterion("sell_amount in", values, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountNotIn(List<BigDecimal> values) {
            addCriterion("sell_amount not in", values, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_amount between", value1, value2, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andSellAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_amount not between", value1, value2, "sellAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountIsNull() {
            addCriterion("coup_amount is null");
            return (Criteria) this;
        }

        public Criteria andCoupAmountIsNotNull() {
            addCriterion("coup_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCoupAmountEqualTo(BigDecimal value) {
            addCriterion("coup_amount =", value, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountNotEqualTo(BigDecimal value) {
            addCriterion("coup_amount <>", value, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountGreaterThan(BigDecimal value) {
            addCriterion("coup_amount >", value, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coup_amount >=", value, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountLessThan(BigDecimal value) {
            addCriterion("coup_amount <", value, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coup_amount <=", value, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountIn(List<BigDecimal> values) {
            addCriterion("coup_amount in", values, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountNotIn(List<BigDecimal> values) {
            addCriterion("coup_amount not in", values, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coup_amount between", value1, value2, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andCoupAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coup_amount not between", value1, value2, "coupAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNull() {
            addCriterion("logistics_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNotNull() {
            addCriterion("logistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdEqualTo(Long value) {
            addCriterion("logistics_id =", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotEqualTo(Long value) {
            addCriterion("logistics_id <>", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThan(Long value) {
            addCriterion("logistics_id >", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("logistics_id >=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThan(Long value) {
            addCriterion("logistics_id <", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThanOrEqualTo(Long value) {
            addCriterion("logistics_id <=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIn(List<Long> values) {
            addCriterion("logistics_id in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotIn(List<Long> values) {
            addCriterion("logistics_id not in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdBetween(Long value1, Long value2) {
            addCriterion("logistics_id between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotBetween(Long value1, Long value2) {
            addCriterion("logistics_id not between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andShippingNoIsNull() {
            addCriterion("shipping_no is null");
            return (Criteria) this;
        }

        public Criteria andShippingNoIsNotNull() {
            addCriterion("shipping_no is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNoEqualTo(String value) {
            addCriterion("shipping_no =", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoNotEqualTo(String value) {
            addCriterion("shipping_no <>", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoGreaterThan(String value) {
            addCriterion("shipping_no >", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_no >=", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoLessThan(String value) {
            addCriterion("shipping_no <", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoLessThanOrEqualTo(String value) {
            addCriterion("shipping_no <=", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoLike(String value) {
            addCriterion("shipping_no like", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoNotLike(String value) {
            addCriterion("shipping_no not like", value, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoIn(List<String> values) {
            addCriterion("shipping_no in", values, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoNotIn(List<String> values) {
            addCriterion("shipping_no not in", values, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoBetween(String value1, String value2) {
            addCriterion("shipping_no between", value1, value2, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andShippingNoNotBetween(String value1, String value2) {
            addCriterion("shipping_no not between", value1, value2, "shippingNo");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPostFeeEqualTo(Double value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(Double value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(Double value) {
            addCriterion("post_fee >", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThan(Double value) {
            addCriterion("post_fee <", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThanOrEqualTo(Double value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeIn(List<Double> values) {
            addCriterion("post_fee in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotIn(List<Double> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(Double value1, Double value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(Double value1, Double value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIsNull() {
            addCriterion("receiver_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIsNotNull() {
            addCriterion("receiver_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceEqualTo(Integer value) {
            addCriterion("receiver_province =", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotEqualTo(Integer value) {
            addCriterion("receiver_province <>", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceGreaterThan(Integer value) {
            addCriterion("receiver_province >", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_province >=", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLessThan(Integer value) {
            addCriterion("receiver_province <", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_province <=", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIn(List<Integer> values) {
            addCriterion("receiver_province in", values, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotIn(List<Integer> values) {
            addCriterion("receiver_province not in", values, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceBetween(Integer value1, Integer value2) {
            addCriterion("receiver_province between", value1, value2, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_province not between", value1, value2, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityEqualTo(Integer value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotEqualTo(Integer value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThan(Integer value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThan(Integer value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIn(List<Integer> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotIn(List<Integer> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityBetween(Integer value1, Integer value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictIsNull() {
            addCriterion("receiver_district is null");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictIsNotNull() {
            addCriterion("receiver_district is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictEqualTo(Integer value) {
            addCriterion("receiver_district =", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotEqualTo(Integer value) {
            addCriterion("receiver_district <>", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictGreaterThan(Integer value) {
            addCriterion("receiver_district >", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_district >=", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictLessThan(Integer value) {
            addCriterion("receiver_district <", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_district <=", value, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictIn(List<Integer> values) {
            addCriterion("receiver_district in", values, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotIn(List<Integer> values) {
            addCriterion("receiver_district not in", values, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictBetween(Integer value1, Integer value2) {
            addCriterion("receiver_district between", value1, value2, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_district not between", value1, value2, "receiverDistrict");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkIsNull() {
            addCriterion("buyer_remark is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkIsNotNull() {
            addCriterion("buyer_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkEqualTo(String value) {
            addCriterion("buyer_remark =", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotEqualTo(String value) {
            addCriterion("buyer_remark <>", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkGreaterThan(String value) {
            addCriterion("buyer_remark >", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_remark >=", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkLessThan(String value) {
            addCriterion("buyer_remark <", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkLessThanOrEqualTo(String value) {
            addCriterion("buyer_remark <=", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkLike(String value) {
            addCriterion("buyer_remark like", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotLike(String value) {
            addCriterion("buyer_remark not like", value, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkIn(List<String> values) {
            addCriterion("buyer_remark in", values, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotIn(List<String> values) {
            addCriterion("buyer_remark not in", values, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkBetween(String value1, String value2) {
            addCriterion("buyer_remark between", value1, value2, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerRemarkNotBetween(String value1, String value2) {
            addCriterion("buyer_remark not between", value1, value2, "buyerRemark");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNull() {
            addCriterion("follower is null");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNotNull() {
            addCriterion("follower is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerEqualTo(String value) {
            addCriterion("follower =", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotEqualTo(String value) {
            addCriterion("follower <>", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThan(String value) {
            addCriterion("follower >", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThanOrEqualTo(String value) {
            addCriterion("follower >=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThan(String value) {
            addCriterion("follower <", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThanOrEqualTo(String value) {
            addCriterion("follower <=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLike(String value) {
            addCriterion("follower like", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotLike(String value) {
            addCriterion("follower not like", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerIn(List<String> values) {
            addCriterion("follower in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotIn(List<String> values) {
            addCriterion("follower not in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerBetween(String value1, String value2) {
            addCriterion("follower between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotBetween(String value1, String value2) {
            addCriterion("follower not between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsPostIsNull() {
            addCriterion("is_post is null");
            return (Criteria) this;
        }

        public Criteria andIsPostIsNotNull() {
            addCriterion("is_post is not null");
            return (Criteria) this;
        }

        public Criteria andIsPostEqualTo(Integer value) {
            addCriterion("is_post =", value, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostNotEqualTo(Integer value) {
            addCriterion("is_post <>", value, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostGreaterThan(Integer value) {
            addCriterion("is_post >", value, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_post >=", value, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostLessThan(Integer value) {
            addCriterion("is_post <", value, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostLessThanOrEqualTo(Integer value) {
            addCriterion("is_post <=", value, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostIn(List<Integer> values) {
            addCriterion("is_post in", values, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostNotIn(List<Integer> values) {
            addCriterion("is_post not in", values, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostBetween(Integer value1, Integer value2) {
            addCriterion("is_post between", value1, value2, "isPost");
            return (Criteria) this;
        }

        public Criteria andIsPostNotBetween(Integer value1, Integer value2) {
            addCriterion("is_post not between", value1, value2, "isPost");
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
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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