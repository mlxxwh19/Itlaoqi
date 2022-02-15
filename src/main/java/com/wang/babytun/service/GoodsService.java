package com.wang.babytun.service;

import com.wang.babytun.dao.GoodsCoverDAO;
import com.wang.babytun.dao.GoodsDAO;
import com.wang.babytun.dao.GoodsDetailDAO;
import com.wang.babytun.dao.GoodsParamDAO;
import com.wang.babytun.entity.Goods;
import com.wang.babytun.entity.GoodsCover;
import com.wang.babytun.entity.GoodsDetail;
import com.wang.babytun.entity.GoodsParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {
    @Resource
    private GoodsDAO goodsDAO;
    @Resource
    private GoodsCoverDAO goodsCoverDAO;
    @Resource
    private GoodsDetailDAO goodsDetailDAO;
    @Resource
    private GoodsParamDAO goodsParamDAO;
    //view>controller>service>dao依次调用 不允许跨级调用 就是controller再调用业务逻辑 service看似冗余其实为了一个逻辑上解耦大概
    public Goods getGoods(Long goodsId){
        return goodsDAO.findById(goodsId);
    }

    public List<GoodsCover> findCovers(Long goodsId){
        return goodsCoverDAO.findByGoodsId(goodsId);
    }
    public List<GoodsDetail> findDetails(Long goodsId){
        return goodsDetailDAO.findByGoodsId(goodsId);
    }
    public List<GoodsParam> findParams(Long goodsId){ return goodsParamDAO.findByGoodsId(goodsId); }
}
