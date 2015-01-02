package org.yy.paipai.request.attr;

/*
* 文 件 名:  GetAttrOptionListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询属性选项列表 ,http://pop.paipai.com/api/paipai/attr/getAttrOptionList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.attr.GetAttrOptionListResponse;

/**
* 查询属性选项列表 ,http://pop.paipai.com/api/paipai/attr/getAttrOptionList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAttrOptionListRequest extends AbstractPaiPaiRequest<GetAttrOptionListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/attr/getAttrOptionList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetAttrOptionListResponse> getResponseClass() {
        return GetAttrOptionListResponse.class;
    }
    
    /**
    * 类目ID，对应于查询导航接口里返回的isClass=1的navigationId
    */
    public Long getClassId() {
        return Long.valueOf(textMap.get("classId"));
    }
    
    /**
     * 
    */
    public void setClassId(Long classId) {
        textMap.put("classId", String.valueOf(classId));
    }
    
    /**
    * 父属性ID
    */
    public Long getParentAttrId() {
        return Long.valueOf(textMap.get("parentAttrId"));
    }
    
    /**
     * 
    */
    public void setParentAttrId(Long parentAttrId) {
        textMap.put("parentAttrId", String.valueOf(parentAttrId));
    }
    
    /**
    * 子属性在父属性选项里对应的optionID
    */
    public Long getOptionId() {
        return Long.valueOf(textMap.get("optionId"));
    }
    
    /**
     * 
    */
    public void setOptionId(Long optionId) {
        textMap.put("optionId", String.valueOf(optionId));
    }
    
    /**
    * 属性ID，注意当属性为子属性时，需要填写父属性ID还有选项ID
    */
    public Long getAttrId() {
        return Long.valueOf(textMap.get("attrId"));
    }
    
    /**
     * 
    */
    public void setAttrId(Long attrId) {
        textMap.put("attrId", String.valueOf(attrId));
    }
    
}
