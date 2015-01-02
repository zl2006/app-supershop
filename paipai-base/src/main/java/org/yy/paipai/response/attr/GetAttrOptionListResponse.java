package org.yy.paipai.response.attr;

/*
* 文 件 名:  GetAttrOptionListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询属性选项列表 ,http://pop.paipai.com/api/paipai/attr/getAttrOptionList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.AttrOption;

/**
* 查询属性选项列表 ,http://pop.paipai.com/api/paipai/attr/getAttrOptionList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAttrOptionListResponse extends PaiPaiResponse {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 4866534034871148315L;
    
    /**
     * 属性选项列表
     */
    private List<AttrOption> optionList;
    
    /**
    * 属性选项列表
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
