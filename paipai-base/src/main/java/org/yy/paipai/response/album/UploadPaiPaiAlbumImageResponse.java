package org.yy.paipai.response.album;


/*
* 文 件 名:  UploadPaiPaiAlbumImageResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  上传图片到拍拍相册 ,http://pop.paipai.com/api/paipai/album/uploadPaiPaiAlbumImage响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Picture;

/**
* 上传图片到拍拍相册 ,http://pop.paipai.com/api/paipai/album/uploadPaiPaiAlbumImage响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class UploadPaiPaiAlbumImageResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -4042221917018960900L;

    /**
     * 文件名称
     */
    private String Name;
    
    /**
     * 最后修改时间
     */
    private Long ModifyTime;
    
    /**
     * 
     */
    private String ID;
    
    /**
     * 
     */
    private String PicNum;
    
    /**
     * 
     */
    private String fileSize;
    
    /**
     * 图片列表
     */
    private List<Picture> Pictures;
     
	
    /**
    * 文件名称
    */
    public String getName() {
        return  Name;
    }
    
    /**
    */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    /**
    * 最后修改时间
    */
    public Long getModifyTime() {
        return  ModifyTime;
    }
    
    /**
    */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }
    
    /**
    * 
    */
    public String getID() {
        return  ID;
    }
    
    /**
    */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    /**
    * 
    */
    public String getPicNum() {
        return  PicNum;
    }
    
    /**
    */
    public void setPicNum(String PicNum) {
        this.PicNum = PicNum;
    }
    
    /**
    * 
    */
    public String getFileSize() {
        return  fileSize;
    }
    
    /**
    */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
    
    /**
    * 图片列表
    */
    public List<Picture> getPictures() {
        return  Pictures;
    }
    
    /**
    */
    public void setPictures(List<Picture> Pictures) {
        this.Pictures = Pictures;
    }
     
    
}
