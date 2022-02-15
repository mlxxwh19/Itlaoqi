package com.wang.babytun.controller;

import com.wang.babytun.entity.Goods;
import com.wang.babytun.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class GoodsController {
    @Resource  //service也能注入？
    private GoodsService goodsService;
    @RequestMapping("/goods")
    public ModelAndView showGoods(Long gid) {
        ModelAndView mav = new ModelAndView("goods");
        Goods goods= goodsService.getGoods(gid);
        mav.addObject("goods",goods);
        mav.addObject("covers",goodsService.findCovers(gid));
        mav.addObject("details",goodsService.findDetails(gid));
        mav.addObject("params",goodsService.findParams(gid));
        return mav;
    }
}

