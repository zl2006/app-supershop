/*
* 文 件 名:  AddLtdActiveRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  创建营销活动请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.request.yingxiao;

import java.util.Date;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.yingxiao.AddLtdActiveResponse;
import org.yy.paipai.util.PaiPaiUtils;

/**
* 创建营销活动请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddLtdActiveRequest extends AbstractPaiPaiRequest<AddLtdActiveResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/addLtdActive.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<AddLtdActiveResponse> getResponseClass() {
        return AddLtdActiveResponse.class;
    }
    
    /**
    * @return 返回 uin
    */
    public Long getUin() {
        return Long.valueOf(textMap.get("uin"));
    }
    
    /**
     * 鉴权uin,即卖家QQ号
    * @param 对uin进行赋值
    */
    public void setUin(Long uin) {
        textMap.put("uin", String.valueOf(uin));
    }
    
    /**
     * 
    * @return 返回 beginTime
    */
    public Date getBeginTime() {
        return PaiPaiUtils.toDate(textMap.get("beginTime"));
    }
    
    /**
     * YYYY-MM-DD HH:MM:SS 活动开始时间
    * @param 对beginTime进行赋值
    */
    public void setBeginTime(Date beginTime) {
        textMap.put("beginTime", PaiPaiUtils.parseDate(beginTime));
    }
    
    /**
    * @return 返回 endTime
    */
    public Date getEndTime() {
        return PaiPaiUtils.toDate(textMap.get("endTime"));
    }
    
    /**
     * 活动结束时间
    * @param 对endTime进行赋值
    */
    public void setEndTime(Date endTime) {
        textMap.put("endTime", PaiPaiUtils.parseDate(endTime));
    }
    
    /**
    * @return 返回 activityName
    */
    public String getActivityName() {
        return textMap.get("activityName");
    }
    
    /**
     * 活动名称描述
    * @param 对activityName进行赋值
    */
    public void setActivityName(String activityName) {
        textMap.put("activityName", activityName);
    }
    
}
