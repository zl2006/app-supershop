package org.yy.paipai.api;

/**
 * TOP响应解释器接口。响应格式可以是JSON, XML等等。
 * 
  * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public interface PaiPaiParser<T extends PaiPaiResponse> {
    
    /**
     * 把响应字符串解释成相应的领域对象。
     * 
     * @param rsp 响应字符串
     * @return 领域对象
     */
    public T parse(String rsp)
        throws ApiException;
    
    /**
     * 获取响应类类型。
     */
    public Class<T> getResponseClass()
        throws ApiException;
    
}
