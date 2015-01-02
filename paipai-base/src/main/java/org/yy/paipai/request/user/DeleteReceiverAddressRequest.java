package org.yy.paipai.request.user;

/*
* 文 件 名:  DeleteReceiverAddressRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  删除收货地址,http://pop.paipai.com/api/paipai/user/deleteReceiverAddress请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 删除收货地址,http://pop.paipai.com/api/paipai/user/deleteReceiverAddress请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DeleteReceiverAddressRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/user/deleteReceiverAddress.xhtml 、";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    * 买家QQ号码
    */
    public Long getBuyerUin() {
        return Long.valueOf(textMap.get("buyerUin"));
    }
    
    /**
     * 
    */
    public void setBuyerUin(Long buyerUin) {
        textMap.put("buyerUin", String.valueOf(buyerUin));
    }
    
    /**
    * 	收货地址记录的id号
    */
    public Long getAddressId() {
        return Long.valueOf(textMap.get("addressId"));
    }
    
    /**
     * 
    */
    public void setAddressId(Long addressId) {
        textMap.put("addressId", String.valueOf(addressId));
    }
    
}
