package com.wsk.service;

import com.wsk.pojo.AllKinds;

import java.util.List;


public interface AllKindsService {
    int deleteByPrimaryKey(Integer id);

    int insert(AllKinds record);

    int insertSelective(AllKinds record);

    AllKinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AllKinds record);

    int updateByPrimaryKey(AllKinds record);

    List<AllKinds> selectAll();
}
