package com.xiaoyiyiyo.service.impl;

import com.xiaoyiyiyo.dao.FrameworkDocDao;
import com.xiaoyiyiyo.service.FrameworkDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoyiyiyo on 2017/7/13.
 */
@Service
public class FrameworkDocServiceImpl implements FrameworkDocService{
    @Autowired
    private FrameworkDocDao frameworkDocDao;

    @Override
    public String getFrameworkDocValue(String name) {
        List<String> list = frameworkDocDao.getFrameworkDocValue(name);
        if(list.isEmpty()){
            return "";
        } else {
            return list.get(0);
        }
    }
}
