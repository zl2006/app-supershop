/*
* 文 件 名:  DemoController.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.shop.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yy.paipai.shop.service.DemoService;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
@Controller
public class DemoController {
    
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    
    @Resource(name = "demoService")
    private DemoService demoService;
    
    @RequestMapping("/demo")
    public ModelAndView demo() {
        logger.debug("say hello");
        demoService.sayHello();
        return new ModelAndView("demo");
    }
    
}
