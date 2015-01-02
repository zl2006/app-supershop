package org.yy.paipai.response.item;

/*
* 文 件 名:  ItemStatisticsResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品统计数据 ,http://pop.paipai.com/api/paipai/item/getItemStatistics响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ItemStatistics;

/**
* 商品统计数据 ,http://pop.paipai.com/api/paipai/item/getItemStatistics响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ItemStatisticsResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 6185823355347201471L;
    /**
     * 统计数据集合
     */
    private List<ItemStatistics> statisticsList;
    
    /**
    * 统计数据集合
    */
    public List<ItemStatistics> getStatisticsList() {
        return statisticsList;
    }
    
    /**
    */
    public void setStatisticsList(List<ItemStatistics> statisticsList) {
        this.statisticsList = statisticsList;
    }
    
}
