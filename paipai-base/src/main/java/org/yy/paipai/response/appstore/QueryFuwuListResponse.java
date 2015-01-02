package org.yy.paipai.response.appstore;

/*
* 文 件 名:  QueryFuwuListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  服务信息，http://pop.paipai.com/api/paipai/appstore/queryFuwuList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.FuwuInfo;

/**
* 服务信息，http://pop.paipai.com/api/paipai/appstore/queryFuwuList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class QueryFuwuListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -52554503554542561L;
    
    /**
     * 查询结果总数
     */
    private String totalNum;
    
    /**
     * 服务列表
     */
    private List<FuwuInfo> fuwuList;
    
    /**
    * 查询结果总数
    */
    public String getTotalNum() {
        return totalNum;
    }
    
    /**
    */
    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }
    
    /**
    * 服务列表
    */
    public List<FuwuInfo> getFuwuList() {
        return fuwuList;
    }
    
    /**
    */
    public void setFuwuList(List<FuwuInfo> fuwuList) {
        this.fuwuList = fuwuList;
    }
    
}
