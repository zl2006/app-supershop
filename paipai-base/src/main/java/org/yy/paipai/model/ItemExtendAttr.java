package org.yy.paipai.model;

/*
* 文 件 名:  ItemExtendAttr.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品扩展属性，http://pop.paipai.com/api/paipai/item/getItem 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 商品扩展属性，http://pop.paipai.com/api/paipai/item/getItem 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ItemExtendAttr extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 8900525137417674487L;
    
    /**
     * 商品扩展属性编码id
     */
    private Long extendCode;
    
    /**
     * 商品扩展属性名称
     */
    private String extendName;
    
    /**
     * 商品扩展属性名称说明
     */
    private String showMeg;
    
    /**
     * 商品扩展属性值
     */
    private String extendValue;
    
    /**
    * 商品扩展属性编码id
    */
    public Long getExtendCode() {
        return extendCode;
    }
    
    /**
    */
    public void setExtendCode(Long extendCode) {
        this.extendCode = extendCode;
    }
    
    /**
    * 商品扩展属性名称
    */
    public String getExtendName() {
        return extendName;
    }
    
    /**
    */
    public void setExtendName(String extendName) {
        this.extendName = extendName;
    }
    
    /**
    * 商品扩展属性名称说明
    */
    public String getShowMeg() {
        return showMeg;
    }
    
    /**
    */
    public void setShowMeg(String showMeg) {
        this.showMeg = showMeg;
    }
    
    /**
    * 商品扩展属性值
    */
    public String getExtendValue() {
        return extendValue;
    }
    
    /**
    */
    public void setExtendValue(String extendValue) {
        this.extendValue = extendValue;
    }
    
}
