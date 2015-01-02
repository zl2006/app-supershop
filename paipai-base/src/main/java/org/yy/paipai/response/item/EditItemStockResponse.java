package org.yy.paipai.response.item;

/*
* 文 件 名:  DditItemStockResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量修改商品库存信息 ,http://pop.paipai.com/api/paipai/item/editItemStock响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;
import java.util.Map;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Stock;

/**
* 批量修改商品库存信息 ,http://pop.paipai.com/api/paipai/item/editItemStock响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class EditItemStockResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 625994488800182748L;
    
    /**
     * 修改成功的sku列表
     */
    private List<Stock> succList;
    
    /**
     * 修改失败的sku列表,stock.errorCode 	number 		错误码, stock.errorMsg 	string 		错误信息
     */
    private List<Map<String, String>> failList;
    
    /**
    * 修改成功的sku列表
    */
    public List<Stock> getSuccList() {
        return succList;
    }
    
    /**
    */
    public void setSuccList(List<Stock> succList) {
        this.succList = succList;
    }
    
    /**
    * 修改失败的sku列表,stock.errorCode 	number 		错误码, stock.errorMsg 	string 		错误信息
    */
    public List<Map<String, String>> getFailList() {
        return failList;
    }
    
    /**
    */
    public void setFailList(List<Map<String, String>> failList) {
        this.failList = failList;
    }
    
}
