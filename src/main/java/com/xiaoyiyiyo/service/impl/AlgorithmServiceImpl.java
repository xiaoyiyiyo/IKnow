package com.xiaoyiyiyo.service.impl;

import com.xiaoyiyiyo.dao.AlgorithmDao;
import com.xiaoyiyiyo.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoyiyiyo on 2017/7/9.
 */
@Service
public class AlgorithmServiceImpl implements AlgorithmService {
    @Autowired
    private AlgorithmDao algorithmDao;

    @Override
    public String getAlgorithmValue(String name) {
        List<String> list = algorithmDao.getAlgorithmValue(name);
        if(list.isEmpty()){
            return "";
        } else {
            return list.get(0);
        }
    }
}
