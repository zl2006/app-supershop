package org.yy.paipai.request.appstore;

/*
* 文 件 名:  QueryFuwuListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询服务列表信息，http://pop.paipai.com/api/paipai/appstore/queryFuwuList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.appstore.QueryFuwuListResponse;

/**
* 查询服务列表信息，http://pop.paipai.com/api/paipai/appstore/queryFuwuList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class QueryFuwuListRequest extends AbstractPaiPaiRequest<QueryFuwuListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/appstore/queryFuwuList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<QueryFuwuListResponse> getResponseClass() {
        return QueryFuwuListResponse.class;
    }
    
    /**
    * 	int64		要查询的服务商QQ,如果不填则查询所有服务商的服务
    */
    public Long getFwsQQ() {
        return Long.valueOf(textMap.get("fwsQQ"));
    }
    
    /**
     * 
    */
    public void setFwsQQ(Long fwsQQ) {
        textMap.put("fwsQQ", String.valueOf(fwsQQ));
    }
    
    /**
    *	string	create	查询时间的类别:create 表示提交时间;update 表示修改时间
    */
    public String getTimeType() {
        return textMap.get("timeType");
    }
    
    /**
    *
    */
    public void setTimeType(String timeType) {
        textMap.put("timeType", timeType);
    }
    
    /**
    *	string		查询开始时间,格式:yyyymmdd HH:mm:ss
    */
    public String getStartTime() {
        return textMap.get("startTime");
    }
    
    /**
    *
    */
    public void setStartTime(String startTime) {
        textMap.put("startTime", startTime);
    }
    
    /**
    *	string		查询结束时间,格式:yyyymmdd HH:mm:ss
    */
    public String getEndTime() {
        return textMap.get("endTime");
    }
    
    /**
    *
    */
    public void setEndTime(String endTime) {
        textMap.put("endTime", endTime);
    }
    
    /**
    * 	int32	999	服务状态:2-服务审核中;3-上架中;4-下架中,默认全部
    */
    public Long getFuwuStatus() {
        return Long.valueOf(textMap.get("fuwuStatus"));
    }
    
    /**
     * 
    */
    public void setFuwuStatus(Long fuwuStatus) {
        textMap.put("fuwuStatus", String.valueOf(fuwuStatus));
    }
    
    /**
    * *	int32		页码
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
    * *	int32		每页数量
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
