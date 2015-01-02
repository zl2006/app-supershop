package org.yy.paipai.model;


/*
* 文 件 名:  AlbumSpaceInfo.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍相册信息 ,http://pop.paipai.com/api/paipai/album/getPaiPaiALbumInfo 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 拍拍相册信息 ,http://pop.paipai.com/api/paipai/album/getPaiPaiALbumInfo 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class AlbumSpaceInfo extends PaiPaiObject {
   
    
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -7669714230175781997L;

    /**
     *  	number 		总容量
     */
    private Long totalSpace;
    
    /**
     *  	number 		已使用容量
     */
    private Long usedSpace;
    
    /**
     *  	number 		总文件数
     */
    private Long totalFileNum;
    
    /**
     *  	number 		总目录数
     */
    private Long totalDirNum;
     
	
    /**
    *  	number 		总容量
    */
    public Long getTotalSpace() {
        return  totalSpace;
    }
    
    /**
    */
    public void setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
    }
    
    /**
    *  	number 		已使用容量
    */
    public Long getUsedSpace() {
        return  usedSpace;
    }
    
    /**
    */
    public void setUsedSpace(Long usedSpace) {
        this.usedSpace = usedSpace;
    }
    
    /**
    *  	number 		总文件数
    */
    public Long getTotalFileNum() {
        return  totalFileNum;
    }
    
    /**
    */
    public void setTotalFileNum(Long totalFileNum) {
        this.totalFileNum = totalFileNum;
    }
    
    /**
    *  	number 		总目录数
    */
    public Long getTotalDirNum() {
        return  totalDirNum;
    }
    
    /**
    */
    public void setTotalDirNum(Long totalDirNum) {
        this.totalDirNum = totalDirNum;
    }
     
  
}

