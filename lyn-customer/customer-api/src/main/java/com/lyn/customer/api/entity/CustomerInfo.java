package com.lyn.customer.api.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerInfo implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer customerId;

    /**
     * 分类
     *
     * @mbg.generated
     */
    private Integer category;

    /**
     * 级别
     *
     * @mbg.generated
     */
    private Integer grade;

    /**
     * 客户编号
     *
     * @mbg.generated
     */
    private String customerNo;

    /**
     * 客户名称
     *
     * @mbg.generated
     */
    private String customerName;

    /**
     * 客户类型
     *
     * @mbg.generated
     */
    private Integer customerType;

    /**
     * 简称	
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     * 电话
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * 省份
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 所在城市
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 地区
     *
     * @mbg.generated
     */
    private String district;

    /**
     * 详细地址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 联系人
     *
     * @mbg.generated
     */
    private String contact;

    /**
     * 联系人电话
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 传真号码
     *
     * @mbg.generated
     */
    private String fax;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date registDate;

    /**
     * 公司介绍
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 来源
     *
     * @mbg.generated
     */
    private Integer source;

    /**
     * 证件照片
     *
     * @mbg.generated
     */
    private String cardId;

    /**
     * 营业执照
     *
     * @mbg.generated
     */
    private String license;

    /**
     * 营业许可证
     *
     * @mbg.generated
     */
    private String permit;

    /**
     * 店铺照片
     *
     * @mbg.generated
     */
    private String storePhoto;

    /**
     * 跟进入
     *
     * @mbg.generated
     */
    private String follower;

    /**
     * 用户状态 0-禁用，1-启用
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 审核状态
     *
     * @mbg.generated
     */
    private Integer confirmStatus;

    /**
     * 审核时间
     *
     * @mbg.generated
     */
    private Date confirmDate;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * 更新人
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStorePhoto() {
        return storePhoto;
    }

    public void setStorePhoto(String storePhoto) {
        this.storePhoto = storePhoto;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", category=").append(category);
        sb.append(", grade=").append(grade);
        sb.append(", customerNo=").append(customerNo);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerType=").append(customerType);
        sb.append(", nickName=").append(nickName);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", contact=").append(contact);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", fax=").append(fax);
        sb.append(", registDate=").append(registDate);
        sb.append(", description=").append(description);
        sb.append(", source=").append(source);
        sb.append(", cardId=").append(cardId);
        sb.append(", license=").append(license);
        sb.append(", permit=").append(permit);
        sb.append(", storePhoto=").append(storePhoto);
        sb.append(", follower=").append(follower);
        sb.append(", status=").append(status);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", confirmDate=").append(confirmDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remark=").append(remark);
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
        CustomerInfo other = (CustomerInfo) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getCustomerNo() == null ? other.getCustomerNo() == null : this.getCustomerNo().equals(other.getCustomerNo()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerType() == null ? other.getCustomerType() == null : this.getCustomerType().equals(other.getCustomerType()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getRegistDate() == null ? other.getRegistDate() == null : this.getRegistDate().equals(other.getRegistDate()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getCardId() == null ? other.getCardId() == null : this.getCardId().equals(other.getCardId()))
            && (this.getLicense() == null ? other.getLicense() == null : this.getLicense().equals(other.getLicense()))
            && (this.getPermit() == null ? other.getPermit() == null : this.getPermit().equals(other.getPermit()))
            && (this.getStorePhoto() == null ? other.getStorePhoto() == null : this.getStorePhoto().equals(other.getStorePhoto()))
            && (this.getFollower() == null ? other.getFollower() == null : this.getFollower().equals(other.getFollower()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getConfirmStatus() == null ? other.getConfirmStatus() == null : this.getConfirmStatus().equals(other.getConfirmStatus()))
            && (this.getConfirmDate() == null ? other.getConfirmDate() == null : this.getConfirmDate().equals(other.getConfirmDate()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getCustomerNo() == null) ? 0 : getCustomerNo().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerType() == null) ? 0 : getCustomerType().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getRegistDate() == null) ? 0 : getRegistDate().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getCardId() == null) ? 0 : getCardId().hashCode());
        result = prime * result + ((getLicense() == null) ? 0 : getLicense().hashCode());
        result = prime * result + ((getPermit() == null) ? 0 : getPermit().hashCode());
        result = prime * result + ((getStorePhoto() == null) ? 0 : getStorePhoto().hashCode());
        result = prime * result + ((getFollower() == null) ? 0 : getFollower().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getConfirmStatus() == null) ? 0 : getConfirmStatus().hashCode());
        result = prime * result + ((getConfirmDate() == null) ? 0 : getConfirmDate().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}