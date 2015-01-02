package org.yy.paipai.request.item;

/*
* 文 件 名:  BuyerSearchItemListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  买家查询商品列表接口请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import java.util.Date;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.BuyerSearchItemListResponse;
import org.yy.paipai.util.PaiPaiUtils;

/**
* 买家查询商品列表接口请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class BuyerSearchItemListRequest extends AbstractPaiPaiRequest<BuyerSearchItemListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/buyerSearchItemList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<BuyerSearchItemListResponse> getResponseClass() {
        return BuyerSearchItemListResponse.class;
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
    *例如如果设置为“森林”，那么商品标题中带有“森林”词的商品列表就会被查找出来. 需要过滤特殊字符，包行在中括号内的: 【< > \】
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
    *目标商品的状态值 1.出售中
    */
    public String getItemState() {
        return textMap.get("itemState");
    }
    
    /**
    *
    */
    public void setItemState(String itemState) {
        textMap.put("itemState", itemState);
    }
    
    /**
    *
    */
    public String getItemTags() {
        return textMap.get("itemTags");
    }
    
    /**
    *
    */
    public void setItemTags(String itemTags) {
        textMap.put("itemTags", itemTags);
    }
    
    /**
    *店铺自定义分类，“0” 查询未分类商品
    */
    public String getCategoryId() {
        return textMap.get("categoryId");
    }
    
    /**
    *
    */
    public void setCategoryId(String categoryId) {
        textMap.put("categoryId", categoryId);
    }
    
    /**
     * 目标商品的第一次发布时间条件区间里的左边界值 例如如果设置为2008-12-03 01:02:03，表示查找商品第一次发布时间大于2008年12月3日 01:02:03 这个时刻的商品。 备注：商品一旦发布，该时间不再更改
    */
    public Date getCreateTimeBegin() {
        return PaiPaiUtils.toDate(textMap.get("createTimeBegin"));
    }
    
    /**
    *
    */
    public void setCreateTimeBegin(Date createTimeBegin) {
        textMap.put("createTimeBegin", PaiPaiUtils.parseDate(createTimeBegin));
    }
    
    /**
     * 目标商品的第一次发布时间条件区间里的右边界值 例如如果设置为2008-12-03 01:02:03，表示查找商品第一次发布时间小于2008年12月3日 01:02:03 这个时刻的商品
    */
    public Date getCreateTimeEnd() {
        return PaiPaiUtils.toDate(textMap.get("createTimeEnd"));
    }
    
    /**
    *
    */
    public void setCreateTimeEnd(Date createTimeEnd) {
        textMap.put("createTimeEnd", PaiPaiUtils.parseDate(createTimeEnd));
    }
    
    /**
     * 目标商品的最后变更时间条件区间里的左边界值 例如如果设置为2008-12-03 01:02:03，表示查找商品信息最后变更时间大于2008年12月3日 01:02:03 这个时刻的商品
    */
    public Date getModifyTimeBegin() {
        return PaiPaiUtils.toDate(textMap.get("modifyTimeBegin"));
    }
    
    /**
    *
    */
    public void setModifyTimeBegin(Date modifyTimeBegin) {
        textMap.put("modifyTimeBegin", PaiPaiUtils.parseDate(modifyTimeBegin));
    }
    
    /**
     * 目标商品的最后变更时间条件区间里的右边界值 例如如果设置为2008-12-03 01:02:03，表示查找商品信息最后变更时间小于2008年12月3日 01:02:03 这个时刻的商品 备注：只要是对商品进行了之如上架，下架，修改之类的操作，该时间就会变更
    */
    public Date getModifyTimeEnd() {
        return PaiPaiUtils.toDate(textMap.get("modifyTimeEnd"));
    }
    
    /**
    *
    */
    public void setModifyTimeEnd(Date modifyTimeEnd) {
        textMap.put("modifyTimeEnd", PaiPaiUtils.parseDate(modifyTimeEnd));
    }
    
    /**
     * 目标商品的上架时间条件区间里的 左边界值 例如如果设置为2008-12-03 01:02:03，表示查找商品上架时间大于2008年12月3日 01:02:03 这个时刻的商品
    */
    public Date getToSaleTimeBegin() {
        return PaiPaiUtils.toDate(textMap.get("toSaleTimeBegin"));
    }
    
    /**
    *
    */
    public void setToSaleTimeBegin(Date toSaleTimeBegin) {
        textMap.put("toSaleTimeBegin", PaiPaiUtils.parseDate(toSaleTimeBegin));
    }
    
    /**
     * 目标商品的上架时间条件区间里的右边界值 例如如果设置为2008-12-03 01:02:03，表示查找商品上架时间小于2008年12月3日 01:02:03 这个时刻的商品 备注：商品上架则该时间改变，如果商品一直没有上架过，则默认的时间是1970-01-01 08:00:00
    */
    public Date getToSaleTimeEnd() {
        return PaiPaiUtils.toDate(textMap.get("toSaleTimeEnd"));
    }
    
    /**
    *
    */
    public void setToSaleTimeEnd(Date toSaleTimeEnd) {
        textMap.put("toSaleTimeEnd", PaiPaiUtils.parseDate(toSaleTimeEnd));
    }
    
    /**
    * 	目标商品价格大于等于 单位：分
    */
    public Long getPriceMorethan() {
        return Long.valueOf(textMap.get("priceMorethan"));
    }
    
    /**
     * 
    */
    public void setPriceMorethan(Long priceMorethan) {
        textMap.put("priceMorethan", String.valueOf(priceMorethan));
    }
    
    /**
    * 目标商品价格小于等于 单位：分
    */
    public Long getPriceLessthan() {
        return Long.valueOf(textMap.get("priceLessthan"));
    }
    
    /**
     * 
    */
    public void setPriceLessthan(Long priceLessthan) {
        textMap.put("priceLessthan", String.valueOf(priceLessthan));
    }
    
    /**
    * 是否需要返回商品的附属信息，0为不需要，1为需要。 强烈建议该字段不要时设置为0， 因为这样能大大加快调用的返回速度。 备注：女装商品的下载的时候需要用这个。5张图片必须设置这个为1才能下载到其他4张图片
    */
    public Long getExtendInfo() {
        return Long.valueOf(textMap.get("extendInfo"));
    }
    
    /**
     * 
    */
    public void setExtendInfo(Long extendInfo) {
        textMap.put("extendInfo", String.valueOf(extendInfo));
    }
    
    /**
    * 目标商品列表的排序方式： 2, 发布时间升序排列 3, 发布时间降序排列 8, 价格升序排列 9, 价格降序排列
    */
    public Long getOrderType() {
        return Long.valueOf(textMap.get("orderType"));
    }
    
    /**
     * 
    */
    public void setOrderType(Long orderType) {
        textMap.put("orderType", String.valueOf(orderType));
    }
    
}
