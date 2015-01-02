package org.yy.paipai.response.evaluation;

/*
* 文 件 名:  GetItemEvalStatResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品评价统计，http://pop.paipai.com/api/paipai/evaluation/getItemEvalStat响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 商品评价统计，http://pop.paipai.com/api/paipai/evaluation/getItemEvalStat响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemEvalStatResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 7831758533042035699L;
    
    /**
     * 商品编码
     */
    private String itemCode;
    
    /**
     * 最近3个月好评数
     */
    private Long goodCount;
    
    /**
     * 最近3个月中评数
     */
    private Long normalCount;
    
    /**
     * 最近3个月差评数
     */
    private Long badCount;
    
    /**
     * 最近6个月运输好评数
     */
    private Long shippingGood;
    
    /**
     *  	最近6个月运输差评数
     */
    private Long shippingBad;
    
    /**
     * 最近6个月运输评价总分数
     */
    private Long shippingTotal;
    
    /**
     * 最近6个月质量好评总数
     */
    private Long qualityGood;
    
    /**
     * 最近6个月质量好评差数
     */
    private Long qualityBad;
    
    /**
     * 最近6个月质量评价总分数
     */
    private Long qualityTotal;
    
    /**
     * 最近6个月服务好评数
     */
    private Long serviceGood;
    
    /**
     * 最近6个月服务好差数
     */
    private Long serviceBad;
    
    /**
     * 最近6个月质量评价总分数
     */
    private Long serviceTotal;
    
    /**
     * 用户有效评价个数
     */
    private Long validTotal;
    
    /**
    * 商品编码
    */
    public String getItemCode() {
        return itemCode;
    }
    
    /**
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * 最近3个月好评数
    */
    public Long getGoodCount() {
        return goodCount;
    }
    
    /**
    */
    public void setGoodCount(Long goodCount) {
        this.goodCount = goodCount;
    }
    
    /**
    * 最近3个月中评数
    */
    public Long getNormalCount() {
        return normalCount;
    }
    
    /**
    */
    public void setNormalCount(Long normalCount) {
        this.normalCount = normalCount;
    }
    
    /**
    * 最近3个月差评数
    */
    public Long getBadCount() {
        return badCount;
    }
    
    /**
    */
    public void setBadCount(Long badCount) {
        this.badCount = badCount;
    }
    
    /**
    * 最近6个月运输好评数
    */
    public Long getShippingGood() {
        return shippingGood;
    }
    
    /**
    */
    public void setShippingGood(Long shippingGood) {
        this.shippingGood = shippingGood;
    }
    
    /**
    *  	最近6个月运输差评数
    */
    public Long getShippingBad() {
        return shippingBad;
    }
    
    /**
    */
    public void setShippingBad(Long shippingBad) {
        this.shippingBad = shippingBad;
    }
    
    /**
    * 最近6个月运输评价总分数
    */
    public Long getShippingTotal() {
        return shippingTotal;
    }
    
    /**
    */
    public void setShippingTotal(Long shippingTotal) {
        this.shippingTotal = shippingTotal;
    }
    
    /**
    * 最近6个月质量好评总数
    */
    public Long getQualityGood() {
        return qualityGood;
    }
    
    /**
    */
    public void setQualityGood(Long qualityGood) {
        this.qualityGood = qualityGood;
    }
    
    /**
    * 最近6个月质量好评差数
    */
    public Long getQualityBad() {
        return qualityBad;
    }
    
    /**
    */
    public void setQualityBad(Long qualityBad) {
        this.qualityBad = qualityBad;
    }
    
    /**
    * 最近6个月质量评价总分数
    */
    public Long getQualityTotal() {
        return qualityTotal;
    }
    
    /**
    */
    public void setQualityTotal(Long qualityTotal) {
        this.qualityTotal = qualityTotal;
    }
    
    /**
    * 最近6个月服务好评数
    */
    public Long getServiceGood() {
        return serviceGood;
    }
    
    /**
    */
    public void setServiceGood(Long serviceGood) {
        this.serviceGood = serviceGood;
    }
    
    /**
    * 最近6个月服务好差数
    */
    public Long getServiceBad() {
        return serviceBad;
    }
    
    /**
    */
    public void setServiceBad(Long serviceBad) {
        this.serviceBad = serviceBad;
    }
    
    /**
    * 最近6个月质量评价总分数
    */
    public Long getServiceTotal() {
        return serviceTotal;
    }
    
    /**
    */
    public void setServiceTotal(Long serviceTotal) {
        this.serviceTotal = serviceTotal;
    }
    
    /**
    * 用户有效评价个数
    */
    public Long getValidTotal() {
        return validTotal;
    }
    
    /**
    */
    public void setValidTotal(Long validTotal) {
        this.validTotal = validTotal;
    }
    
}
