package org.yy.paipai.api;

/**
 * 
 * 拍拍API调用异常类
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class ApiException extends Exception {
    
    private static final long serialVersionUID = -238091758285157331L;
    
    /**
     * 必填参数为空。
     */
    public final static String PARAMETER_EMPTY = "2001";
    
    /**
     * 必填参数无效。
     */
    public final static String PARAMETER_INVALID = "2002";
    
    /**
     * 服务器响应数据无效。
     */
    public final static String RESPONSE_DATA_INVALID = "2003";
    
    /**
     * 生成签名失败。
     */
    public final static String MAKE_SIGNATURE_ERROR = "2004";
    
    /**
     * 网络错误。
     */
    public final static String NETWORK_ERROR = "3000";
    
    /**
     * 错误编码
     */
    private String errCode;
    
    /**
     * 错误消息
     */
    private String errMsg;
    
    public ApiException() {
        super();
    }
    
    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ApiException(String message) {
        super(message);
    }
    
    public ApiException(Throwable cause) {
        super(cause);
    }
    
    public ApiException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
    
    public ApiException(String errCode, String errMsg, Throwable cause) {
        super(errCode + ":" + errMsg, cause);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
    
    public String getErrCode() {
        return this.errCode;
    }
    
    public String getErrMsg() {
        return this.errMsg;
    }
    
}
