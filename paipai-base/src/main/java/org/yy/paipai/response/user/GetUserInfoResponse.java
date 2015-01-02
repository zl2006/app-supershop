package org.yy.paipai.response.user;

/*
* 文 件 名:  GetUserInfoResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   获取用户信息 ，http://pop.paipai.com/api/paipai/user/getUserInfo响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
*  获取用户信息 ，http://pop.paipai.com/api/paipai/user/getUserInfo响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetUserInfoResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 8887222674159999081L;
    
    /**
     * 用户QQ号码
     */
    private Long uin;
    
    /**
     * 用户拍拍网的昵称
     */
    private String nickName;
    
    /**
     * 用户的买家信用
     */
    private Long buyerCredit;
    
    /**
     * 用户的卖家信用
     */
    private Long sellerCredit;
    
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
    * 用户拍拍网的昵称
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
    
}
