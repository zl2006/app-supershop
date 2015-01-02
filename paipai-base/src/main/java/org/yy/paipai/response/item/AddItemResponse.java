package org.yy.paipai.response.item;


/*
* 文 件 名:  AddItemResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   发布商品接口，http://pop.paipai.com/api/paipai/item/addItem响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Stock;

/**
*  发布商品接口，http://pop.paipai.com/api/paipai/item/addItem响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddItemResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -620472139081386148L;

    /**
     * 商品编码，拍拍侧返回的一个商品一个的固定编码，不可改变
     */
    private String itemCode;
    
    /**
     * 商品本地编码，合作商家的私有商品编码
     */
    private String itemLocalCode;
    
    /**
     * 商品状态
     */
    private String itemState;
    
    /**
     * 商品状态原因描述。主要用于商品 非在售状态时，告诉商家为什么商品不在上架销售状态。
     */
    private String stateDesc;
    
    /**
     * 发布成功后的库存信息
     */
    private List<Stock> stockList;
     
	
    /**
    * 商品编码，拍拍侧返回的一个商品一个的固定编码，不可改变
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
    * 商品本地编码，合作商家的私有商品编码
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
    * 商品状态
    */
    public String getItemState() {
        return  itemState;
    }
    
    /**
    */
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }
    
    /**
    * 商品状态原因描述。主要用于商品 非在售状态时，告诉商家为什么商品不在上架销售状态。
    */
    public String getStateDesc() {
        return  stateDesc;
    }
    
    /**
    */
    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }
    
    /**
    * 发布成功后的库存信息
    */
    public List<Stock> getStockList() {
        return  stockList;
    }
    
    /**
    */
    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }
     
    
}

