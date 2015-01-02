package org.yy.paipai.response.album;

/*
* 文 件 名:  ModifyPaiPaiAlbumDirResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改文件夹名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumDir响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 修改文件夹名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumDir响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyPaiPaiAlbumDirResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2826483927311391349L;
    
    /**
     * 新目录名称
     */
    private String newDirName;
    
    /**
     * 当前目录路径(各级目录ID组合而成，用/分割)
     */
    private String path;
    
    /**
    * 新目录名称
    */
    public String getNewDirName() {
        return newDirName;
    }
    
    /**
    */
    public void setNewDirName(String newDirName) {
        this.newDirName = newDirName;
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
