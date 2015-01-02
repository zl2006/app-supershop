package org.yy.paipai.response.item;

/*
* 文 件 名:  ModifyItemStateResponse.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  批量修改商品状态(上下架) 响应
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

import java.util.List;

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.model.ItemModifyResult;

/**
* 批量修改商品状态(上下架) 响应
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ModifyItemStateResponse extends PaiPaiResponse {
    
     /**
     * 注释内容
     */
    private static final long serialVersionUID = -4140074342867062673L;
    /**
     * 修改的结果集
     */
    private List<ItemModifyResult> modifyResultList;
    
    /**
    * 修改的结果集
    */
    public List<ItemModifyResult> getModifyResultList() {
        return modifyResultList;
    }
    
    /**
    */
    public void setModifyResultList(List<ItemModifyResult> modifyResultList) {
        this.modifyResultList = modifyResultList;
    }
    
}
