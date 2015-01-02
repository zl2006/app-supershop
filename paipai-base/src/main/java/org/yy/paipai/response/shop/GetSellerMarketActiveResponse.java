package org.yy.paipai.response.shop;

/*
* 文 件 名:  GetSellerMarketActiveResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺满减满送活动信息 ,http://pop.paipai.com/api/paipai/shop/getSellerMarketActive响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;
import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ActiveContent;

/**
* 查询店铺满减满送活动信息 ,http://pop.paipai.com/api/paipai/shop/getSellerMarketActive响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetSellerMarketActiveResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2888192479703349046L;
    
    /**
     * 卖家uin号
     */
    private Long sellerUin;
    
    /**
     * 促销开始时间
     */
    private Date startTime;
    
    /**
     * 促销结束时间
     */
    private Date endTime;
    
    /**
     * 活动描述
     */
    private String activeDesc;
    
    /**
     * 内容列表
     */
    private List<ActiveContent> contentList;
    
    /**
    * 卖家uin号
    */
    public Long getSellerUin() {
        return sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    * 促销开始时间
    */
    public Date getStartTime() {
        return startTime;
    }
    
    /**
    */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    /**
    * 促销结束时间
    */
    public Date getEndTime() {
        return endTime;
    }
    
    /**
    */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    /**
    * 活动描述
    */
    public String getActiveDesc() {
        return activeDesc;
    }
    
    /**
    */
    public void setActiveDesc(String activeDesc) {
        this.activeDesc = activeDesc;
    }
    
    /**
    * 内容列表
    */
    public List<ActiveContent> getContentList() {
        return contentList;
    }
    
    /**
    */
    public void setContentList(List<ActiveContent> contentList) {
        this.contentList = contentList;
    }
    
}
