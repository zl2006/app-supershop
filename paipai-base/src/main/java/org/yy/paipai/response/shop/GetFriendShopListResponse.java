package org.yy.paipai.response.shop;

/*
* 文 件 名:  GetFriendShopListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  获取友情店铺链接 ,http://pop.paipai.com/api/paipai/shop/getFriendShopList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.FriendShop;

/**
* 获取友情店铺链接 ,http://pop.paipai.com/api/paipai/shop/getFriendShopList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetFriendShopListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2883481592679673897L;
    
    /**
     * 友情店铺链接数量
     */
    private Long totalCount;
    
    /**
     * 友情店铺链接列表
     */
    private List<FriendShop> friendShopList;
    
    /**
    * 友情店铺链接数量
    */
    public Long getTotalCount() {
        return totalCount;
    }
    
    /**
    */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    
    /**
    * 友情店铺链接列表
    */
    public List<FriendShop> getFriendShopList() {
        return friendShopList;
    }
    
    /**
    */
    public void setFriendShopList(List<FriendShop> friendShopList) {
        this.friendShopList = friendShopList;
    }
    
}
