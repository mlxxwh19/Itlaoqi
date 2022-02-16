package com.wang.babytun.entity;


public class GoodsCover {

  private long gcId;
  private long goodsId;
  private String gcPicUrl;
  private String gcThumbUrl;
  private long gcOrder;


  public long getGcId() {
    return gcId;
  }

  public void setGcId(long gcId) {
    this.gcId = gcId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGcPicUrl() {
    return gcPicUrl;
  }

  public void setGcPicUrl(String gcPicUrl) {
    this.gcPicUrl = gcPicUrl;
  }


  public String getGcThumbUrl() {
    return gcThumbUrl;
  }

  public void setGcThumbUrl(String gcThumbUrl) {
    this.gcThumbUrl = gcThumbUrl;
  }


  public long getGcOrder() {
    return gcOrder;
  }

  public void setGcOrder(long gcOrder) {
    this.gcOrder = gcOrder;
  }

}
