package org.yy.paipai.request.shop;

/*
* 文 件 名:  ActiveGetCouponRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  买家自主领取店铺优惠券,http://pop.paipai.com/api/paipai/shop/activeGetCoupon请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 买家自主领取店铺优惠券,http://pop.paipai.com/api/paipai/shop/activeGetCoupon请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ActiveGetCouponRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/activeGetCoupon.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    *	优惠券key
    */
    public String getCouponKey() {
        return textMap.get("couponKey");
    }
    
    /**
    *
    */
    public void setCouponKey(String couponKey) {
        textMap.put("couponKey", couponKey);
    }
    
    /**
    * 要领取的目标店铺卖家QQ号，即优惠券所属的店铺
    */
    public Long getSellerUin() {
        return Long.valueOf(textMap.get("sellerUin"));
    }
    
    /**
     * 
    */
    public void setSellerUin(Long sellerUin) {
        textMap.put("sellerUin", String.valueOf(sellerUin));
    }
    
}
