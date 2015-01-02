package org.yy.paipai.response.user;

/*
* 文 件 名:  GetReceiverAddressListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询买家收货地址列表 ,http://pop.paipai.com/api/paipai/user/getReceiverAddressList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ReceiverAddress;

/**
* 查询买家收货地址列表 ,http://pop.paipai.com/api/paipai/user/getReceiverAddressList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetReceiverAddressListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 3428258904329615917L;
    
    /**
     * 用户QQ号码
     */
    private Long buyerUin;
    
    /**
     * 收货地址列表
     */
    private List<ReceiverAddress> receiverAddressList;
    
    /**
    * 用户QQ号码
    */
    public Long getBuyerUin() {
        return buyerUin;
    }
    
    /**
    */
    public void setBuyerUin(Long buyerUin) {
        this.buyerUin = buyerUin;
    }
    
    /**
    * 收货地址列表
    */
    public List<ReceiverAddress> getReceiverAddressList() {
        return receiverAddressList;
    }
    
    /**
    */
    public void setReceiverAddressList(List<ReceiverAddress> receiverAddressList) {
        this.receiverAddressList = receiverAddressList;
    }
    
}
