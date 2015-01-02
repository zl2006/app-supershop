package org.yy.paipai.request.album;

/*
* 文 件 名:  ModifyPaiPaiAlbumDirRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  修改文件夹名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumDir请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.ModifyPaiPaiAlbumDirResponse;

/**
* 修改文件夹名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumDir请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyPaiPaiAlbumDirRequest extends AbstractPaiPaiRequest<ModifyPaiPaiAlbumDirResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/modifyPaiPaiAlbumDir.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ModifyPaiPaiAlbumDirResponse> getResponseClass() {
        return ModifyPaiPaiAlbumDirResponse.class;
    }
    
    /**
    *机器码
    */
    public String getMachineKey() {
        return textMap.get("machineKey");
    }
    
    /**
    *
    */
    public void setMachineKey(String machineKey) {
        textMap.put("machineKey", machineKey);
    }
    
    /**
    *来源
    */
    public String getSource() {
        return textMap.get("source");
    }
    
    /**
    *
    */
    public void setSource(String source) {
        textMap.put("source", source);
    }
    
    /**
    *输入保留
    */
    public String getInReserved() {
        return textMap.get("inReserved");
    }
    
    /**
    *
    */
    public void setInReserved(String inReserved) {
        textMap.put("inReserved", inReserved);
    }
    
    /**
    *当前目录路径(各级目录ID组合而成，用/分割)
    */
    public String getPath() {
        return textMap.get("path");
    }
    
    /**
    *
    */
    public void setPath(String path) {
        textMap.put("path", path);
    }
    
    /**
    *	新目录名称
    */
    public String getDirName() {
        return textMap.get("dirName");
    }
    
    /**
    *
    */
    public void setDirName(String dirName) {
        textMap.put("dirName", dirName);
    }
    
}
