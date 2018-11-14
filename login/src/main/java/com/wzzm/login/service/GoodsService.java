package com.wzzm.login.service;


import com.wzzm.login.pojo.Goods;

import java.util.List;

public interface GoodsService {
    /**
     * 首页（商品展示）
     *
     * @return
     */
    List<Goods> getAllByGoods();

}


