package org.yy.paipai.request.shop;

/*
* 文 件 名:  GetShopPVRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  查询店铺每天统计PV信息 ,http://pop.paipai.com/api/paipai/shop/getShopPV请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.shop.GetShopPVResponse;

/**
* 查询店铺每天统计PV信息 ,http://pop.paipai.com/api/paipai/shop/getShopPV请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class GetShopPVRequest extends AbstractPaiPaiRequest<GetShopPVResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/shop/getShopPV.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<GetShopPVResponse> getResponseClass() {
        return GetShopPVResponse.class;
    }
    
    /**
    *查询的开始日期,例如：20121212
    */
    public String getStartDay() {
        return textMap.get("startDay");
    }
    
    /**
    *
    */
    public void setStartDay(String startDay) {
        textMap.put("startDay", startDay);
    }
    
    /**
    *查询的结束日期,例如：20121218,查询跨度不能大于7天,不能查询1个月前数据
    */
    public String getEndDay() {
        return textMap.get("endDay");
    }
    
    /**
    *
    */
    public void setEndDay(String endDay) {
        textMap.put("endDay", endDay);
    }
    
}
