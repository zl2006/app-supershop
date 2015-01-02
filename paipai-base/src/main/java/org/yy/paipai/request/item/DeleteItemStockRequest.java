package org.yy.paipai.request.item;

/*
* 文 件 名:  DeleteItemStockRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   批量删除商品库存 ,http://pop.paipai.com/api/paipai/item/deleteItemStock请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.DeleteItemStockResponse;

/**
*  批量删除商品库存 ,http://pop.paipai.com/api/paipai/item/deleteItemStock请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DeleteItemStockRequest extends AbstractPaiPaiRequest<DeleteItemStockResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/deleteItemStock.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<DeleteItemStockResponse> getResponseClass() {
        return DeleteItemStockResponse.class;
    }
    
    /**
    *商品编码
    */
    public String getItemCode() {
        return textMap.get("itemCode");
    }
    
    /**
    *
    */
    public void setItemCode(String itemCode) {
        textMap.put("itemCode", itemCode);
    }
    
    /**
    *要删除的sku列表。格式:skuId;skuId;...
    */
    public String getSkuIdList() {
        return textMap.get("skuIdList");
    }
    
    /**
    *
    */
    public void setSkuIdList(String skuIdList) {
        textMap.put("skuIdList", skuIdList);
    }
    
}
