package org.yy.paipai.request.album;

/*
* 文 件 名:  ModifyPaiPaiAlbumFileNameRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍相册修改图片名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumFileName请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.ModifyPaiPaiAlbumFileNameResponse;

/**
* 拍拍相册修改图片名称 ,http://pop.paipai.com/api/paipai/album/modifyPaiPaiAlbumFileName请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyPaiPaiAlbumFileNameRequest extends AbstractPaiPaiRequest<ModifyPaiPaiAlbumFileNameResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/modifyPaiPaiAlbumFileName.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<ModifyPaiPaiAlbumFileNameResponse> getResponseClass() {
        return ModifyPaiPaiAlbumFileNameResponse.class;
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
    *必填参数	当前目录路径(各级目录ID组合而成，用/分割)
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
    *必填参数	被修改的文件ID
    */
    public String getFileId() {
        return textMap.get("fileId");
    }
    
    /**
    *
    */
    public void setFileId(String fileId) {
        textMap.put("fileId", fileId);
    }
    
    /**
    *必填参数	新文件名称
    */
    public String getFileName() {
        return textMap.get("fileName");
    }
    
    /**
    *
    */
    public void setFileName(String fileName) {
        textMap.put("fileName", fileName);
    }
    
}
