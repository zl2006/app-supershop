package org.yy.paipai.request.shop;

/*
* 文 件 名:  GetSellerMarketActiveRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺满减满送活动信息 ,http://pop.paipai.com/api/paipai/shop/getSellerMarketActive请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetSellerMarketActiveResponse;

/**
* 查询店铺满减满送活动信息 ,http://pop.paipai.com/api/paipai/shop/getSellerMarketActive请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetSellerMarketActiveRequest extends AbstractPaiPaiRequest<GetSellerMarketActiveResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/getSellerMarketActive.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetSellerMarketActiveResponse> getResponseClass() {
        return GetSellerMarketActiveResponse.class;
    }
    
    /**
    * 卖家uin号
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
