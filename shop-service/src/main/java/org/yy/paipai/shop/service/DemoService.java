/*
* 文 件 名:  DemoService.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.shop.service;

import org.yy.framework.basedata.exception.ServiceException;
import org.yy.paipai.shop.model.Demo;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
public interface DemoService {
    
    void sayHello();
    /**

     * @throws ServiceException
     */
    void insertDemo(Demo demo)
        throws ServiceException;
    
    /**

     * @throws ServiceException
     */
    Demo findDemo(Long demoID)
        throws ServiceException;
    
}
