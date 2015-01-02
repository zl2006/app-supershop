package org.yy.paipai.request.shop;


/*
* 文 件 名:  GetShopCategoryListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  店铺分类，http://pop.paipai.com/api/paipai/shop/getShopCategoryList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetShopCategoryListResponse;

/**
* 店铺分类，http://pop.paipai.com/api/paipai/shop/getShopCategoryList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopCategoryListRequest extends AbstractPaiPaiRequest<GetShopCategoryListResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/GetShopCategoryList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopCategoryListResponse> getResponseClass() {
        return GetShopCategoryListResponse.class;
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

