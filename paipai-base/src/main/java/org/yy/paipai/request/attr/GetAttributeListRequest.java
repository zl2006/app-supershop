package org.yy.paipai.request.attr;


/*
* 文 件 名:  GetAttributeListRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询类目属性列表 ,http://pop.paipai.com/api/paipai/attr/getAttributeList请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.attr.GetAttributeListResponse;

/**
* 查询类目属性列表 ,http://pop.paipai.com/api/paipai/attr/getAttributeList请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAttributeListRequest extends AbstractPaiPaiRequest<GetAttributeListResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/attr/getAttributeList.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetAttributeListResponse> getResponseClass() {
        return GetAttributeListResponse.class;
    }
    
    /**
    * 类目ID，对应于查询导航接口里返回的isClass=1的nagigationId,  [10001, 2000000000]
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
    * 属性ID
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
    
    /**
    * 属性选项ID
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
    * 是否输出属性的选项列表,0，1
    */
    public Long getOption() {
        return Long.valueOf(textMap.get("option"));
    }
    
    /**
     * 
    */
    public void setOption(Long option) {
        textMap.put("option", String.valueOf(option));
    }
    
}
