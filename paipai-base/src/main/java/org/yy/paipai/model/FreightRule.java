package org.yy.paipai.model;

/*
* 文 件 名:  FreightRuleResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  运费模板规则 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 运费模板规则 ,http://pop.paipai.com/api/paipai/shop/getShippingfeeList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class FreightRule extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -7170643059304101603L;
    
    /**
     * 目的地编码(多个以','号分隔)
     */
    private String dest;
    
    /**
     * 位叠加计算：0x1支持平邮配送 0x2支持快递配送 0x4支持ems配送 0x08商城用户标记 0x10按重量计费标记 0x20支持货到付款标记
     */
    private Long property;
    
    /**
     * 大约到达天数
     */
    private Long arriveDays;
    
    /**
     * 货到付款费用
     */
    private Long codPrice;
    
    /**
     * 快递首次量
     */
    private Long startCount;
    
    /**
     * 快递首付价格
     */
    private Long startPrice;
    
    /**
     * 快递递增单位量
     */
    private Long riseCount;
    
    /**
     * 快递递增单位价格
     */
    private Long risePrice;
    
    /**
     * 规则类型([默认|同城|普通] （B2C统一为普通即异地）,0x03)
     */
    private String type;
    
    /**
    * 目的地编码(多个以','号分隔)
    */
    public String getDest() {
        return dest;
    }
    
    /**
    */
    public void setDest(String dest) {
        this.dest = dest;
    }
    
    /**
    * 位叠加计算：0x1支持平邮配送 0x2支持快递配送 0x4支持ems配送 0x08商城用户标记 0x10按重量计费标记 0x20支持货到付款标记
    */
    public Long getProperty() {
        return property;
    }
    
    /**
    */
    public void setProperty(Long property) {
        this.property = property;
    }
    
    /**
    * 大约到达天数
    */
    public Long getArriveDays() {
        return arriveDays;
    }
    
    /**
    */
    public void setArriveDays(Long arriveDays) {
        this.arriveDays = arriveDays;
    }
    
    /**
    * 货到付款费用
    */
    public Long getCodPrice() {
        return codPrice;
    }
    
    /**
    */
    public void setCodPrice(Long codPrice) {
        this.codPrice = codPrice;
    }
    
    /**
    * 快递首次量
    */
    public Long getStartCount() {
        return startCount;
    }
    
    /**
    */
    public void setStartCount(Long startCount) {
        this.startCount = startCount;
    }
    
    /**
    * 快递首付价格
    */
    public Long getStartPrice() {
        return startPrice;
    }
    
    /**
    */
    public void setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
    }
    
    /**
    * 快递递增单位量
    */
    public Long getRiseCount() {
        return riseCount;
    }
    
    /**
    */
    public void setRiseCount(Long riseCount) {
        this.riseCount = riseCount;
    }
    
    /**
    * 快递递增单位价格
    */
    public Long getRisePrice() {
        return risePrice;
    }
    
    /**
    */
    public void setRisePrice(Long risePrice) {
        this.risePrice = risePrice;
    }
    
    /**
    * 规则类型([默认|同城|普通] （B2C统一为普通即异地）,0x03)
    */
    public String getType() {
        return type;
    }
    
    /**
    */
    public void setType(String type) {
        this.type = type;
    }
    
}
