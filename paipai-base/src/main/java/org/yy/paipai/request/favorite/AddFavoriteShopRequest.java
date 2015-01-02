package org.yy.paipai.request.favorite;

/*
* 文 件 名:  AddFavoriteShopRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  增加一个店铺到收藏列表中,http://pop.paipai.com/api/paipai/favorite/addFavoriteShop请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 增加一个店铺到收藏列表中,http://pop.paipai.com/api/paipai/favorite/addFavoriteShop请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddFavoriteShopRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/favorite/addFavoriteShop.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    * *	uint32	[10000,9999999999999]	卖家QQ号
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
