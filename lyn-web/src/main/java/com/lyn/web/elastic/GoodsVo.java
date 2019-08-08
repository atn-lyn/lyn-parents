package com.lyn.web.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "goods_info_index", type = "goods_info")
public class GoodsVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long goodsId;

    @Field(type = FieldType.Keyword)
    private String goodsNo;

    @Field(type = FieldType.Keyword)
    private String goodsName;

    @Field(type = FieldType.Keyword)
    private String goodsTitle;

    @Field(type = FieldType.Keyword)
    private String goodsImg;

    @Field(type = FieldType.Integer)
    private Integer categoryId;

    @Field(type = FieldType.Integer)
    private Integer brandId;

    @Field(type = FieldType.Keyword)
    private String goodsDetail;

    @Field(type = FieldType.Boolean)
    private Boolean isHotSell;

    @Field(type = FieldType.Integer)
    private Integer status;

    @Field(type = FieldType.Date)
    private Date createTime;

    @Field(type = FieldType.Date)
    private Date updateTime;

    @Field(type = FieldType.Keyword)
    private String remark;

    public Long getGoodsId() {
        return goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public Boolean getHotSell() {
        return isHotSell;
    }

    public Integer getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public void setHotSell(Boolean hotSell) {
        isHotSell = hotSell;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "GoodsVo{" +
                "goodsId=" + goodsId +
                ", goodsNo='" + goodsNo + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", categoryId=" + categoryId +
                ", brandId=" + brandId +
                ", goodsDetail='" + goodsDetail + '\'' +
                ", isHotSell=" + isHotSell +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
