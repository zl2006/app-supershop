package org.yy.paipai.response.album;

/*
* 文 件 名:  CreatePaiPaiAlbumDirResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍相册新建文件夹 ,http://pop.paipai.com/api/paipai/album/createPaiPaiAlbumDir响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 拍拍相册新建文件夹 ,http://pop.paipai.com/api/paipai/album/createPaiPaiAlbumDir响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreatePaiPaiAlbumDirResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -8967957866266595750L;
    
    /**
     * 目录名称
     */
    private String dirName;
    
    /**
     * 当前目录路径(各级目录ID组合而成，用/分割)
     */
    private String path;
    
    /**
    * 目录名称
    */
    public String getDirName() {
        return dirName;
    }
    
    /**
    */
    public void setDirName(String dirName) {
        this.dirName = dirName;
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
    
}
