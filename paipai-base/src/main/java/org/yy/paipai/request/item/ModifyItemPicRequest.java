package org.yy.paipai.request.item;

/*
* 文 件 名:  ModifyItemPicRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改商品图片接口请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiUploadRequest;
import org.yy.paipai.response.item.ModifyItemPicResponse;
import org.yy.paipai.util.FileItem;

/**
* 修改商品图片接口请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemPicRequest extends AbstractPaiPaiUploadRequest<ModifyItemPicResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/modifyItemPic.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ModifyItemPicResponse> getResponseClass() {
        return ModifyItemPicResponse.class;
    }
    
    /**
    *商品编码
    */
    public String getSellerUin() {
        return textMap.get("sellerUin");
    }
    
    /**
    *
    */
    public void setSellerUin(String sellerUin) {
        textMap.put("sellerUin", sellerUin);
    }
    
    /**
    *上传图片后的URL
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
    *商家编码 itemCode和itemLocalCode至少必须填写一个。 索引字段，不能修改。
    */
    public String getItemLocalCode() {
        return textMap.get("itemLocalCode");
    }
    
    /**
    *
    */
    public void setItemLocalCode(String itemLocalCode) {
        textMap.put("itemLocalCode", itemLocalCode);
    }
    
    /**
    *商品图片索引 第几张商品。取值只能是0到4之间 默认为0。一般商品拥有1-5张图片。
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
    
    /**
    *图片二进制数据 图片仅支持jpg和gif格式。 图片大小请不要小于700*700像素，文件大小需要大于1KB,小于120KB。 该字段不加入sign值的计算中
    */
    public FileItem getPic() {
        return fileParams.get("pic");
    }
    
    /**
    *
    */
    public void setPic(FileItem pic) {
        fileParams.put("pic", pic);
    }
    
}
