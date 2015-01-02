package org.yy.paipai.request.evaluation;

/*
* 文 件 名:  GetShopEvalGradeRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺口碑评分  ,http://pop.paipai.com/api/paipai/evaluation/getShopEvalGrade请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.evaluation.GetShopEvalGradeResponse;

/**
* 查询店铺口碑评分  ,http://pop.paipai.com/api/paipai/evaluation/getShopEvalGrade请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopEvalGradeRequest extends AbstractPaiPaiRequest<GetShopEvalGradeResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/evaluation/getShopEvalGrade.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopEvalGradeResponse> getResponseClass() {
        return GetShopEvalGradeResponse.class;
    }
    
    /**
    * 	[10001,2000000000]	卖家QQ号
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
    
}
