package com.wang.babytun.entity;

public class Goods {
    private Long goodsId;
    private String title;
    private String subTitle;
    private Float originalCost;
    private Float discount;
    private Integer isFreeDelivery;
    private Long categoryId;
    private Float currentPrice;

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setOriginalCost(Float originalCost) {
        this.originalCost = originalCost;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public void setIsFreeDelivery(Integer isFreeDelivery) {
        this.isFreeDelivery = isFreeDelivery;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public Float getOriginalCost() {
        return originalCost;
    }

    public Float getDiscount() {
        return discount;
    }

    public Integer getIsFreeDelivery() {
        return isFreeDelivery;
    }

    public Long getCategoryId() {
        return categoryId;
    }
}
