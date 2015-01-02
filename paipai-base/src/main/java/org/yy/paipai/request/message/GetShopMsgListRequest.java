package org.yy.paipai.request.message;

/*
* 文 件 名:  GetShopMsgListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺留言列表 ,http://pop.paipai.com/api/paipai/message/getShopMsgList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.message.GetShopMsgListResponse;

/**
* 查询店铺留言列表 ,http://pop.paipai.com/api/paipai/message/getShopMsgList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopMsgListRequest extends AbstractPaiPaiRequest<GetShopMsgListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/message/getShopMsgList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopMsgListResponse> getResponseClass() {
        return GetShopMsgListResponse.class;
    }
    
    /**
    * *	number		需要查询的店铺qq号
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
    * 	number		每页返回的订单记录数，不要超过20。默认为10
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
