package org.yy.paipai.model;

/*
* 文 件 名:  ItemMsg.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品留言,http://pop.paipai.com/api/paipai/message/getItemMsgList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 商品留言,http://pop.paipai.com/api/paipai/message/getItemMsgList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ItemMsg extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 8994778735377703565L;
    
    /**
     *  	number 		留言消息内部id
     */
    private Long msgId;
    
    /**
     *  	number 		店铺qq
     */
    private Long sellerUin;
    
    /**
     *  	string 		店主昵称
     */
    private String sellerName;
    
    /**
     *  	number 		留言者QQ
     */
    private Long publisherUin;
    
    /**
     *  	string 		留言者昵称
     */
    private String publisherName;
    
    /**
     *  	string 		留言内容
     */
    private String msgContent;
    
    /**
     *  	date 		留言时间
     */
    private Date msgCreateTime;
    
    /**
     * 	string 		回复内容
     */
    private String replyContent;
    
    /**
     *  	date 		回复时间
     */
    private Date replyCreateTime;
    
    /**
     *  	number 		留言是(0)否(1)公开可见
     */
    private Long msgIspublic;
    
    /**
     * 	number 		是(0)否(1)回复
     */
    private Long msgIsreplied;
    
    /**
     *  	number 		回复是(0)否(1)公开可见
     */
    private Long replyIspublic;
    
    /**
    *  	number 		留言消息内部id
    */
    public Long getMsgId() {
        return msgId;
    }
    
    /**
    */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
    
    /**
    *  	number 		店铺qq
    */
    public Long getSellerUin() {
        return sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    *  	string 		店主昵称
    */
    public String getSellerName() {
        return sellerName;
    }
    
    /**
    */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    /**
    *  	number 		留言者QQ
    */
    public Long getPublisherUin() {
        return publisherUin;
    }
    
    /**
    */
    public void setPublisherUin(Long publisherUin) {
        this.publisherUin = publisherUin;
    }
    
    /**
    *  	string 		留言者昵称
    */
    public String getPublisherName() {
        return publisherName;
    }
    
    /**
    */
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    /**
    *  	string 		留言内容
    */
    public String getMsgContent() {
        return msgContent;
    }
    
    /**
    */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
    
    /**
    *  	date 		留言时间
    */
    public Date getMsgCreateTime() {
        return msgCreateTime;
    }
    
    /**
    */
    public void setMsgCreateTime(Date msgCreateTime) {
        this.msgCreateTime = msgCreateTime;
    }
    
    /**
    * 	string 		回复内容
    */
    public String getReplyContent() {
        return replyContent;
    }
    
    /**
    */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    
    /**
    *  	date 		回复时间
    */
    public Date getReplyCreateTime() {
        return replyCreateTime;
    }
    
    /**
    */
    public void setReplyCreateTime(Date replyCreateTime) {
        this.replyCreateTime = replyCreateTime;
    }
    
    /**
    *  	number 		留言是(0)否(1)公开可见
    */
    public Long getMsgIspublic() {
        return msgIspublic;
    }
    
    /**
    */
    public void setMsgIspublic(Long msgIspublic) {
        this.msgIspublic = msgIspublic;
    }
    
    /**
    * 	number 		是(0)否(1)回复
    */
    public Long getMsgIsreplied() {
        return msgIsreplied;
    }
    
    /**
    */
    public void setMsgIsreplied(Long msgIsreplied) {
        this.msgIsreplied = msgIsreplied;
    }
    
    /**
    *  	number 		回复是(0)否(1)公开可见
    */
    public Long getReplyIspublic() {
        return replyIspublic;
    }
    
    /**
    */
    public void setReplyIspublic(Long replyIspublic) {
        this.replyIspublic = replyIspublic;
    }
    
}
