package org.yy.paipai.request.item;

/*
* 文 件 名:  DeleteItemStockImageActionRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   删除商品库存图片,http://pop.paipai.com/api/paipai/item/deleteItemStockImageAction请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
*  删除商品库存图片,http://pop.paipai.com/api/paipai/item/deleteItemStockImageAction请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DeleteItemStockImageActionRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/deleteItemStockImageAction.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    *商品编码 itemCode和itemLocalCode至少必须填写一个。 索引字段，不能修改。
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
    *商品私有编码 itemCode和itemLocalCode至少必须填写一个。 索引字段，不能修改。
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
    *库存串,可支持多个以|分割，如：颜色:红|颜色:白
    */
    public String getStockStr() {
        return textMap.get("stockStr");
    }
    
    /**
    *
    */
    public void setStockStr(String stockStr) {
        textMap.put("stockStr", stockStr);
    }
    
}
