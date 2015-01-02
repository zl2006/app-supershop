/*
* 文 件 名:  AddLtdActiveResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  创建营销活动响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.response.yingxiao;

import org.yy.paipai.api.PaiPaiResponse;

/**
* 创建营销活动响应
* 
 * @author  zhouliang
 * @version  [0.1, 2014年11月28日]
 * @since  [paipai-base/0.1]
*/
public class AddLtdActiveResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 659328167969008307L;
    
    /**
     *  创建成功后生成的活动ID
     */
    private String activityId;
    
    /**
    * @return 返回 activityId
    */
    public String getActivityId() {
        return activityId;
    }
    
    /**
    * @param 对activityId进行赋值
    */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
}
