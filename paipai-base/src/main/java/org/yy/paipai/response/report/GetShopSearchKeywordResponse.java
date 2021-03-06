package org.yy.paipai.response.report;

/*
* 文 件 名:  GetShopSearchKeywordResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询拍拍到店搜索关键词统计 ,http://pop.paipai.com/api/paipai/report/getShopSearchKeyword响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ShopSearchKeyword;

/**
* 查询拍拍到店搜索关键词统计 ,http://pop.paipai.com/api/paipai/report/getShopSearchKeyword响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopSearchKeywordResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2240328061669145195L;
    
    /**
     * 查询结果的总数,用于分页显示
     */
    private Long totalNum;
    
    /**
     * 到店搜索关键词列表
     */
    private List<ShopSearchKeyword> shopSearchKeywordList;
    
    /**
    * 查询结果的总数,用于分页显示
    */
    public Long getTotalNum() {
        return totalNum;
    }
    
    /**
    */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * 到店搜索关键词列表
    */
    public List<ShopSearchKeyword> getShopSearchKeywordList() {
        return shopSearchKeywordList;
    }
    
    /**
    */
    public void setShopSearchKeywordList(List<ShopSearchKeyword> shopSearchKeywordList) {
        this.shopSearchKeywordList = shopSearchKeywordList;
    }
    
}
