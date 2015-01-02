package org.yy.paipai.response.album;

/*
* 文 件 名:  GetPaiPaiALbumInfoResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询卖家的拍拍相册信息 ,http://pop.paipai.com/api/paipai/album/getPaiPaiALbumInfo响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.AlbumSpaceInfo;

/**
* 查询卖家的拍拍相册信息 ,http://pop.paipai.com/api/paipai/album/getPaiPaiALbumInfo响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetPaiPaiALbumInfoResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 1895018064642656336L;
    
    /**
     * 相册信息
     */
    private List<AlbumSpaceInfo> albumSpaceInfoList;
    
    /**
    * 相册信息
    */
    public List<AlbumSpaceInfo> getAlbumSpaceInfoList() {
        return albumSpaceInfoList;
    }
    
    /**
    */
    public void setAlbumSpaceInfoList(List<AlbumSpaceInfo> albumSpaceInfoList) {
        this.albumSpaceInfoList = albumSpaceInfoList;
    }
    
}
