package org.yy.paipai.response.item;


/*
* 文 件 名:  GetItemInfoResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询商品相关信息接口 ，http://pop.paipai.com/api/paipai/item/getItemInfo响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 查询商品相关信息接口 ，http://pop.paipai.com/api/paipai/item/getItemInfo响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemInfoResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -3693246693062712204L;

    /**
     * 卖家名称
     */
    private String sellerName;
    
    /**
     * 商品编码，商品在拍拍上标识的唯一编码
     */
    private String itemCode;
    
    /**
     * 商家对商品的编码，商家自行保证该编码的唯一性，否则根据该编码查询可能出错。
     */
    private String itemLocalCode;
    
    /**
     * 商品名称
     */
    private String itemName;
    
    /**
     * 访问的次数
     */
    private Long visitCount;
    
    /**
     * 商品当前的库存量
     */
    private Long number;
    
    /**
     * 卖家QQ号
     */
    private Long sellerUin;
     
	
    /**
    * 卖家名称
    */
    public String getSellerName() {
        return  sellerName;
    }
    
    /**
    */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    /**
    * 商品编码，商品在拍拍上标识的唯一编码
    */
    public String getItemCode() {
        return  itemCode;
    }
    
    /**
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * 商家对商品的编码，商家自行保证该编码的唯一性，否则根据该编码查询可能出错。
    */
    public String getItemLocalCode() {
        return  itemLocalCode;
    }
    
    /**
    */
    public void setItemLocalCode(String itemLocalCode) {
        this.itemLocalCode = itemLocalCode;
    }
    
    /**
    * 商品名称
    */
    public String getItemName() {
        return  itemName;
    }
    
    /**
    */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    /**
    * 访问的次数
    */
    public Long getVisitCount() {
        return  visitCount;
    }
    
    /**
    */
    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }
    
    /**
    * 商品当前的库存量
    */
    public Long getNumber() {
        return  number;
    }
    
    /**
    */
    public void setNumber(Long number) {
        this.number = number;
    }
    
    /**
    * 卖家QQ号
    */
    public Long getSellerUin() {
        return  sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
     
    
}

