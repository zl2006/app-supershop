package org.yy.paipai.request.shop;

/*
* 文 件 名:  GetShopInfoRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   查询店铺的信息,http://pop.paipai.com/api/paipai/shop/getShopInfo请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetShopInfoResponse;

/**
*  查询店铺的信息,http://pop.paipai.com/api/paipai/shop/getShopInfo请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopInfoRequest extends AbstractPaiPaiRequest<GetShopInfoResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/getShopInfo.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopInfoResponse> getResponseClass() {
        return GetShopInfoResponse.class;
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
    
    /**
    * 是否查询并输出promotions字段,1：输出,其他：不输出
    */
    public Long getShowPromotionString() {
        return Long.valueOf(textMap.get("showPromotionString"));
    }
    
    /**
     * 
    */
    public void setShowPromotionString(Long showPromotionString) {
        textMap.put("showPromotionString", String.valueOf(showPromotionString));
    }
    
    /**
    * 是否查询并输出店铺关注数concernNum字段,1：输出,其他：不输出
    */
    public Long getEnableConcern() {
        return Long.valueOf(textMap.get("enableConcern"));
    }
    
    /**
     * 
    */
    public void setEnableConcern(Long enableConcern) {
        textMap.put("enableConcern", String.valueOf(enableConcern));
    }
    
}
