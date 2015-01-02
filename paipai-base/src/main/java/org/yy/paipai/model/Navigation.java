package org.yy.paipai.model;

/*
* 文 件 名:  Navigation.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  导航子类目 ,http://pop.paipai.com/api/paipai/attr/getNavigationChildList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 导航子类目 ,http://pop.paipai.com/api/paipai/attr/getNavigationChildList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class Navigation extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 8122342615196774808L;
    
    /**
     * 子级导航的编号。
     */
    private Long navigationId;
    
    /**
     * 子级导航的名称。
     */
    private String navigationName;
    
    /**
     * 是否是一个发布类目。1表示是发布类目，用户可将navigationId作为发布商品时的classId参数来发布商品。0表示只是一个导航级，不能在上面发布商品。
     */
    private String isClass;
    
    /**
     * 子级导航的属性值。如第八位为“1”，则为预删除类目，该类目下无法发布商品。
     */
    private String navProp;
    
    /**
    * 子级导航的编号。
    */
    public Long getNavigationId() {
        return navigationId;
    }
    
    /**
    */
    public void setNavigationId(Long navigationId) {
        this.navigationId = navigationId;
    }
    
    /**
    * 子级导航的名称。
    */
    public String getNavigationName() {
        return navigationName;
    }
    
    /**
    */
    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }
    
    /**
    * 是否是一个发布类目。1表示是发布类目，用户可将navigationId作为发布商品时的classId参数来发布商品。0表示只是一个导航级，不能在上面发布商品。
    */
    public String getIsClass() {
        return isClass;
    }
    
    /**
    */
    public void setIsClass(String isClass) {
        this.isClass = isClass;
    }
    
    /**
    * 子级导航的属性值。如第八位为“1”，则为预删除类目，该类目下无法发布商品。
    */
    public String getNavProp() {
        return navProp;
    }
    
    /**
    */
    public void setNavProp(String navProp) {
        this.navProp = navProp;
    }
    
}
