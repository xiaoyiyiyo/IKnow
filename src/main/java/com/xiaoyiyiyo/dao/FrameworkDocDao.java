package com.xiaoyiyiyo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xiaoyiyiyo on 2017/7/13.
 */
@Mapper
public interface FrameworkDocDao {
    List<String> getFrameworkDocValue(String name);
}
