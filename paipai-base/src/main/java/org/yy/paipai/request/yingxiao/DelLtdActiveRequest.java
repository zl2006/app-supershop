package org.yy.paipai.request.yingxiao;

/*
* 文 件 名:  DelLtdActiveRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  卖家删除限时折扣活动请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 卖家删除限时折扣活动请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DelLtdActiveRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/delLtdActive.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    *活动ID
    */
    public String getActivityId() {
        return textMap.get("activityId");
    }
    
    /**
    *
    */
    public void setActivityId(String activityId) {
        textMap.put("activityId", activityId);
    }
    
}
