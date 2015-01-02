package org.yy.paipai.model;

/*
* 文 件 名:  BuyerAgePlus.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍买家性别年龄,http://pop.paipai.com/api/paipai/report/getBuyerAgePlus 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 拍拍买家性别年龄,http://pop.paipai.com/api/paipai/report/getBuyerAgePlus 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class BuyerAgePlus extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 5771448984273612917L;
    
    /**
     *  	int64 	20130101 	统计的日期,格式YYYYMMDD
     */
    private Long fday;
    
    /**
     *  	int64 	0 	店铺号
     */
    private Long shopId;
    
    /**
     *  	int64 		买家性别
     */
    private Long buyerSex;
    
    /**
     *  	int64 		年龄段:
     */
    private Long ageMask;
    
    /**
     *  	int64 		买家数据量
     */
    private Long buyerNum;
    
    /**
     *  	int64 		订单数量
     */
    private Long dealNum;
    
    /**
     *  	int64 		成交金额
     */
    private Long dealCash;
    
    /**
    *  	int64 	20130101 	统计的日期,格式YYYYMMDD
    */
    public Long getFday() {
        return fday;
    }
    
    /**
    */
    public void setFday(Long fday) {
        this.fday = fday;
    }
    
    /**
    *  	int64 	0 	店铺号
    */
    public Long getShopId() {
        return shopId;
    }
    
    /**
    */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    
    /**
    *  	int64 		买家性别
    */
    public Long getBuyerSex() {
        return buyerSex;
    }
    
    /**
    */
    public void setBuyerSex(Long buyerSex) {
        this.buyerSex = buyerSex;
    }
    
    /**
    *  	int64 		年龄段:
    */
    public Long getAgeMask() {
        return ageMask;
    }
    
    /**
    */
    public void setAgeMask(Long ageMask) {
        this.ageMask = ageMask;
    }
    
    /**
    *  	int64 		买家数据量
    */
    public Long getBuyerNum() {
        return buyerNum;
    }
    
    /**
    */
    public void setBuyerNum(Long buyerNum) {
        this.buyerNum = buyerNum;
    }
    
    /**
    *  	int64 		订单数量
    */
    public Long getDealNum() {
        return dealNum;
    }
    
    /**
    */
    public void setDealNum(Long dealNum) {
        this.dealNum = dealNum;
    }
    
    /**
    *  	int64 		成交金额
    */
    public Long getDealCash() {
        return dealCash;
    }
    
    /**
    */
    public void setDealCash(Long dealCash) {
        this.dealCash = dealCash;
    }
    
}
