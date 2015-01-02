package org.yy.paipai.model;

/*
* 文 件 名:  FriendShop.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  友情店铺链接 ,http://pop.paipai.com/api/paipai/shop/getFriendShopList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 友情店铺链接 ,http://pop.paipai.com/api/paipai/shop/getFriendShopList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class FriendShop extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 3572299028259513027L;
    
    /**
     * 友情店铺编号
     */
    private String shopId;
    
    /**
     * 友情店铺名称
     */
    private String shopName;
    
    /**
    * 友情店铺编号
    */
    public String getShopId() {
        return shopId;
    }
    
    /**
    */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    
    /**
    * 友情店铺名称
    */
    public String getShopName() {
        return shopName;
    }
    
    /**
    */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    
}
