package org.yy.paipai.request.item;

/*
* 文 件 名:  GetItemDetailInfoRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询商品详情描述说明,http://pop.paipai.com/api/paipai/item/getItemDetailInfo请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.GetItemDetailInfoResponse;

/**
* 查询商品详情描述说明,http://pop.paipai.com/api/paipai/item/getItemDetailInfo请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemDetailInfoRequest extends AbstractPaiPaiRequest<GetItemDetailInfoResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/getItemDetailInfo.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetItemDetailInfoResponse> getResponseClass() {
        return GetItemDetailInfoResponse.class;
    }
    
    /**
    *商品编码 itemCode和itemLocalCode至少必须填写一个。
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
    *商家编码 itemCode和itemLocalCode至少必须填写一个。
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
    
}
