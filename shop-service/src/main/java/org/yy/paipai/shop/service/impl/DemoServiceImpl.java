/*
* 文 件 名:  DemoServiceImpl.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yy.framework.base.validator.ValidateError;
import org.yy.framework.base.validator.ValidateUtil;
import org.yy.framework.basedata.exception.ServiceException;
import org.yy.paipai.shop.dao.DemoDao;
import org.yy.paipai.shop.model.Demo;
import org.yy.paipai.shop.service.DemoService;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
public class DemoServiceImpl implements DemoService {
    
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
    
    @Resource(name = "demoDao")
    private DemoDao demoDao;
    
    /** {@inheritDoc} */
    @Override
    public void insertDemo(Demo demo)
        throws ServiceException {
        
        //数据验证
        List<ValidateError> errors = ValidateUtil.validate(demo);
        if (errors.size() > 0) {
            throw new ServiceException("DIC_VALIDATE_ERROR", errors.toString());
        }
        
        demoDao.insertDemo(demo);
    }
    
    /** {@inheritDoc} */
    @Override
    public Demo findDemo(Long demoID)
        throws ServiceException {
        if (demoID == null) {
            throw new ServiceException("DEMO_PARAM_ERROR", "DEMOID为空");
        }
        return demoDao.findDemoByID(demoID);
    }
    
    /**
    * @param 对demoDao进行赋值
    */
    public void setDemoDao(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

     /** {@inheritDoc} */
    @Override
    public void sayHello() {
        logger.debug("say hello");
        demoDao.sayHello();
    }
    
    
}
