package org.yy.paipai.request.attr;

/*
* 文 件 名:  GetNavigationChildListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询发布导航子类目列表 ,http://pop.paipai.com/api/paipai/attr/getNavigationChildList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.attr.GetNavigationChildListResponse;

/**
* 查询发布导航子类目列表 ,http://pop.paipai.com/api/paipai/attr/getNavigationChildList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetNavigationChildListRequest extends AbstractPaiPaiRequest<GetNavigationChildListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/attr/getNavigationChildList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetNavigationChildListResponse> getResponseClass() {
        return GetNavigationChildListResponse.class;
    }
    
    /**
    * 导航类目ID
    */
    public Long getNavigationId() {
        return Long.valueOf(textMap.get("navigationId"));
    }
    
    /**
     * 
    */
    public void setNavigationId(Long navigationId) {
        textMap.put("navigationId", String.valueOf(navigationId));
    }
    
}
