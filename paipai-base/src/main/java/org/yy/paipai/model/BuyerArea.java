package org.yy.paipai.model;

/*
* 文 件 名:  BuyerArea.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍买家地域 ,http://pop.paipai.com/api/paipai/report/getBuyerAreaReport 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 拍拍买家地域 ,http://pop.paipai.com/api/paipai/report/getBuyerAreaReport 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class BuyerArea extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 4038216468509251237L;
    
    /**
     *  	int64 	20130101 	统计的日期,格式YYYYMMDD
     */
    private Long fday;
    
    /**
     *  	int64 	0 	店铺号
     */
    private Long shopId;
    
    /**
     *  	string 		省份
     */
    private String province;
    
    /**
     *  	string 		城市 
     */
    private String city;
    
    /**
     * 
     */
    private Long orderBuyerNum;
    
    /**
     * 
     */
    private Long doneOrderNum;
    
    /**
     * 
     */
    private Long doneOrderSum;
    
    /**
     * 
     */
    private Long orderNum;
    
    /**
     * 
     */
    private Long orderSum;
    
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
    *  	string 		省份
    */
    public String getProvince() {
        return province;
    }
    
    /**
    */
    public void setProvince(String province) {
        this.province = province;
    }
    
    /**
    *  	string 		城市 
    */
    public String getCity() {
        return city;
    }
    
    /**
    */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
    * 
    */
    public Long getOrderBuyerNum() {
        return orderBuyerNum;
    }
    
    /**
    */
    public void setOrderBuyerNum(Long orderBuyerNum) {
        this.orderBuyerNum = orderBuyerNum;
    }
    
    /**
    * 
    */
    public Long getDoneOrderNum() {
        return doneOrderNum;
    }
    
    /**
    */
    public void setDoneOrderNum(Long doneOrderNum) {
        this.doneOrderNum = doneOrderNum;
    }
    
    /**
    * 
    */
    public Long getDoneOrderSum() {
        return doneOrderSum;
    }
    
    /**
    */
    public void setDoneOrderSum(Long doneOrderSum) {
        this.doneOrderSum = doneOrderSum;
    }
    
    /**
    * 
    */
    public Long getOrderNum() {
        return orderNum;
    }
    
    /**
    */
    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }
    
    /**
    * 
    */
    public Long getOrderSum() {
        return orderSum;
    }
    
    /**
    */
    public void setOrderSum(Long orderSum) {
        this.orderSum = orderSum;
    }
    
}
