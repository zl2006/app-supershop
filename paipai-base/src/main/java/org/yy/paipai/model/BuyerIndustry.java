package org.yy.paipai.model;

/*
* 文 件 名:  BuyerIndustry.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍买家规模 ,http://pop.paipai.com/api/paipai/report/getBuyerIndustryReport 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 拍拍买家规模 ,http://pop.paipai.com/api/paipai/report/getBuyerIndustryReport 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class BuyerIndustry extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -6196856694928893795L;
    
    /**
     *  	int64 	20130101 	统计的日期,格式YYYYMMDD
     */
    private Long fday;
    
    /**
     *  	int64 	0 	类目ID
     */
    private Long classID;
    
    /**
     *  	int64 		所有买家数量
     */
    private Long allBuyerNum;
    
    /**
     *  	int64 		活跃买家数量 
     */
    private Long actBuyerNum;
    
    /**
     *  	int64 		新买家数量
     */
    private Long newBuyerNum;
    
    /**
     *  	int64 		老买家数量
     */
    private Long oldBuyerNum;
    
    /**
     * int64 		所有买家交易金额
     */
    private Long allBuyerMoney;
    
    /**
     * 	int64 		活跃买家交易金额
     */
    private Long actBuyerMoney;
    
    /**
     *  	int64 		新买家交易金额
     */
    private Long newBuyerMoney;
    
    /**
     *  	int64 		老买家交易金额
     */
    private Long oldBuyerMoney;
    
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
    *  	int64 	0 	类目ID
    */
    public Long getClassID() {
        return classID;
    }
    
    /**
    */
    public void setClassID(Long classID) {
        this.classID = classID;
    }
    
    /**
    *  	int64 		所有买家数量
    */
    public Long getAllBuyerNum() {
        return allBuyerNum;
    }
    
    /**
    */
    public void setAllBuyerNum(Long allBuyerNum) {
        this.allBuyerNum = allBuyerNum;
    }
    
    /**
    *  	int64 		活跃买家数量 
    */
    public Long getActBuyerNum() {
        return actBuyerNum;
    }
    
    /**
    */
    public void setActBuyerNum(Long actBuyerNum) {
        this.actBuyerNum = actBuyerNum;
    }
    
    /**
    *  	int64 		新买家数量
    */
    public Long getNewBuyerNum() {
        return newBuyerNum;
    }
    
    /**
    */
    public void setNewBuyerNum(Long newBuyerNum) {
        this.newBuyerNum = newBuyerNum;
    }
    
    /**
    *  	int64 		老买家数量
    */
    public Long getOldBuyerNum() {
        return oldBuyerNum;
    }
    
    /**
    */
    public void setOldBuyerNum(Long oldBuyerNum) {
        this.oldBuyerNum = oldBuyerNum;
    }
    
    /**
    * int64 		所有买家交易金额
    */
    public Long getAllBuyerMoney() {
        return allBuyerMoney;
    }
    
    /**
    */
    public void setAllBuyerMoney(Long allBuyerMoney) {
        this.allBuyerMoney = allBuyerMoney;
    }
    
    /**
    * 	int64 		活跃买家交易金额
    */
    public Long getActBuyerMoney() {
        return actBuyerMoney;
    }
    
    /**
    */
    public void setActBuyerMoney(Long actBuyerMoney) {
        this.actBuyerMoney = actBuyerMoney;
    }
    
    /**
    *  	int64 		新买家交易金额
    */
    public Long getNewBuyerMoney() {
        return newBuyerMoney;
    }
    
    /**
    */
    public void setNewBuyerMoney(Long newBuyerMoney) {
        this.newBuyerMoney = newBuyerMoney;
    }
    
    /**
    *  	int64 		老买家交易金额
    */
    public Long getOldBuyerMoney() {
        return oldBuyerMoney;
    }
    
    /**
    */
    public void setOldBuyerMoney(Long oldBuyerMoney) {
        this.oldBuyerMoney = oldBuyerMoney;
    }
    
}
