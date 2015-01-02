package org.yy.paipai.request.shop;

/*
* 文 件 名:  GetShippingfeeListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   查询运费模板列表 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetShippingfeeListResponse;

/**
*  查询运费模板列表 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShippingfeeListRequest extends AbstractPaiPaiRequest<GetShippingfeeListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/getShippingfeeList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShippingfeeListResponse> getResponseClass() {
        return GetShippingfeeListResponse.class;
    }
    
    /**
    * 查询商家的UIN
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
    * 第几页
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
    * 每页运费模板数
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
    * 是否输出运费规则
    */
    public Long getOutputRule() {
        return Long.valueOf(textMap.get("outputRule"));
    }
    
    /**
     * 
    */
    public void setOutputRule(Long outputRule) {
        textMap.put("outputRule", String.valueOf(outputRule));
    }
    
}
