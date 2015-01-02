package org.yy.paipai.response.item;

/*
* 文 件 名:  SetItemDiscountResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   设置商品彩钻折扣 ,http://pop.paipai.com/api/paipai/item/setItemDiscount响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;
import java.util.Map;

import org.yy.paipai.api.PaiPaiResponse;

/**
*  设置商品彩钻折扣 ,http://pop.paipai.com/api/paipai/item/setItemDiscount响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class SetItemDiscountResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 1101039114087223610L;
    
    /**
     * 与输入itemCode一一对应的返回结果,ret.itemCode 	string 		商品编码 ,ret.status 	number 		与modifyItem接口返回码含义基本一致
     */
    private List<Map<String, String>> resultList;
    
    /**
    * 与输入itemCode一一对应的返回结果,ret.itemCode 	string 		商品编码 ,ret.status 	number 		与modifyItem接口返回码含义基本一致
    */
    public List<Map<String, String>> getResultList() {
        return resultList;
    }
    
    /**
    */
    public void setResultList(List<Map<String, String>> resultList) {
        this.resultList = resultList;
    }
    
}
