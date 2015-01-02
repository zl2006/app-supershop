package org.yy.paipai.request.message;

/*
* 文 件 名:  GetItemMsgListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询商品留言列表,http://pop.paipai.com/api/paipai/message/getItemMsgList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.message.GetItemMsgListResponse;

/**
* 查询商品留言列表,http://pop.paipai.com/api/paipai/message/getItemMsgList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemMsgListRequest extends AbstractPaiPaiRequest<GetItemMsgListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/message/getItemMsgList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetItemMsgListResponse> getResponseClass() {
        return GetItemMsgListResponse.class;
    }
    
    /**
    **	string		商品编码
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
    
    /**
    * number		页数索引，默认从1开始
    */
    public Long getPageIndex() {
        return Long.valueOf(textMap.get("pageIndex	"));
    }
    
    /**
     * 
    */
    public void setPageIndex(Long pageIndex) {
        textMap.put("pageIndex	", String.valueOf(pageIndex));
    }
    
    /**
    * 	number	1-20	每页返回的订单记录数，不要超过20。默认为10
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
    
}
