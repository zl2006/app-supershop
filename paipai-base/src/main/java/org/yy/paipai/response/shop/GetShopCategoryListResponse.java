package org.yy.paipai.response.shop;


/*
* 文 件 名:  GetShopCategoryListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  店铺分类，http://pop.paipai.com/api/paipai/shop/getShopCategoryList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ShopCategory;

/**
* 店铺分类，http://pop.paipai.com/api/paipai/shop/getShopCategoryList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopCategoryListResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 7630527513070767728L;

    /**
     * 卖家uin号
     */
    private Long sellerUin;
    
    /**
     * 分类列表
     */
    private List<ShopCategory> shopCategoryList;
     
	
    /**
    * 卖家uin号
    */
    public Long getSellerUin() {
        return  sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    * 分类列表
    */
    public List<ShopCategory> getShopCategoryList() {
        return  shopCategoryList;
    }
    
    /**
    */
    public void setShopCategoryList(List<ShopCategory> shopCategoryList) {
        this.shopCategoryList = shopCategoryList;
    }
     
    
}

