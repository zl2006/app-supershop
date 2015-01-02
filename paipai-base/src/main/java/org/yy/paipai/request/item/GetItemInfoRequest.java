package org.yy.paipai.request.item;

/*
* 文 件 名:  GetItemInfoRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询商品相关信息接口 ，http://pop.paipai.com/api/paipai/item/getItemInfo请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.GetItemInfoResponse;

/**
* 查询商品相关信息接口 ，http://pop.paipai.com/api/paipai/item/getItemInfo请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemInfoRequest extends AbstractPaiPaiRequest<GetItemInfoResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/getItemInfo.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetItemInfoResponse> getResponseClass() {
        return GetItemInfoResponse.class;
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
    *需要查询的商品信息： 2048:商品实时浏览量信息
    */
    public String getOptionStr() {
        return textMap.get("optionStr");
    }
    
    /**
    *
    */
    public void setOptionStr(String optionStr) {
        textMap.put("optionStr", optionStr);
    }
    
}
