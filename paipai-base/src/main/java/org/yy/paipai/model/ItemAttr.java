package org.yy.paipai.model;

/*
* 文 件 名:  ItemAttr.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商品属性，http://pop.paipai.com/api/paipai/item/getItem 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 商品属性，http://pop.paipai.com/api/paipai/item/getItem 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ItemAttr extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -8337230783826264688L;
    
    /**
     * 商品的属性串编码id
     */
    private Long attrId;
    
    /**
     * 商品的属性串编码名称
     */
    private String attrName;
    
    /**
     * 商品的属性串编码值id
     */
    private Long attrOptionId;
    
    /**
     * 商品的属性串编码值名称
     */
    private String attrOptionName;
    
    /**
    * 商品的属性串编码id
    */
    public Long getAttrId() {
        return attrId;
    }
    
    /**
    */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }
    
    /**
    * 商品的属性串编码名称
    */
    public String getAttrName() {
        return attrName;
    }
    
    /**
    */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
    
    /**
    * 商品的属性串编码值id
    */
    public Long getAttrOptionId() {
        return attrOptionId;
    }
    
    /**
    */
    public void setAttrOptionId(Long attrOptionId) {
        this.attrOptionId = attrOptionId;
    }
    
    /**
    * 商品的属性串编码值名称
    */
    public String getAttrOptionName() {
        return attrOptionName;
    }
    
    /**
    */
    public void setAttrOptionName(String attrOptionName) {
        this.attrOptionName = attrOptionName;
    }
    
}
