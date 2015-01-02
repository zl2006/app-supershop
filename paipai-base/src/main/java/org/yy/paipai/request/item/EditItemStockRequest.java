package org.yy.paipai.request.item;

/*
* 文 件 名:  DditItemStockRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量修改商品库存信息 ,http://pop.paipai.com/api/paipai/item/editItemStock请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.EditItemStockResponse;

/**
* 批量修改商品库存信息 ,http://pop.paipai.com/api/paipai/item/editItemStock请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class EditItemStockRequest extends AbstractPaiPaiRequest<EditItemStockResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/editItemStock.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<EditItemStockResponse> getResponseClass() {
        return EditItemStockResponse.class;
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
    *库存信息，,最大支持一次20条库存。 库存格式请参考:通用库存字段说明
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
