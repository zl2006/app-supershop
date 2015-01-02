package org.yy.paipai.response.shop;


/*
* 文 件 名:  GetShopPVResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺每天统计PV信息 ,http://pop.paipai.com/api/paipai/shop/getShopPV响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ShopPV;

/**
* 查询店铺每天统计PV信息 ,http://pop.paipai.com/api/paipai/shop/getShopPV响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopPVResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -3628241343191748300L;

    /**
     * 店铺号
     */
    private Long shopId;
    
    /**
     * 返回的结果总数
     */
    private Long totalNum;
    
    /**
     * 返回统计明细
     */
    private List<ShopPV> shopPVList;
     
	
    /**
    * 店铺号
    */
    public Long getShopId() {
        return  shopId;
    }
    
    /**
    */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    
    /**
    * 返回的结果总数
    */
    public Long getTotalNum() {
        return  totalNum;
    }
    
    /**
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * 返回统计明细
    */
    public List<ShopPV> getShopPVList() {
        return  shopPVList;
    }
    
    /**
    */
    public void setShopPVList(List<ShopPV> shopPVList) {
        this.shopPVList = shopPVList;
    }
     
    
}

