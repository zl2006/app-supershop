/*
* 文 件 名:  DemoDaoImpl.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.shop.dao.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yy.framework.base.dao.AbstractMyBatisDao;
import org.yy.framework.basedata.exception.DaoException;
import org.yy.paipai.shop.dao.DemoDao;
import org.yy.paipai.shop.model.Demo;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
public class DemoDaoImpl extends AbstractMyBatisDao implements DemoDao {
    
    private static final Logger logger = LoggerFactory.getLogger(DemoDaoImpl.class);
    
    /** {@inheritDoc} */
    @Override
    public Demo insertDemo(Demo demo) {
        try {
            demo.setCreateTime(new Date());
            demo.setUpdateTime(new Date());
            sqlSession.insert("demo.INSERT_DEMO", demo);
        }
        catch (Exception e) {
            throw new DaoException("DEMO_ADD_ERROR", "新增DEMO异常", e);
        }
        return demo;
    }
    
    /** {@inheritDoc} */
    @Override
    public void deleteDemo(Long demoID) {
        try {
            sqlSession.delete("demo.DELETE_DEMO", demoID);
        }
        catch (Exception e) {
            throw new DaoException("DEMO_DELETE_ERROR", "删除DEMO异常", e);
        }
        
    }
    
    /** {@inheritDoc} */
    @Override
    public Demo findDemoByID(Long demoID) {
        try {
            return (Demo)sqlSession.selectOne("dic.FIND_DEMO_BY_ID", demoID);
        }
        catch (Exception e) {
            throw new DaoException("DEMO_FIND_ERROR", "查询DEMO异常", e);
        }
    }
    
    @Override
    public void sayHello() {
        logger.debug("say hello");
    }
    
}
