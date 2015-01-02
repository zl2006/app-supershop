package org.yy.paipai.response.report;

/*
* 文 件 名:  GetBuyerIndustryReportResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍买家规模分析统计 ,http://pop.paipai.com/api/paipai/report/getBuyerIndustryReport响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.BuyerIndustry;

/**
* 查询拍拍买家规模分析统计 ,http://pop.paipai.com/api/paipai/report/getBuyerIndustryReport响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetBuyerIndustryReportResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -6520481159231879089L;

    /**
     *  	int64 	0 	查询结果的总数,用于分页显示
     */
    private Long totalNum;
    
    /**
     *  	list 		买家规模分析结果列表
     */
    private List<BuyerIndustry> buyerIndustryList;
    
    /**
    *  	int64 	0 	查询结果的总数,用于分页显示
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
    *  	list 		买家规模分析结果列表
    */
    public List<BuyerIndustry> getBuyerIndustryList() {
        return buyerIndustryList;
    }
    
    /**
    */
    public void setBuyerIndustryList(List<BuyerIndustry> buyerIndustryList) {
        this.buyerIndustryList = buyerIndustryList;
    }
    
}
