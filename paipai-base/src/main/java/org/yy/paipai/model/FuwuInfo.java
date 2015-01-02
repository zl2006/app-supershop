package org.yy.paipai.model;

/*
* 文 件 名:  FuwuInfo.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务信息，http://pop.paipai.com/api/paipai/appstore/queryFuwuList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 服务信息，http://pop.paipai.com/api/paipai/appstore/queryFuwuList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class FuwuInfo extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -940349464231126990L;
    
    /**
     *  	int32 		服务ID
     */
    private Long fuwuId;
    
    /**
     *  	string 		服务名称
     */
    private String fuwuName;
    
    /**
     *  	int64 		服务商QQ
     */
    private Long fwsQQ;
    
    /**
     *  	int32 		服务状态:2-服务审核中;3-上架中;4-下架中
     */
    private Long fuwuStatus;
    
    /**
     *  	string 		创建时间,格式:yyyymmdd HH:mm:ss
     */
    private Date createdTime;
    
    /**
     *  	string 		修改时间,格式:yyyymmdd HH:mm:ss
     */
    private Date updatedTime;
    
    /**
    *  	int32 		服务ID
    */
    public Long getFuwuId() {
        return fuwuId;
    }
    
    /**
    */
    public void setFuwuId(Long fuwuId) {
        this.fuwuId = fuwuId;
    }
    
    /**
    *  	string 		服务名称
    */
    public String getFuwuName() {
        return fuwuName;
    }
    
    /**
    */
    public void setFuwuName(String fuwuName) {
        this.fuwuName = fuwuName;
    }
    
    /**
    *  	int64 		服务商QQ
    */
    public Long getFwsQQ() {
        return fwsQQ;
    }
    
    /**
    */
    public void setFwsQQ(Long fwsQQ) {
        this.fwsQQ = fwsQQ;
    }
    
    /**
    *  	int32 		服务状态:2-服务审核中;3-上架中;4-下架中
    */
    public Long getFuwuStatus() {
        return fuwuStatus;
    }
    
    /**
    */
    public void setFuwuStatus(Long fuwuStatus) {
        this.fuwuStatus = fuwuStatus;
    }
    
    /**
    *  	string 		创建时间,格式:yyyymmdd HH:mm:ss
    */
    public Date getCreatedTime() {
        return createdTime;
    }
    
    /**
    */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
    *  	string 		修改时间,格式:yyyymmdd HH:mm:ss
    */
    public Date getUpdatedTime() {
        return updatedTime;
    }
    
    /**
    */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
    
}
