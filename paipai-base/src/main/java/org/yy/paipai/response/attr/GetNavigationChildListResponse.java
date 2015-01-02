package org.yy.paipai.response.attr;


/*
* 文 件 名:  GetNavigationChildListResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询发布导航子类目列表 ,http://pop.paipai.com/api/paipai/attr/getNavigationChildList响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.Navigation;

/**
* 查询发布导航子类目列表 ,http://pop.paipai.com/api/paipai/attr/getNavigationChildList响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetNavigationChildListResponse extends PaiPaiResponse {

    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = 4977321319014912208L;
    /**
     * 子类目列表。 navigation
     */
    private List<Navigation> childList;
     
	
    /**
    * 子类目列表。 navigation
    */
    public List<Navigation> getChildList() {
        return  childList;
    }
    
    /**
    */
    public void setChildList(List<Navigation> childList) {
        this.childList = childList;
    }
     
    
}

