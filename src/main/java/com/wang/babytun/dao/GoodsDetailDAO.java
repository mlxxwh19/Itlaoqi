package com.wang.babytun.dao;

import com.wang.babytun.entity.GoodsDetail;

import java.util.List;

public interface GoodsDetailDAO {
    public List<GoodsDetail> findByGoodsId(long goodsId);
}
