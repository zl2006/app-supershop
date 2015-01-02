package org.yy.paipai.request.user;

/*
* 文 件 名:  ModifyReceiverAddressRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改收货地址,http://pop.paipai.com/api/paipai/user/modifyReceiverAddress请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 修改收货地址,http://pop.paipai.com/api/paipai/user/modifyReceiverAddress请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyReceiverAddressRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/modifyReceiverAddress.xhtml";
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
    
    /**
    * 收货地区编号
    */
    public Long getRegionId() {
        return Long.valueOf(textMap.get("regionId"));
    }
    
    /**
     * 
    */
    public void setRegionId(Long regionId) {
        textMap.put("regionId", String.valueOf(regionId));
    }
    
    /**
    *	收货人姓名
    */
    public String getName() {
        return textMap.get("name");
    }
    
    /**
    *
    */
    public void setName(String name) {
        textMap.put("name", name);
    }
    
    /**
    *收货地址
    */
    public String getAddress() {
        return textMap.get("address");
    }
    
    /**
    *
    */
    public void setAddress(String address) {
        textMap.put("address", address);
    }
    
    /**
    *手机
    */
    public String getMobile() {
        return textMap.get("mobile");
    }
    
    /**
    *
    */
    public void setMobile(String mobile) {
        textMap.put("mobile", mobile);
    }
    
    /**
    *电话
    */
    public String getPhone() {
        return textMap.get("phone");
    }
    
    /**
    *
    */
    public void setPhone(String phone) {
        textMap.put("phone", phone);
    }
    
    /**
    * 邮编
    */
    public Long getPostcode() {
        return Long.valueOf(textMap.get("postcode"));
    }
    
    /**
     * 
    */
    public void setPostcode(Long postcode) {
        textMap.put("postcode", String.valueOf(postcode));
    }
    
}
