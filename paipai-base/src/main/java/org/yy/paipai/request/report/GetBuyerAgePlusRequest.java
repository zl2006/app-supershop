package org.yy.paipai.request.report;

/*
* 文 件 名:  GetBuyerAgePlusRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍买家性别年龄分析统计,http://pop.paipai.com/api/paipai/report/getBuyerAgePlus请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.report.GetBuyerAgePlusResponse;

/**
* 查询拍拍买家性别年龄分析统计,http://pop.paipai.com/api/paipai/report/getBuyerAgePlus请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetBuyerAgePlusRequest extends AbstractPaiPaiRequest<GetBuyerAgePlusResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/report/getBuyerAgePlus.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetBuyerAgePlusResponse> getResponseClass() {
        return GetBuyerAgePlusResponse.class;
    }
    
    /**
    * 	int64		查询的卖家号,即店铺QQ号
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
    **	int64		查询的对应开始日期,只能按天为单位查询,格式'yyyyMMdd'
    */
    public Long getStartDay() {
        return Long.valueOf( textMap.get("startDay") );
    }
    
    /**
    *
    */
    public void setStartDay(Long startDay) {
        textMap.put("startDay", String.valueOf(startDay));
    }
    
    /**
    **	int64		查询的对应结束日期,只能按天为单位查询,格式'yyyyMMdd'
    */
    public Long getEndDay() {
        return Long.valueOf(  textMap.get("endDay"));
    }
    
    /**
    *
    */
    public void setEndDay(Long endDay) {
        textMap.put("endDay", String.valueOf(endDay));
    }
    
    /**
    * *	int64	1	查询的分页信息,页数
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
    * *	int64	20	查询的分页信息,每页返回数
    */
    public Long getPageNum() {
        return Long.valueOf(textMap.get("pageNum"));
    }
    
    /**
     * 
    */
    public void setPageNum(Long pageNum) {
        textMap.put("pageNum", String.valueOf(pageNum));
    }
    
}
