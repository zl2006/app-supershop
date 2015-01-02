package org.yy.paipai.response.attr;

/*
* 文 件 名:  GetAttributeListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询类目属性列表 ,http://pop.paipai.com/api/paipai/attr/getAttributeList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Attr;

/**
* 查询类目属性列表 ,http://pop.paipai.com/api/paipai/attr/getAttributeList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetAttributeListResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 7844646027813479651L;

    /**
     * 类目ID
     */
    private Long classId;
    
    /**
     * 类目名称
     */
    private String className;
    
    /**
     * 属性列表里的属性个数
     */
    private Long attrCount;
    
    /**
     * 属性列表
     */
    private List<Attr> attrList;
    
    /**
    * 类目ID
    */
    public Long getClassId() {
        return classId;
    }
    
    /**
    */
    public void setClassId(Long classId) {
        this.classId = classId;
    }
    
    /**
    * 类目名称
    */
    public String getClassName() {
        return className;
    }
    
    /**
    */
    public void setClassName(String className) {
        this.className = className;
    }
    
    /**
    * 属性列表里的属性个数
    */
    public Long getAttrCount() {
        return attrCount;
    }
    
    /**
    */
    public void setAttrCount(Long attrCount) {
        this.attrCount = attrCount;
    }
    
    /**
    * 属性列表
    */
    public List<Attr> getAttrList() {
        return attrList;
    }
    
    /**
    */
    public void setAttrList(List<Attr> attrList) {
        this.attrList = attrList;
    }
    
}
