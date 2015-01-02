package org.yy.paipai.response.yingxiao;


/*
* 文 件 名:  GetLtdItemResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询参加限时活动商品信息 响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.CBoLtdItem;

/**
* 查询参加限时活动商品信息 响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetLtdItemResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -333130210568479353L;

    /**
     * 返回结果数
     */
    private Long totalNum;
    
    /**
     * 活动ID
     */
    private String activityId;
    
    /**
     * 商品列表
     */
    private List<CBoLtdItem> cBoLtdItems;
     
	
    /**
    * 返回结果数
    */
    public Long getTotalNum() {
        return  totalNum;
    }
    
    /**
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * 活动ID
    */
    public String getActivityId() {
        return  activityId;
    }
    
    /**
    */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
    * 商品列表
    */
    public List<CBoLtdItem> getCBoLtdItems() {
        return  cBoLtdItems;
    }
    
    /**
    */
    public void setCBoLtdItems(List<CBoLtdItem> cBoLtdItems) {
        this.cBoLtdItems = cBoLtdItems;
    }
     
    
}

