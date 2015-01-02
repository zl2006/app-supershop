package org.yy.paipai.request.item;

/*
* 文 件 名:  GetShopRecommendListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺推荐商品列表接口 ,http://pop.paipai.com/api/paipai/item/getShopRecommendList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.GetShopRecommendListResponse;
/**
* 查询店铺推荐商品列表接口 ,http://pop.paipai.com/api/paipai/item/getShopRecommendList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopRecommendListRequest extends AbstractPaiPaiRequest<GetShopRecommendListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/getShopRecommendList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopRecommendListResponse> getResponseClass() {
        return GetShopRecommendListResponse.class;
    }
    
    /**
    *卖家QQ号
    */
    public String getSellerUin() {
        return textMap.get("sellerUin");
    }
    
    /**
    *
    */
    public void setSellerUin(String sellerUin) {
        textMap.put("sellerUin", sellerUin);
    }
    
    /**
    * 默认0，为1表示当卖家没有推荐商品时系统自动推荐
    */
    public Long getNeedSysRecom() {
        return Long.valueOf(textMap.get("needSysRecom"));
    }
    
    /**
     * 
    */
    public void setNeedSysRecom(Long needSysRecom) {
        textMap.put("needSysRecom", String.valueOf(needSysRecom));
    }
    
}
