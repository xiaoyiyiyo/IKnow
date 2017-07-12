package com.xiaoyiyiyo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyiyiyo.dao.XmlHeaderDao;
import com.xiaoyiyiyo.service.XmlHeaderService;

@Service
public class XmlHeaderServiceImpl implements XmlHeaderService {

    @Autowired
    private XmlHeaderDao xmlHeaderDao;

    @Override
    public String getXmlHeader(String name) {
        return xmlHeaderDao.getXmlHeader(name).get(0);
    }

}
