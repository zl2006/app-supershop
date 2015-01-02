package org.yy.paipai.request.album;


/*
* 文 件 名:  GetPaiPaiAlbumListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询用户拍拍相册的文件或目录 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.GetPaiPaiAlbumListResponse;

/**
* 查询用户拍拍相册的文件或目录 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetPaiPaiAlbumListRequest extends AbstractPaiPaiRequest<GetPaiPaiAlbumListResponse> {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/getPaiPaiAlbumList.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetPaiPaiAlbumListResponse> getResponseClass() {
        return GetPaiPaiAlbumListResponse.class;
    }
    
    
    	
    	
    	
    /**
    *路径ID,如果想查询该卖家下最顶级下的所有目录信息,请输入根目录: path="/"
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
    	
    
    
    
    	
    /**
    * 	int8	1，2，3	设置需要获取的内容, 1-表示获取文件夹，2-表示获取文件，3-表示获取文件和文件夹
    */
    public Long getContentType() {
        return Long.valueOf(textMap.get("contentType"));
    }
    
    /**
     * 
    */
    public void setContentType(Long contentType) {
        textMap.put("contentType", String.valueOf(contentType));
    }
    	
    	
    	
    
     
    
    
    
}

