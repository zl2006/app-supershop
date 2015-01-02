package org.yy.paipai.request.item;

/*
* 文 件 名:  ModifyItemStateRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量修改商品状态(上下架) 请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.ModifyItemStateResponse;

/**
* 批量修改商品状态(上下架) 请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemStateRequest extends AbstractPaiPaiRequest<ModifyItemStateResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/modifyItemState.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ModifyItemStateResponse> getResponseClass() {
        return ModifyItemStateResponse.class;
    }
    
    /**
    * 修改的结果集
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
    
    /**
    *商品编码 itemCode和itemLocalCode至少必须填写一个(总量不能超过20)。 多个商品可使用多个itemCode字段，例如： itemCode=AAAAA&itemCode=BBBBB&itemCode=CCCCC itemCode和itemLocalCode只能同时使用一种。
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
    * 商品编码,可替代itemCode参数;多个商品以逗号或者分号分隔
    */
    public String getItemCodeList() {
        return textMap.get("itemCodeList");
    }
    
    /**
    *
    */
    public void setItemCodeList(String itemCodeList) {
        textMap.put("itemCodeList", itemCodeList);
    }
    
    /**
    *商家编码 itemCode和itemLocalCode至少必须填写一个(总量不能超过20)。 多个商品可使用多个itemLocalCode字段，例如： itemLocalCode=LOCAL1&itemLocalCode=Local2
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
    *商家商品编码,可替代itemLocalCode参数;多个商品以逗号或者分号分隔
    */
    public String getItemLocalCodeList() {
        return textMap.get("itemLocalCodeList");
    }
    
    /**
    *
    */
    public void setItemLocalCodeList(String itemLocalCodeList) {
        textMap.put("itemLocalCodeList", itemLocalCodeList);
    }
    
    /**
    * 商品期望的状态 IS_FOR_SALE：上架销售。 IS_IN_STORE：放入仓库。
    */
    public String getItemState() {
        return textMap.get("itemState");
    }
    
    /**
    *
    */
    public void setItemState(String itemState) {
        textMap.put("itemState", itemState);
    }
    
}
