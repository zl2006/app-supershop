package org.yy.paipai.response.evaluation;

/*
* 文 件 名:  GetItemEvalListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询单个商品评价列表 ,http://pop.paipai.com/api/paipai/evaluation/getItemEvalList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ItemEval;

/**
* 查询单个商品评价列表 ,http://pop.paipai.com/api/paipai/evaluation/getItemEvalList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetItemEvalListResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -8837124529989805485L;

    /**
     * 记录总数
     */
    private Long countTotal;
    
    /**
     * 当前第几页
     */
    private Long pageIndex;
    
    /**
     * 每页记录条数
     */
    private Long pageSize;
    
    /**
     * 评价列表
     */
    private List<ItemEval> evalList;
    
    /**
     *  	卖家QQ
     */
    private Long sellerUin;
    
    /**
    * 记录总数
    */
    public Long getCountTotal() {
        return countTotal;
    }
    
    /**
    */
    public void setCountTotal(Long countTotal) {
        this.countTotal = countTotal;
    }
    
    /**
    * 当前第几页
    */
    public Long getPageIndex() {
        return pageIndex;
    }
    
    /**
    */
    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    /**
    * 每页记录条数
    */
    public Long getPageSize() {
        return pageSize;
    }
    
    /**
    */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
    * 评价列表
    */
    public List<ItemEval> getEvalList() {
        return evalList;
    }
    
    /**
    */
    public void setEvalList(List<ItemEval> evalList) {
        this.evalList = evalList;
    }
    
    /**
    *  	卖家QQ
    */
    public Long getSellerUin() {
        return sellerUin;
    }
    
    /**
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }
    
}
