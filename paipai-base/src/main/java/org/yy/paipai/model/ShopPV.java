package org.yy.paipai.model;

/*
* 文 件 名:  ShopPVL.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  店铺每天统计PV 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 店铺每天统计PV 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ShopPV extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -1528081452414693380L;
    
    /**
     * 统计日期
     */
    private String countDay;
    
    /**
     * 统计的全店铺PV数
     */
    private Long shopPV;
    
    /**
     * 统计的全店铺UV数
     */
    private Long shopUV;
    
    /**
    * 统计日期
    */
    public String getCountDay() {
        return countDay;
    }
    
    /**
    */
    public void setCountDay(String countDay) {
        this.countDay = countDay;
    }
    
    /**
    * 统计的全店铺PV数
    */
    public Long getShopPV() {
        return shopPV;
    }
    
    /**
    */
    public void setShopPV(Long shopPV) {
        this.shopPV = shopPV;
    }
    
    /**
    * 统计的全店铺UV数
    */
    public Long getShopUV() {
        return shopUV;
    }
    
    /**
    */
    public void setShopUV(Long shopUV) {
        this.shopUV = shopUV;
    }
    
}
