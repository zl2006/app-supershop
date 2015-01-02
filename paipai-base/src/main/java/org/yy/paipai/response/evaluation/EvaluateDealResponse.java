package org.yy.paipai.response.evaluation;

/*
* 文 件 名:  EvaluateDealResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商家做评 ，http://pop.paipai.com/api/paipai/evaluation/evaluateDeal响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;
import java.util.Map;

import org.yy.paipai.api.PaiPaiResponse;

/**
* 商家做评 ，http://pop.paipai.com/api/paipai/evaluation/evaluateDeal响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class EvaluateDealResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -3850265517173327149L;
    
    /**
     * 	卖家QQ号
     */
    private Long sellerUin;
    
    /**
     * result.dealCode 	string 		大订单id result.retCode 	string 		评价结果0成功其他失败
     */
    private List<Map<String, String>> evalResult;
    
    /**
    * 	卖家QQ号
    */
    public Long getSellerUin() {
        return sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    * result.dealCode 	string 		大订单id result.retCode 	string 		评价结果0成功其他失败
    */
    public List<Map<String, String>> getEvalResult() {
        return evalResult;
    }
    
    /**
    */
    public void setEvalResult(List<Map<String, String>> evalResult) {
        this.evalResult = evalResult;
    }
    
}
