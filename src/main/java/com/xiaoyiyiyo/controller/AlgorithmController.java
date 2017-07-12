package com.xiaoyiyiyo.controller;

import com.xiaoyiyiyo.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaoyiyiyo on 2017/7/9.
 */
@RestController
public class AlgorithmController {
    @Autowired
    private AlgorithmService algorithmService;

    @RequestMapping("/api/algorithm/{name}")
    public String getAlgorithmValue(@PathVariable("name") String name, HttpServletResponse response){
        String url = algorithmService.getAlgorithmValue(name);
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
