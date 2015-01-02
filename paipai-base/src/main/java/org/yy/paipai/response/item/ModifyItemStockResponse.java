package org.yy.paipai.response.item;

/*
* 文 件 名:  ModifyItemStockResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改商品库存或价格响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 修改商品库存或价格响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemStockResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -7965855356504954500L;
    
    /**
     * 商品编码
     */
    private String itemCode;
    
    /**
     * 同步后的库存价格
     */
    private Long stockPrice;
    
    /**
     * 同步后的库存数量
     */
    private Long stockCount;
    
    /**
    * 商品编码
    */
    public String getItemCode() {
        return itemCode;
    }
    
    /**
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * 同步后的库存价格
    */
    public Long getStockPrice() {
        return stockPrice;
    }
    
    /**
    */
    public void setStockPrice(Long stockPrice) {
        this.stockPrice = stockPrice;
    }
    
    /**
    * 同步后的库存数量
    */
    public Long getStockCount() {
        return stockCount;
    }
    
    /**
    */
    public void setStockCount(Long stockCount) {
        this.stockCount = stockCount;
    }
    
}
