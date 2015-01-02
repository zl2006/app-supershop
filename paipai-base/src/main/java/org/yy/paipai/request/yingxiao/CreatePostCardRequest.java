/*
* 文 件 名:  CreatePostCardRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  卖家创建包邮卡请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.request.yingxiao;

import java.util.Date;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.yingxiao.CreatePostCardResponse;
import org.yy.paipai.util.PaiPaiUtils;

/**
*  卖家创建包邮卡请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreatePostCardRequest extends AbstractPaiPaiRequest<CreatePostCardResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/createPostCard.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<CreatePostCardResponse> getResponseClass() {
        return CreatePostCardResponse.class;
    }
    
    /**
     *  卖家QQ号
    * @return 返回 sellerUin
    */
    public Long getSellerUin() {
        return Long.valueOf(textMap.get("sellerUin"));
    }
    
    /**
    * @param 对sellerUin进行赋值
    */
    public void setSellerUin(Long sellerUin) {
        textMap.put("sellerUin", String.valueOf(sellerUin));
    }
    
    /**
     * 场景ID 1.卖家店铺优惠券批次 2.系统店铺优惠券批次 3.系统普通红包批次 一般都用1
    * @return 返回 sceneId
    */
    public Long getSceneId() {
        return Long.valueOf(textMap.get("sceneId"));
    }
    
    /**
    * @param 对sceneId进行赋值
    */
    public void setSceneId(Long sceneId) {
        textMap.put("sceneId", String.valueOf(sceneId));
    }
    
    /**
     * 包邮卡有效期开始时间
    * @return 返回 beginTime
    */
    public Date getBeginTime() {
        return PaiPaiUtils.toDate(textMap.get("beginTime"));
    }
    
    /**
    * @param 对beginTime进行赋值
    */
    public void setBeginTime(Date beginTime) {
        textMap.put("beginTime", PaiPaiUtils.parseDate(beginTime));
    }
    
    /**
     *  包邮卡有效期结束时间
    * @return 返回 endTime
    */
    public Date getEndTime() {
        return PaiPaiUtils.toDate(textMap.get("endTime"));
    }
    
    /**
    * @param 对endTime进行赋值
    */
    public void setEndTime(Date endTime) {
        textMap.put("endTime", PaiPaiUtils.parseDate(endTime));
    }
    
    /**
     * 包邮卡面值
    * @return 返回 faceValue
    */
    public Long getFaceValue() {
        return Long.valueOf(textMap.get("faceValue"));
    }
    
    /**
    * @param 对faceValue进行赋值
    */
    public void setFaceValue(Long faceValue) {
        textMap.put("faceValue", String.valueOf(faceValue));
    }
    
    /**
     * 包邮卡领取后最大有效天数
    * @return 返回 maxExpireDays
    */
    public Long getMaxExpireDays() {
        return Long.valueOf(textMap.get("maxExpireDays"));
    }
    
    /**
    * @param 对maxExpireDays进行赋值
    */
    public void setMaxExpireDays(Long maxExpireDays) {
        textMap.put("maxExpireDays", String.valueOf(maxExpireDays));
    }
    
    /**
     * 优惠券最大发放限额
    * @return 返回 maxIssue
    */
    public Long getMaxIssue() {
        return Long.valueOf(textMap.get("maxIssue"));
    }
    
    /**
    * @param 对maxIssue进行赋值
    */
    public void setMaxIssue(Long maxIssue) {
        textMap.put("maxIssue", String.valueOf(maxIssue));
    }
    
    /**
     * 包邮卡最低消费
    * @return 返回 minimum
    */
    public Long getMinimum() {
        return Long.valueOf(textMap.get("minimum"));
    }
    
    /**
    * @param 对minimum进行赋值
    */
    public void setMinimum(Long minimum) {
        textMap.put("minimum", String.valueOf(minimum));
    }
    
    /**
     * 包邮卡名称
    * @return 返回 packetName
    */
    public String getPacketName() {
        return textMap.get("packetName");
    }
    
    /**
    * @param 对packetName进行赋值
    */
    public void setPacketName(String packetName) {
        textMap.put("packetName", packetName);
    }
    
    /**
     * 包邮卡图片地址
    * @return 返回 imageUrl
    */
    public String getImageUrl() {
        return textMap.get("imageUrl");
    }
    
    /**
     * 
    * @param 对imageUrl进行赋值
    */
    public void setImageUrl(String imageUrl) {
        textMap.put("imageUrl", imageUrl);
    }
    
    /**
     * 店铺包邮卡地址
    * @return 返回 relaUrl
    */
    public String getRelaUrl() {
        return textMap.get("relaUrl");
    }
    
    /**
    * @param 对relaUrl进行赋值
    */
    public void setRelaUrl(String relaUrl) {
        textMap.put("relaUrl", relaUrl);
    }
    
}
