package org.yy.paipai.model;

/*
* 文 件 名:  CBoLtdItem.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  限时活动商品 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 限时活动商品 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
@SuppressWarnings("serial")
public class CBoLtdItem extends PaiPaiObject {
    
    /**
     * 商品编码
     */
    private String sItemId;
    
    /**
     * 针对活动的购买限制
     */
    private Long dwBuyLimit;
    
    /**
     * 商品的折扣信息
     */
    private Long dwItemDiscount;
    
    /**
    * 商品编码
    */
    public String getSItemId() {
        return sItemId;
    }
    
    /**
    */
    public void setSItemId(String sItemId) {
        this.sItemId = sItemId;
    }
    
    /**
    * 针对活动的购买限制
    */
    public Long getDwBuyLimit() {
        return dwBuyLimit;
    }
    
    /**
    */
    public void setDwBuyLimit(Long dwBuyLimit) {
        this.dwBuyLimit = dwBuyLimit;
    }
    
    /**
    * 商品的折扣信息
    */
    public Long getDwItemDiscount() {
        return dwItemDiscount;
    }
    
    /**
    */
    public void setDwItemDiscount(Long dwItemDiscount) {
        this.dwItemDiscount = dwItemDiscount;
    }
    
}
