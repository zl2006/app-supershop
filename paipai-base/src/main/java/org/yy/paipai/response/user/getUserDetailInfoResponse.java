package org.yy.paipai.response.user;

/*
* 文 件 名:  getUserDetailInfoResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  获取用户的详细信息,http://pop.paipai.com/api/paipai/user/getUserDetailInfo响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 获取用户的详细信息,http://pop.paipai.com/api/paipai/user/getUserDetailInfo响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class getUserDetailInfoResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -3260061432507319416L;
    
    /**
     * 用户QQ号码
     */
    private Long uin;
    
    /**
     *  	用户拍拍网的昵称
     */
    private String nickName;
    
    /**
     * 性别 1=男 2=女
     */
    private String sex;
    
    /**
     * 电子邮箱
     */
    private String email;
    
    /**
     * 用户的买家信用
     */
    private Long buyerCredit;
    
    /**
     * 用户的卖家信用
     */
    private Long sellerCredit;
    
    /**
     * 店铺电话
     */
    private String telephone;
    
    /**
     * 售前电话
     */
    private String telephoneBefore;
    
    /**
     * 售后电话
     */
    private String telephoneAfter;
    
    /**
     * 售前手机号码
     */
    private String mobileBefore;
    
    /**
     * 售后手机号码
     */
    private String mobileAfter;
    
    /**
     * 用户认证属性AuthMask 2=身份证认证 16=多工号系统员工身份 0=非卖家身份
     */
    private Long authMask;
    
    /**
     * 用户常规属性 格式为：key1_value1|key2_value2|key3_value3|.... 例如：2_1|25_1|34_1|..... key对应的数据字典如下所示：
     */
    private String properties;
    
    /**
    * 用户QQ号码
    */
    public Long getUin() {
        return uin;
    }
    
    /**
    */
    public void setUin(Long uin) {
        this.uin = uin;
    }
    
    /**
    *  	用户拍拍网的昵称
    */
    public String getNickName() {
        return nickName;
    }
    
    /**
    */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    /**
    * 性别 1=男 2=女
    */
    public String getSex() {
        return sex;
    }
    
    /**
    */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /**
    * 电子邮箱
    */
    public String getEmail() {
        return email;
    }
    
    /**
    */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
    * 用户的买家信用
    */
    public Long getBuyerCredit() {
        return buyerCredit;
    }
    
    /**
    */
    public void setBuyerCredit(Long buyerCredit) {
        this.buyerCredit = buyerCredit;
    }
    
    /**
    * 用户的卖家信用
    */
    public Long getSellerCredit() {
        return sellerCredit;
    }
    
    /**
    */
    public void setSellerCredit(Long sellerCredit) {
        this.sellerCredit = sellerCredit;
    }
    
    /**
    * 店铺电话
    */
    public String getTelephone() {
        return telephone;
    }
    
    /**
    */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
    * 售前电话
    */
    public String getTelephoneBefore() {
        return telephoneBefore;
    }
    
    /**
    */
    public void setTelephoneBefore(String telephoneBefore) {
        this.telephoneBefore = telephoneBefore;
    }
    
    /**
    * 售后电话
    */
    public String getTelephoneAfter() {
        return telephoneAfter;
    }
    
    /**
    */
    public void setTelephoneAfter(String telephoneAfter) {
        this.telephoneAfter = telephoneAfter;
    }
    
    /**
    * 售前手机号码
    */
    public String getMobileBefore() {
        return mobileBefore;
    }
    
    /**
    */
    public void setMobileBefore(String mobileBefore) {
        this.mobileBefore = mobileBefore;
    }
    
    /**
    * 售后手机号码
    */
    public String getMobileAfter() {
        return mobileAfter;
    }
    
    /**
    */
    public void setMobileAfter(String mobileAfter) {
        this.mobileAfter = mobileAfter;
    }
    
    /**
    * 用户认证属性AuthMask 2=身份证认证 16=多工号系统员工身份 0=非卖家身份
    */
    public Long getAuthMask() {
        return authMask;
    }
    
    /**
    */
    public void setAuthMask(Long authMask) {
        this.authMask = authMask;
    }
    
    /**
    * 用户常规属性 格式为：key1_value1|key2_value2|key3_value3|.... 例如：2_1|25_1|34_1|..... key对应的数据字典如下所示：
    */
    public String getProperties() {
        return properties;
    }
    
    /**
    */
    public void setProperties(String properties) {
        this.properties = properties;
    }
    
}
