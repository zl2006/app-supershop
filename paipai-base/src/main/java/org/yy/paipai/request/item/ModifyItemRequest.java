package org.yy.paipai.request.item;

/*
* 文 件 名:  ModifyItemRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改商品接口,http://pop.paipai.com/api/paipai/item/modifyItem请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.ModifyItemResponse;

/**
* 修改商品接口,http://pop.paipai.com/api/paipai/item/modifyItem请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemRequest extends AbstractPaiPaiRequest<ModifyItemResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/modifyItem.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ModifyItemResponse> getResponseClass() {
        return ModifyItemResponse.class;
    }
    
    /**
    * 卖家QQ号
    */
    public Long getSellerUin() {
        return Long.valueOf(textMap.get("sellerUin"));
    }
    
    /**
     * 
    */
    public void setSellerUin(Long sellerUin) {
        textMap.put("sellerUin", String.valueOf(sellerUin));
    }
    
    /**
    *商品编码 itemCode和itemLocalCode至少必须填写一个。 索引字段，不能修改。
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
    *商品私有编码 itemCode和itemLocalCode至少必须填写一个。 索引字段，不能修改。
    */
    public String getItemLocalCode() {
        return textMap.get("itemLocalCode");
    }
    
    /**
    *
    */
    public void setItemLocalCode(String itemLocalCode) {
        textMap.put("itemLocalCode", itemLocalCode);
    }
    
    /**
    *商品名称1-60字节。如不修改，则不应该出现该字段。
    */
    public String getItemName() {
        return textMap.get("itemName");
    }
    
    /**
    *
    */
    public void setItemName(String itemName) {
        textMap.put("itemName", itemName);
    }
    
    /**
    * 商品所在城市。如不修改，则不应该出现该字段。
    */
    public Long getCityId() {
        return Long.valueOf(textMap.get("cityId"));
    }
    
    /**
     * 
    */
    public void setCityId(Long cityId) {
        textMap.put("cityId", String.valueOf(cityId));
    }
    
    /**
    * 所在省。如不修改，则不应该出现该字段。
    */
    public Long getProvinceId() {
        return Long.valueOf(textMap.get("provinceId"));
    }
    
    /**
     * 
    */
    public void setProvinceId(Long provinceId) {
        textMap.put("provinceId", String.valueOf(provinceId));
    }
    
    /**
    * 国家。如不修改，则不应该出现该字段。
    */
    public Long getCountryId() {
        return Long.valueOf(textMap.get("countryId"));
    }
    
    /**
     * 
    */
    public void setCountryId(Long countryId) {
        textMap.put("countryId", String.valueOf(countryId));
    }
    
    /**
    *商品属性信息。 按照class config属性串格式拼写。attr和customAttr字段至少该提供一个。如不修改，则不应该出现该字段。 使用属性工具可以获取参考值。
    */
    public String getAttr() {
        return textMap.get("attr");
    }
    
    /**
    *
    */
    public void setAttr(String attr) {
        textMap.put("attr", attr);
    }
    
    /**
    *自定义属性字符串。如不修改，则不应该出现该字段。 总长不超过10KB。属性串中存储若干个属性对，每个属性对包含一个属性名称和多个属性值名称。 属性对之间以|隔开，属性名称和属性值名称之间以“:”隔开，多个属性值之间以“&”隔开。 格式形如 Ka:Va|Kb:Vb|Kc:Vc1&Vc2&Vc3|Kd:Vd 例如 颜色:白色&黑色|尺码:S&M&L&XL&XXL 其中 K是指属性名称，禁止包含半角分隔符“|”或“:”，也不应包含其他不可见字符或控制字符，长度不超过60Bytes； V 是指属性值名称，禁止包含半角分隔符“|”、“:”或“&”，也不应包含其他不可见字符或控制字符，长度不超过100Bytes； 对于包含了属性名称或属性值名称包含了分隔符的情况，建议转换成对应的全角符号。 使用属性工具可以获取参考值。
    */
    public String getCustomAttr() {
        return textMap.get("customAttr");
    }
    
    /**
    *
    */
    public void setCustomAttr(String customAttr) {
        textMap.put("customAttr", customAttr);
    }
    
    /**
    *格式和attr基本一致,将多选改为以逗号分隔, 例子:version=1,1:1|2:2|a:a|b:1,2,4^a:你好
    */
    public String getAttr2() {
        return textMap.get("attr2");
    }
    
    /**
    *
    */
    public void setAttr2(String attr2) {
        textMap.put("attr2", attr2);
    }
    
    /**
    * 商品所属的店铺分类id，多个分类可用半角逗号隔开。如不修改，则不应该出现该字段。
    */
    public Long getCategoryId() {
        return Long.valueOf(textMap.get("categoryId"));
    }
    
    /**
     * 
    */
    public void setCategoryId(Long categoryId) {
        textMap.put("categoryId", String.valueOf(categoryId));
    }
    
    /**
    * 商品所属的拍拍类目id。每个商品只能从属于一个拍拍类目id，且必须从属于一个类目id。 如不修改，则不应该出现该字段。 使用属性工具可以查看该值。
    */
    public Long getClassId() {
        return Long.valueOf(textMap.get("classId"));
    }
    
    /**
     * 
    */
    public void setClassId(Long classId) {
        textMap.put("classId", String.valueOf(classId));
    }
    
    /**
    * 商品详情模版ID,可以通过:查询店铺所有的模板列表 getShopPageTemplate 获取
    */
    public Long getThemeId() {
        return Long.valueOf(textMap.get("themeId"));
    }
    
    /**
     * 
    */
    public void setThemeId(Long themeId) {
        textMap.put("themeId", String.valueOf(themeId));
    }
    
    /**
    * 单位为秒，表示商品第一次发布上架开始计算，过多久会被系统自动下架 7天传值: 604800 14天传值: 1209600 其他数值会通不过校验。如不修改，则不应该出现该字段。
    */
    public Long getValidDuration() {
        return Long.valueOf(textMap.get("validDuration"));
    }
    
    /**
     * 
    */
    public void setValidDuration(Long validDuration) {
        textMap.put("validDuration", String.valueOf(validDuration));
    }
    
    /**
    * 是否设置商品下架后自动上架。 注：该字段是指当商品下架后，是否设置自动上架，而不是指设置商品的预售时间上架销售。 如不修改，则不应该出现该字段。 0：不自动上架（默认） 1：自动上架
    */
    public Long getAutoReload() {
        return Long.valueOf(textMap.get("autoReload"));
    }
    
    /**
     * 
    */
    public void setAutoReload(Long autoReload) {
        textMap.put("autoReload", String.valueOf(autoReload));
    }
    
    /**
    * 购买限制，默认为0，表示不限制。如不修改，则不应该出现该字段。
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
    * 是否卖家承担运费。如不修改，则不应该出现该字段。 0：表示买家承担运费（默认） 1：表示卖家承担运费
    */
    public Long getSellerPayFreight() {
        return Long.valueOf(textMap.get("sellerPayFreight"));
    }
    
    /**
     * 
    */
    public void setSellerPayFreight(Long sellerPayFreight) {
        textMap.put("sellerPayFreight", String.valueOf(sellerPayFreight));
    }
    
    /**
    * 运费模板编号。值范围为 10-255，如果为0的话表示没有设置运费模板。 当采用freightId运费模板时, 无需再提供expressPrice/mailPrice/emsPrice,此时以运费模板中定义的运费价格为主。 如不修改，则不应该出现该字段。
    */
    public Long getFreightId() {
        return Long.valueOf(textMap.get("freightId"));
    }
    
    /**
     * 
    */
    public void setFreightId(Long freightId) {
        textMap.put("freightId", String.valueOf(freightId));
    }
    
    /**
    * 货到付款运费模板编号。如果为0的话表示没有设置运费模板，如果sendType=PT_COD则必须指定。 当采用codId运费模板时, 无需再提供expressPrice/mailPrice/emsPrice,此时以运费模板中定义的运费价格为主。 如不修改，则不应该出现该字段。
    */
    public Long getCodId() {
        return Long.valueOf(textMap.get("codId"));
    }
    
    /**
     * 
    */
    public void setCodId(Long codId) {
        textMap.put("codId", String.valueOf(codId));
    }
    
    /**
    * 平邮价格，当不采用运费模版时,需要提供这个运费价格。如不修改，则不应该出现该字段。
    */
    public Long getMailPrice() {
        return Long.valueOf(textMap.get("mailPrice"));
    }
    
    /**
     * 
    */
    public void setMailPrice(Long mailPrice) {
        textMap.put("mailPrice", String.valueOf(mailPrice));
    }
    
    /**
    * 	快递价格，当不采用运费模版时,需要提供这个运费价格。如不修改，则不应该出现该字段。
    */
    public Long getExpressPrice() {
        return Long.valueOf(textMap.get("expressPrice"));
    }
    
    /**
     * 
    */
    public void setExpressPrice(Long expressPrice) {
        textMap.put("expressPrice", String.valueOf(expressPrice));
    }
    
    /**
    * EMS运费，0到10000，单位:分，当不采用运费模版时,需要提供这个运费价格。 如不修改，则不应该出现该字段。
    */
    public Long getEmsPrice() {
        return Long.valueOf(textMap.get("emsPrice"));
    }
    
    /**
     * 
    */
    public void setEmsPrice(Long emsPrice) {
        textMap.put("emsPrice", String.valueOf(emsPrice));
    }
    
    /**
    *商品对应的拍拍产品编码，32 Bytes编码。如不修改，则不应该出现该字段。
    */
    public String getProductCode() {
        return textMap.get("productCode");
    }
    
    /**
    *
    */
    public void setProductCode(String productCode) {
        textMap.put("productCode", productCode);
    }
    
    /**
    * 商品的发货方式， PT_MONEY=款到发货 PT_COD=货到付款 
    */
    public Long getSendType() {
        return Long.valueOf(textMap.get("sendType"));
    }
    
    /**
     * 
    */
    public void setSendType(Long sendType) {
        textMap.put("sendType", String.valueOf(sendType));
    }
    
    /**
    * 是否二手商品。如不修改，则不应该出现该字段。 0：表示非二手商品，是全新商品 1：表示是二手商品 8：商品新旧类型-见商品说明
    */
    public Long getSecondHandItem() {
        return Long.valueOf(textMap.get("secondHandItem"));
    }
    
    /**
     * 
    */
    public void setSecondHandItem(Long secondHandItem) {
        textMap.put("secondHandItem", String.valueOf(secondHandItem));
    }
    
    /**
    * 	是否保修商品。如不修改，则不应该出现该字段。 0：表示非保修商品 1：表示保修商品
    */
    public Long getWarrantyItem() {
        return Long.valueOf(textMap.get("warrantyItem"));
    }
    
    /**
     * 
    */
    public void setWarrantyItem(Long warrantyItem) {
        textMap.put("warrantyItem", String.valueOf(warrantyItem));
    }
    
    /**
    * 是否提供发票。如不修改，则不应该出现该字段。 0：表示商品不开具发票 1：表示商品可开具发票
    */
    public Long getInvoiceItem() {
        return Long.valueOf(textMap.get("invoiceItem"));
    }
    
    /**
     * 
    */
    public void setInvoiceItem(Long invoiceItem) {
        textMap.put("invoiceItem", String.valueOf(invoiceItem));
    }
    
    /**
    * 是否假一赔三诚信保证商品。如不修改，则不应该出现该字段。 0：表示非假一赔三商品 1：表示是假一赔三商品
    */
    public Long getGuaranteeCompensation() {
        return Long.valueOf(textMap.get("guaranteeCompensation"));
    }
    
    /**
     * 
    */
    public void setGuaranteeCompensation(Long guaranteeCompensation) {
        textMap.put("guaranteeCompensation", String.valueOf(guaranteeCompensation));
    }
    
    /**
    * 是否7天包退诚信保证商品。如不修改，则不应该出现该字段。 0：表示非7天包退诚信保证商品 1：表示是7天包退诚信保证商品
    */
    public Long getGuarantee7Days() {
        return Long.valueOf(textMap.get("guarantee7Days"));
    }
    
    /**
     * 
    */
    public void setGuarantee7Days(Long guarantee7Days) {
        textMap.put("guarantee7Days", String.valueOf(guarantee7Days));
    }
    
    /**
    * 是否14天先行赔付诚信保证商品。如不修改，则不应该出现该字段。 0：表示非14天先行赔付诚信保证商品 1：表示是14天先行赔付诚信保证商品
    */
    public Long getGuarantee14Days() {
        return Long.valueOf(textMap.get("guarantee14Days"));
    }
    
    /**
     * 
    */
    public void setGuarantee14Days(Long guarantee14Days) {
        textMap.put("guarantee14Days", String.valueOf(guarantee14Days));
    }
    
    /**
    * 商品的市场参考价格，只对QQ会员特权卖家有效。如不修改，则不应该出现该字段。
    */
    public Long getMarketPrice() {
        return Long.valueOf(textMap.get("marketPrice"));
    }
    
    /**
     * 
    */
    public void setMarketPrice(Long marketPrice) {
        textMap.put("marketPrice", String.valueOf(marketPrice));
    }
    
    /**
    * 商品的QQ会员折扣，只对QQ会员特权卖家有效。如不修改，则不应该出现该字段。单位为万分之一,例如:9折为9000
    */
    public Long getQqVipDiscount() {
        return Long.valueOf(textMap.get("qqVipDiscount"));
    }
    
    /**
     * 
    */
    public void setQqVipDiscount(Long qqVipDiscount) {
        textMap.put("qqVipDiscount", String.valueOf(qqVipDiscount));
    }
    
    /**
    * 	是否橱窗商品。如不修改，则不应该出现该字段。 0：表示非橱窗展示商品 1：表示是橱窗展示商品
    */
    public Long getWindowItem() {
        return Long.valueOf(textMap.get("windowItem"));
    }
    
    /**
     * 
    */
    public void setWindowItem(Long windowItem) {
        textMap.put("windowItem", String.valueOf(windowItem));
    }
    
    /**
    *每次操作stockInfo都将覆盖该商品所有库存，请谨慎处理。建议修改库存和价格请参考文档 http://pop.paipai.com/api/item/editItemStock 库存信息格式如下： 库存信息要根据发布的类目classId分为单库存和多库存商品。 多库存商品可以填写例如 stockInfo=“17900,100,颜色:白色|尺码:L,AFC0021,备注内容” stockInfo=“500,50,颜色:红色|尺码:M,AFC0022,备注内容” 单库存商品可参加如下：[后续请使用stockPrice和stockCount] stockInfo=“500,50” 价格（单位：分，必须），库存数（必须），库存属性（可为空），库存私有编码（可为空），库存备注（可为空）各个字段用半角逗号隔开， 字段值禁止出现半角逗号。例如：17900,100,颜色:白色|尺码:L,AFC0021，备注内容 stockInfo字段可出现多次，表示多个库存，但同一商品的多个库存的库存属性不可重复、库存私有编码不可重复。
    */
    public String getStockInfo() {
        return textMap.get("stockInfo");
    }
    
    /**
    *
    */
    public void setStockInfo(String stockInfo) {
        textMap.put("stockInfo", stockInfo);
    }
    
    /**
    *新库存信息格式如下:[{字段名:字段值,...},{字段名:字段值,...}]。字段定义请参考：商品库存信息字段说明,请注意：多库存的修改该接口只支持全量覆盖方式
    */
    public String getStockJsonList() {
        return textMap.get("stockJsonList");
    }
    
    /**
    *
    */
    public void setStockJsonList(String stockJsonList) {
        textMap.put("stockJsonList", stockJsonList);
    }
    
    /**
    * 	单库存商品的价格
    */
    public Long getStockPrice() {
        return Long.valueOf(textMap.get("stockPrice"));
    }
    
    /**
     * 
    */
    public void setStockPrice(Long stockPrice) {
        textMap.put("stockPrice", String.valueOf(stockPrice));
    }
    
    /**
    * 单库存商品的库存数量。单库存的商品价格和数量修改请使用stockPrice和stockCount,同时忽略多库存输入字段stockInfo或stockJsonList
    */
    public Long getStockCount() {
        return Long.valueOf(textMap.get("stockCount"));
    }
    
    /**
     * 
    */
    public void setStockCount(Long stockCount) {
        textMap.put("stockCount", String.valueOf(stockCount));
    }
    
    /**
    * 	尺码表Id。如不修改，则不应该出现该字段。
    */
    public Long getSizeTableId() {
        return Long.valueOf(textMap.get("sizeTableId"));
    }
    
    /**
     * 
    */
    public void setSizeTableId(Long sizeTableId) {
        textMap.put("sizeTableId", String.valueOf(sizeTableId));
    }
    
    /**
    *推荐搭配商品编码(商品必须是已经上架的)，多个以‘|’号隔开,取消设置为空即可
    */
    public String getRelatedItems() {
        return textMap.get("relatedItems");
    }
    
    /**
    *
    */
    public void setRelatedItems(String relatedItems) {
        textMap.put("relatedItems", relatedItems);
    }
    
    /**
    * 如果商品已经售出至少2个， 可以设置商品支持红包类型(只支持5元,10元,20元，0为取消,其他值忽略, 但当商品是特价、推荐位、卖场推荐的，则不能再设置它的红包类型)
    */
    public Long getRedPacketSupport() {
        return Long.valueOf(textMap.get("redPacketSupport"));
    }
    
    /**
     * 
    */
    public void setRedPacketSupport(Long redPacketSupport) {
        textMap.put("redPacketSupport", String.valueOf(redPacketSupport));
    }
    
    /**
    * 是否7天免邮包退：1=是、0=否， 没有指定该参数，则不修改
    */
    public Long getFreeReturn() {
        return Long.valueOf(textMap.get("freeReturn"));
    }
    
    /**
     * 
    */
    public void setFreeReturn(Long freeReturn) {
        textMap.put("freeReturn", String.valueOf(freeReturn));
    }
    
    /**
    * 	是否快速发货：1=是、0=否， 没有指定该参数，则不修改
    */
    public Long getQuick() {
        return Long.valueOf(textMap.get("quick"));
    }
    
    /**
     * 
    */
    public void setQuick(Long quick) {
        textMap.put("quick", String.valueOf(quick));
    }
    
    /**
    * 是否打预售标记：1=是、0=否， 没有指定该参数，则不修改
    */
    public Long getPreSale() {
        return Long.valueOf(textMap.get("preSale"));
    }
    
    /**
     * 
    */
    public void setPreSale(Long preSale) {
        textMap.put("preSale", String.valueOf(preSale));
    }
    
}
