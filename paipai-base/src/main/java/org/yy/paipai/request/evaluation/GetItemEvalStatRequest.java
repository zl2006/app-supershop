package org.yy.paipai.request.evaluation;

/*
* 文 件 名:  GetItemEvalStatRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品评价统计，http://pop.paipai.com/api/paipai/evaluation/getItemEvalStat请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.evaluation.GetItemEvalStatResponse;

/**
* 商品评价统计，http://pop.paipai.com/api/paipai/evaluation/getItemEvalStat请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemEvalStatRequest extends AbstractPaiPaiRequest<GetItemEvalStatResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/evaluation/getItemEvalStat.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetItemEvalStatResponse> getResponseClass() {
        return GetItemEvalStatResponse.class;
    }
    
    /**
    *商品编码
    */
    public String getItemCode() {
        return textMap.get("itemCode");
    }
    
    /**
    *
    */
    public void setItemCode(String itemCode) {
        textMap.put("itemCode", itemCode);
    }
    
}
