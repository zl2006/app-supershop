/*
* 文 件 名:  GetLtdActiveRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询活动请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.request.yingxiao;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.yingxiao.GetLtdActiveResponse;

/**
* 查询活动请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetLtdActiveRequest extends AbstractPaiPaiRequest<GetLtdActiveResponse> {
      
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/getLtdActive.xhtml";
    }
    
    
    /** {@inheritDoc} */
    @Override
    public Class<GetLtdActiveResponse> getResponseClass() {
        return GetLtdActiveResponse.class;
    }

    /**
     * 活动ID,填空则查询全部
    * @return 返回 activityId
    */
    public String getActivityId() {
        return textMap.get("activityId");
    }

    /**
    * @param 对activityId进行赋值
    */
    public void setActivityId(String activityId) {
        textMap.put("activityId", activityId);
    }
    
}
