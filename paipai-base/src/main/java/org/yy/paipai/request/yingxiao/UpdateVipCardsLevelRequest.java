package org.yy.paipai.request.yingxiao;

/*
* 文 件 名:  UpdateVipCardsLevelRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   卖家批量升级买家店铺VIP卡等级请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
*  卖家批量升级买家店铺VIP卡等级请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class UpdateVipCardsLevelRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/updateVipCardsLevel.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
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
    
    /**
    *设置等级的买家QQ号串;每个QQ号以','分隔,如：12345,67890;注意：每个店铺每月可发放的VIP卡都是有限制的,并且跟店铺的成长值有关
    */
    public String getBuyerUinStr() {
        return textMap.get("buyerUinStr");
    }
    
    /**
    *
    */
    public void setBuyerUinStr(String buyerUinStr) {
        textMap.put("buyerUinStr", buyerUinStr);
    }
    
    /**
    * 店铺VIP卡的等级:1:普通,2:黄金卡;3:白金卡;4:钻石卡
    */
    public Long getVipLevel() {
        return Long.valueOf(textMap.get("vipLevel"));
    }
    
    /**
     * 
    */
    public void setVipLevel(Long vipLevel) {
        textMap.put("vipLevel", String.valueOf(vipLevel));
    }
    
}
