package com.wzzm.login.controller;

import com.wzzm.login.pojo.Goods;
import com.wzzm.login.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<Goods> getall(){

        return goodsService.getAllByGoods();
    }
}
