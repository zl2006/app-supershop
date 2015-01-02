package org.yy.paipai.request.album;

/*
* 文 件 名:  GetAlbumNumRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  获取拍拍相册下某个文件夹下已发布的图片数量 ,http://pop.paipai.com/api/paipai/album/getAlbumNum请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.GetAlbumNumResponse;

/**
* 获取拍拍相册下某个文件夹下已发布的图片数量 ,http://pop.paipai.com/api/paipai/album/getAlbumNum请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAlbumNumRequest extends AbstractPaiPaiRequest<GetAlbumNumResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/getAlbumNum.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetAlbumNumResponse> getResponseClass() {
        return GetAlbumNumResponse.class;
    }
    
    /**
    *	string		拍拍相册路径ID，格式：/目录ID/
    */
    public String getPath() {
        return textMap.get("path");
    }
    
    /**
    *
    */
    public void setPath(String path) {
        textMap.put("path", path);
    }
    
}
