package org.yy.paipai.response.appstore;

/*
* 文 件 名:  GetAppOrderListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询收费平台订单列表 ,响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.AppOrder;

/**
* 查询收费平台订单列表 ,响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAppOrderListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -8695861490055663933L;
    
    /**
     *  	number 		返回总结果数
     */
    private Long totalNum;
    
    /**
     * 
     */
    private Long pageIndex;
    
    /**
     * 
     */
    private Long pageSize;
    
    /**
     * 
     */
    private List<AppOrder> orderList;
    
    /**
    *  	number 		返回总结果数
    */
    public Long getTotalNum() {
        return totalNum;
    }
    
    /**
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * 
    */
    public Long getPageIndex() {
        return pageIndex;
    }
    
    /**
    */
    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    /**
    * 
    */
    public Long getPageSize() {
        return pageSize;
    }
    
    /**
    */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
    * 
    */
    public List<AppOrder> getOrderList() {
        return orderList;
    }
    
    /**
    */
    public void setOrderList(List<AppOrder> orderList) {
        this.orderList = orderList;
    }
    
}
