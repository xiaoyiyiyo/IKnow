package com.xiaoyiyiyo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoyiyiyo.service.XmlHeaderService;

@RestController
public class XmlHeaderController {
    @Autowired
    private XmlHeaderService xmlHeaderService;

    @RequestMapping(value="/api/{name}/xml/header")
    public String getValue(@PathVariable("name") String name){
        return xmlHeaderService.getXmlHeader(name);
    }
}
