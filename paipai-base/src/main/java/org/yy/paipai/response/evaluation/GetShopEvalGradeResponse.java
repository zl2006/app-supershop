package org.yy.paipai.response.evaluation;

/*
* 文 件 名:  GetShopEvalGradeResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺口碑评分  ,http://pop.paipai.com/api/paipai/evaluation/getShopEvalGrade响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiResponse;

/**
* 查询店铺口碑评分  ,http://pop.paipai.com/api/paipai/evaluation/getShopEvalGrade响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopEvalGradeResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -4760993075643304549L;
    
    /**
     * 	[10001,2000000000]	卖家QQ号
     */
    private Long sellerUin;
    
    /**
     * 作为卖家得到的好评数
     */
    private String goodAsSeller;
    
    /**
     *  	作为卖家得到的中评数
     */
    private Long normalAsSeller;
    
    /**
     * 作为卖家得到的差评数
     */
    private Long badAsSeller;
    
    /**
     * 作为卖家信用总数
     */
    private Long allCreditAsSeller;
    
    /**
     * 作为卖家实物信用总数
     */
    private Long entityCreditAsSeller;
    
    /**
     * 作为卖家虚拟物信用总数
     */
    private Long virtualCreditAsSeller;
    
    /**
     * 评价总数
     */
    private Long totalEval;
    
    /**
     * 评价总分数
     */
    private Long totalEvalScore;
    
    /**
     * 作为买家得到的好评数
     */
    private Long goodAsBuyer;
    
    /**
     * 作为买家得到的中评数
     */
    private Long moderateAsBuyer;
    
    /**
     * 作为买家得到的差评数
     */
    private Long badAsBuyer;
    
    /**
     * 作为买家信用总数
     */
    private Long allCreditAsBuyer;
    
    /**
     * 作为买家实物信用总数
     */
    private Long entityCreditAsBuyer;
    
    /**
     * 作为买家虚拟物信用总数
     */
    private Long virtualCreditAsBuyer;
    
    /**
    * 	[10001,2000000000]	卖家QQ号
    */
    public Long getSellerUin() {
        return sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
    /**
    * 作为卖家得到的好评数
    */
    public String getGoodAsSeller() {
        return goodAsSeller;
    }
    
    /**
    */
    public void setGoodAsSeller(String goodAsSeller) {
        this.goodAsSeller = goodAsSeller;
    }
    
    /**
    *  	作为卖家得到的中评数
    */
    public Long getNormalAsSeller() {
        return normalAsSeller;
    }
    
    /**
    */
    public void setNormalAsSeller(Long normalAsSeller) {
        this.normalAsSeller = normalAsSeller;
    }
    
    /**
    * 作为卖家得到的差评数
    */
    public Long getBadAsSeller() {
        return badAsSeller;
    }
    
    /**
    */
    public void setBadAsSeller(Long badAsSeller) {
        this.badAsSeller = badAsSeller;
    }
    
    /**
    * 作为卖家信用总数
    */
    public Long getAllCreditAsSeller() {
        return allCreditAsSeller;
    }
    
    /**
    */
    public void setAllCreditAsSeller(Long allCreditAsSeller) {
        this.allCreditAsSeller = allCreditAsSeller;
    }
    
    /**
    * 作为卖家实物信用总数
    */
    public Long getEntityCreditAsSeller() {
        return entityCreditAsSeller;
    }
    
    /**
    */
    public void setEntityCreditAsSeller(Long entityCreditAsSeller) {
        this.entityCreditAsSeller = entityCreditAsSeller;
    }
    
    /**
    * 作为卖家虚拟物信用总数
    */
    public Long getVirtualCreditAsSeller() {
        return virtualCreditAsSeller;
    }
    
    /**
    */
    public void setVirtualCreditAsSeller(Long virtualCreditAsSeller) {
        this.virtualCreditAsSeller = virtualCreditAsSeller;
    }
    
    /**
    * 评价总数
    */
    public Long getTotalEval() {
        return totalEval;
    }
    
    /**
    */
    public void setTotalEval(Long totalEval) {
        this.totalEval = totalEval;
    }
    
    /**
    * 评价总分数
    */
    public Long getTotalEvalScore() {
        return totalEvalScore;
    }
    
    /**
    */
    public void setTotalEvalScore(Long totalEvalScore) {
        this.totalEvalScore = totalEvalScore;
    }
    
    /**
    * 作为买家得到的好评数
    */
    public Long getGoodAsBuyer() {
        return goodAsBuyer;
    }
    
    /**
    */
    public void setGoodAsBuyer(Long goodAsBuyer) {
        this.goodAsBuyer = goodAsBuyer;
    }
    
    /**
    * 作为买家得到的中评数
    */
    public Long getModerateAsBuyer() {
        return moderateAsBuyer;
    }
    
    /**
    */
    public void setModerateAsBuyer(Long moderateAsBuyer) {
        this.moderateAsBuyer = moderateAsBuyer;
    }
    
    /**
    * 作为买家得到的差评数
    */
    public Long getBadAsBuyer() {
        return badAsBuyer;
    }
    
    /**
    */
    public void setBadAsBuyer(Long badAsBuyer) {
        this.badAsBuyer = badAsBuyer;
    }
    
    /**
    * 作为买家信用总数
    */
    public Long getAllCreditAsBuyer() {
        return allCreditAsBuyer;
    }
    
    /**
    */
    public void setAllCreditAsBuyer(Long allCreditAsBuyer) {
        this.allCreditAsBuyer = allCreditAsBuyer;
    }
    
    /**
    * 作为买家实物信用总数
    */
    public Long getEntityCreditAsBuyer() {
        return entityCreditAsBuyer;
    }
    
    /**
    */
    public void setEntityCreditAsBuyer(Long entityCreditAsBuyer) {
        this.entityCreditAsBuyer = entityCreditAsBuyer;
    }
    
    /**
    * 作为买家虚拟物信用总数
    */
    public Long getVirtualCreditAsBuyer() {
        return virtualCreditAsBuyer;
    }
    
    /**
    */
    public void setVirtualCreditAsBuyer(Long virtualCreditAsBuyer) {
        this.virtualCreditAsBuyer = virtualCreditAsBuyer;
    }
    
}
