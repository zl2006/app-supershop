package org.yy.paipai.request.appstore;


/*
* 文 件 名:  GetAppOrderListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询收费平台订单列表 ,请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import java.util.Date;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.appstore.GetAppOrderListResponse;
import org.yy.paipai.util.PaiPaiUtils;

/**
* 查询收费平台订单列表 ,请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAppOrderListRequest extends AbstractPaiPaiRequest<GetAppOrderListResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/appstore/getAppOrderList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetAppOrderListResponse> getResponseClass() {
        return GetAppOrderListResponse.class;
    }
    
    
    	
    /**
    * *	number		应用id,需要查询的应用标识
    */
    public Long getAppId() {
        return Long.valueOf(textMap.get("appId"));
    }
    
    /**
     * 
    */
    public void setAppId(Long appId) {
        textMap.put("appId", String.valueOf(appId));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 	number		收费项目ID
    */
    public Long getItemId() {
        return Long.valueOf(textMap.get("itemId"));
    }
    
    /**
     * 
    */
    public void setItemId(Long itemId) {
        textMap.put("itemId", String.valueOf(itemId));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 	number		用户Uin
    */
    public Long getUserUin() {
        return Long.valueOf(textMap.get("userUin"));
    }
    
    /**
     * 
    */
    public void setUserUin(Long userUin) {
        textMap.put("userUin", String.valueOf(userUin));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 	number		订单ID
    */
    public Long getOrderId() {
        return Long.valueOf(textMap.get("orderId"));
    }
    
    /**
     * 
    */
    public void setOrderId(Long orderId) {
        textMap.put("orderId", String.valueOf(orderId));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 	number		订购类型 : 1.New:订单,2.Renew:续订,3.Upgrade:升级
    */
    public Long getOrderType() {
        return Long.valueOf(textMap.get("orderType"));
    }
    
    /**
     * 
    */
    public void setOrderType(Long orderType) {
        textMap.put("orderType", String.valueOf(orderType));
    }
    	
    	
    	
    
    
    
    	
    /**
    * 	number		支付状态:1.New:新建,2.Paid:已付款,3.Upgraded:被升级,4.Cancel:取消,5.SystemClose:付款超时关闭
    */
    public Long getOrderStatus() {
        return Long.valueOf(textMap.get("orderStatus"));
    }
    
    /**
     * 
    */
    public void setOrderStatus(Long orderStatus) {
        textMap.put("orderStatus", String.valueOf(orderStatus));
    }
    	
    	
    	
    
    
    
    	
    	
    /**
     * 	string		订单创建开始时间
    */
    public Date getFromDate() {
        return PaiPaiUtils.toDate(textMap.get("fromDate"));
    }
    
    /**
    *
    */
    public void setFromDate(Date fromDate) {
        textMap.put("fromDate", PaiPaiUtils.parseDate(fromDate));
    }
    	
    	
    
    
    
    	
    	
    /**
     * 	string		订单创建结束时间
    */
    public Date getToDate() {
        return PaiPaiUtils.toDate(textMap.get("toDate"));
    }
    
    /**
    *
    */
    public void setToDate(Date toDate) {
        textMap.put("toDate", PaiPaiUtils.parseDate(toDate));
    }
    	
    	
    
    
    
    	
    /**
    * *	number		查询分页:当前第几页,第1开始计算
    */
    public Long getPageIndex() {
        return Long.valueOf(textMap.get("pageIndex"));
    }
    
    /**
     * 
    */
    public void setPageIndex(Long pageIndex) {
        textMap.put("pageIndex", String.valueOf(pageIndex));
    }
    	
    	
    	
    
    
    
    	
    /**
    * *	number		查询分页:每页返回最大结果数
    */
    public Long getPageSize() {
        return Long.valueOf(textMap.get("pageSize"));
    }
    
    /**
     * 
    */
    public void setPageSize(Long pageSize) {
        textMap.put("pageSize", String.valueOf(pageSize));
    }
    	
    	
    	
    
     
    
    
    
}

