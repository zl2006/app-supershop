/*
* 文 件 名:  SellerSearchItemListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.response.item;

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Item;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author  zhouliang
* @version  [版本号, 2014年11月27日]
* @since  [产品/模块版本]
*/
public class SellerSearchItemListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 317522129503832330L;
    
    private long countTotal;
    
    private long pageIndex;
    
    private long pageSize;
    
    /**
    * @return 返回 countTotal
    */
    public long getCountTotal() {
        return countTotal;
    }
    
    /**
    * @param 对countTotal进行赋值
    */
    public void setCountTotal(long countTotal) {
        this.countTotal = countTotal;
    }
    
    /**
    * @return 返回 pageIndex
    */
    public long getPageIndex() {
        return pageIndex;
    }
    
    /**
    * @param 对pageIndex进行赋值
    */
    public void setPageIndex(long pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    /**
    * @return 返回 pageSize
    */
    public long getPageSize() {
        return pageSize;
    }
    
    /**
    * @param 对pageSize进行赋值
    */
    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }
    
    private List<Item> itemList;
    
    /**
    * @return 返回 itemList
    */
    public List<Item> getItemList() {
        return itemList;
    }
    
    /**
    * @param 对itemList进行赋值
    */
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
    
}
