package org.yy.paipai.model;

/*
* 文 件 名:  ActiveContent.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  店铺满减满送活动信息 ,http://pop.paipai.com/api/paipai/shop/getSellerMarketActive 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 店铺满减满送活动信息 ,http://pop.paipai.com/api/paipai/shop/getSellerMarketActive 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ActiveContent extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -848101198510616457L;
    
    /**
     * 内容编号
     */
    private String contentID;
    
    /**
     *  	无效标记,1无效，0有效
     */
    private Long invalidFlag;
    
    /**
     * 消费标记,0:购买达到一定件数优惠,1:购买满多少金额优惠
     */
    private Long costFlag;
    
    /**
     * 消费金额/件数，与costFlag对应的件数和金额，金额单位为分
     */
    private Long costMoney;
    
    /**
     * 优惠标记,位操作，0：无,1:减金额,2:折扣,4:是否赠送,8:是否换购,16:是否免邮费，如果有多种优惠，propery是这些值相加的和
     */
    private Long property;
    
    /**
     * 减免金额,单位为分
     */
    private Long freeMoney;
    
    /**
     *  	折扣率
     */
    private Long freeRebate;
    
    /**
     * 赠品名称
     */
    private String presentName;
    
    /**
     * 赠品类型 0：单个商品,1：店铺分类地址
     */
    private Long presentType;
    
    /**
     * 赠品ID
     */
    private String presentID;
    
    /**
     * 赠品图片地址
     */
    private String presentUrl;
    
    /**
     * 换购金额
     */
    private Long barterMoney;
    
    /**
     * 换购商品名称
     */
    private String barterName;
    
    /**
     * 换购商品类型 0：单个商品,1：店铺分类地址
     */
    private Long barterType;
    
    /**
     * 换购商品ID
     */
    private String barterID;
    
    /**
     *  	换购商品图片地址
     */
    private String barterUrl;
    
    /**
     * 面向人群（保留字段暂不说明）
     */
    private Long facePerson;
    
    /**
    * 内容编号
    */
    public String getContentID() {
        return contentID;
    }
    
    /**
    */
    public void setContentID(String contentID) {
        this.contentID = contentID;
    }
    
    /**
    *  	无效标记,1无效，0有效
    */
    public Long getInvalidFlag() {
        return invalidFlag;
    }
    
    /**
    */
    public void setInvalidFlag(Long invalidFlag) {
        this.invalidFlag = invalidFlag;
    }
    
    /**
    * 消费标记,0:购买达到一定件数优惠,1:购买满多少金额优惠
    */
    public Long getCostFlag() {
        return costFlag;
    }
    
    /**
    */
    public void setCostFlag(Long costFlag) {
        this.costFlag = costFlag;
    }
    
    /**
    * 消费金额/件数，与costFlag对应的件数和金额，金额单位为分
    */
    public Long getCostMoney() {
        return costMoney;
    }
    
    /**
    */
    public void setCostMoney(Long costMoney) {
        this.costMoney = costMoney;
    }
    
    /**
    * 优惠标记,位操作，0：无,1:减金额,2:折扣,4:是否赠送,8:是否换购,16:是否免邮费，如果有多种优惠，propery是这些值相加的和
    */
    public Long getProperty() {
        return property;
    }
    
    /**
    */
    public void setProperty(Long property) {
        this.property = property;
    }
    
    /**
    * 减免金额,单位为分
    */
    public Long getFreeMoney() {
        return freeMoney;
    }
    
    /**
    */
    public void setFreeMoney(Long freeMoney) {
        this.freeMoney = freeMoney;
    }
    
    /**
    *  	折扣率
    */
    public Long getFreeRebate() {
        return freeRebate;
    }
    
    /**
    */
    public void setFreeRebate(Long freeRebate) {
        this.freeRebate = freeRebate;
    }
    
    /**
    * 赠品名称
    */
    public String getPresentName() {
        return presentName;
    }
    
    /**
    */
    public void setPresentName(String presentName) {
        this.presentName = presentName;
    }
    
    /**
    * 赠品类型 0：单个商品,1：店铺分类地址
    */
    public Long getPresentType() {
        return presentType;
    }
    
    /**
    */
    public void setPresentType(Long presentType) {
        this.presentType = presentType;
    }
    
    /**
    * 赠品ID
    */
    public String getPresentID() {
        return presentID;
    }
    
    /**
    */
    public void setPresentID(String presentID) {
        this.presentID = presentID;
    }
    
    /**
    * 赠品图片地址
    */
    public String getPresentUrl() {
        return presentUrl;
    }
    
    /**
    */
    public void setPresentUrl(String presentUrl) {
        this.presentUrl = presentUrl;
    }
    
    /**
    * 换购金额
    */
    public Long getBarterMoney() {
        return barterMoney;
    }
    
    /**
    */
    public void setBarterMoney(Long barterMoney) {
        this.barterMoney = barterMoney;
    }
    
    /**
    * 换购商品名称
    */
    public String getBarterName() {
        return barterName;
    }
    
    /**
    */
    public void setBarterName(String barterName) {
        this.barterName = barterName;
    }
    
    /**
    * 换购商品类型 0：单个商品,1：店铺分类地址
    */
    public Long getBarterType() {
        return barterType;
    }
    
    /**
    */
    public void setBarterType(Long barterType) {
        this.barterType = barterType;
    }
    
    /**
    * 换购商品ID
    */
    public String getBarterID() {
        return barterID;
    }
    
    /**
    */
    public void setBarterID(String barterID) {
        this.barterID = barterID;
    }
    
    /**
    *  	换购商品图片地址
    */
    public String getBarterUrl() {
        return barterUrl;
    }
    
    /**
    */
    public void setBarterUrl(String barterUrl) {
        this.barterUrl = barterUrl;
    }
    
    /**
    * 面向人群（保留字段暂不说明）
    */
    public Long getFacePerson() {
        return facePerson;
    }
    
    /**
    */
    public void setFacePerson(Long facePerson) {
        this.facePerson = facePerson;
    }
    
}
