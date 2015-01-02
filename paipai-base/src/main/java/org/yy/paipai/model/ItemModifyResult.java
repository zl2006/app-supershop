package org.yy.paipai.model;

/*
* 文 件 名:  ModifyResult.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量修改商品状态的返回结果 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* 批量修改商品状态的返回结果 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ItemModifyResult extends PaiPaiObject {
    
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -4837164618272476921L;
    
    /**
     * 商品编码
     */
    private String itemCode;
    
    /**
     * 商家编码
     */
    private String itemLocalCode;
    
    /**
     * 结果标志：0成功；非0失败
     */
    private Long result;
    
    /**
     * 修改后的状态
     */
    private String itemState;
    
    /**
     * 修改后的状态描述
     */
    private String stateDesc;
    
    /**
    * 商品编码
    */
    public String getItemCode() {
        return itemCode;
    }
    
    /**
    */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    /**
    * 商家编码
    */
    public String getItemLocalCode() {
        return itemLocalCode;
    }
    
    /**
    */
    public void setItemLocalCode(String itemLocalCode) {
        this.itemLocalCode = itemLocalCode;
    }
    
    /**
    * 结果标志：0成功；非0失败
    */
    public Long getResult() {
        return result;
    }
    
    /**
    */
    public void setResult(Long result) {
        this.result = result;
    }
    
    /**
    * 修改后的状态
    */
    public String getItemState() {
        return itemState;
    }
    
    /**
    */
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }
    
    /**
    * 修改后的状态描述
    */
    public String getStateDesc() {
        return stateDesc;
    }
    
    /**
    */
    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }
    
}
