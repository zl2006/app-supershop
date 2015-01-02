package org.yy.paipai.model;

/*
* 文 件 名:  Attr.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  类目属性 ,http://pop.paipai.com/api/paipai/attr/getAttributeList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 类目属性 ,http://pop.paipai.com/api/paipai/attr/getAttributeList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class Attr extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -7063351138051170874L;
    
    /**
     *  	属性ID
     */
    private Long attrId;
    
    /**
     * 属性名称
     */
    private String attrName;
    
    /**
     * 0,1 	标识是否关键属性（该品类下每种商品该属性值必须唯一）
     */
    private Long keyAttr;
    
    /**
     * 0,1 	是否必填
     */
    private Long necessary;
    
    /**
     * 是否销售属性(标识库存), 0-1
     */
    private Long saleAttr;
    
    /**
     * UT_RADIO | UT_CHECKBOX | UT_TEXT 	属性的类型(单选，多选，文本)
     */
    private String useType;
    
    /**
     * 是否标识为c2c业务不需要的属性,0-1
     */
    private Long c2cHidden;
    
    /**
     * 是否标识为b2c业务不需要的属性, 0-1
     */
    private Long b2cHidden;
    
    /**
     * 选项列表
     */
    private List<AttrOption> optionList;
    
    /**
    *  	属性ID
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
    * 属性名称
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
    * 0,1 	标识是否关键属性（该品类下每种商品该属性值必须唯一）
    */
    public Long getKeyAttr() {
        return keyAttr;
    }
    
    /**
    */
    public void setKeyAttr(Long keyAttr) {
        this.keyAttr = keyAttr;
    }
    
    /**
    * 0,1 	是否必填
    */
    public Long getNecessary() {
        return necessary;
    }
    
    /**
    */
    public void setNecessary(Long necessary) {
        this.necessary = necessary;
    }
    
    /**
    * 是否销售属性(标识库存), 0-1
    */
    public Long getSaleAttr() {
        return saleAttr;
    }
    
    /**
    */
    public void setSaleAttr(Long saleAttr) {
        this.saleAttr = saleAttr;
    }
    
    /**
    * UT_RADIO | UT_CHECKBOX | UT_TEXT 	属性的类型(单选，多选，文本)
    */
    public String getUseType() {
        return useType;
    }
    
    /**
    */
    public void setUseType(String useType) {
        this.useType = useType;
    }
    
    /**
    * 是否标识为c2c业务不需要的属性,0-1
    */
    public Long getC2cHidden() {
        return c2cHidden;
    }
    
    /**
    */
    public void setC2cHidden(Long c2cHidden) {
        this.c2cHidden = c2cHidden;
    }
    
    /**
    * 是否标识为b2c业务不需要的属性, 0-1
    */
    public Long getB2cHidden() {
        return b2cHidden;
    }
    
    /**
    */
    public void setB2cHidden(Long b2cHidden) {
        this.b2cHidden = b2cHidden;
    }
    
    /**
    * 选项列表
    */
    public List<AttrOption> getOptionList() {
        return optionList;
    }
    
    /**
    */
    public void setOptionList(List<AttrOption> optionList) {
        this.optionList = optionList;
    }
    
}
