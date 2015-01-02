/*
* 文 件 名:  SellerSearchItemListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.request.item;

import org.yy.paipai.api.ApiRuleException;
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.SellerSearchItemListResponse;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class SellerSearchItemListRequest extends AbstractPaiPaiRequest<SellerSearchItemListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/sellerSearchItemList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public void check()
        throws ApiRuleException {
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<SellerSearchItemListResponse> getResponseClass() {
        return SellerSearchItemListResponse.class;
    }
    
    /**
     * >=1 查询第几页
     */
    public Long getPageIndex() {
        return Long.valueOf(textMap.get("pageIndex"));
    }
    
    /**
    * @param 对pageIndex进行赋值
    */
    public void setPageIndex(Long pageIndex) {
        textMap.put("pageIndex", String.valueOf(pageIndex));
    }
    
    /**
     * [1,30]  每页显示的记录数,不超过30
     */
    public Long getPageSize() {
        return Long.valueOf(textMap.get("pageSize"));
    }
    
    /**
    * @param 对pageSize进行赋值
    */
    public void setPageSize(Long pageSize) {
        textMap.put("pageSize", String.valueOf(pageSize));
    }
    
    /**
     * [10001,2000000000]  卖家QQ号
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
     * 例如如果设置为“森林”，那么商品标题中带有“森林”词的商品列表就会被查找出来.需要过滤特殊字符，包含在中括号内的: 【< > \】
     */
    public String getItemName() {
        return textMap.get("itemName");
    }
    
    /**
    * @param 对itemName进行赋值
    */
    public void setItemName(String itemName) {
        textMap.put("itemName", itemName);
    }
    
    /**
    * @return 返回 itemTags
    */
    public String getItemTags() {
        return textMap.get("itemTags");
    }
    
    /**
    * @param 对itemTags进行赋值
    */
    public void setItemTags(String itemTags) {
        textMap.put("itemTags", itemTags);
    }
    
    /**
     *  店铺自定义分类，“0” 查询未分类商品
     */
    public String getCategoryId() {
        return textMap.get("categoryId");
    }
    
    /**
    * @param 对categoryId进行赋值
    */
    public void setCategoryId(String categoryId) {
        textMap.put("categoryId", categoryId);
    }
    
    /**
     *   目标商品的状态值， 不传值则是获得所有的商品
     *    1.出售中， 
         2.仓库中，组合状态包括：我下架的+定期下架的+定时上架+从未上架的 
         3.我下架的 
         4.定期下架的 
         5.等待上架 
         6.定时上架 
         7.从未上架 
         8.售完的 
         9.等待处理 
         10.删除的商品
     */
    public Long getItemState() {
        return Long.valueOf(textMap.get("itemState"));
    }
    
    /**
    * @param 对itemState进行赋值
    */
    public void setItemState(Long itemState) {
        textMap.put("itemState", String.valueOf(itemState));
    }
    
    /**
     *  目标商品的第一次发布时间条件区间里的左边界值
     *  例如如果设置为2008-12-03 01:02:03，表示查找商品第一次发布时间大于2008年12月3日 01:02:03 这个时刻的商品。 
        备注：商品一旦发布，该时间不再更改
     */
    public String getCreateTimeBegin() {
        return textMap.get("createTimeBegin");
    }
    
    /**
    * @param 对createTimeBegin进行赋值
    */
    public void setCreateTimeBegin(String createTimeBegin) {
        textMap.put("createTimeBegin", createTimeBegin);
    }
    
    /**
     *       目标商品的第一次发布时间条件区间里的右边界值
     * 例如如果设置为2008-12-03 01:02:03，表示查找商品第一次发布时间小于2008年12月3日 01:02:03 这个时刻的商品
     */
    public String getCreateTimeEnd() {
        return textMap.get("createTimeEnd");
    }
    
    /**
    * @param 对createTimeEnd进行赋值
    */
    public void setCreateTimeEnd(String createTimeEnd) {
        textMap.put("createTimeEnd", createTimeEnd);
    }
    
    /**
     * 目标商品的最后变更时间条件区间里的左边界值
    例如如果设置为2008-12-03 01:02:03，表示查找商品信息最后变更时间大于2008年12月3日 01:02:03 这个时刻的商品
     */
    public String getModifyTimeBegin() {
        return textMap.get("modifyTimeBegin");
    }
    
    /**
    * @param 对modifyTimeBegin进行赋值
    */
    public void setModifyTimeBegin(String modifyTimeBegin) {
        textMap.put("modifyTimeBegin", modifyTimeBegin);
    }
    
    /**
     *  目标商品的最后变更时间条件区间里的右边界值
    例如如果设置为2008-12-03 01:02:03，表示查找商品信息最后变更时间小于2008年12月3日 01:02:03 这个时刻的商品 
    备注：只要是对商品进行了之如上架，下架，修改之类的操作，该时间就会变更
     */
    public String getModifyTimeEnd() {
        return textMap.get("modifyTimeEnd");
    }
    
    /**
    * @param 对modifyTimeEnd进行赋值
    */
    public void setModifyTimeEnd(String modifyTimeEnd) {
        textMap.put("modifyTimeEnd", modifyTimeEnd);
    }
    
    /**
     * 
     * 目标商品的上架时间条件区间里的 左边界值
        例如如果设置为2008-12-03 01:02:03，表示查找商品上架时间大于2008年12月3日 01:02:03 这个时刻的商品
    * @return 返回 toSaleTimeBegin
    */
    public String getToSaleTimeBegin() {
        return textMap.get("toSaleTimeBegin");
    }
    
    /**
    * @param 对toSaleTimeBegin进行赋值
    */
    public void setToSaleTimeBegin(String toSaleTimeBegin) {
        textMap.put("toSaleTimeBegin", toSaleTimeBegin);
    }
    
    /**
     * 
     * 目标商品的上架时间条件区间里的右边界值
    例如如果设置为2008-12-03 01:02:03，表示查找商品上架时间小于2008年12月3日 01:02:03 这个时刻的商品 
    备注：商品上架则该时间改变，如果商品一直没有上架过，则默认的时间是1970-01-01 08:00:00
    * @return 返回 toSaleTimeEnd
    */
    public String getToSaleTimeEnd() {
        return textMap.get("toSaleTimeEnd");
    }
    
    /**
    * @param 对toSaleTimeEnd进行赋值
    */
    public void setToSaleTimeEnd(String toSaleTimeEnd) {
        textMap.put("toSaleTimeEnd", toSaleTimeEnd);
    }
    
    /**
     * 
     * 目标商品价格大于等于 单位：分
    */
    public Long getPriceMorethan() {
        return Long.valueOf(textMap.get("priceMorethan"));
    }
    
    /**
    * @param 对priceMorethan进行赋值
    */
    public void setPriceMorethan(Long priceMorethan) {
        textMap.put("priceMorethan", String.valueOf(priceMorethan));
    }
    
    /**
     * 
     * 目标商品价格小于等于 单位：分
    * @return 返回 priceLessthan
    */
    public Long getPriceLessthan() {
        return Long.valueOf(textMap.get("priceLessthan"));
    }
    
    /**
    * @param 对priceLessthan进行赋值
    */
    public void setPriceLessthan(Long priceLessthan) {
        textMap.put("priceLessthan", String.valueOf(priceLessthan));
    }
    
    /**
     * 
     * 是否需要返回商品的附属信息，0为不需要，1为需要。 强烈建议该字段不要时设置为0，
    因为这样能大大加快调用的返回速度。 
    备注：
    1.女装商品的下载的时候需要用这个,5张图片必须设置这个为1才能下载到其他4张图片
    2.需要返回尺码表sizeTable时，也必须出现该字段
    3.需要返回会员vip折扣价或是否会员vip商品时，也必须出现该字段
    * @return 返回 extendInfo
    */
    public Long getExtendInfo() {
        return Long.valueOf(textMap.get("extendInfo"));
    }
    
    /**
    * @param 对extendInfo进行赋值
    */
    public void setExtendInfo(Long extendInfo) {
        textMap.put("extendInfo", String.valueOf(extendInfo));
    }
    
    /**
     * 
     * /**
     * 目标商品列表的排序方式：
    0, 商品ID升序排列 
    1, 商品ID降序排列 
    2, 发布时间升序排列 
    3, 发布时间降序排列 
    4, 下架时间升序排列 
    5, 下架时间降序排列 
    6, 上架时间升序排列 
    7, 上架时间降序排列 
    8, 价格升序排列 
    9, 价格降序排列 
    10, 商品出价次数升序排列 
    11, 商品出价次数降序排列 
    12, 商品剩余时间升序排列 
    13, 商品剩余时间降序排列 
    14, 商品定时上架时间升序排列 
    15, 商品定时上架时间降序排列 
    16, 商品剩余件数升序排列 
    17, 商品剩余件数降序排列
    * @return 返回 orderType
    */
    public Long getOrderType() {
        return Long.valueOf(textMap.get("orderType"));
    }
    
    /**
    * @param 对orderType进行赋值
    */
    public void setOrderType(Long orderType) {
        textMap.put("orderType", String.valueOf(orderType));
    }
    
}
