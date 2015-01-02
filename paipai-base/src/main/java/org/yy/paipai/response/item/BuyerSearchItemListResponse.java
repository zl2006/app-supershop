package org.yy.paipai.response.item;


/*
* 文 件 名:  BuyerSearchItemListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  买家查询商品列表接口 响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Item;

/**
* 买家查询商品列表接口 响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class BuyerSearchItemListResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -6203293953797324246L;

    /**
     * 记录总数
     */
    private Long countTotal;
    
    /**
     * 第几页
     */
    private String pageIndex;
    
    /**
     * 每页记录条数
     */
    private String pageSize;
    
    /** 
     *  	商品列表
     */
    private List<Item> itemList;
     
	
    /**
    * 记录总数
    */
    public Long getCountTotal() {
        return  countTotal;
    }
    
    /**
    */
    public void setCountTotal(Long countTotal) {
        this.countTotal = countTotal;
    }
    
    /**
    * 第几页
    */
    public String getPageIndex() {
        return  pageIndex;
    }
    
    /**
    */
    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    /**
    * 每页记录条数
    */
    public String getPageSize() {
        return  pageSize;
    }
    
    /**
    */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
    *  	商品列表
    */
    public List<Item> getItemList() {
        return  itemList;
    }
    
    /**
    */
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
     
    
}

