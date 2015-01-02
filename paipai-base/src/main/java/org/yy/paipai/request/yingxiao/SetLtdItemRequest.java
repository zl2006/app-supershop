package org.yy.paipai.request.yingxiao;


/*
* 文 件 名:  SetLtdItemRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  设置限时折扣商品信息请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 设置限时折扣商品信息请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class SetLtdItemRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/setLtdItem.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    
    	
    /**
    * 请求类型:1-添加商品到活动,2-取消参加活动商品,3-更新活动商品信息
    */
    public Long getReqType() {
        return Long.valueOf(textMap.get("reqType"));
    }
    
    /**
     * 
    */
    public void setReqType(Long reqType) {
        textMap.put("reqType", String.valueOf(reqType));
    }
    	
    	
    	
    
    
    
    	
    	
    	
    /**
    *要操作的活动ID
    */
    public String getActivityId() {
        return textMap.get("activityId");
    }
    
    /**
    *
    */
    public void setActivityId(String activityId) {
        textMap.put("activityId", activityId);
    }
    	
    
    
    
    	
    	
    	
    /**
    *要操作的商品ID,即商品编码
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
    * 商品的限购件数
    */
    public Long getBuyLimit() {
        return Long.valueOf(textMap.get("buyLimit"));
    }
    
    /**
     * 
    */
    public void setBuyLimit(Long buyLimit) {
        textMap.put("buyLimit", String.valueOf(buyLimit));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 商品的折扣: 计算规则: 折扣*1000;如5折,填5000,如2.5折,填250
    */
    public Long getDiscount() {
        return Long.valueOf(textMap.get("discount"));
    }
    
    /**
     * 
    */
    public void setDiscount(Long discount) {
        textMap.put("discount", String.valueOf(discount));
    }
    	
    	
    	
    
     
    
    
    
}

