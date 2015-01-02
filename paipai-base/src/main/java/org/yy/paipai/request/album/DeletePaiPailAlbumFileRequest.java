package org.yy.paipai.request.album;

/*
* 文 件 名:  DeletePaiPailAlbumFileRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  拍拍删除图片 ,http://pop.paipai.com/api/paipai/album/deletePaiPailAlbumFile请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.DeletePaiPailAlbumFileResponse;

/**
* 拍拍删除图片 ,http://pop.paipai.com/api/paipai/album/deletePaiPailAlbumFile请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class DeletePaiPailAlbumFileRequest extends AbstractPaiPaiRequest<DeletePaiPailAlbumFileResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/deletePaiPailAlbumFile.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<DeletePaiPailAlbumFileResponse> getResponseClass() {
        return DeletePaiPailAlbumFileResponse.class;
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
    *必填参数	文件全路径（多文件以;号隔开）
    */
    public String getFiles() {
        return textMap.get("files");
    }
    
    /**
    *
    */
    public void setFiles(String files) {
        textMap.put("files", files);
    }
    
}
