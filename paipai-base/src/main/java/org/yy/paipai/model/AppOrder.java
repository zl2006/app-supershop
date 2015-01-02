package org.yy.paipai.model;

/*
* 文 件 名:  AppOrder.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  收费平台订单,http://pop.paipai.com/api/paipai/appstore/getAppOrderList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 收费平台订单,http://pop.paipai.com/api/paipai/appstore/getAppOrderList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class AppOrder extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -3620873080938726766L;
    
    /**
     * 
     */
    private Long orderId;
    
    /**
     * 
     */
    private Long appId;
    
    /**
     * 
     */
    private Long spUin;
    
    /**
     * 
     */
    private Long userUin;
    
    /**
     *  	number 		收费项目id
     */
    private Long chargeItemId;
    
    /**
     *  	string 		收费项目名称
     */
    private String chargeItemName;
    
    /**
     *  	number 		订购周期(月份)
     */
    private Long effectiveMonth;
    
    /**
     *  	number 		实付金额(分)
     */
    private Long payAmount;
    
    /**
     *  	number 		订购类型 : 1.New:订单,2.Renew:续订,3.Upgrade:升级
     */
    private Long orderType;
    
    /**
     *  	number 		支付状态:1.New:新建,2.Paid:已付款,3.Upgraded:被升级,4.Cancel:取消,5.SystemClose:付款超时关闭
     */
    private Long status;
    
    /**
     *  	number 		生效时间
     */
    private Long effectiveTime;
    
    /**
     *  	number 		失效时间
     */
    private Long expireTime;
    
    /**
    * 
    */
    public Long getOrderId() {
        return orderId;
    }
    
    /**
    */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    
    /**
    * 
    */
    public Long getAppId() {
        return appId;
    }
    
    /**
    */
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    
    /**
    * 
    */
    public Long getSpUin() {
        return spUin;
    }
    
    /**
    */
    public void setSpUin(Long spUin) {
        this.spUin = spUin;
    }
    
    /**
    * 
    */
    public Long getUserUin() {
        return userUin;
    }
    
    /**
    */
    public void setUserUin(Long userUin) {
        this.userUin = userUin;
    }
    
    /**
    *  	number 		收费项目id
    */
    public Long getChargeItemId() {
        return chargeItemId;
    }
    
    /**
    */
    public void setChargeItemId(Long chargeItemId) {
        this.chargeItemId = chargeItemId;
    }
    
    /**
    *  	string 		收费项目名称
    */
    public String getChargeItemName() {
        return chargeItemName;
    }
    
    /**
    */
    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName;
    }
    
    /**
    *  	number 		订购周期(月份)
    */
    public Long getEffectiveMonth() {
        return effectiveMonth;
    }
    
    /**
    */
    public void setEffectiveMonth(Long effectiveMonth) {
        this.effectiveMonth = effectiveMonth;
    }
    
    /**
    *  	number 		实付金额(分)
    */
    public Long getPayAmount() {
        return payAmount;
    }
    
    /**
    */
    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }
    
    /**
    *  	number 		订购类型 : 1.New:订单,2.Renew:续订,3.Upgrade:升级
    */
    public Long getOrderType() {
        return orderType;
    }
    
    /**
    */
    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }
    
    /**
    *  	number 		支付状态:1.New:新建,2.Paid:已付款,3.Upgraded:被升级,4.Cancel:取消,5.SystemClose:付款超时关闭
    */
    public Long getStatus() {
        return status;
    }
    
    /**
    */
    public void setStatus(Long status) {
        this.status = status;
    }
    
    /**
    *  	number 		生效时间
    */
    public Long getEffectiveTime() {
        return effectiveTime;
    }
    
    /**
    */
    public void setEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
    
    /**
    *  	number 		失效时间
    */
    public Long getExpireTime() {
        return expireTime;
    }
    
    /**
    */
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }
    
}
