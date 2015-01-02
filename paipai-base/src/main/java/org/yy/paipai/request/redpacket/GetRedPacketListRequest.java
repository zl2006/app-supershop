package org.yy.paipai.request.redpacket;

/*
* 文 件 名:  GetRedPacketListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询红包或优惠券列表接口 ,http://pop.paipai.com/api/paipai/redpacket/getRedPacketList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.redpacket.GetRedPacketListResponse;

/**
* 查询红包或优惠券列表接口 ,http://pop.paipai.com/api/paipai/redpacket/getRedPacketList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* 
* @since  [paipai-base/0.1]
*/
public class GetRedPacketListRequest extends AbstractPaiPaiRequest<GetRedPacketListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/redpacket/getRedPacketList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetRedPacketListResponse> getResponseClass() {
        return GetRedPacketListResponse.class;
    }
    
    /**
    * *	number		红包状态,待使用(100),使用中:绑定和冻结(101)，已使用(102),过期(2)
    */
    public Long getState() {
        return Long.valueOf(textMap.get("state"));
    }
    
    /**
     * 
    */
    public void setState(Long state) {
        textMap.put("state", String.valueOf(state));
    }
    
    /**
    * *	number		红包类型,红包(1)，店铺代金券(2)
    */
    public Long getType() {
        return Long.valueOf(textMap.get("type"));
    }
    
    /**
     * 
    */
    public void setType(Long type) {
        textMap.put("type", String.valueOf(type));
    }
    
    /**
    * *	number		红包拥有者QQ号
    */
    public Long getOwnerUin() {
        return Long.valueOf(textMap.get("ownerUin"));
    }
    
    /**
     * 
    */
    public void setOwnerUin(Long ownerUin) {
        textMap.put("ownerUin", String.valueOf(ownerUin));
    }
    
    /**
    * 	number		对应的卖家QQ号
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
    *	string		订单号 1.普通红包的格式为:大订单号|子订单号 例如：80000935-20110111-222222|222223 2.店铺优惠券：大订单号 例如：80000935-20110111-222222 
    */
    public String getDealCode() {
        return textMap.get("dealCode");
    }
    
    /**
    *
    */
    public void setDealCode(String dealCode) {
        textMap.put("dealCode", dealCode);
    }
    
    /**
    *	string		红包名称
    */
    public String getPacketName() {
        return textMap.get("packetName");
    }
    
    /**
    *
    */
    public void setPacketName(String packetName) {
        textMap.put("packetName", packetName);
    }
    
}
