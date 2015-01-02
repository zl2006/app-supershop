package org.yy.paipai.model;

/*
* 文 件 名:  AlbumFile.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  文件 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 文件 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class AlbumFile extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 1100898264769502546L;
    
    /**
     *  	string 		文件名称
     */
    private String name;
    
    /**
     * 	number 		最后修改时间
     */
    private Long modifyTime;
    
    /**
     * 
     */
    private String id;
    
    /**
     * 
     */
    private String picNum;
    
    /**
     * 
     */
    private String fileSize;
    
    /**
     * 图片列表
     */
    private List<Picture> pictures;
    
    /**
    *  	string 		文件名称
    */
    public String getName() {
        return name;
    }
    
    /**
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * 	number 		最后修改时间
    */
    public Long getModifyTime() {
        return modifyTime;
    }
    
    /**
    */
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    /**
    * 
    */
    public String getId() {
        return id;
    }
    
    /**
    */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
    * 
    */
    public String getPicNum() {
        return picNum;
    }
    
    /**
    */
    public void setPicNum(String picNum) {
        this.picNum = picNum;
    }
    
    /**
    * 
    */
    public String getFileSize() {
        return fileSize;
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
        return pictures;
    }
    
    /**
    */
    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }
    
}
