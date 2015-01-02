package org.yy.paipai.model;

/*
* 文 件 名:  ShopSearchKeyword.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  到店搜索关键词 ,http://pop.paipai.com/api/paipai/report/getShopSearchKeyword 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 到店搜索关键词 ,http://pop.paipai.com/api/paipai/report/getShopSearchKeyword 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ShopSearchKeyword extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -5095719359061103660L;
    
    /**
     *  	int64 	20130101 	统计的日期,格式YYYYMMDD
     */
    private Long fday;
    
    /**
     *  	int64 	0 	店铺号
     */
    private Long shopId;
    
    /**
     *  	string 		店铺名称
     */
    private String shopName;
    
    /**
     *  	string 		关键词 
     */
    private String keyword;
    
    /**
     *  	int64 		pv
     */
    private Long pv;
    
    /**
     * 
     */
    private Long uv;
    
    /**
     *  	int64 		总的访问次数
     */
    private Long visitSum;
    
    /**
     *  	int64 		关键词uv
     */
    private Long uvKey;
    
    /**
    *  	int64 	20130101 	统计的日期,格式YYYYMMDD
    */
    public Long getFday() {
        return fday;
    }
    
    /**
    */
    public void setFday(Long fday) {
        this.fday = fday;
    }
    
    /**
    *  	int64 	0 	店铺号
    */
    public Long getShopId() {
        return shopId;
    }
    
    /**
    */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    
    /**
    *  	string 		店铺名称
    */
    public String getShopName() {
        return shopName;
    }
    
    /**
    */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    
    /**
    *  	string 		关键词 
    */
    public String getKeyword() {
        return keyword;
    }
    
    /**
    */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    /**
    *  	int64 		pv
    */
    public Long getPv() {
        return pv;
    }
    
    /**
    */
    public void setPv(Long pv) {
        this.pv = pv;
    }
    
    /**
    * 
    */
    public Long getUv() {
        return uv;
    }
    
    /**
    */
    public void setUv(Long uv) {
        this.uv = uv;
    }
    
    /**
    *  	int64 		总的访问次数
    */
    public Long getVisitSum() {
        return visitSum;
    }
    
    /**
    */
    public void setVisitSum(Long visitSum) {
        this.visitSum = visitSum;
    }
    
    /**
    *  	int64 		关键词uv
    */
    public Long getUvKey() {
        return uvKey;
    }
    
    /**
    */
    public void setUvKey(Long uvKey) {
        this.uvKey = uvKey;
    }
    
}
