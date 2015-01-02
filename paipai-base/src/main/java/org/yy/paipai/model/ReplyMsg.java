package org.yy.paipai.model;

/*
* 文 件 名:  ReplyMsg.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品回复 ,http://pop.paipai.com/api/paipai/evaluation/getItemEvalList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 商品回复 ,http://pop.paipai.com/api/paipai/evaluation/getItemEvalList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ReplyMsg extends PaiPaiObject {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 7607768604044499590L;

    /**
     * 回复者QQ
     */
    private Long replyerUin;
    
    /**
     * 订单Id
     */
    private String dealCode;
    
    /**
     * 回复内容
     */
    private String content;
    
    /**
    * 回复者QQ
    */
    public Long getReplyerUin() {
        return replyerUin;
    }
    
    /**
    */
    public void setReplyerUin(Long replyerUin) {
        this.replyerUin = replyerUin;
    }
    
    /**
    * 订单Id
    */
    public String getDealCode() {
        return dealCode;
    }
    
    /**
    */
    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }
    
    /**
    * 回复内容
    */
    public String getContent() {
        return content;
    }
    
    /**
    */
    public void setContent(String content) {
        this.content = content;
    }
    
}
