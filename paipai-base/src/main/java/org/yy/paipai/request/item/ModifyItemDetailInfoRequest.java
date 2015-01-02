package org.yy.paipai.request.item;

/*
* 文 件 名:  ModifyItemDetailInfoRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改商品详情,http://pop.paipai.com/api/paipai/item/modifyItemDetailInfo请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 修改商品详情,http://pop.paipai.com/api/paipai/item/modifyItemDetailInfo请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemDetailInfoRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/modifyItemDetailInfo.xhtml";
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
    *商家编码 itemCode和itemLocalCode至少必须填写一个。 索引字段，不能修改。
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
    *商品详情说明
    */
    public String getDetailInfo() {
        return textMap.get("detailInfo");
    }
    
    /**
    *
    */
    public void setDetailInfo(String detailInfo) {
        textMap.put("detailInfo", detailInfo);
    }
    
    /**
    *	易迅商品详情内容。该接口一次只能处理一种类型详情。detailInfo和icsonDesc只需填其中一个,如果两个都填写,默认只处理detailInfo
    */
    public String getIcsonDesc() {
        return textMap.get("icsonDesc");
    }
    
    /**
    *
    */
    public void setIcsonDesc(String icsonDesc) {
        textMap.put("icsonDesc", icsonDesc);
    }
    
}
