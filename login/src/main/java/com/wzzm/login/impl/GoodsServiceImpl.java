package com.wzzm.login.impl;

import com.wzzm.login.dao.GoodsDao;
import com.wzzm.login.pojo.Goods;
import com.wzzm.login.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    @Qualifier("gd")
    private GoodsDao goodsDao;

    @Override
    public List<Goods> getAllByGoods() {
        return goodsDao.getAllByGoods();
    }

}
