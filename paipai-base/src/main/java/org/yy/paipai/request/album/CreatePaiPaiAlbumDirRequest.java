package org.yy.paipai.request.album;

/*
* 文 件 名:  CreatePaiPaiAlbumDirRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍相册新建文件夹 ,http://pop.paipai.com/api/paipai/album/createPaiPaiAlbumDir请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.CreatePaiPaiAlbumDirResponse;

/**
* 拍拍相册新建文件夹 ,http://pop.paipai.com/api/paipai/album/createPaiPaiAlbumDir请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreatePaiPaiAlbumDirRequest extends AbstractPaiPaiRequest<CreatePaiPaiAlbumDirResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/createPaiPaiAlbumDir.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<CreatePaiPaiAlbumDirResponse> getResponseClass() {
        return CreatePaiPaiAlbumDirResponse.class;
    }
    
    /**
    *可选参数	机器码
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
    *可选参数	来源
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
    *可选参数	输入保留
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
    *必填参数	当前目录路径(各级目录ID组合而成，用/分割)：/([A-F0-9]{8}(?:-[A-F0-9]{4}){3}-[A-Z0-9]{12}/){0,2}$ 
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
    *必填参数	新目录名称
    */
    public String getNewDirName() {
        return textMap.get("newDirName");
    }
    
    /**
    *
    */
    public void setNewDirName(String newDirName) {
        textMap.put("newDirName", newDirName);
    }
    
}
