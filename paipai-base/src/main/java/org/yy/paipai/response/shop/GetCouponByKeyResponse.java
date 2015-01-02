package org.yy.paipai.response.shop;

/*
* 文 件 名:  GetCouponByKeyResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺优惠券 ,http://pop.paipai.com/api/paipai/shop/getCouponByKey响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiResponse;

/**
* 查询店铺优惠券 ,http://pop.paipai.com/api/paipai/shop/getCouponByKey响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetCouponByKeyResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -1121303926019275970L;
    
    /**
     * 优惠券id
     */
    private Long couponId;
    
    /**
     * 优惠券key
     */
    private String couponKey;
    
    /**
     * 卖家QQ号
     */
    private Long sellerUin;
    
    /**
     * 卖家店铺名称
     */
    private String shopName;
    
    /**
     * 优惠券名称
     */
    private String couponName;
    
    /**
     * 优惠券面额
     */
    private Long faceValue;
    
    /**
     * 发行总量
     */
    private Long maxIssue;
    
    /**
     * 每个人最多能领取的优惠券数量
     */
    private Long maxHave;
    
    /**
     * 有效期开始时间
     */
    private Date beginTime;
    
    /**
     * 有效期结束时间
     */
    private Date endTime;
    
    /**
     * 领取后有效天数
     */
    private Long maxExpireDays;
    
    /**
     * 使用条件：最低限额
     */
    private Long miniMum;
    
    /**
     * 已发放总量
     */
    private Long totalSend;
    
    /**
    * 优惠券id
    */
    public Long getCouponId() {
        return couponId;
    }
    
    /**
    */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
    
    /**
    * 优惠券key
    */
    public String getCouponKey() {
        return couponKey;
    }
    
    /**
    */
    public void setCouponKey(String couponKey) {
        this.couponKey = couponKey;
    }
    
    /**
    * 卖家QQ号
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
    * 卖家店铺名称
    */
    public String getShopName() {
        return shopName;
    }
    
    /**
    */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    
    /**
    * 优惠券名称
    */
    public String getCouponName() {
        return couponName;
    }
    
    /**
    */
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }
    
    /**
    * 优惠券面额
    */
    public Long getFaceValue() {
        return faceValue;
    }
    
    /**
    */
    public void setFaceValue(Long faceValue) {
        this.faceValue = faceValue;
    }
    
    /**
    * 发行总量
    */
    public Long getMaxIssue() {
        return maxIssue;
    }
    
    /**
    */
    public void setMaxIssue(Long maxIssue) {
        this.maxIssue = maxIssue;
    }
    
    /**
    * 每个人最多能领取的优惠券数量
    */
    public Long getMaxHave() {
        return maxHave;
    }
    
    /**
    */
    public void setMaxHave(Long maxHave) {
        this.maxHave = maxHave;
    }
    
    /**
    * 有效期开始时间
    */
    public Date getBeginTime() {
        return beginTime;
    }
    
    /**
    */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    
    /**
    * 有效期结束时间
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
    * 领取后有效天数
    */
    public Long getMaxExpireDays() {
        return maxExpireDays;
    }
    
    /**
    */
    public void setMaxExpireDays(Long maxExpireDays) {
        this.maxExpireDays = maxExpireDays;
    }
    
    /**
    * 使用条件：最低限额
    */
    public Long getMiniMum() {
        return miniMum;
    }
    
    /**
    */
    public void setMiniMum(Long miniMum) {
        this.miniMum = miniMum;
    }
    
    /**
    * 已发放总量
    */
    public Long getTotalSend() {
        return totalSend;
    }
    
    /**
    */
    public void setTotalSend(Long totalSend) {
        this.totalSend = totalSend;
    }
    
}
