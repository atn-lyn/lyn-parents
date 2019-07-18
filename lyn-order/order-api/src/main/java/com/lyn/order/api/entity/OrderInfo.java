package com.lyn.order.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable {
    /**
     * 订单id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * 商铺id
     *
     * @mbg.generated
     */
    private Integer storeId;

    /**
     * 采购人id
     *
     * @mbg.generated
     */
    private Long customerId;

    /**
     * 商品id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     * 规格ID
     *
     * @mbg.generated
     */
    private Integer specsId;

    /**
     * 规格描述
     *
     * @mbg.generated
     */
    private String specsDesc;

    /**
     * 单价
     *
     * @mbg.generated
     */
    private BigDecimal sellPrice;

    /**
     * 销售数量
     *
     * @mbg.generated
     */
    private Integer sellNum;

    /**
     * 销售总金额
     *
     * @mbg.generated
     */
    private BigDecimal sellAmount;

    /**
     * 总优惠金额
     *
     * @mbg.generated
     */
    private BigDecimal coupAmount;

    /**
     * 订单状态：1待付款-2待发货-3待收货-4已完成-5已关闭
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 物流id
     *
     * @mbg.generated
     */
    private Long logisticsId;

    /**
     * 物流单号
     *
     * @mbg.generated
     */
    private String shippingNo;

    /**
     * 邮费
     *
     * @mbg.generated
     */
    private Double postFee;

    /**
     * 省份
     *
     * @mbg.generated
     */
    private Integer receiverProvince;

    /**
     * 城市
     *
     * @mbg.generated
     */
    private Integer receiverCity;

    /**
     * 区/县
     *
     * @mbg.generated
     */
    private Integer receiverDistrict;

    /**
     * 收货人名称
     *
     * @mbg.generated
     */
    private String receiverName;

    /**
     * 收货人电话
     *
     * @mbg.generated
     */
    private String receiverMobile;

    /**
     * 收货地址
     *
     * @mbg.generated
     */
    private String receiverAddress;

    /**
     * 买家备注
     *
     * @mbg.generated
     */
    private String buyerRemark;

    /**
     * 发货时间
     *
     * @mbg.generated
     */
    private Date sendTime;

    /**
     * 发货人
     *
     * @mbg.generated
     */
    private String senderName;

    /**
     * 跟进人
     *
     * @mbg.generated
     */
    private String follower;

    /**
     * 支付方式 1-微信，2-支付宝
     *
     * @mbg.generated
     */
    private Integer payMethod;

    /**
     * 第三方交易流水号
     *
     * @mbg.generated
     */
    private String tradeNo;

    /**
     * 是否删除：1-否，2-是
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * 是否包邮：1-否，2-是
     *
     * @mbg.generated
     */
    private Integer isPost;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 交易完成时间
     *
     * @mbg.generated
     */
    private Date endTime;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSpecsId() {
        return specsId;
    }

    public void setSpecsId(Integer specsId) {
        this.specsId = specsId;
    }

    public String getSpecsDesc() {
        return specsDesc;
    }

    public void setSpecsDesc(String specsDesc) {
        this.specsDesc = specsDesc;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    public BigDecimal getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(BigDecimal sellAmount) {
        this.sellAmount = sellAmount;
    }

    public BigDecimal getCoupAmount() {
        return coupAmount;
    }

    public void setCoupAmount(BigDecimal coupAmount) {
        this.coupAmount = coupAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getShippingNo() {
        return shippingNo;
    }

    public void setShippingNo(String shippingNo) {
        this.shippingNo = shippingNo;
    }

    public Double getPostFee() {
        return postFee;
    }

    public void setPostFee(Double postFee) {
        this.postFee = postFee;
    }

    public Integer getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(Integer receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public Integer getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(Integer receiverCity) {
        this.receiverCity = receiverCity;
    }

    public Integer getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(Integer receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsPost() {
        return isPost;
    }

    public void setIsPost(Integer isPost) {
        this.isPost = isPost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", storeId=").append(storeId);
        sb.append(", customerId=").append(customerId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", specsId=").append(specsId);
        sb.append(", specsDesc=").append(specsDesc);
        sb.append(", sellPrice=").append(sellPrice);
        sb.append(", sellNum=").append(sellNum);
        sb.append(", sellAmount=").append(sellAmount);
        sb.append(", coupAmount=").append(coupAmount);
        sb.append(", status=").append(status);
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", shippingNo=").append(shippingNo);
        sb.append(", postFee=").append(postFee);
        sb.append(", receiverProvince=").append(receiverProvince);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverDistrict=").append(receiverDistrict);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverMobile=").append(receiverMobile);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", buyerRemark=").append(buyerRemark);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", senderName=").append(senderName);
        sb.append(", follower=").append(follower);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isPost=").append(isPost);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderInfo other = (OrderInfo) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSpecsId() == null ? other.getSpecsId() == null : this.getSpecsId().equals(other.getSpecsId()))
            && (this.getSpecsDesc() == null ? other.getSpecsDesc() == null : this.getSpecsDesc().equals(other.getSpecsDesc()))
            && (this.getSellPrice() == null ? other.getSellPrice() == null : this.getSellPrice().equals(other.getSellPrice()))
            && (this.getSellNum() == null ? other.getSellNum() == null : this.getSellNum().equals(other.getSellNum()))
            && (this.getSellAmount() == null ? other.getSellAmount() == null : this.getSellAmount().equals(other.getSellAmount()))
            && (this.getCoupAmount() == null ? other.getCoupAmount() == null : this.getCoupAmount().equals(other.getCoupAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLogisticsId() == null ? other.getLogisticsId() == null : this.getLogisticsId().equals(other.getLogisticsId()))
            && (this.getShippingNo() == null ? other.getShippingNo() == null : this.getShippingNo().equals(other.getShippingNo()))
            && (this.getPostFee() == null ? other.getPostFee() == null : this.getPostFee().equals(other.getPostFee()))
            && (this.getReceiverProvince() == null ? other.getReceiverProvince() == null : this.getReceiverProvince().equals(other.getReceiverProvince()))
            && (this.getReceiverCity() == null ? other.getReceiverCity() == null : this.getReceiverCity().equals(other.getReceiverCity()))
            && (this.getReceiverDistrict() == null ? other.getReceiverDistrict() == null : this.getReceiverDistrict().equals(other.getReceiverDistrict()))
            && (this.getReceiverName() == null ? other.getReceiverName() == null : this.getReceiverName().equals(other.getReceiverName()))
            && (this.getReceiverMobile() == null ? other.getReceiverMobile() == null : this.getReceiverMobile().equals(other.getReceiverMobile()))
            && (this.getReceiverAddress() == null ? other.getReceiverAddress() == null : this.getReceiverAddress().equals(other.getReceiverAddress()))
            && (this.getBuyerRemark() == null ? other.getBuyerRemark() == null : this.getBuyerRemark().equals(other.getBuyerRemark()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getSenderName() == null ? other.getSenderName() == null : this.getSenderName().equals(other.getSenderName()))
            && (this.getFollower() == null ? other.getFollower() == null : this.getFollower().equals(other.getFollower()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getIsPost() == null ? other.getIsPost() == null : this.getIsPost().equals(other.getIsPost()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSpecsId() == null) ? 0 : getSpecsId().hashCode());
        result = prime * result + ((getSpecsDesc() == null) ? 0 : getSpecsDesc().hashCode());
        result = prime * result + ((getSellPrice() == null) ? 0 : getSellPrice().hashCode());
        result = prime * result + ((getSellNum() == null) ? 0 : getSellNum().hashCode());
        result = prime * result + ((getSellAmount() == null) ? 0 : getSellAmount().hashCode());
        result = prime * result + ((getCoupAmount() == null) ? 0 : getCoupAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLogisticsId() == null) ? 0 : getLogisticsId().hashCode());
        result = prime * result + ((getShippingNo() == null) ? 0 : getShippingNo().hashCode());
        result = prime * result + ((getPostFee() == null) ? 0 : getPostFee().hashCode());
        result = prime * result + ((getReceiverProvince() == null) ? 0 : getReceiverProvince().hashCode());
        result = prime * result + ((getReceiverCity() == null) ? 0 : getReceiverCity().hashCode());
        result = prime * result + ((getReceiverDistrict() == null) ? 0 : getReceiverDistrict().hashCode());
        result = prime * result + ((getReceiverName() == null) ? 0 : getReceiverName().hashCode());
        result = prime * result + ((getReceiverMobile() == null) ? 0 : getReceiverMobile().hashCode());
        result = prime * result + ((getReceiverAddress() == null) ? 0 : getReceiverAddress().hashCode());
        result = prime * result + ((getBuyerRemark() == null) ? 0 : getBuyerRemark().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getSenderName() == null) ? 0 : getSenderName().hashCode());
        result = prime * result + ((getFollower() == null) ? 0 : getFollower().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getIsPost() == null) ? 0 : getIsPost().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }
}