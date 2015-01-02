package org.yy.paipai.request.shop;

/*
* 文 件 名:  GetShopPVLogRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍店铺pv基础日志明细 ,   http://pop.paipai.com/api/paipai/shop/getShopPVLog请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import java.util.Date;

import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetShopPVLogResponse;
import org.yy.paipai.util.PaiPaiUtils;

/**
* 查询拍拍店铺pv基础日志明细 ,   http://pop.paipai.com/api/paipai/shop/getShopPVLog请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopPVLogRequest extends AbstractPaiPaiRequest<GetShopPVLogResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/getShopPVLog.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopPVLogResponse> getResponseClass() {
        return GetShopPVLogResponse.class;
    }
    
    /**
     * 查询日志的开始时间,即pv点击流产生的时间开始,目前只能查7天以内数据,不包括当天
    */
    public Date getStartTime() {
        return PaiPaiUtils.toDate(textMap.get("startTime"));
    }
    
    /**
    *
    */
    public void setStartTime(Date startTime) {
        textMap.put("startTime", PaiPaiUtils.parseDate(startTime));
    }
    
    /**
     * 查询日志的结束时间,开始时间与结束时间必须同一天,暂不支持跨天查
    */
    public Date getEndTime() {
        return PaiPaiUtils.toDate(textMap.get("endTime"));
    }
    
    /**
    *
    */
    public void setEndTime(Date endTime) {
        textMap.put("endTime", PaiPaiUtils.parseDate(endTime));
    }
    
    /**
    * 查询分页的索引,即第几页,从1开始
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
    * 查询分页的大小,默认每页20条,不能大于30
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
