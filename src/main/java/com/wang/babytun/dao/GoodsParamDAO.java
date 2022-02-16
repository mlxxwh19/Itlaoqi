package com.wang.babytun.dao;

import com.wang.babytun.entity.GoodsParam;

import java.util.List;

public interface GoodsParamDAO {
    public List<GoodsParam> findByGoodsId(long goodsId);
}
