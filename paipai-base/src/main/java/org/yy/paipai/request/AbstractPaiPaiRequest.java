/*
* 文 件 名:  AbstractPaiPaiRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月27日
* 修改内容:  <修改内容>
*/
package org.yy.paipai.request;

import java.util.HashMap;
import java.util.Map;

import org.yy.paipai.api.ApiRuleException;
import org.yy.paipai.api.PaiPaiRequest;
import org.yy.paipai.api.PaiPaiResponse;

/**
* 拍拍基础请求封装
* 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public abstract class AbstractPaiPaiRequest<T extends PaiPaiResponse> implements PaiPaiRequest<T> {
    
    /**
     * http请求头信息
     */
    protected Map<String, String> headerMap = new HashMap<String, String>();
    
    /**
     * http请求参数 
     */
    protected Map<String, String> textMap = new HashMap<String, String>();
    
    private Long timestamp = System.currentTimeMillis();
    
    /** {@inheritDoc} */
    @Override
    public Map<String, String> getTextParams() {
        return textMap;
    }
    
    /** {@inheritDoc} */
    @Override
    public Long getTimestamp() {
        return timestamp;
    }
    
    /** {@inheritDoc} */
    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    
    /** {@inheritDoc} */
    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
    
    
    /** {@inheritDoc} */
    @Override
    public void check()
        throws ApiRuleException {
    }

    
}
