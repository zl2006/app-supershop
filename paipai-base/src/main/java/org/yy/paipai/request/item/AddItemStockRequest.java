package org.yy.paipai.request.item;

/*
* 文 件 名:  AddItemStockRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量新增商品库存信息 ,http://pop.paipai.com/api/paipai/item/addItemStock请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.AddItemStockResponse;

/**
* 批量新增商品库存信息 ,http://pop.paipai.com/api/paipai/item/addItemStock请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddItemStockRequest extends AbstractPaiPaiRequest<AddItemStockResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/addItemStock.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<AddItemStockResponse> getResponseClass() {
        return AddItemStockResponse.class;
    }
    
    /**
    *商品ID
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
    *商品本地编码
    */
    public String getItemLocalCode() {
        return textMap.get("itemLocalCode");
    }
    
    /**
    *
    */
    public void setItemLocalCode(String itemLocalCode) {
        textMap.put("itemLocalCode", itemLocalCode);
    }
    
    /**
    *库存信息:参看商品库存信息字段说明,http://pop.paipai.com/doc/businessinfo/stockJsonDesc
    */
    public String getStockJsonList() {
        return textMap.get("stockJsonList");
    }
    
    /**
    *
    */
    public void setStockJsonList(String stockJsonList) {
        textMap.put("stockJsonList", stockJsonList);
    }
    
}
