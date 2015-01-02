package org.yy.paipai.request.yingxiao;


/*
* 文 件 名:  SendPostCardRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  卖家对指定买家发放包邮卡等请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 卖家对指定买家发放包邮卡等请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class SendPostCardRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/sendPostCard.xhtml";
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
    * 场景ID 1.卖家店铺优惠券批次 2.系统店铺优惠券批次 3.系统普通红包批次 一般都用1
    */
    public Long getSceneId() {
        return Long.valueOf(textMap.get("sceneId"));
    }
    
    /**
     * 
    */
    public void setSceneId(Long sceneId) {
        textMap.put("sceneId", String.valueOf(sceneId));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 买家QQ号
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
    *优惠券批次号 就是创建包邮卡里面返回的postCardKey
    */
    public String getPktStockId() {
        return textMap.get("pktStockId");
    }
    
    /**
    *
    */
    public void setPktStockId(String pktStockId) {
        textMap.put("pktStockId", pktStockId);
    }
    	
    
     
    
    
    
}

