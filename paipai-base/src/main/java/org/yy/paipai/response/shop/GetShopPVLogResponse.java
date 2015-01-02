package org.yy.paipai.response.shop;


/*
* 文 件 名:  GetShopPVLogResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍店铺pv基础日志明细 ,   http://pop.paipai.com/api/paipai/shop/getShopPVLog响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;
import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ShopPVLog;

/**
* 查询拍拍店铺pv基础日志明细 ,   http://pop.paipai.com/api/paipai/shop/getShopPVLog响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopPVLogResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 1587272173787824397L;

    /**
     * 查询日志的开始时间,即pv点击流产生的时间开始,目前只能查7天以内数据,不包括当天
     */
    private Date shopId;
    
    /**
     * 查询日志的结束时间,开始时间与结束时间必须同一天,暂不支持跨天查
     */
    private Date totalNum;
    
    /**
     * 查询分页的索引,即第几页,从1开始
     */
    private Long pageIndex;
    
    /**
     * 查询分页的大小,默认每页20条,不能大于30
     */
    private Long pageSize;
    
    /**
     * 日志明细
     */
    private List<ShopPVLog> pvLogList;
     
	
    /**
    * 查询日志的开始时间,即pv点击流产生的时间开始,目前只能查7天以内数据,不包括当天
    */
    public Date getShopId() {
        return  shopId;
    }
    
    /**
    */
    public void setShopId(Date shopId) {
        this.shopId = shopId;
    }
    
    /**
    * 查询日志的结束时间,开始时间与结束时间必须同一天,暂不支持跨天查
    */
    public Date getTotalNum() {
        return  totalNum;
    }
    
    /**
    */
    public void setTotalNum(Date totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * 查询分页的索引,即第几页,从1开始
    */
    public Long getPageIndex() {
        return  pageIndex;
    }
    
    /**
    */
    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    /**
    * 查询分页的大小,默认每页20条,不能大于30
    */
    public Long getPageSize() {
        return  pageSize;
    }
    
    /**
    */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
    * 日志明细
    */
    public List<ShopPVLog> getPvLogList() {
        return  pvLogList;
    }
    
    /**
    */
    public void setPvLogList(List<ShopPVLog> pvLogList) {
        this.pvLogList = pvLogList;
    }
     
    
}

