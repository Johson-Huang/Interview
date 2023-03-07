package com.wsk.service;

import com.wsk.pojo.GoodsOfOrderForm;

import java.util.List;


public interface GoodsOfOrderFormService {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOfOrderForm record);

    int insertSelective(GoodsOfOrderForm record);

    GoodsOfOrderForm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsOfOrderForm record);

    int updateByPrimaryKey(GoodsOfOrderForm record);

    List<GoodsOfOrderForm> selectByOFid(int ofid);
}
