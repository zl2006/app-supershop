package org.yy.paipai.response.shop;

/*
* 文 件 名:  CreateShopCouponResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   创建店铺优惠券,http://pop.paipai.com/api/paipai/shop/createShopCoupon响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
*  创建店铺优惠券,http://pop.paipai.com/api/paipai/shop/createShopCoupon响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreateShopCouponResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -4632304437099712805L;
    /**
     * 	优惠券key
     */
    private String couponKey;
    
    /**
    * 	优惠券key
    */
    public String getCouponKey() {
        return couponKey;
    }
    
    /**
    */
    public void setCouponKey(String couponKey) {
        this.couponKey = couponKey;
    }
    
}
