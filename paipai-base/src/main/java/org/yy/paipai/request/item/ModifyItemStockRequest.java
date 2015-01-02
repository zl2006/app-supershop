package org.yy.paipai.request.item;

/*
* 文 件 名:  ModifyItemStockRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改商品库存或价格,http://pop.paipai.com/api/paipai/item/modifyItemStock请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.ModifyItemStockResponse;

/**
* 修改商品库存或价格,http://pop.paipai.com/api/paipai/item/modifyItemStock请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemStockRequest extends AbstractPaiPaiRequest<ModifyItemStockResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/modifyItemStock.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ModifyItemStockResponse> getResponseClass() {
        return ModifyItemStockResponse.class;
    }
    
    /**
    *卖家QQ号
    */
    public String getSellerUin() {
        return textMap.get("sellerUin");
    }
    
    /**
    *
    */
    public void setSellerUin(String sellerUin) {
        textMap.put("sellerUin", sellerUin);
    }
    
    /**
    *商品编码 itemCode和itemLocalCode两者中只需要填写一个。
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
    *商家编码 itemCode和itemLocalCode两者中只需要填写一个。
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
    *库存唯一标识sku id,由拍拍平台生成
    */
    public String getSkuId() {
        return textMap.get("skuId");
    }
    
    /**
    *
    */
    public void setSkuId(String skuId) {
        textMap.put("skuId", skuId);
    }
    
    /**
    *合作商家的私有库存编码,如果有填写skuId,不需要填写该字段
    */
    public String getStockLocalCode() {
        return textMap.get("stockLocalCode");
    }
    
    /**
    *
    */
    public void setStockLocalCode(String stockLocalCode) {
        textMap.put("stockLocalCode", stockLocalCode);
    }
    
    /**
    *库存属性串:比如：尺码:L|颜色:黑色。如果有填写skuId,不需要填写该字段。
    */
    public String getStockAttr() {
        return textMap.get("stockAttr");
    }
    
    /**
    *
    */
    public void setStockAttr(String stockAttr) {
        textMap.put("stockAttr", stockAttr);
    }
    
    /**
    * 商品库存价格 商品的库存价格不能修改成比市场价大 单位为分。若该库存价格不变，则不应提供本节点。
    */
    public Long getStockPrice() {
        return Long.valueOf(textMap.get("stockPrice"));
    }
    
    /**
     * 
    */
    public void setStockPrice(Long stockPrice) {
        textMap.put("stockPrice", String.valueOf(stockPrice));
    }
    
    /**
    * 库存数量 若该库存数量不变，则不应提供本节点。
    */
    public Long getStockCount() {
        return Long.valueOf(textMap.get("stockCount"));
    }
    
    /**
     * 
    */
    public void setStockCount(Long stockCount) {
        textMap.put("stockCount", String.valueOf(stockCount));
    }
    
    /**
    *库存备注
    */
    public String getStockRemark() {
        return textMap.get("stockRemark");
    }
    
    /**
    *
    */
    public void setStockRemark(String stockRemark) {
        textMap.put("stockRemark", stockRemark);
    }
    
    /**
    * 	是否修改库存编码，0=否；1=是
    */
    public Long getModifyLocalCode() {
        return Long.valueOf(textMap.get("modifyLocalCode"));
    }
    
    /**
     * 
    */
    public void setModifyLocalCode(Long modifyLocalCode) {
        textMap.put("modifyLocalCode", String.valueOf(modifyLocalCode));
    }
    
    /**
    *需要修改的新库存编码，该字段其作用的前提是modifyLocalCode=1
    */
    public String getStockLocalCodeNew() {
        return textMap.get("stockLocalCodeNew");
    }
    
    /**
    *
    */
    public void setStockLocalCodeNew(String stockLocalCodeNew) {
        textMap.put("stockLocalCodeNew", stockLocalCodeNew);
    }
    
    /**
    *	需要修改的新商家编码，该字段其作用的前提是modifyLocalCode=1
    */
    public String getItemLocalCodeNew() {
        return textMap.get("itemLocalCodeNew");
    }
    
    /**
    *
    */
    public void setItemLocalCodeNew(String itemLocalCodeNew) {
        textMap.put("itemLocalCodeNew", itemLocalCodeNew);
    }
    
}
