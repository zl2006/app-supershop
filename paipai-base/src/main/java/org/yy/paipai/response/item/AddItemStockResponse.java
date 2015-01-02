package org.yy.paipai.response.item;

/*
* 文 件 名:  AddItemStockResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量新增商品库存信息 ,http://pop.paipai.com/api/paipai/item/addItemStock响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Stock;

/**
* 批量新增商品库存信息 ,http://pop.paipai.com/api/paipai/item/addItemStock响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddItemStockResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -6452818459804900351L;
    /**
     * 
     */
    private List<Stock> succList;
    
    /**
    * 
    */
    public List<Stock> getSuccList() {
        return succList;
    }
    
    /**
    */
    public void setSuccList(List<Stock> succList) {
        this.succList = succList;
    }
    
}
