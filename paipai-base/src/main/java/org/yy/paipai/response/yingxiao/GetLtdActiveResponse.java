/*
* 文 件 名:  GetLtdActiveResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询活动列表响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.response.yingxiao;

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Activity;

/**
* 查询活动列表响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetLtdActiveResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 3943359927318407147L;

    /**
     *  返回结果数
     */
    private Long totalNum;
    
    /**
     *  活动列表
     */
    private List<Activity> activityList;
    
    /**
    * @return 返回 totalNum
    */
    public Long getTotalNum() {
        return totalNum;
    }
    
    /**
    * @param 对totalNum进行赋值
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * @return 返回 activityList
    */
    public List<Activity> getActivityList() {
        return activityList;
    }
    
    /**
    * @param 对activityList进行赋值
    */
    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }
    
}
