package com.wang.babytun.service;

import com.wang.babytun.dao.GoodsDAO;
import com.wang.babytun.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsService {
    @Resource
    private GoodsDAO goodsDAO;
    //view>controller>service>dao依次调用 不允许跨级调用 就是controller再调用业务逻辑 service看似冗余其实为了一个逻辑上解耦大概
    public Goods getGoods(Long goodsId){
        return goodsDAO.findById(goodsId);
    }
}
