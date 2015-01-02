package org.yy.paipai.request.shop;

/*
* 文 件 名:  CreateShopCouponRequest.java

* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   创建店铺优惠券,http://pop.paipai.com/api/paipai/shop/createShopCoupon请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import java.util.Date;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.CreateShopCouponResponse;
import org.yy.paipai.util.PaiPaiUtils;

/**
*  创建店铺优惠券,http://pop.paipai.com/api/paipai/shop/createShopCoupon请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreateShopCouponRequest extends AbstractPaiPaiRequest<CreateShopCouponResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/createShopCoupon.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<CreateShopCouponResponse> getResponseClass() {
        return CreateShopCouponResponse.class;
    }
    
    /**
     * 优惠开始时间
    */
    public Date getBeginTime() {
        return PaiPaiUtils.toDate(textMap.get("beginTime"));
    }
    
    /**
    *
    */
    public void setBeginTime(Date beginTime) {
        textMap.put("beginTime", PaiPaiUtils.parseDate(beginTime));
    }
    
    /**
     * 优惠结束时间.结束时间离开始时间的间隔不能超过3个月
    */
    public Date getEndTime() {
        return PaiPaiUtils.toDate(textMap.get("endTime"));
    }
    
    /**
    *
    */
    public void setEndTime(Date endTime) {
        textMap.put("endTime", PaiPaiUtils.parseDate(endTime));
    }
    
    /**
    * 优惠券面值：300，500，1000，2000，3000，4000，5000，6000，7000，8000，9000，10000， 单位为分
    */
    public Long getFaceValue() {
        return Long.valueOf(textMap.get("faceValue"));
    }
    
    /**
     * 
    */
    public void setFaceValue(Long faceValue) {
        textMap.put("faceValue", String.valueOf(faceValue));
    }
    
    /**
    * 最大的有效天数
    */
    public Long getMaxExpireDays() {
        return Long.valueOf(textMap.get("maxExpireDays"));
    }
    
    /**
     * 
    */
    public void setMaxExpireDays(Long maxExpireDays) {
        textMap.put("maxExpireDays", String.valueOf(maxExpireDays));
    }
    
    /**
    * 发放总量
    */
    public Long getMaxIssue() {
        return Long.valueOf(textMap.get("maxIssue"));
    }
    
    /**
     * 
    */
    public void setMaxIssue(Long maxIssue) {
        textMap.put("maxIssue", String.valueOf(maxIssue));
    }
    
    /**
    * 最低消费，单位为分
    */
    public Long getMinimum() {
        return Long.valueOf(textMap.get("minimum"));
    }
    
    /**
     * 
    */
    public void setMinimum(Long minimum) {
        textMap.put("minimum", String.valueOf(minimum));
    }
    
    /**
    *优惠券名称
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
