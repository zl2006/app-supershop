package org.yy.paipai.api;

/**
 * TAOBAO客户端。
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public interface PaiPaiClient {
    
    /**
     * 执行TOP公开API请求。
     * @param <T>
     * @param request 具体的TOP请求
     * @return
     * @throws ApiException
     */
    public <T extends PaiPaiResponse> T execute(PaiPaiRequest<T> request, String session, String uin)
        throws ApiException;
    
}
