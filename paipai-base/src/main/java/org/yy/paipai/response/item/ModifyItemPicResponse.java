package org.yy.paipai.response.item;


/*
* 文 件 名:  ModifyItemPicResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改商品图片接口响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 修改商品图片接口响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemPicResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -8191171788346295987L;

    /**
     * 商品编码
     */
    private String itemCode;
    
    /**
     * 上传图片后的URL
     */
    private String picLink;
     
	
    /**
    * 商品编码
    */
    public String getItemCode() {
        return  itemCode;
    }
    
    /**
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * 上传图片后的URL
    */
    public String getPicLink() {
        return  picLink;
    }
    
    /**
    */
    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }
     
    
}

