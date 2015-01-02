package org.yy.paipai.response.shop;

/*
* 文 件 名:  GetShippingfeeListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   查询运费模板列表 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Freight;

/**
*  查询运费模板列表 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShippingfeeListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -5423867847483479850L;
    
    /**
     * 运费模板总数
     */
    private Long totalCount;
    
    /**
     * 第几页
     */
    private Long pageIndex;
    
    /**
     * 每页运费模板数
     */
    private Long pageSize;
    
    /**
     * 运费模板列表
     */
    private List<Freight> freightList;
    
    /**
    * 运费模板总数
    */
    public Long getTotalCount() {
        return totalCount;
    }
    
    /**
    */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    
    /**
    * 第几页
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
    * 每页运费模板数
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
    * 运费模板列表
    */
    public List<Freight> getFreightList() {
        return freightList;
    }
    
    /**
    */
    public void setFreightList(List<Freight> freightList) {
        this.freightList = freightList;
    }
    
}
