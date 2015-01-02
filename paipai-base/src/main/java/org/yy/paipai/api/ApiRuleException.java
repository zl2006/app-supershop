package org.yy.paipai.api;

/**
 * API前置检查异常。
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class ApiRuleException extends ApiException {
    
    private static final long serialVersionUID = -7787145910600194272L;
    
    public ApiRuleException(String errCode, String errMsg) {
        super(errCode, errMsg);
    }
    
}
