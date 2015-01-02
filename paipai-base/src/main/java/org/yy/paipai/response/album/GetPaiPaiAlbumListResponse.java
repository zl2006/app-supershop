package org.yy.paipai.response.album;

/*
* 文 件 名:  GetPaiPaiAlbumListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询用户拍拍相册的文件或目录 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.AlbumFile;
import org.yy.paipai.model.Directory;

/**
* 查询用户拍拍相册的文件或目录 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetPaiPaiAlbumListResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 6829003611473415705L;

    /**
     * 文件列表
     */
    private List<AlbumFile> files;
    
    /**
     * 目录列表
     */
    private List<Directory> directories;
    
    /**
    * 文件列表
    */
    public List<AlbumFile> getFiles() {
        return files;
    }
    
    /**
    */
    public void setFiles(List<AlbumFile> files) {
        this.files = files;
    }
    
    /**
    * 目录列表
    */
    public List<Directory> getDirectories() {
        return directories;
    }
    
    /**
    */
    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }
    
}
