package org.yy.paipai.model;

/*
* 文 件 名:  ShopCategory.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  店铺分类，http://pop.paipai.com/api/paipai/shop/getShopCategoryList 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 店铺分类，http://pop.paipai.com/api/paipai/shop/getShopCategoryList 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ShopCategory extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = 193620091737042214L;
    
    /**
     * 店铺分类编码
     */
    private String categoryCode;
    
    /**
     * 父级分类编号，level>1时才有意义
     */
    private String parentId;
    
    /**
     * 显示顺序值
     */
    private Long sequence;
    
    /**
     * 图片url
     */
    private String picLink;
    
    /**
     * 该分类下的商品数
     */
    private Long itemCount;
    
    /**
     * 分类级别，父级为1，子级为2，目前只有两级
     */
    private Long level;
    
    /**
     * 是否有子级别
     */
    private Long hasLeaf;
    
    /**
     * 该分类对应的商品列表页面
     */
    private String categoryLink;
    
    /**
     * 分类描述
     */
    private String desc;
    
    /**
     * 店铺分类编号
     */
    private String categoryId;
    
    /**
    * 店铺分类编码
    */
    public String getCategoryCode() {
        return categoryCode;
    }
    
    /**
    */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
    
    /**
    * 父级分类编号，level>1时才有意义
    */
    public String getParentId() {
        return parentId;
    }
    
    /**
    */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    /**
    * 显示顺序值
    */
    public Long getSequence() {
        return sequence;
    }
    
    /**
    */
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
    
    /**
    * 图片url
    */
    public String getPicLink() {
        return picLink;
    }
    
    /**
    */
    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }
    
    /**
    * 该分类下的商品数
    */
    public Long getItemCount() {
        return itemCount;
    }
    
    /**
    */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }
    
    /**
    * 分类级别，父级为1，子级为2，目前只有两级
    */
    public Long getLevel() {
        return level;
    }
    
    /**
    */
    public void setLevel(Long level) {
        this.level = level;
    }
    
    /**
    * 是否有子级别
    */
    public Long getHasLeaf() {
        return hasLeaf;
    }
    
    /**
    */
    public void setHasLeaf(Long hasLeaf) {
        this.hasLeaf = hasLeaf;
    }
    
    /**
    * 该分类对应的商品列表页面
    */
    public String getCategoryLink() {
        return categoryLink;
    }
    
    /**
    */
    public void setCategoryLink(String categoryLink) {
        this.categoryLink = categoryLink;
    }
    
    /**
    * 分类描述
    */
    public String getDesc() {
        return desc;
    }
    
    /**
    */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    /**
    * 店铺分类编号
    */
    public String getCategoryId() {
        return categoryId;
    }
    
    /**
    */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
}
