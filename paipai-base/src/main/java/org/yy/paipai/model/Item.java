package org.yy.paipai.model;

import java.util.Date;

import org.yy.paipai.api.PaiPaiObject;

/**
 * 
 * 商品信息
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class Item extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2594375267898032502L;
    
    /**
     * 商品编码
     */
    private String itemCode;
    
    /**
     * 商品名称1-60字节
     */
    private String itemName;
    
    /**
     * 合作商家的私有商品编码，由商家保证该编码在其所有商品中的唯一性，不超过40 Bytes。
     */
    private String itemLocalCode;
    
    /**
     * 商品状态,
     *  “IS_FOR_SALE”：上架销售。
        “IS_IN_STORE”：放入仓库。
        “IS_SALE_ON_TIME”：定时上架
     */
    private String itemState;
    
    /**
     * 商品状态码
     */
    private String stateCode;
    
    /**
     * 商品状态描述
     */
    private String stateDesc;
    
    /**
     * 商品属性
     */
    private Long itemProperty;
    
    /**
     * 商品属性串(拍拍助理)
     * 格式为：key1_value1|key2_value2|key3_value3|.... 例如：2_1|25_1|34_1|.....
     */
    private String properties;
    
    /**
     * 商品所属的店铺分类id
     */
    private String categoryId;
    
    /**
     * 商品所属的拍拍类目id。每个商品只能从属于一个拍拍类目id，且必须从属于一个类目id。
     */
    private Long classId;
    
    /**
     * 原有商品属性信息
     */
    private String attr;
    
    /**
     *  新商品属性串信息,如：version=1,1:1|2:2|a:a|b:1,2,4^a:你好
     */
    private String attr2;
    
    /**
     * 自定义属性字符串
     */
    private String customAttr;
    
    /**
     *  出售类型
     */
    private String sellType;
    
    /**
     * 支付类型
     */
    private String payType;
    
    /**
     * 商品的市场参考价格，只对QQ会员特权卖家有效。
     */
    private String marketPrice;
    
    /**
     * 商品价格
     */
    private Long itemPrice;
    
    /**
     *  是否QQ会员商品1是0否。请求参数extendInfo=1时有效
     */
    private Long qqvipItem;
    
    /**
     * 商品折扣。请求参数extendInfo=1时有效
     */
    private Long qqvipDiscount;
    
    /**
     * 商品库存数量
     */
    private Long stockCount;
    
    /**
     *  商家昵称
     */
    private String sellerName;
    
    /**
     * 买家或卖家承担运费
     * 0x01=卖家承担运费 
    0x02=买家承担运费 
    0x03=同城交易无需运费 
    0x0a=支持运费模板的边界值（大于或等于这个值时，表示支持运费模板）
     */
    private Long sellerPayFreight;
    
    /**
     * 运费模版Id
     */
    private Long freightId;
    
    /**
     * 货到付款运费模版Id
     */
    private Long codId;
    
    /**
     * 商品重量
     */
    private Long weight;
    
    /**
     * 平邮价格
     */
    private Long mailPrice;
    
    /**
     * 快递价格
     */
    private Long expressPrice;
    
    /**
     * 快递价格
     */
    private Long emsPrice;
    
    /**
     * 商品所在城市
     */
    private Long cityId;
    
    /**
     * 所在省
     */
    private Long provinceId;
    
    /**
     * 国家
     */
    private Long countryId;
    
    /**
     * 是否推荐商品
     * 0：表示非推荐商品
        1：表示推荐商品
     */
    private Long recommendItem;
    
    private Long quick;
    
    private Long freeReturn;
    
    private Long qtReportFlag;
    
    /**
     * 是否橱窗商品
     * 0：表示非橱窗展示商品
    1：表示是橱窗展示商品
     */
    private Long windowItem;
    
    /**
     * 是否提供发票
     * 0：表示商品不开具发票
    1：表示商品可开具发票
     */
    private Long invoiceItem;
    
    /**
     * 是否假一赔三诚信保证商品
     * 0：表示非假一赔三商品
    1：表示是假一赔三商品
     */
    private Long guaranteeCompensation;
    
    /**
     * 是否7天包退诚信保证商品
     *  0：表示非7天包退诚信保证商品
    1：表示是7天包退诚信保证商品
     */
    private Long guarantee7Days;
    
    /**
     *   是否14天先行赔付诚信保证商品
     *   0：表示非14天先行赔付诚信保证商品
    1：表示是14天先行赔付诚信保证商品
     */
    private Long guarantee14Days;
    
    /**
     * 是否保修商品
     * 0：表示非保修商品
    1：表示保修商品
     */
    private Long guaranteeRepair;
    
    /**
     * 是否支持财付通0：表示不支持
    1：表示支持
     */
    private Long supportTenpay;
    
    /**
     * 购买限制，0，表示不限制。大于0的值表示单个买家购买该商品不得超过该数目。
     */
    private Long buyLimit;
    
    /**
     * 上架时长，单位为秒
     */
    private Long validDuration;
    
    /**
     * 商品详情页面颜色主题
     * “THEME_DEFAULT”：默认风格（默认值）。
    “THEME_PURPLE”：紫色浪漫。暂不支持
    “THEME_BLUE”：蓝色幻想。暂不支持
    “THEME_PINK”：粉色回忆。
    “THEME_NATURE”：自然印象。
    “THEME_METAL”：金属狂潮。
     */
    private String theme;
    
    /**
     * 图片链接
     */
    private String picLink;
    
    /**
     * 修改次数
     */
    private Long reloadCount;
    
    /**
     * 商品被访问次数
     */
    private Long visitCount;
    
    /**
     * 尺码表id extendInfo=1 时有效
     */
    private String sizeTableId;
    
    /**
     * 发布时间 yyyy-MM-dd HH:mm:ss
     */
    private Date createTime;
    
    /**
     * 最近修改时间 yyyy-MM-dd HH:mm:ss
     */
    private Date lastModifyTime;
    
    /**
     * 最近上架时间 yyyy-MM-dd HH:mm:ss
     */
    private Date lastToSaleTime;
    
    /**
     * 最近下架时间 yyyy-MM-dd HH:mm:ss
     */
    private Date lastToStoreTime;
    
    /**
    * @return 返回 itemCode
    */
    public String getItemCode() {
        return itemCode;
    }
    
    /**
    * @param 对itemCode进行赋值
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * @return 返回 itemName
    */
    public String getItemName() {
        return itemName;
    }
    
    /**
    * @param 对itemName进行赋值
    */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    /**
    * @return 返回 itemLocalCode
    */
    public String getItemLocalCode() {
        return itemLocalCode;
    }
    
    /**
    * @param 对itemLocalCode进行赋值
    */
    public void setItemLocalCode(String itemLocalCode) {
        this.itemLocalCode = itemLocalCode;
    }
    
    /**
    * @return 返回 itemState
    */
    public String getItemState() {
        return itemState;
    }
    
    /**
    * @param 对itemState进行赋值
    */
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }
    
    /**
    * @return 返回 stateCode
    */
    public String getStateCode() {
        return stateCode;
    }
    
    /**
    * @param 对stateCode进行赋值
    */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
    
    /**
    * @return 返回 stateDesc
    */
    public String getStateDesc() {
        return stateDesc;
    }
    
    /**
    * @param 对stateDesc进行赋值
    */
    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }
    
    /**
    * @return 返回 itemProperty
    */
    public Long getItemProperty() {
        return itemProperty;
    }
    
    /**
    * @param 对itemProperty进行赋值
    */
    public void setItemProperty(Long itemProperty) {
        this.itemProperty = itemProperty;
    }
    
    /**
    * @return 返回 properties
    */
    public String getProperties() {
        return properties;
    }
    
    /**
    * @param 对properties进行赋值
    */
    public void setProperties(String properties) {
        this.properties = properties;
    }
    
    /**
    * @return 返回 categoryId
    */
    public String getCategoryId() {
        return categoryId;
    }
    
    /**
    * @param 对categoryId进行赋值
    */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
    /**
    * @return 返回 classId
    */
    public Long getClassId() {
        return classId;
    }
    
    /**
    * @param 对classId进行赋值
    */
    public void setClassId(Long classId) {
        this.classId = classId;
    }
    
    /**
    * @return 返回 attr
    */
    public String getAttr() {
        return attr;
    }
    
    /**
    * @param 对attr进行赋值
    */
    public void setAttr(String attr) {
        this.attr = attr;
    }
    
    /**
    * @return 返回 attr2
    */
    public String getAttr2() {
        return attr2;
    }
    
    /**
    * @param 对attr2进行赋值
    */
    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }
    
    /**
    * @return 返回 customAttr
    */
    public String getCustomAttr() {
        return customAttr;
    }
    
    /**
    * @param 对customAttr进行赋值
    */
    public void setCustomAttr(String customAttr) {
        this.customAttr = customAttr;
    }
    
    /**
    * @return 返回 sellType
    */
    public String getSellType() {
        return sellType;
    }
    
    /**
    * @param 对sellType进行赋值
    */
    public void setSellType(String sellType) {
        this.sellType = sellType;
    }
    
    /**
    * @return 返回 payType
    */
    public String getPayType() {
        return payType;
    }
    
    /**
    * @param 对payType进行赋值
    */
    public void setPayType(String payType) {
        this.payType = payType;
    }
    
    /**
    * @return 返回 marketPrice
    */
    public String getMarketPrice() {
        return marketPrice;
    }
    
    /**
    * @param 对marketPrice进行赋值
    */
    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }
    
    /**
    * @return 返回 itemPrice
    */
    public Long getItemPrice() {
        return itemPrice;
    }
    
    /**
    * @param 对itemPrice进行赋值
    */
    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    /**
    * @return 返回 qqvipItem
    */
    public Long getQqvipItem() {
        return qqvipItem;
    }
    
    /**
    * @param 对qqvipItem进行赋值
    */
    public void setQqvipItem(Long qqvipItem) {
        this.qqvipItem = qqvipItem;
    }
    
    /**
    * @return 返回 qqvipDiscount
    */
    public Long getQqvipDiscount() {
        return qqvipDiscount;
    }
    
    /**
    * @param 对qqvipDiscount进行赋值
    */
    public void setQqvipDiscount(Long qqvipDiscount) {
        this.qqvipDiscount = qqvipDiscount;
    }
    
    /**
    * @return 返回 stockCount
    */
    public Long getStockCount() {
        return stockCount;
    }
    
    /**
    * @param 对stockCount进行赋值
    */
    public void setStockCount(Long stockCount) {
        this.stockCount = stockCount;
    }
    
    /**
    * @return 返回 sellerName
    */
    public String getSellerName() {
        return sellerName;
    }
    
    /**
    * @param 对sellerName进行赋值
    */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    /**
    * @return 返回 sellerPayFreight
    */
    public Long getSellerPayFreight() {
        return sellerPayFreight;
    }
    
    /**
    * @param 对sellerPayFreight进行赋值
    */
    public void setSellerPayFreight(Long sellerPayFreight) {
        this.sellerPayFreight = sellerPayFreight;
    }
    
    /**
    * @return 返回 freightId
    */
    public Long getFreightId() {
        return freightId;
    }
    
    /**
    * @param 对freightId进行赋值
    */
    public void setFreightId(Long freightId) {
        this.freightId = freightId;
    }
    
    /**
    * @return 返回 codId
    */
    public Long getCodId() {
        return codId;
    }
    
    /**
    * @param 对codId进行赋值
    */
    public void setCodId(Long codId) {
        this.codId = codId;
    }
    
    /**
    * @return 返回 weight
    */
    public Long getWeight() {
        return weight;
    }
    
    /**
    * @param 对weight进行赋值
    */
    public void setWeight(Long weight) {
        this.weight = weight;
    }
    
    /**
    * @return 返回 mailPrice
    */
    public Long getMailPrice() {
        return mailPrice;
    }
    
    /**
    * @param 对mailPrice进行赋值
    */
    public void setMailPrice(Long mailPrice) {
        this.mailPrice = mailPrice;
    }
    
    /**
    * @return 返回 expressPrice
    */
    public Long getExpressPrice() {
        return expressPrice;
    }
    
    /**
    * @param 对expressPrice进行赋值
    */
    public void setExpressPrice(Long expressPrice) {
        this.expressPrice = expressPrice;
    }
    
    /**
    * @return 返回 cityId
    */
    public Long getCityId() {
        return cityId;
    }
    
    /**
    * @param 对cityId进行赋值
    */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
    
    /**
    * @return 返回 provinceId
    */
    public Long getProvinceId() {
        return provinceId;
    }
    
    /**
    * @param 对provinceId进行赋值
    */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }
    
    /**
    * @return 返回 countryId
    */
    public Long getCountryId() {
        return countryId;
    }
    
    /**
    * @param 对countryId进行赋值
    */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }
    
    /**
    * @return 返回 recommendItem
    */
    public Long getRecommendItem() {
        return recommendItem;
    }
    
    /**
    * @param 对recommendItem进行赋值
    */
    public void setRecommendItem(Long recommendItem) {
        this.recommendItem = recommendItem;
    }
    
    /**
    * @return 返回 windowItem
    */
    public Long getWindowItem() {
        return windowItem;
    }
    
    /**
    * @param 对windowItem进行赋值
    */
    public void setWindowItem(Long windowItem) {
        this.windowItem = windowItem;
    }
    
    /**
    * @return 返回 invoiceItem
    */
    public Long getInvoiceItem() {
        return invoiceItem;
    }
    
    /**
    * @param 对invoiceItem进行赋值
    */
    public void setInvoiceItem(Long invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
    
    /**
    * @return 返回 guaranteeCompensation
    */
    public Long getGuaranteeCompensation() {
        return guaranteeCompensation;
    }
    
    /**
    * @param 对guaranteeCompensation进行赋值
    */
    public void setGuaranteeCompensation(Long guaranteeCompensation) {
        this.guaranteeCompensation = guaranteeCompensation;
    }
    
    /**
    * @return 返回 guarantee7Days
    */
    public Long getGuarantee7Days() {
        return guarantee7Days;
    }
    
    /**
    * @param 对guarantee7Days进行赋值
    */
    public void setGuarantee7Days(Long guarantee7Days) {
        this.guarantee7Days = guarantee7Days;
    }
    
    /**
    * @return 返回 guarantee14Days
    */
    public Long getGuarantee14Days() {
        return guarantee14Days;
    }
    
    /**
    * @param 对guarantee14Days进行赋值
    */
    public void setGuarantee14Days(Long guarantee14Days) {
        this.guarantee14Days = guarantee14Days;
    }
    
    /**
    * @return 返回 guaranteeRepair
    */
    public Long getGuaranteeRepair() {
        return guaranteeRepair;
    }
    
    /**
    * @param 对guaranteeRepair进行赋值
    */
    public void setGuaranteeRepair(Long guaranteeRepair) {
        this.guaranteeRepair = guaranteeRepair;
    }
    
    /**
    * @return 返回 supportTenpay
    */
    public Long getSupportTenpay() {
        return supportTenpay;
    }
    
    /**
    * @param 对supportTenpay进行赋值
    */
    public void setSupportTenpay(Long supportTenpay) {
        this.supportTenpay = supportTenpay;
    }
    
    /**
    * @return 返回 buyLimit
    */
    public Long getBuyLimit() {
        return buyLimit;
    }
    
    /**
    * @param 对buyLimit进行赋值
    */
    public void setBuyLimit(Long buyLimit) {
        this.buyLimit = buyLimit;
    }
    
    /**
    * @return 返回 validDuration
    */
    public Long getValidDuration() {
        return validDuration;
    }
    
    /**
    * @param 对validDuration进行赋值
    */
    public void setValidDuration(Long validDuration) {
        this.validDuration = validDuration;
    }
    
    /**
    * @return 返回 theme
    */
    public String getTheme() {
        return theme;
    }
    
    /**
    * @param 对theme进行赋值
    */
    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    /**
    * @return 返回 reloadCount
    */
    public Long getReloadCount() {
        return reloadCount;
    }
    
    /**
    * @param 对reloadCount进行赋值
    */
    public void setReloadCount(Long reloadCount) {
        this.reloadCount = reloadCount;
    }
    
    /**
    * @return 返回 visitCount
    */
    public Long getVisitCount() {
        return visitCount;
    }
    
    /**
    * @param 对visitCount进行赋值
    */
    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }
    
    /**
    * @return 返回 sizeTableId
    */
    public String getSizeTableId() {
        return sizeTableId;
    }
    
    /**
    * @param 对sizeTableId进行赋值
    */
    public void setSizeTableId(String sizeTableId) {
        this.sizeTableId = sizeTableId;
    }
    
    /**
    * @return 返回 createTime
    */
    public Date getCreateTime() {
        return createTime;
    }
    
    /**
    * @param 对createTime进行赋值
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
    * @return 返回 lastModifyTime
    */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }
    
    /**
    * @param 对lastModifyTime进行赋值
    */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
    
    /**
    * @return 返回 lastToSaleTime
    */
    public Date getLastToSaleTime() {
        return lastToSaleTime;
    }
    
    /**
    * @param 对lastToSaleTime进行赋值
    */
    public void setLastToSaleTime(Date lastToSaleTime) {
        this.lastToSaleTime = lastToSaleTime;
    }
    
    /**
    * @return 返回 lastToStoreTime
    */
    public Date getLastToStoreTime() {
        return lastToStoreTime;
    }
    
    /**
    * @param 对lastToStoreTime进行赋值
    */
    public void setLastToStoreTime(Date lastToStoreTime) {
        this.lastToStoreTime = lastToStoreTime;
    }
    
    /**
    * @return 返回 emsPrice
    */
    public Long getEmsPrice() {
        return emsPrice;
    }
    
    /**
    * @param 对emsPrice进行赋值
    */
    public void setEmsPrice(Long emsPrice) {
        this.emsPrice = emsPrice;
    }
    
    /**
    * @return 返回 quick
    */
    public Long getQuick() {
        return quick;
    }
    
    /**
    * @param 对quick进行赋值
    */
    public void setQuick(Long quick) {
        this.quick = quick;
    }
    
    /**
    * @return 返回 freeReturn
    */
    public Long getFreeReturn() {
        return freeReturn;
    }
    
    /**
    * @param 对freeReturn进行赋值
    */
    public void setFreeReturn(Long freeReturn) {
        this.freeReturn = freeReturn;
    }
    
    /**
    * @return 返回 qtReportFlag
    */
    public Long getQtReportFlag() {
        return qtReportFlag;
    }
    
    /**
    * @param 对qtReportFlag进行赋值
    */
    public void setQtReportFlag(Long qtReportFlag) {
        this.qtReportFlag = qtReportFlag;
    }
    
    /**
    * @return 返回 picLink
    */
    public String getPicLink() {
        return picLink;
    }
    
    /**
    * @param 对picLink进行赋值
    */
    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", itemLocalCode=" + itemLocalCode
            + ", itemState=" + itemState + ", stateCode=" + stateCode + ", stateDesc=" + stateDesc + ", itemProperty="
            + itemProperty + ", properties=" + properties + ", categoryId=" + categoryId + ", classId=" + classId
            + ", attr=" + attr + ", attr2=" + attr2 + ", customAttr=" + customAttr + ", sellType=" + sellType
            + ", payType=" + payType + ", marketPrice=" + marketPrice + ", itemPrice=" + itemPrice + ", qqvipItem="
            + qqvipItem + ", qqvipDiscount=" + qqvipDiscount + ", stockCount=" + stockCount + ", sellerName="
            + sellerName + ", sellerPayFreight=" + sellerPayFreight + ", freightId=" + freightId + ", codId=" + codId
            + ", weight=" + weight + ", mailPrice=" + mailPrice + ", expressPrice=" + expressPrice + ", emsPrice="
            + emsPrice + ", cityId=" + cityId + ", provinceId=" + provinceId + ", countryId=" + countryId
            + ", recommendItem=" + recommendItem + ", quick=" + quick + ", freeReturn=" + freeReturn
            + ", qtReportFlag=" + qtReportFlag + ", windowItem=" + windowItem + ", invoiceItem=" + invoiceItem
            + ", guaranteeCompensation=" + guaranteeCompensation + ", guarantee7Days=" + guarantee7Days
            + ", guarantee14Days=" + guarantee14Days + ", guaranteeRepair=" + guaranteeRepair + ", supportTenpay="
            + supportTenpay + ", buyLimit=" + buyLimit + ", validDuration=" + validDuration + ", theme=" + theme
            + ", picLink=" + picLink + ", reloadCount=" + reloadCount + ", visitCount=" + visitCount + ", sizeTableId="
            + sizeTableId + ", createTime=" + createTime + ", lastModifyTime=" + lastModifyTime + ", lastToSaleTime="
            + lastToSaleTime + ", lastToStoreTime=" + lastToStoreTime + "]";
    }
    
}