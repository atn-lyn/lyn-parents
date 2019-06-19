package com.lyn.order.api.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {
    /**
     * 订单id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * 订单状态：1待付款-2待发货-3待收货-4已完成-5已失效-6已取消
     *
     * @mbg.generated
     */
    private Integer orderStatus;

    /**
     * 采购人id
     *
     * @mbg.generated
     */
    private Long customerId;

    /**
     * 总优惠金额
     *
     * @mbg.generated
     */
    private Double totalDiscount;

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
     * 买家备注
     *
     * @mbg.generated
     */
    private String buyerRemark;

    /**
     * 商品数量
     *
     * @mbg.generated
     */
    private Integer productNum;

    /**
     * 订单金额
     *
     * @mbg.generated
     */
    private Double orderAmount;

    /**
     * 实付金额
     *
     * @mbg.generated
     */
    private Double payAmount;

    /**
     * 付款时间
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     * 交易完成时间
     *
     * @mbg.generated
     */
    private Date endTime;

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
     * 省份
     *
     * @mbg.generated
     */
    private Integer province;

    /**
     * 城市
     *
     * @mbg.generated
     */
    private Integer city;

    /**
     * 区/县
     *
     * @mbg.generated
     */
    private Integer district;

    /**
     * 收货地址
     *
     * @mbg.generated
     */
    private String receiverAddress;

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
    private String sendName;

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

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
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

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", customerId=").append(customerId);
        sb.append(", totalDiscount=").append(totalDiscount);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverMobile=").append(receiverMobile);
        sb.append(", buyerRemark=").append(buyerRemark);
        sb.append(", productNum=").append(productNum);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", shippingNo=").append(shippingNo);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", sendName=").append(sendName);
        sb.append(", follower=").append(follower);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isPost=").append(isPost);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
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
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getTotalDiscount() == null ? other.getTotalDiscount() == null : this.getTotalDiscount().equals(other.getTotalDiscount()))
            && (this.getReceiverName() == null ? other.getReceiverName() == null : this.getReceiverName().equals(other.getReceiverName()))
            && (this.getReceiverMobile() == null ? other.getReceiverMobile() == null : this.getReceiverMobile().equals(other.getReceiverMobile()))
            && (this.getBuyerRemark() == null ? other.getBuyerRemark() == null : this.getBuyerRemark().equals(other.getBuyerRemark()))
            && (this.getProductNum() == null ? other.getProductNum() == null : this.getProductNum().equals(other.getProductNum()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getLogisticsId() == null ? other.getLogisticsId() == null : this.getLogisticsId().equals(other.getLogisticsId()))
            && (this.getShippingNo() == null ? other.getShippingNo() == null : this.getShippingNo().equals(other.getShippingNo()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getReceiverAddress() == null ? other.getReceiverAddress() == null : this.getReceiverAddress().equals(other.getReceiverAddress()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getSendName() == null ? other.getSendName() == null : this.getSendName().equals(other.getSendName()))
            && (this.getFollower() == null ? other.getFollower() == null : this.getFollower().equals(other.getFollower()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getIsPost() == null ? other.getIsPost() == null : this.getIsPost().equals(other.getIsPost()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getTotalDiscount() == null) ? 0 : getTotalDiscount().hashCode());
        result = prime * result + ((getReceiverName() == null) ? 0 : getReceiverName().hashCode());
        result = prime * result + ((getReceiverMobile() == null) ? 0 : getReceiverMobile().hashCode());
        result = prime * result + ((getBuyerRemark() == null) ? 0 : getBuyerRemark().hashCode());
        result = prime * result + ((getProductNum() == null) ? 0 : getProductNum().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getLogisticsId() == null) ? 0 : getLogisticsId().hashCode());
        result = prime * result + ((getShippingNo() == null) ? 0 : getShippingNo().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getReceiverAddress() == null) ? 0 : getReceiverAddress().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getSendName() == null) ? 0 : getSendName().hashCode());
        result = prime * result + ((getFollower() == null) ? 0 : getFollower().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getIsPost() == null) ? 0 : getIsPost().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}