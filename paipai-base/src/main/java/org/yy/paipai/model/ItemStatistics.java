package org.yy.paipai.model;

/*
* 文 件 名:  ItemStatistics.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品统计数据 ,http://pop.paipai.com/api/paipai/item/getItemStatistics 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 商品统计数据 ,http://pop.paipai.com/api/paipai/item/getItemStatistics 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ItemStatistics extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -1048481064378238168L;
    
    /**
     * 统计项ID 7:一个月内付款笔数(实时) 8:一个月内付款金额(实时) 9:90天内付款笔数(实时) 10:90天内销售数量(完成付款的实时数量)，注意：如果修改了商品关键属性，该值会被置0
     */
    private String id;
    
    /**
     * 统计值
     */
    private String val;
    
    /**
    * 统计项ID 7:一个月内付款笔数(实时) 8:一个月内付款金额(实时) 9:90天内付款笔数(实时) 10:90天内销售数量(完成付款的实时数量)，注意：如果修改了商品关键属性，该值会被置0
    */
    public String getId() {
        return id;
    }
    
    /**
    */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
    * 统计值
    */
    public String getVal() {
        return val;
    }
    
    /**
    */
    public void setVal(String val) {
        this.val = val;
    }
    
}
