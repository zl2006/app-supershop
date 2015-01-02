/*
* 文 件 名:  Activity.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  活动信息
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.model;

import org.yy.paipai.api.PaiPaiObject;

/**
* 活动信息
* 
* @author  zhouliang
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1]
*/
public class Activity extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -5639592396066147458L;
    
    /**
     * 活动ID
     */
    private String activityId;
    
    /**
     * 活动名称
     */
    private String activityName;
    
    /**
     * 卖家号
     */
    private Long sellerUin;
    
    /**
     * 活动开始时间
     */
    private String beginTime;
    
    /**
     * 活动结束时间
     */
    private String endTime;
    
    /**
     * 参加活动的商品数
     */
    private Long itemNum;
    
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
    
    /**
    * @return 返回 activityName
    */
    public String getActivityName() {
        return activityName;
    }
    
    /**
    * @param 对activityName进行赋值
    */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    
    /**
    * @return 返回 sellerUin
    */
    public Long getSellerUin() {
        return sellerUin;
    }
    
    /**
    * @param 对sellerUin进行赋值
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    * @return 返回 beginTime
    */
    public String getBeginTime() {
        return beginTime;
    }
    
    /**
    * @param 对beginTime进行赋值
    */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
    
    /**
    * @return 返回 endTime
    */
    public String getEndTime() {
        return endTime;
    }
    
    /**
    * @param 对endTime进行赋值
    */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    /**
    * @return 返回 itemNum
    */
    public Long getItemNum() {
        return itemNum;
    }
    
    /**
    * @param 对itemNum进行赋值
    */
    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }
    
}
