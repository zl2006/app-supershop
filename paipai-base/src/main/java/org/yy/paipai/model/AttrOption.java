package org.yy.paipai.model;

/*
* 文 件 名:  AttrOption.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  属性选项 ,http://pop.paipai.com/api/paipai/attr/getAttrOptionList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 属性选项 ,http://pop.paipai.com/api/paipai/attr/getAttrOptionList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class AttrOption extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -6277958846127967446L;
    
    /**
     * 选项ID
     */
    private Long optionId;
    
    /**
     * 选项值
     */
    private String optionValue;
    
    //是否含有子属性 0=不含有子属性； 1=含有子属性
    private Long hasChild;
    
    /**
    * 选项ID
    */
    public Long getOptionId() {
        return optionId;
    }
    
    /**
    */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }
    
    /**
    * 选项值
    */
    public String getOptionValue() {
        return optionValue;
    }
    
    /**
    */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    /**
    * @return 返回 hasChild
    */
    public Long getHasChild() {
        return hasChild;
    }

    /**
    * @param 对hasChild进行赋值
    */
    public void setHasChild(Long hasChild) {
        this.hasChild = hasChild;
    }
    
    
    
}
