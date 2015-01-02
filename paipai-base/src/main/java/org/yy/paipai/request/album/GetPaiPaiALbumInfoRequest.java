package org.yy.paipai.request.album;

/*
* 文 件 名:  GetPaiPaiALbumInfoRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询卖家的拍拍相册信息 ,http://pop.paipai.com/api/paipai/album/getPaiPaiALbumInfo请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.album.GetPaiPaiALbumInfoResponse;

/**
* 查询卖家的拍拍相册信息 ,http://pop.paipai.com/api/paipai/album/getPaiPaiALbumInfo请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetPaiPaiALbumInfoRequest extends AbstractPaiPaiRequest<GetPaiPaiALbumInfoResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/album/getPaiPaiALbumInfo.xhtml ";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetPaiPaiALbumInfoResponse> getResponseClass() {
        return GetPaiPaiALbumInfoResponse.class;
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
    *	string	可选参数	来源
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
    *	string	可选参数	输入保留
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
    *	string	必填参数	拍拍相册路径
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
    
}
