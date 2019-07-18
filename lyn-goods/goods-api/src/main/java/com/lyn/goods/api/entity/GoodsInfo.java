package com.lyn.goods.api.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsInfo implements Serializable {
    /**
     * 商品ID
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * 商品编号
     *
     * @mbg.generated
     */
    private String goodsNo;

    /**
     * 商品名
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * title
     *
     * @mbg.generated
     */
    private String goodsTitle;

    /**
     * 主图
     *
     * @mbg.generated
     */
    private String goodsImg;

    /**
     * 分类ID
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     * 品牌ID
     *
     * @mbg.generated
     */
    private Integer brandId;

    /**
     * 商品详情
     *
     * @mbg.generated
     */
    private String goodsDetail;

    /**
     * 是否为热销商品
     *
     * @mbg.generated
     */
    private Boolean isHotSell;

    /**
     * 状态
     *
     * @mbg.generated
     */
    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public Boolean getIsHotSell() {
        return isHotSell;
    }

    public void setIsHotSell(Boolean isHotSell) {
        this.isHotSell = isHotSell;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsTitle=").append(goodsTitle);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", brandId=").append(brandId);
        sb.append(", goodsDetail=").append(goodsDetail);
        sb.append(", isHotSell=").append(isHotSell);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
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
        GoodsInfo other = (GoodsInfo) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsNo() == null ? other.getGoodsNo() == null : this.getGoodsNo().equals(other.getGoodsNo()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsTitle() == null ? other.getGoodsTitle() == null : this.getGoodsTitle().equals(other.getGoodsTitle()))
            && (this.getGoodsImg() == null ? other.getGoodsImg() == null : this.getGoodsImg().equals(other.getGoodsImg()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getGoodsDetail() == null ? other.getGoodsDetail() == null : this.getGoodsDetail().equals(other.getGoodsDetail()))
            && (this.getIsHotSell() == null ? other.getIsHotSell() == null : this.getIsHotSell().equals(other.getIsHotSell()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsNo() == null) ? 0 : getGoodsNo().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsTitle() == null) ? 0 : getGoodsTitle().hashCode());
        result = prime * result + ((getGoodsImg() == null) ? 0 : getGoodsImg().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getGoodsDetail() == null) ? 0 : getGoodsDetail().hashCode());
        result = prime * result + ((getIsHotSell() == null) ? 0 : getIsHotSell().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}