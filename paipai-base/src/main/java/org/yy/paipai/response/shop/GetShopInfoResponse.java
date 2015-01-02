package org.yy.paipai.response.shop;

/*
* 文 件 名:  GetShopInfoResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   查询店铺的信息,http://pop.paipai.com/api/paipai/shop/getShopInfo响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
*  查询店铺的信息,http://pop.paipai.com/api/paipai/shop/getShopInfo响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopInfoResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 2270600259322436525L;
    
    /**
     * 卖家uin号
     */
    private Long sellerUin;
    
    /**
     * 是否查询并输出promotions字段,1：输出,其他：不输出
     */
    private Long shopName;
    
    /**
     * 是否查询并输出店铺关注数concernNum字段,1：输出,其他：不输出
     */
    private Long mainBusiness;
    
    /**
     * 卖家位置
     */
    private Long sellerLocation;
    
    /**
     * 卖家等级
     */
    private Long sellerLevelCount;
    
    /**
     *  	诚保标志
     */
    private Long guaranteeCompensation;
    
    /**
     *  	店铺二进制属性串： [11]:开通财付通 [12]:冻结用户 [15]:警告用户 [16]:禁止用户 [22]:金牌卖家 [27]:禁止购买 [28]:禁止投诉或举报 [29]:禁止发布商品 [30]:禁止留言 [31]:禁止评价 [32]:禁止举报 [33]:保证金用户 [37]:基础诚保用户 [49]:开通CRM功能 [50]:官字卖家 [51]:新女装裳品廊 [52]:VIP用户 [53]:B2C卖家 [54]:腾讯官方商家 [55]:腾讯慈善商家 [56]:营业执照认证商家 [57]:诚保二级卖家 [59]:QQ商城用户 [60]:主营虚拟类目卖家 [62]:QQ秀特权 [63]:时尚标记尚品会 [64]:3C保证金 [65]:减金额优惠 [66]:打折优惠 [67]:送赠品优惠 [68]:加钱换购优惠 [69]:包快递优惠 [70]:B2C C2C合并卖家 [71]:绿钻用户 [72]:直通车 [73]:OPENAPI用户 [74]:彩钻用户 [75]:店铺3.0灰度属性 [76]:3c卖家 [77]:卖家支持手机客服 [78]:卖家参加买立减，送促销活动 [79]:卖家开始买立减，送促销活动 [116]:网游快冲 [117]:新店铺 [118]:当期销售量 [119]:QQ商城卖家授权修改店名和店招标记 [173]:卖家处于加分状态 [174]:受邀请用户
     */
    private String property;
    
    /**
     * 当前在销售的商品数量
     */
    private Long itemCountOnSale;
    
    /**
     * 货品符合度
     */
    private String goodDescriptionMatch;
    
    /**
     * 服务质量
     */
    private Long attitudeOfService;
    
    /**
     * 物流速度
     */
    private Long speedOfDelivery;
    
    /**
     * 好评数
     */
    private Long goodEval;
    
    /**
     * 中评数
     */
    private Long normalEval;
    
    /**
     * 差评数
     */
    private Long badEval;
    
    /**
     * 腾讯签名
     */
    private String sigTencent;
    
    /**
     * 场景签名
     */
    private String sigPaipai;
    
    /**
     *  	前提条件：三星以上信用卖家，该店铺当前支持的满减满送促销优惠（本串固定长度为5个字符，依次是：减免金额，折扣，赠品，换购，免邮费），字符为1代表有相应的优惠，为0则没有
     */
    private String promotions;
    
    /**
     * 本店铺被关注数量
     */
    private Long concernNum;
    
    /**
    * 卖家uin号
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
    * 是否查询并输出promotions字段,1：输出,其他：不输出
    */
    public Long getShopName() {
        return shopName;
    }
    
    /**
    */
    public void setShopName(Long shopName) {
        this.shopName = shopName;
    }
    
    /**
    * 是否查询并输出店铺关注数concernNum字段,1：输出,其他：不输出
    */
    public Long getMainBusiness() {
        return mainBusiness;
    }
    
    /**
    */
    public void setMainBusiness(Long mainBusiness) {
        this.mainBusiness = mainBusiness;
    }
    
    /**
    * 卖家位置
    */
    public Long getSellerLocation() {
        return sellerLocation;
    }
    
    /**
    */
    public void setSellerLocation(Long sellerLocation) {
        this.sellerLocation = sellerLocation;
    }
    
    /**
    * 卖家等级
    */
    public Long getSellerLevelCount() {
        return sellerLevelCount;
    }
    
    /**
    */
    public void setSellerLevelCount(Long sellerLevelCount) {
        this.sellerLevelCount = sellerLevelCount;
    }
    
    /**
    *  	诚保标志
    */
    public Long getGuaranteeCompensation() {
        return guaranteeCompensation;
    }
    
    /**
    */
    public void setGuaranteeCompensation(Long guaranteeCompensation) {
        this.guaranteeCompensation = guaranteeCompensation;
    }
    
    /**
    *  	店铺二进制属性串： [11]:开通财付通 [12]:冻结用户 [15]:警告用户 [16]:禁止用户 [22]:金牌卖家 [27]:禁止购买 [28]:禁止投诉或举报 [29]:禁止发布商品 [30]:禁止留言 [31]:禁止评价 [32]:禁止举报 [33]:保证金用户 [37]:基础诚保用户 [49]:开通CRM功能 [50]:官字卖家 [51]:新女装裳品廊 [52]:VIP用户 [53]:B2C卖家 [54]:腾讯官方商家 [55]:腾讯慈善商家 [56]:营业执照认证商家 [57]:诚保二级卖家 [59]:QQ商城用户 [60]:主营虚拟类目卖家 [62]:QQ秀特权 [63]:时尚标记尚品会 [64]:3C保证金 [65]:减金额优惠 [66]:打折优惠 [67]:送赠品优惠 [68]:加钱换购优惠 [69]:包快递优惠 [70]:B2C C2C合并卖家 [71]:绿钻用户 [72]:直通车 [73]:OPENAPI用户 [74]:彩钻用户 [75]:店铺3.0灰度属性 [76]:3c卖家 [77]:卖家支持手机客服 [78]:卖家参加买立减，送促销活动 [79]:卖家开始买立减，送促销活动 [116]:网游快冲 [117]:新店铺 [118]:当期销售量 [119]:QQ商城卖家授权修改店名和店招标记 [173]:卖家处于加分状态 [174]:受邀请用户
    */
    public String getProperty() {
        return property;
    }
    
    /**
    */
    public void setProperty(String property) {
        this.property = property;
    }
    
    /**
    * 当前在销售的商品数量
    */
    public Long getItemCountOnSale() {
        return itemCountOnSale;
    }
    
    /**
    */
    public void setItemCountOnSale(Long itemCountOnSale) {
        this.itemCountOnSale = itemCountOnSale;
    }
    
    /**
    * 货品符合度
    */
    public String getGoodDescriptionMatch() {
        return goodDescriptionMatch;
    }
    
    /**
    */
    public void setGoodDescriptionMatch(String goodDescriptionMatch) {
        this.goodDescriptionMatch = goodDescriptionMatch;
    }
    
    /**
    * 服务质量
    */
    public Long getAttitudeOfService() {
        return attitudeOfService;
    }
    
    /**
    */
    public void setAttitudeOfService(Long attitudeOfService) {
        this.attitudeOfService = attitudeOfService;
    }
    
    /**
    * 物流速度
    */
    public Long getSpeedOfDelivery() {
        return speedOfDelivery;
    }
    
    /**
    */
    public void setSpeedOfDelivery(Long speedOfDelivery) {
        this.speedOfDelivery = speedOfDelivery;
    }
    
    /**
    * 好评数
    */
    public Long getGoodEval() {
        return goodEval;
    }
    
    /**
    */
    public void setGoodEval(Long goodEval) {
        this.goodEval = goodEval;
    }
    
    /**
    * 中评数
    */
    public Long getNormalEval() {
        return normalEval;
    }
    
    /**
    */
    public void setNormalEval(Long normalEval) {
        this.normalEval = normalEval;
    }
    
    /**
    * 差评数
    */
    public Long getBadEval() {
        return badEval;
    }
    
    /**
    */
    public void setBadEval(Long badEval) {
        this.badEval = badEval;
    }
    
    /**
    * 腾讯签名
    */
    public String getSigTencent() {
        return sigTencent;
    }
    
    /**
    */
    public void setSigTencent(String sigTencent) {
        this.sigTencent = sigTencent;
    }
    
    /**
    * 场景签名
    */
    public String getSigPaipai() {
        return sigPaipai;
    }
    
    /**
    */
    public void setSigPaipai(String sigPaipai) {
        this.sigPaipai = sigPaipai;
    }
    
    /**
    *  	前提条件：三星以上信用卖家，该店铺当前支持的满减满送促销优惠（本串固定长度为5个字符，依次是：减免金额，折扣，赠品，换购，免邮费），字符为1代表有相应的优惠，为0则没有
    */
    public String getPromotions() {
        return promotions;
    }
    
    /**
    */
    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }
    
    /**
    * 本店铺被关注数量
    */
    public Long getConcernNum() {
        return concernNum;
    }
    
    /**
    */
    public void setConcernNum(Long concernNum) {
        this.concernNum = concernNum;
    }
    
}
