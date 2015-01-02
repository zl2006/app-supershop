package org.yy.paipai.model;

/*
* 文 件 名:  Picture.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  图片 ,http://pop.paipai.com/api/paipai/album/uploadPaiPaiAlbumImage 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 图片 ,http://pop.paipai.com/api/paipai/album/uploadPaiPaiAlbumImage 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class Picture extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 7208515670265939169L;
    
    /**
     * 文件名称
     */
    private String SequenceNumber;
    
    /**
     * 最后修改时间
     */
    private Long PictureType;
    
    /**
     * 
     */
    private String FileSize;
    
    /**
     * 
     */
    private String Height;
    
    /**
     * 
     */
    private String Width;
    
    /**
     * 
     */
    private String URL;
    
    /**
    * 文件名称
    */
    public String getSequenceNumber() {
        return SequenceNumber;
    }
    
    /**
    */
    public void setSequenceNumber(String SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
    }
    
    /**
    * 最后修改时间
    */
    public Long getPictureType() {
        return PictureType;
    }
    
    /**
    */
    public void setPictureType(Long PictureType) {
        this.PictureType = PictureType;
    }
    
    /**
    * 
    */
    public String getFileSize() {
        return FileSize;
    }
    
    /**
    */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }
    
    /**
    * 
    */
    public String getHeight() {
        return Height;
    }
    
    /**
    */
    public void setHeight(String Height) {
        this.Height = Height;
    }
    
    /**
    * 
    */
    public String getWidth() {
        return Width;
    }
    
    /**
    */
    public void setWidth(String Width) {
        this.Width = Width;
    }
    
    /**
    * 
    */
    public String getURL() {
        return URL;
    }
    
    /**
    */
    public void setURL(String URL) {
        this.URL = URL;
    }
    
}
