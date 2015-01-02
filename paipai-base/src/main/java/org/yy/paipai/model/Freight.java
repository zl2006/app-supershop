package org.yy.paipai.model;

/*
* 文 件 名:  FreightResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  运费模板规则 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiObject;

/**
* 运费模板规则 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class Freight extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -5870045139579964153L;
    
    /**
     * 运费模板ID
     */
    private String freightId;
    
    /**
     * 运费模板名称
     */
    private String freightName;
    
    /**
     * 运费模板描述
     */
    private String desc;
    
    /**
     * 
     */
    private List<FreightRule> ruleList;
    
    /**
    * 运费模板ID
    */
    public String getFreightId() {
        return freightId;
    }
    
    /**
    */
    public void setFreightId(String freightId) {
        this.freightId = freightId;
    }
    
    /**
    * 运费模板名称
    */
    public String getFreightName() {
        return freightName;
    }
    
    /**
    */
    public void setFreightName(String freightName) {
        this.freightName = freightName;
    }
    
    /**
    * 运费模板描述
    */
    public String getDesc() {
        return desc;
    }
    
    /**
    */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    /**
    * 
    */
    public List<FreightRule> getRuleList() {
        return ruleList;
    }
    
    /**
    */
    public void setRuleList(List<FreightRule> ruleList) {
        this.ruleList = ruleList;
    }
    
}
