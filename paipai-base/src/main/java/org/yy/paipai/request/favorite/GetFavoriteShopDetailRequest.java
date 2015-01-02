package org.yy.paipai.request.favorite;

/*
* 文 件 名:  GetFavoriteShopDetailRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询指定用户是否收藏了指定店铺 ,http://pop.paipai.com/api/paipai/favorite/getFavoriteShopDetail请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.favorite.GetFavoriteShopDetailResponse;

/**
* 查询指定用户是否收藏了指定店铺 ,http://pop.paipai.com/api/paipai/favorite/getFavoriteShopDetail请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetFavoriteShopDetailRequest extends AbstractPaiPaiRequest<GetFavoriteShopDetailResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/favorite/getFavoriteShopDetail.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetFavoriteShopDetailResponse> getResponseClass() {
        return GetFavoriteShopDetailResponse.class;
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
