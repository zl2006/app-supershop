package org.yy.paipai.response.album;

/*
* 文 件 名:  ModifyPaiPaiAlbumFileNameResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍相册修改图片名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumFileName响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 拍拍相册修改图片名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumFileName响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyPaiPaiAlbumFileNameResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 3805799142194210098L;
    
    /**
     * 新文件名称
     */
    private String newFileName;
    
    /**
     * 当前目录路径(各级目录ID组合而成，用/分割)
     */
    private String path;
    
    /**
     * 被修改的文件ID
     */
    private String fileId;
    
    /**
    * 新文件名称
    */
    public String getNewFileName() {
        return newFileName;
    }
    
    /**
    */
    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }
    
    /**
    * 当前目录路径(各级目录ID组合而成，用/分割)
    */
    public String getPath() {
        return path;
    }
    
    /**
    */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
    * 被修改的文件ID
    */
    public String getFileId() {
        return fileId;
    }
    
    /**
    */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
    
}
