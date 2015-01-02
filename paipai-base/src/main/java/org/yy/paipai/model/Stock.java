package org.yy.paipai.model;

/*
* 文 件 名:  Stock.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  库存信息 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 库存信息 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class Stock extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 8495519921071536115L;
    
    /**
     * 发布成功后的库存唯一标识,后续修改删除时作为主键使用
     */
    private Long skuId;
    
    /**
     * 商家自身库存编码
     */
    private String stockLocalCode;
    
    /**
     * 库存属性串,不作为库存唯一标识用
     */
    private String stockAttr;
    
    /**
     * 库存状态:1-IS_IN_STORE, 2-IS_FOR_SALE,9-IS_PRE_DELETE
     */
    private String status;
    
    /**
     * 库存销售属性串
     */
    private Long saleAttr;
    
    /**
     * 商品的库存备注
     */
    private String stockDesc;
    
    /**
     * 商品的该库存对应的销售数量
     */
    private Long soldCount_TODO;
    
    /**
     * 商品的库存的价格
     */
    private Long stockPrice;
    
    /**
     * 商品的库存数量
     */
    private Long stockCount_TODO;
    
    /**
     *  商品的库存创建时间
     */
    private Date createTime_TODO;
    
    /**
     *  商品的库存最后修改时间
     */
    private Date lastModifyTime_TODO;
    
    /**
     *   易迅商品详情内容
     *  */
    private Long icsonDesc;
    
    /**
     * 标准json数组    新库存信息,内容和stockList一致.格式如下:[{字段名:字段值,...},{字段名:字段值,...}]。字段定义请参考：商品库存信息字段说明
     */
    private String stockJsonList;
    
    /**
    * 发布成功后的库存唯一标识,后续修改删除时作为主键使用
    */
    public Long getSkuId() {
        return skuId;
    }
    
    /**
    */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
    
    /**
    * 商家自身库存编码
    */
    public String getStockLocalCode() {
        return stockLocalCode;
    }
    
    /**
    */
    public void setStockLocalCode(String stockLocalCode) {
        this.stockLocalCode = stockLocalCode;
    }
    
    /**
    * 库存属性串,不作为库存唯一标识用
    */
    public String getStockAttr() {
        return stockAttr;
    }
    
    /**
    */
    public void setStockAttr(String stockAttr) {
        this.stockAttr = stockAttr;
    }
    
    /**
    * 库存状态:1-IS_IN_STORE, 2-IS_FOR_SALE,9-IS_PRE_DELETE
    */
    public String getStatus() {
        return status;
    }
    
    /**
    */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
    * 库存销售属性串
    */
    public Long getSaleAttr() {
        return saleAttr;
    }
    
    /**
    */
    public void setSaleAttr(Long saleAttr) {
        this.saleAttr = saleAttr;
    }
    
    /**
    * @return 返回 stockDesc
    */
    public String getStockDesc() {
        return stockDesc;
    }
    
    /**
    * @param 对stockDesc进行赋值
    */
    public void setStockDesc(String stockDesc) {
        this.stockDesc = stockDesc;
    }
    
    /**
    * @return 返回 soldCount_TODO
    */
    public Long getSoldCount_TODO() {
        return soldCount_TODO;
    }
    
    /**
    * @param 对soldCount_TODO进行赋值
    */
    public void setSoldCount_TODO(Long soldCount_TODO) {
        this.soldCount_TODO = soldCount_TODO;
    }
    
    /**
    * @return 返回 stockPrice
    */
    public Long getStockPrice() {
        return stockPrice;
    }
    
    /**
    * @param 对stockPrice进行赋值
    */
    public void setStockPrice(Long stockPrice) {
        this.stockPrice = stockPrice;
    }
    
    /**
    * @return 返回 stockCount_TODO
    */
    public Long getStockCount_TODO() {
        return stockCount_TODO;
    }
    
    /**
    * @param 对stockCount_TODO进行赋值
    */
    public void setStockCount_TODO(Long stockCount_TODO) {
        this.stockCount_TODO = stockCount_TODO;
    }
    
    /**
    * @return 返回 createTime_TODO
    */
    public Date getCreateTime_TODO() {
        return createTime_TODO;
    }
    
    /**
    * @param 对createTime_TODO进行赋值
    */
    public void setCreateTime_TODO(Date createTime_TODO) {
        this.createTime_TODO = createTime_TODO;
    }
    
    /**
    * @return 返回 lastModifyTime_TODO
    */
    public Date getLastModifyTime_TODO() {
        return lastModifyTime_TODO;
    }
    
    /**
    * @param 对lastModifyTime_TODO进行赋值
    */
    public void setLastModifyTime_TODO(Date lastModifyTime_TODO) {
        this.lastModifyTime_TODO = lastModifyTime_TODO;
    }
    
    /**
    * @return 返回 icsonDesc
    */
    public Long getIcsonDesc() {
        return icsonDesc;
    }
    
    /**
    * @param 对icsonDesc进行赋值
    */
    public void setIcsonDesc(Long icsonDesc) {
        this.icsonDesc = icsonDesc;
    }
    
    /**
    * @return 返回 stockJsonList
    */
    public String getStockJsonList() {
        return stockJsonList;
    }
    
    /**
    * @param 对stockJsonList进行赋值
    */
    public void setStockJsonList(String stockJsonList) {
        this.stockJsonList = stockJsonList;
    }
    
}
