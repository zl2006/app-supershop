package org.yy.paipai.request.item;

/*
* 文 件 名:  SetItemDiscountRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:   设置商品彩钻折扣 ,http://pop.paipai.com/api/paipai/item/setItemDiscount请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.item.SetItemDiscountResponse;

/**
*  设置商品彩钻折扣 ,http://pop.paipai.com/api/paipai/item/setItemDiscount请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class SetItemDiscountRequest extends AbstractPaiPaiRequest<SetItemDiscountResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/item/setItemDiscount.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<SetItemDiscountResponse> getResponseClass() {
        return SetItemDiscountResponse.class;
    }
    
    /**
    *商品编码,可以多个，以|分隔
    */
    public String getItemCode() {
        return textMap.get("itemCode");
    }
    
    /**
    *
    */
    public void setItemCode(String itemCode) {
        textMap.put("itemCode", itemCode);
    }
    
    /**
    *彩钻折扣,不同彩钻级别以|分隔，从1级到6级顺序排列(注意每级都必须有值且高等级折扣不能少于低等级，否则出错) 例:9|9|8.8|8.8|6|6 = 1级彩钻9折,2级彩钻9折,3级彩钻8.8折,4级彩钻8.8折,5级彩钻6折,6级彩钻6折，折扣数字接受小数点一位，其余截断忽略，必须大于等于0.1，小于等于9.9，且要求2级与1级一致，4级与3级一致，6级与5级一致，取消折扣则本参数设置为“0”就可以了。
    */
    public String getDiscount() {
        return textMap.get("discount");
    }
    
    /**
    *
    */
    public void setDiscount(String discount) {
        textMap.put("discount", discount);
    }
    
}
