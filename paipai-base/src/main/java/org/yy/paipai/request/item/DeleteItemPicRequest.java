package org.yy.paipai.request.item;

/*
* 文 件 名:  DeleteItemPicRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  删除商品图片接口，http://pop.paipai.com/api/paipai/item/deleteItemPic请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.DeleteItemPicResponse;

/**
* 删除商品图片接口，http://pop.paipai.com/api/paipai/item/deleteItemPic请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DeleteItemPicRequest extends AbstractPaiPaiRequest<DeleteItemPicResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/deleteItemPic.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<DeleteItemPicResponse> getResponseClass() {
        return DeleteItemPicResponse.class;
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
    
    /**
    *商品图片索引，取值只能是0到4之间，表示第1或第5张主图。一般商品拥有不超过5张主图，若要删除多张主图，则主图索引之间可用','分隔， 例如'0,1,2'
    */
    public String getIndex() {
        return textMap.get("index");
    }
    
    /**
    *
    */
    public void setIndex(String index) {
        textMap.put("index", index);
    }
    
}
