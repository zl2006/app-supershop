package org.yy.paipai.model;

/*
* 文 件 名:  ShopPVLog.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍店铺pv基础日志明细 ,   http://pop.paipai.com/api/paipai/shop/getShopPVLog 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 拍拍店铺pv基础日志明细 ,   http://pop.paipai.com/api/paipai/shop/getShopPVLog 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ShopPVLog extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 8034391379315293081L;
    
    /**
     * 统计日期
     */
    private String fday;
    
    /**
     * 店铺号
     */
    private Long shopId;
    
    /**
     * 访问唯一标识：可以认为同一个visitkey对应一台PC
     */
    private String visitKey;
    
    /**
     * 用户session id
     */
    private String sessionId;
    
    /**
     * 访问用户ip地址
     */
    private String clientIp;
    
    /**
     * 访问的当前页完整URL
     */
    private String currentUrl;
    
    /**
     * 访问当前页URL业务模块
     */
    private String currentUrlRule;
    
    /**
     * 访问当前页域名
     */
    private String currentUrlDomain;
    
    /**
     * 来源页完整URL
     */
    private String referUrl;
    
    /**
     * 来源页URL业务模块
     */
    private String referUrlRule;
    
    /**
     * 来源页域名
     */
    private String referUrlDomain;
    
    /**
     * 访问用户QQ
     */
    private Long buyerId;
    
    /**
     * 访问用户pv总数,即该session产生了多少pv
     */
    private Long pvCount;
    
    /**
     * 日志产生时间
     */
    private String logTime;
    
    /**
    * 统计日期
    */
    public String getFday() {
        return fday;
    }
    
    /**
    */
    public void setFday(String fday) {
        this.fday = fday;
    }
    
    /**
    * 店铺号
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
    * 访问唯一标识：可以认为同一个visitkey对应一台PC
    */
    public String getVisitKey() {
        return visitKey;
    }
    
    /**
    */
    public void setVisitKey(String visitKey) {
        this.visitKey = visitKey;
    }
    
    /**
    * 用户session id
    */
    public String getSessionId() {
        return sessionId;
    }
    
    /**
    */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    
    /**
    * 访问用户ip地址
    */
    public String getClientIp() {
        return clientIp;
    }
    
    /**
    */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
    
    /**
    * 访问的当前页完整URL
    */
    public String getCurrentUrl() {
        return currentUrl;
    }
    
    /**
    */
    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }
    
    /**
    * 访问当前页URL业务模块
    */
    public String getCurrentUrlRule() {
        return currentUrlRule;
    }
    
    /**
    */
    public void setCurrentUrlRule(String currentUrlRule) {
        this.currentUrlRule = currentUrlRule;
    }
    
    /**
    * 访问当前页域名
    */
    public String getCurrentUrlDomain() {
        return currentUrlDomain;
    }
    
    /**
    */
    public void setCurrentUrlDomain(String currentUrlDomain) {
        this.currentUrlDomain = currentUrlDomain;
    }
    
    /**
    * 来源页完整URL
    */
    public String getReferUrl() {
        return referUrl;
    }
    
    /**
    */
    public void setReferUrl(String referUrl) {
        this.referUrl = referUrl;
    }
    
    /**
    * 来源页URL业务模块
    */
    public String getReferUrlRule() {
        return referUrlRule;
    }
    
    /**
    */
    public void setReferUrlRule(String referUrlRule) {
        this.referUrlRule = referUrlRule;
    }
    
    /**
    * 来源页域名
    */
    public String getReferUrlDomain() {
        return referUrlDomain;
    }
    
    /**
    */
    public void setReferUrlDomain(String referUrlDomain) {
        this.referUrlDomain = referUrlDomain;
    }
    
    /**
    * 访问用户QQ
    */
    public Long getBuyerId() {
        return buyerId;
    }
    
    /**
    */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }
    
    /**
    * 访问用户pv总数,即该session产生了多少pv
    */
    public Long getPvCount() {
        return pvCount;
    }
    
    /**
    */
    public void setPvCount(Long pvCount) {
        this.pvCount = pvCount;
    }
    
    /**
    * 日志产生时间
    */
    public String getLogTime() {
        return logTime;
    }
    
    /**
    */
    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }
    
}
