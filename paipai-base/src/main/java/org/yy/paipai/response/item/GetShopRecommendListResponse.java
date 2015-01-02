package org.yy.paipai.response.item;

/*
* 文 件 名:  GetShopRecommendListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺推荐商品列表接口 ,http://pop.paipai.com/api/paipai/item/getShopRecommendList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Item;

/**
* 查询店铺推荐商品列表接口 ,http://pop.paipai.com/api/paipai/item/getShopRecommendList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopRecommendListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2595985813409397386L;
    
    /**
     * 记录总数
     */
    private String countTotal;
    
    /**
     * 商品列表
     */
    private List<Item> itemList;
    
    /**
    * 记录总数
    */
    public String getCountTotal() {
        return countTotal;
    }
    
    /**
    */
    public void setCountTotal(String countTotal) {
        this.countTotal = countTotal;
    }
    
    /**
    * 商品列表
    */
    public List<Item> getItemList() {
        return itemList;
    }
    
    /**
    */
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
    
}
