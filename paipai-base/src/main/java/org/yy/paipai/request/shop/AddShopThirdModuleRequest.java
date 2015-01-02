package org.yy.paipai.request.shop;

/*
* 文 件 名:  AddShopThirdModuleRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  添加店铺第三方模块,http://pop.paipai.com/api/paipai/shop/addShopThirdModule请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 添加店铺第三方模块,http://pop.paipai.com/api/paipai/shop/addShopThirdModule请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddShopThirdModuleRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/addShopThirdModule.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    *应用ID
    */
    public String getAppId() {
        return textMap.get("appId");
    }
    
    /**
    *
    */
    public void setAppId(String appId) {
        textMap.put("appId", appId);
    }
    
    /**
    *宽度类型,0表示210px*240px,1表示730px*220px
    */
    public String getWidthType() {
        return textMap.get("widthType");
    }
    
    /**
    *
    */
    public void setWidthType(String widthType) {
        textMap.put("widthType", widthType);
    }
    
    /**
    *模块名称
    */
    public String getModuleName() {
        return textMap.get("moduleName");
    }
    
    /**
    *
    */
    public void setModuleName(String moduleName) {
        textMap.put("moduleName", moduleName);
    }
    
    /**
    * 卖家QQ号
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
    
}
