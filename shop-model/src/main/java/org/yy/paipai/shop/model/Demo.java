/*
* 文 件 名:  Demo.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  演示
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
* 演示
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
public class Demo implements Serializable {
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -6347487646171854966L;
    
    private Long demoID;
    
    private String name;
    
    private Date createTime;
    
    private Long createPerson;
    
    private Date updateTime;
    
    private Long updatePerson;
    
    /**
    * @return 返回 demoID
    */
    public Long getDemoID() {
        return demoID;
    }
    
    /**
    * @param 对demoID进行赋值
    */
    public void setDemoId(Long demoID) {
        this.demoID = demoID;
    }
    
    /**
    * @return 返回 name
    */
    public String getName() {
        return name;
    }
    
    /**
    * @param 对name进行赋值
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * @return 返回 createTime
    */
    public Date getCreateTime() {
        return createTime;
    }
    
    /**
    * @param 对createTime进行赋值
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
    * @return 返回 createPerson
    */
    public Long getCreatePerson() {
        return createPerson;
    }
    
    /**
    * @param 对createPerson进行赋值
    */
    public void setCreatePerson(Long createPerson) {
        this.createPerson = createPerson;
    }
    
    /**
    * @return 返回 updateTime
    */
    public Date getUpdateTime() {
        return updateTime;
    }
    
    /**
    * @param 对updateTime进行赋值
    */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
    * @return 返回 updatePerson
    */
    public Long getUpdatePerson() {
        return updatePerson;
    }
    
    /**
    * @param 对updatePerson进行赋值
    */
    public void setUpdatePerson(Long updatePerson) {
        this.updatePerson = updatePerson;
    }
    
}
