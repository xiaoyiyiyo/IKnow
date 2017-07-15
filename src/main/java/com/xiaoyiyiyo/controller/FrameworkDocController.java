package com.xiaoyiyiyo.controller;

import com.xiaoyiyiyo.service.FrameworkDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaoyiyiyo on 2017/7/15.
 */
@RestController
public class FrameworkDocController {
    @Autowired
    private FrameworkDocService frameworkDocService;

    @RequestMapping("/api/framework/doc/{name}")
    public String getFrameworkDoc(@PathVariable("name") String name, HttpServletResponse response){
        String url = frameworkDocService.getFrameworkDocValue(name);
        if(StringUtils.isEmpty(url)){
            return "sorry, this service is unavailable now.";
        } else {
            try {
                response.sendRedirect(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }
}
