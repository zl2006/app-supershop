package org.yy.paipai.model;

/*
* 文 件 名:  RedPacket.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  红包或优惠券 ,http://pop.paipai.com/api/paipai/redpacket/getRedPacketList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 红包或优惠券 ,http://pop.paipai.com/api/paipai/redpacket/getRedPacketList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class RedPacket extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 5972278838066161066L;
    
    /**
     *  	number 		红包id
     */
    private Long packetId;
    
    /**
     *  	number 		红包类型:红包(1)，店铺代金券(2),未知类型(0)
     */
    private Long type;
    
    /**
     *  	number 		红包状态: 0 初始化状态 1 可用 2 超时 3 冻结 4 绑定 5 确认 6 可体现 7 体现中 8 体现结束 9 未到有效期
     */
    private Long state;
    
    /**
     *  	number 		面值
     */
    private Long packetPrice;
    
    /**
     *  	number 		实际抵扣金额
     */
    private Long actualPrice;
    
    /**
     *  	string 		红包名称
     */
    private String packetName;
    
    /**
     *  	string 		关联url
     */
    private String relaUrl;
    
    /**
     *  	string 		图片url
     */
    private String imageUrl;
    
    /**
     *  	number 		所属者
     */
    private Long ownerUin;
    
    /**
     *  	number 		对应卖家号
     */
    private Long sellerUin;
    
    /**
     *  	date 		起始时间
     */
    private Date beginTime;
    
    /**
     *  	date 		结束时间
     */
    private Date endTime;
    
    /**
     *  	date 		使用时间
     */
    private Date useTime;
    
    /**
     *  	date 		领取时间
     */
    private Date recvTime;
    
    /**
     *  	string 		绑定的订单id 1.普通红包的格式为:大订单号|子订单号 例如：80000935-20110111-222222|222223 2.店铺优惠券：大订单号 例如：80000935-20110111-222222 
     */
    private String dealCode;
    
    /**
     *  	number 		最低消费,即购买金额限制,单位分
     */
    private Long minimum;
    
    /**
     *  	string 		适用店铺
     */
    private String applicableScopeList;
    
    /**
    *  	number 		红包id
    */
    public Long getPacketId() {
        return packetId;
    }
    
    /**
    */
    public void setPacketId(Long packetId) {
        this.packetId = packetId;
    }
    
    /**
    *  	number 		红包类型:红包(1)，店铺代金券(2),未知类型(0)
    */
    public Long getType() {
        return type;
    }
    
    /**
    */
    public void setType(Long type) {
        this.type = type;
    }
    
    /**
    *  	number 		红包状态: 0 初始化状态 1 可用 2 超时 3 冻结 4 绑定 5 确认 6 可体现 7 体现中 8 体现结束 9 未到有效期
    */
    public Long getState() {
        return state;
    }
    
    /**
    */
    public void setState(Long state) {
        this.state = state;
    }
    
    /**
    *  	number 		面值
    */
    public Long getPacketPrice() {
        return packetPrice;
    }
    
    /**
    */
    public void setPacketPrice(Long packetPrice) {
        this.packetPrice = packetPrice;
    }
    
    /**
    *  	number 		实际抵扣金额
    */
    public Long getActualPrice() {
        return actualPrice;
    }
    
    /**
    */
    public void setActualPrice(Long actualPrice) {
        this.actualPrice = actualPrice;
    }
    
    /**
    *  	string 		红包名称
    */
    public String getPacketName() {
        return packetName;
    }
    
    /**
    */
    public void setPacketName(String packetName) {
        this.packetName = packetName;
    }
    
    /**
    *  	string 		关联url
    */
    public String getRelaUrl() {
        return relaUrl;
    }
    
    /**
    */
    public void setRelaUrl(String relaUrl) {
        this.relaUrl = relaUrl;
    }
    
    /**
    *  	string 		图片url
    */
    public String getImageUrl() {
        return imageUrl;
    }
    
    /**
    */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    /**
    *  	number 		所属者
    */
    public Long getOwnerUin() {
        return ownerUin;
    }
    
    /**
    */
    public void setOwnerUin(Long ownerUin) {
        this.ownerUin = ownerUin;
    }
    
    /**
    *  	number 		对应卖家号
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
    *  	date 		起始时间
    */
    public Date getBeginTime() {
        return beginTime;
    }
    
    /**
    */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    
    /**
    *  	date 		结束时间
    */
    public Date getEndTime() {
        return endTime;
    }
    
    /**
    */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    /**
    *  	date 		使用时间
    */
    public Date getUseTime() {
        return useTime;
    }
    
    /**
    */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }
    
    /**
    *  	date 		领取时间
    */
    public Date getRecvTime() {
        return recvTime;
    }
    
    /**
    */
    public void setRecvTime(Date recvTime) {
        this.recvTime = recvTime;
    }
    
    /**
    *  	string 		绑定的订单id 1.普通红包的格式为:大订单号|子订单号 例如：80000935-20110111-222222|222223 2.店铺优惠券：大订单号 例如：80000935-20110111-222222 
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
    *  	number 		最低消费,即购买金额限制,单位分
    */
    public Long getMinimum() {
        return minimum;
    }
    
    /**
    */
    public void setMinimum(Long minimum) {
        this.minimum = minimum;
    }
    
    /**
    *  	string 		适用店铺
    */
    public String getApplicableScopeList() {
        return applicableScopeList;
    }
    
    /**
    */
    public void setApplicableScopeList(String applicableScopeList) {
        this.applicableScopeList = applicableScopeList;
    }
    
}
