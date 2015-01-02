package org.yy.paipai.request.yingxiao;

/*
* 文 件 名:  CreateManJianSongRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   卖家创建满立减满立送活动,http://http://pop.paipai.com/api/paipai/yingxiao/createManJianSong请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import java.util.Date;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.util.PaiPaiUtils;

/**
*  卖家创建满立减满立送活动,http://http://pop.paipai.com/api/paipai/yingxiao/createManJianSong请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreateManJianSongRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/yingxiao/createManJianSong.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    *卖家QQ号
    */
    public String getSellerUin() {
        return textMap.get("sellerUin");
    }
    
    /**
    *
    */
    public void setSellerUin(String sellerUin) {
        textMap.put("sellerUin", sellerUin);
    }
    
    /**
     * 活动开始时间
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
     * 活动结束时间
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
    *活动描述
    */
    public String getActivityDesc() {
        return textMap.get("activityDesc");
    }
    
    /**
    *
    */
    public void setActivityDesc(String activityDesc) {
        textMap.put("activityDesc", activityDesc);
    }
    
    /**
     * 活动内容,数组,一个或多个活动规则,详见以下说明 
    *http://pop.paipai.com/api/paipai/yingxiao/createManJianSong
    */
    public String getContentJson() {
        return textMap.get("contentJson");
    }
    
    /**
    *
    */
    public void setContentJson(String contentJson) {
        textMap.put("contentJson", contentJson);
    }
    
}
