package com.rebusole.boot.rboot.controller;

import com.rebusole.boot.rboot.common.bo.ConfigBean;
import com.rebusole.boot.rboot.common.bo.TestUserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class TestBeanController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    TestUserBean testUserBean;

    @RequestMapping(value = "/lucy")
    public String lucy(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @RequestMapping(value = "/testUser")
    public String testUser(){
        return testUserBean.getName()+"》》》》》》"+testUserBean.getAge();    }
}
