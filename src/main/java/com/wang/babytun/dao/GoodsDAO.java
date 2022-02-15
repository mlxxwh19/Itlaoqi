package com.wang.babytun.dao;

import com.wang.babytun.entity.Goods;

public interface GoodsDAO {
    public Goods findById(Long goodsId);
}
