package org.yy.paipai.response.album;

/*
* 文 件 名:  DeletePaiPailAlbumFileResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍删除图片 ,http://pop.paipai.com/api/paipai/album/deletePaiPailAlbumFile响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Map;

import org.yy.paipai.api.PaiPaiResponse;

/**
* 拍拍删除图片 ,http://pop.paipai.com/api/paipai/album/deletePaiPailAlbumFile响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DeletePaiPailAlbumFileResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 93597769988892927L;
    
    /**
     * resultInfo.Path 	string 	删除失败时有此数据 	所在目录路径 resultInfo.FileId 	string 	删除失败时有此数据 	文件id resultInfo.ErrCode 	string 	删除失败时有此数据 	错误码
     */
    private Map<String, String> resultInfo;
    
    /**
    * resultInfo.Path 	string 	删除失败时有此数据 	所在目录路径 resultInfo.FileId 	string 	删除失败时有此数据 	文件id resultInfo.ErrCode 	string 	删除失败时有此数据 	错误码
    */
    public Map<String, String> getResultInfo() {
        return resultInfo;
    }
    
    /**
    */
    public void setResultInfo(Map<String, String> resultInfo) {
        this.resultInfo = resultInfo;
    }
    
}
