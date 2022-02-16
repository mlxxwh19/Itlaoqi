package com.wang.babytun.dao;

import com.wang.babytun.entity.GoodsCover;

import java.util.List;

public interface GoodsCoverDAO {
    public List<GoodsCover> findByGoodsId(long goodsId);

}
