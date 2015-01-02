package org.yy.paipai.request.item;


/*
* 文 件 名:  ItemStatisticsRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品统计数据 ,http://pop.paipai.com/api/paipai/item/getItemStatistics请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.ItemStatisticsResponse;

/**
* 商品统计数据 ,http://pop.paipai.com/api/paipai/item/getItemStatistics请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ItemStatisticsRequest extends AbstractPaiPaiRequest<ItemStatisticsResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/getItemStatistics.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ItemStatisticsResponse> getResponseClass() {
        return ItemStatisticsResponse.class;
    }
    
    
    	
    	
    	
    /**
    *商品编码itemCode
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
    	
    
     
    
    
    
}

