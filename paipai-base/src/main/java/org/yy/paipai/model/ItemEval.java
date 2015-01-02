package org.yy.paipai.model;

/*
* 文 件 名:  ItemEval.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品评价 ,http://pop.paipai.com/api/paipai/evaluation/getItemEvalList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;
import java.util.List;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 商品评价 ,http://pop.paipai.com/api/paipai/evaluation/getItemEvalList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ItemEval extends PaiPaiObject {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -2180651309849129L;

    /**
     * 商品编码
     */
    private String itemCode;
    
    /**
     * 商品名称
     */
    private String itemName;
    
    /**
     * 商品价格
     */
    private String itemPrice;
    
    /**
     * 商品图片link
     */
    private String picLink;
    
    /**
     * 商品快照Id
     */
    private String snapItemCode;
    
    /**
     * 卖家QQ
     */
    private String sellerUin;
    
    /**
     * 卖家昵称
     */
    private String sellerName;
    
    /**
     * 买家昵称
     */
    private String buyerName;
    
    /**
     * 买家评价级别 1差评，2中评3，好评
     */
    private Long buyerEvalLevel;
    
    /**
     * 卖家评价级别 1差评，2中评3，好评
     */
    private Long sellerEvalLevel;
    
    /**
     * 买家评价时间 yyyy-MM-dd HH:mm:ss
     */
    private Date buyerEvalTime;
    
    /**
     * 卖家评价时间 yyyy-MM-dd HH:mm:ss
     */
    private Date sellerEvalTime;
    
    /**
     * 买家评价内容
     */
    private String buyerEvalContent;
    
    /**
     * 买家评价原因
     */
    private String buyerReason;
    
    /**
     * 买家评价原因描述
     */
    private String buyerReasonDesc;
    
    /**
     * 卖家评价原因
     */
    private String sellerReason;
    
    /**
     * 卖家评价原因描述
     */
    private String sellerReasonDesc;
    
    /**
     * 买家得分
     */
    private Long buyerScore;
    
    /**
     * 卖家得分
     */
    private Long sellerScore;
    
    /**
     * 发货速度得分
     */
    private Long dsrShippingScore;
    
    /**
     * 商品质量得分
     */
    private Long dsrQualityScore;
    
    /**
     * 服务态度得分
     */
    private Long dsrServiceScore;
    
    /**
     * 多维度评价打分时间
     */
    private String dsrScoreTime;
    
    /**
     * 系统计分时间
     */
    private String systemScoreTime;
    
    /**
     * 卖家评价内容
     */
    private String sellerEvalContent;
    
    /**
     * 回复列表
     */
    private List<ReplyMsg> replyMsgList;
    
    /**
    * 商品编码
    */
    public String getItemCode() {
        return itemCode;
    }
    
    /**
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * 商品名称
    */
    public String getItemName() {
        return itemName;
    }
    
    /**
    */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    /**
    * 商品价格
    */
    public String getItemPrice() {
        return itemPrice;
    }
    
    /**
    */
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    /**
    * 商品图片link
    */
    public String getPicLink() {
        return picLink;
    }
    
    /**
    */
    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }
    
    /**
    * 商品快照Id
    */
    public String getSnapItemCode() {
        return snapItemCode;
    }
    
    /**
    */
    public void setSnapItemCode(String snapItemCode) {
        this.snapItemCode = snapItemCode;
    }
    
    /**
    * 卖家QQ
    */
    public String getSellerUin() {
        return sellerUin;
    }
    
    /**
    */
    public void setSellerUin(String sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    * 卖家昵称
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
    * 买家昵称
    */
    public String getBuyerName() {
        return buyerName;
    }
    
    /**
    */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
    
    /**
    * 买家评价级别 1差评，2中评3，好评
    */
    public Long getBuyerEvalLevel() {
        return buyerEvalLevel;
    }
    
    /**
    */
    public void setBuyerEvalLevel(Long buyerEvalLevel) {
        this.buyerEvalLevel = buyerEvalLevel;
    }
    
    /**
    * 卖家评价级别 1差评，2中评3，好评
    */
    public Long getSellerEvalLevel() {
        return sellerEvalLevel;
    }
    
    /**
    */
    public void setSellerEvalLevel(Long sellerEvalLevel) {
        this.sellerEvalLevel = sellerEvalLevel;
    }
    
    /**
    * 买家评价时间 yyyy-MM-dd HH:mm:ss
    */
    public Date getBuyerEvalTime() {
        return buyerEvalTime;
    }
    
    /**
    */
    public void setBuyerEvalTime(Date buyerEvalTime) {
        this.buyerEvalTime = buyerEvalTime;
    }
    
    /**
    * 卖家评价时间 yyyy-MM-dd HH:mm:ss
    */
    public Date getSellerEvalTime() {
        return sellerEvalTime;
    }
    
    /**
    */
    public void setSellerEvalTime(Date sellerEvalTime) {
        this.sellerEvalTime = sellerEvalTime;
    }
    
    /**
    * 买家评价内容
    */
    public String getBuyerEvalContent() {
        return buyerEvalContent;
    }
    
    /**
    */
    public void setBuyerEvalContent(String buyerEvalContent) {
        this.buyerEvalContent = buyerEvalContent;
    }
    
    /**
    * 买家评价原因
    */
    public String getBuyerReason() {
        return buyerReason;
    }
    
    /**
    */
    public void setBuyerReason(String buyerReason) {
        this.buyerReason = buyerReason;
    }
    
    /**
    * 买家评价原因描述
    */
    public String getBuyerReasonDesc() {
        return buyerReasonDesc;
    }
    
    /**
    */
    public void setBuyerReasonDesc(String buyerReasonDesc) {
        this.buyerReasonDesc = buyerReasonDesc;
    }
    
    /**
    * 卖家评价原因
    */
    public String getSellerReason() {
        return sellerReason;
    }
    
    /**
    */
    public void setSellerReason(String sellerReason) {
        this.sellerReason = sellerReason;
    }
    
    /**
    * 卖家评价原因描述
    */
    public String getSellerReasonDesc() {
        return sellerReasonDesc;
    }
    
    /**
    */
    public void setSellerReasonDesc(String sellerReasonDesc) {
        this.sellerReasonDesc = sellerReasonDesc;
    }
    
    /**
    * 买家得分
    */
    public Long getBuyerScore() {
        return buyerScore;
    }
    
    /**
    */
    public void setBuyerScore(Long buyerScore) {
        this.buyerScore = buyerScore;
    }
    
    /**
    * 卖家得分
    */
    public Long getSellerScore() {
        return sellerScore;
    }
    
    /**
    */
    public void setSellerScore(Long sellerScore) {
        this.sellerScore = sellerScore;
    }
    
    /**
    * 发货速度得分
    */
    public Long getDsrShippingScore() {
        return dsrShippingScore;
    }
    
    /**
    */
    public void setDsrShippingScore(Long dsrShippingScore) {
        this.dsrShippingScore = dsrShippingScore;
    }
    
    /**
    * 商品质量得分
    */
    public Long getDsrQualityScore() {
        return dsrQualityScore;
    }
    
    /**
    */
    public void setDsrQualityScore(Long dsrQualityScore) {
        this.dsrQualityScore = dsrQualityScore;
    }
    
    /**
    * 服务态度得分
    */
    public Long getDsrServiceScore() {
        return dsrServiceScore;
    }
    
    /**
    */
    public void setDsrServiceScore(Long dsrServiceScore) {
        this.dsrServiceScore = dsrServiceScore;
    }
    
    /**
    * 多维度评价打分时间
    */
    public String getDsrScoreTime() {
        return dsrScoreTime;
    }
    
    /**
    */
    public void setDsrScoreTime(String dsrScoreTime) {
        this.dsrScoreTime = dsrScoreTime;
    }
    
    /**
    * 系统计分时间
    */
    public String getSystemScoreTime() {
        return systemScoreTime;
    }
    
    /**
    */
    public void setSystemScoreTime(String systemScoreTime) {
        this.systemScoreTime = systemScoreTime;
    }
    
    /**
    * 卖家评价内容
    */
    public String getSellerEvalContent() {
        return sellerEvalContent;
    }
    
    /**
    */
    public void setSellerEvalContent(String sellerEvalContent) {
        this.sellerEvalContent = sellerEvalContent;
    }
    
    /**
    * 回复列表
    */
    public List<ReplyMsg> getReplyMsgList() {
        return replyMsgList;
    }
    
    /**
    */
    public void setReplyMsgList(List<ReplyMsg> replyMsgList) {
        this.replyMsgList = replyMsgList;
    }
    
}
