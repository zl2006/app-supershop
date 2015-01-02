package org.yy.paipai.api;

import java.io.Serializable;


/**
 * TOPAPI基础响应信息。
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class PaiPaiResponse implements Serializable {

	private static final long serialVersionUID = 5014379068811962022L;

	private String errorCode;

	private String errorMessage;

	private Long sellerUin;

	private String body;

    /**
    * @return 返回 errorCode
    */
    public String getErrorCode() {
        return errorCode;
    }

    /**
    * @param 对errorCode进行赋值
    */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
    * @return 返回 errorMessage
    */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
    * @param 对errorMessage进行赋值
    */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
    * @return 返回 sellerUin
    */
    public Long getSellerUin() {
        return sellerUin;
    }

    /**
    * @param 对sellerUin进行赋值
    */
    public void setSellerUin(Long sellerUin) {
        this.sellerUin = sellerUin;
    }


    /**
    * @return 返回 body
    */
    public String getBody() {
        return body;
    }

    /**
    * @param 对body进行赋值
    */
    public void setBody(String body) {
        this.body = body;
    }

	
}
