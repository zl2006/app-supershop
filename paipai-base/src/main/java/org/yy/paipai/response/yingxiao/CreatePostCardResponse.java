/*
* 文 件 名:  CreatePostCardResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   卖家创建包邮卡响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.response.yingxiao;

import org.yy.paipai.api.PaiPaiResponse;

/**
*  卖家创建包邮卡响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class CreatePostCardResponse extends PaiPaiResponse {
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 2414073023950706833L;

    private String rootName; //    string      没有实际含义
    
    private String postCardKey; /// string      优惠券key
    
    /**
    * @return 返回 rootName
    */
    public String getRootName() {
        return rootName;
    }
    
    /**
    * @param 对rootName进行赋值
    */
    public void setRootName(String rootName) {
        this.rootName = rootName;
    }
    
    /**
    * @return 返回 postCardKey
    */
    public String getPostCardKey() {
        return postCardKey;
    }
    
    /**
    * @param 对postCardKey进行赋值
    */
    public void setPostCardKey(String postCardKey) {
        this.postCardKey = postCardKey;
    }
    
}
