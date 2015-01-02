package org.yy.paipai.model;

/*
* 文 件 名:  Directory.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  目录 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 目录 ,http://pop.paipai.com/api/paipai/album/getPaiPaiAlbumList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class Directory extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 3647263800590816407L;
    
    /**
     * 
     */
    private String Name;
    
    /**
     * 
     */
    private String ModifyTime_TODO;
    
    /**
     * 
     */
    private String ID;
    
    /**
     * 目录ID,该ID作为其它相册请求参数里指定的path路径ID
     */
    private String SubDirNum;
    
    /**
     * 
     */
    private String FileNum;
    
    /**
    * 
    */
    public String getName() {
        return Name;
    }
    
    /**
    */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    /**
    * 
    */
    public String getModifyTime_TODO() {
        return ModifyTime_TODO;
    }
    
    /**
    */
    public void setModifyTime_TODO(String ModifyTime_TODO) {
        this.ModifyTime_TODO = ModifyTime_TODO;
    }
    
    /**
    * 
    */
    public String getID() {
        return ID;
    }
    
    /**
    */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    /**
    * 目录ID,该ID作为其它相册请求参数里指定的path路径ID
    */
    public String getSubDirNum() {
        return SubDirNum;
    }
    
    /**
    */
    public void setSubDirNum(String SubDirNum) {
        this.SubDirNum = SubDirNum;
    }
    
    /**
    * 
    */
    public String getFileNum() {
        return FileNum;
    }
    
    /**
    */
    public void setFileNum(String FileNum) {
        this.FileNum = FileNum;
    }
    
}
