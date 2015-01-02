package org.yy.paipai.request.report;

/*
* 文 件 名:  GetShopSearchKeywordRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍到店搜索关键词统计 ,http://pop.paipai.com/api/paipai/report/getShopSearchKeyword请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.report.GetShopSearchKeywordResponse;

/**
* 查询拍拍到店搜索关键词统计 ,http://pop.paipai.com/api/paipai/report/getShopSearchKeyword请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopSearchKeywordRequest extends AbstractPaiPaiRequest<GetShopSearchKeywordResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/report/getShopSearchKeyword.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopSearchKeywordResponse> getResponseClass() {
        return GetShopSearchKeywordResponse.class;
    }
    
    /**
    * 卖家QQ号
    */
    public Long getSellerUin() {
        return Long.valueOf(textMap.get("sellerUin"));
    }
    
    /**
     * 
    */
    public void setSellerUin(Long sellerUin) {
        textMap.put("sellerUin", String.valueOf(sellerUin));
    }
    
    /**
    * 查询的对应开始日期,只能按天为单位查询,格式'yyyyMMdd'
    */
    public Long getStartDay() {
        return Long.valueOf(textMap.get("startDay"));
    }
    
    /**
     * 
    */
    public void setStartDay(Long startDay) {
        textMap.put("startDay", String.valueOf(startDay));
    }
    
    /**
    * 查询的对应结束日期,只能按天为单位查询,格式'yyyyMMdd'
    */
    public Long getEndDay() {
        return Long.valueOf(textMap.get("endDay"));
    }
    
    /**
     * 
    */
    public void setEndDay(Long endDay) {
        textMap.put("endDay", String.valueOf(endDay));
    }
    
    /**
    * 查询的分页信息,页数
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
    * 查询的分页信息,每页返回数
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
