package org.yy.paipai.response.album;

/*
* 文 件 名:  GetAlbumNumResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  获取拍拍相册下某个文件夹下已发布的图片数量 ,http://pop.paipai.com/api/paipai/album/getAlbumNum响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 获取拍拍相册下某个文件夹下已发布的图片数量 ,http://pop.paipai.com/api/paipai/album/getAlbumNum响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAlbumNumResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -3801173415794787643L;
    
    /**
     *  	number 		当前路径下相册的已发布的图片数量
     */
    private Long totalNum;
    
    /**
    *  	number 		当前路径下相册的已发布的图片数量
    */
    public Long getTotalNum() {
        return totalNum;
    }
    
    /**
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
}
