package org.yy.paipai.request.message;

/*
* 文 件 名:  AddShopMsgRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  添加店铺留言,http://pop.paipai.com/api/paipai/message/addShopMsg请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* 添加店铺留言,http://pop.paipai.com/api/paipai/message/addShopMsg请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class AddShopMsgRequest extends AbstractPaiPaiRequest<PaiPaiResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/message/addShopMsg.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<PaiPaiResponse> getResponseClass() {
        return PaiPaiResponse.class;
    }
    
    /**
    * *	string		店铺QQ
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
    **	string		留言内容
    */
    public String getMsgContent() {
        return textMap.get("msgContent");
    }
    
    /**
    *
    */
    public void setMsgContent(String msgContent) {
        textMap.put("msgContent", msgContent);
    }
    
    /**
    *	string		留言是否公开.y:公开; n:不公开（默认值为y）
    */
    public String getMsgIspublic() {
        return textMap.get("msgIspublic");
    }
    
    /**
    *
    */
    public void setMsgIspublic(String msgIspublic) {
        textMap.put("msgIspublic", msgIspublic);
    }
    
}
