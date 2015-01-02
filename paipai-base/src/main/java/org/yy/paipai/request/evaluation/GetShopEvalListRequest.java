package org.yy.paipai.request.evaluation;

/*
* 文 件 名:  GetShopEvalListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   查询店铺评价列表  ,http://pop.paipai.com/api/paipai/evaluation/getShopEvalList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.evaluation.GetShopEvalListResponse;

/**
*  查询店铺评价列表  ,http://pop.paipai.com/api/paipai/evaluation/getShopEvalList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopEvalListRequest extends AbstractPaiPaiRequest<GetShopEvalListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/evaluation/getShopEvalList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopEvalListResponse> getResponseClass() {
        return GetShopEvalListResponse.class;
    }
    
    /**
    * >=1	查询第几页
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
    * 每页显示的记录数
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
    
    /**
    * [10001,2000000000]	卖家QQ号
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
    * 0（默认）	是否显示历史评价 0：只返回六个月内评价列表（默认） 1：只返回六个月以前评价列表
    */
    public Long getHistory() {
        return Long.valueOf(textMap.get("history"));
    }
    
    /**
     * 
    */
    public void setHistory(Long history) {
        textMap.put("history", String.valueOf(history));
    }
    
    /**
    * 0（默认） 是否显示回复 0：不显示回复（默认） 1：显示回复
    */
    public Long getNeedReply() {
        return Long.valueOf(textMap.get("needReply"));
    }
    
    /**
     * 
    */
    public void setNeedReply(Long needReply) {
        textMap.put("needReply", String.valueOf(needReply));
    }
    
}
