package org.yy.paipai.response.item;


/*
* 文 件 名:  GetItemDetailInfoResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询商品详情描述说明,http://pop.paipai.com/api/paipai/item/getItemDetailInfo响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 查询商品详情描述说明,http://pop.paipai.com/api/paipai/item/getItemDetailInfo响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemDetailInfoResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 625944395360822890L;
    /**
     * 商品的详情内容
     */
    private String detailInfo;
     
	
    /**
    * 商品的详情内容
    */
    public String getDetailInfo() {
        return  detailInfo;
    }
    
    /**
    */
    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }
     
    
}

