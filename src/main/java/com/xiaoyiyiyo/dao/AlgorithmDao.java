package com.xiaoyiyiyo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xiaoyiyiyo on 2017/7/9.
 */
@Mapper
public interface AlgorithmDao {
    List<String> getAlgorithmValue(String name);
}
