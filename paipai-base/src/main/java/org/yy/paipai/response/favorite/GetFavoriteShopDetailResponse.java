package org.yy.paipai.response.favorite;

/*
* 文 件 名:  GetFavoriteShopDetailResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询指定用户是否收藏了指定店铺 ,http://pop.paipai.com/api/paipai/favorite/getFavoriteShopDetail响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.Date;

import org.yy.paipai.api.PaiPaiResponse;

/**
* 查询指定用户是否收藏了指定店铺 ,http://pop.paipai.com/api/paipai/favorite/getFavoriteShopDetail响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetFavoriteShopDetailResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 159926225732394826L;
    
    /**
     *  	number 		买家QQ号
     */
    private Long buyerUin;
    
    /**
     *  	time 		收藏店铺的时间
     */
    private Date addFavoriteTime;
    
    /**
    *  	number 		买家QQ号
    */
    public Long getBuyerUin() {
        return buyerUin;
    }
    
    /**
    */
    public void setBuyerUin(Long buyerUin) {
        this.buyerUin = buyerUin;
    }
    
    /**
    *  	time 		收藏店铺的时间
    */
    public Date getAddFavoriteTime() {
        return addFavoriteTime;
    }
    
    /**
    */
    public void setAddFavoriteTime(Date addFavoriteTime) {
        this.addFavoriteTime = addFavoriteTime;
    }
    
}
