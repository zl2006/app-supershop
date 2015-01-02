package org.yy.paipai.response.report;


/*
* 文 件 名:  GetBuyerAgePlusResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍买家性别年龄分析统计,http://pop.paipai.com/api/paipai/report/getBuyerAgePlus响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.BuyerAgePlus;

/**
* 查询拍拍买家性别年龄分析统计,http://pop.paipai.com/api/paipai/report/getBuyerAgePlus响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetBuyerAgePlusResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 7557827530678446967L;

    /**
     *  	int64 	0 	查询结果的总数,用于分页显示
     */
    private Long totalNum;
    
    /**
     *  	list 		买家性别年龄分析列表
     */
    private List<BuyerAgePlus> buyerAgePlusList;
     
	
    /**
    *  	int64 	0 	查询结果的总数,用于分页显示
    */
    public Long getTotalNum() {
        return  totalNum;
    }
    
    /**
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    *  	list 		买家性别年龄分析列表
    */
    public List<BuyerAgePlus> getBuyerAgePlusList() {
        return  buyerAgePlusList;
    }
    
    /**
    */
    public void setBuyerAgePlusList(List<BuyerAgePlus> buyerAgePlusList) {
        this.buyerAgePlusList = buyerAgePlusList;
    }
     
    
}

