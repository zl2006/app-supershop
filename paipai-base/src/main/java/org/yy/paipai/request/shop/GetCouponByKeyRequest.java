package org.yy.paipai.request.shop;

/*
* 文 件 名:  GetCouponByKeyRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺优惠券 ,http://pop.paipai.com/api/paipai/shop/getCouponByKey请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetCouponByKeyResponse;

/**
* 查询店铺优惠券 ,http://pop.paipai.com/api/paipai/shop/getCouponByKey请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetCouponByKeyRequest extends AbstractPaiPaiRequest<GetCouponByKeyResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/getCouponByKey.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetCouponByKeyResponse> getResponseClass() {
        return GetCouponByKeyResponse.class;
    }
    
    /**
    *优惠券key
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
    
}
