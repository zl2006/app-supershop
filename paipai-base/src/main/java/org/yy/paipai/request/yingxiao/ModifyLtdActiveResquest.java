/*
* 文 件 名:  ModifyLtdActiveResquest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改限时折扣活动信息请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.request.yingxiao;

import java.util.Date;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.util.PaiPaiUtils;

/**
* 修改限时折扣活动信息请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyLtdActiveResquest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/modifyLtdActive.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    * @return 返回 activityId
    */
    public String getActivityId() {
        return textMap.get("activityId");
    }
    
    /**
     * 要修改的活动ID
    * @param 对activityId进行赋值
    */
    public void setActivityId(String activityId) {
        textMap.put("activityId", activityId);
    }
    
    /**
     * 
     * YYYY-MM-DD HH:MM:SS 活动开始时间
    * @return 返回 beginTime
    */
    public Date getBeginTime() {
        return PaiPaiUtils.toDate(textMap.get("beginTime"));
    }
    
    /**
    * @param 对beginTime进行赋值
    */
    public void setBeginTime(Date beginTime) {
        textMap.put("beginTime", PaiPaiUtils.parseDate(beginTime));
    }
    
    /**
     *  YYYY-MM-DD HH:MM:SS 活动结束时间
    * @return 返回 endTime
    */
    public Date getEndTime() {
        return PaiPaiUtils.toDate(textMap.get("endTime"));
    }
    
    /**
    * @param 对endTime进行赋值
    */
    public void setEndTime(Date endTime) {
        textMap.put("endTime", PaiPaiUtils.parseDate(endTime));
    }
    
    /**
     *  活动名称描述
    * @return 返回 activityName
    */
    public String getActivityName() {
        return textMap.get("activityName");
    }
    
    /**
    * @param 对activityName进行赋值
    */
    public void setActivityName(String activityName) {
        textMap.put("activityName", activityName);
    }
    
}
