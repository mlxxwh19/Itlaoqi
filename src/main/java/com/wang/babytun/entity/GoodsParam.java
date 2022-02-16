package com.wang.babytun.entity;


public class GoodsParam {

  private long gpId;
  private String gpParamName;
  private String gpParamValue;
  private long goodsId;
  private long gpOrder;


  public long getGpId() {
    return gpId;
  }

  public void setGpId(long gpId) {
    this.gpId = gpId;
  }


  public String getGpParamName() {
    return gpParamName;
  }

  public void setGpParamName(String gpParamName) {
    this.gpParamName = gpParamName;
  }


  public String getGpParamValue() {
    return gpParamValue;
  }

  public void setGpParamValue(String gpParamValue) {
    this.gpParamValue = gpParamValue;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getGpOrder() {
    return gpOrder;
  }

  public void setGpOrder(long gpOrder) {
    this.gpOrder = gpOrder;
  }

}
