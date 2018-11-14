package com.wzzm.login.dao;


import com.wzzm.login.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品接口
 */
@Mapper
@Repository("gd")
public interface GoodsDao {
    /**
     * 首页商品展示
     * @return
     */
    List<Goods> getAllByGoods();


}
