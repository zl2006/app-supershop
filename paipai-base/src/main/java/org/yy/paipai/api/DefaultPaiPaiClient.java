 /*
 * 文 件 名:  DefaultPaiPaiClient.java
 * 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zhouliang
 * 修改时间:  2014年11月27日
 * 修改内容:  <修改内容>
 */
package org.yy.paipai.api;

import java.io.IOException;
import java.util.Map;

import org.yy.paipai.util.FileItem;
import org.yy.paipai.util.PaiPaiUtils;
import org.yy.paipai.util.WebUtils;

 /**
 * 拍拍API调用客户端
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class DefaultPaiPaiClient implements PaiPaiClient {
    
    private String appOAuthID;  //应用授权id
    private String appOAuthkey; //应用授权key
    private String apiUrl;      //api调用地址
    private String method= "POST";
    private String format = Constants.FORMAT_JSON;

    private int connectTimeout = 3000;//3秒
    private int readTimeout = 15000;//15秒
    
    /**
     * 
     <默认构造函数>
     */
    public DefaultPaiPaiClient(String apiUrl, String appOAuthID, String appOAuthkey) {
        this.apiUrl = apiUrl;
        this.appOAuthID = appOAuthID;
        this.appOAuthkey = appOAuthkey;
    }
    
    public DefaultPaiPaiClient(String apiUrl, String appOAuthID, String appOAuthkey, String format) {
        this(apiUrl, appOAuthID, appOAuthkey);
        this.format = format;
    }

    public DefaultPaiPaiClient(String apiUrl, String appOAuthID, String appOAuthkey, String format, int connectTimeout, int readTimeout) {
        this(apiUrl, appOAuthID, appOAuthkey);
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
    }

    
    /** {@inheritDoc} */
    @Override
    public <T extends PaiPaiResponse> T execute(PaiPaiRequest<T> request, String session, String uin)
        throws ApiException {
        
        String secret = appOAuthkey+"&";
        String url=apiUrl+ request.getApiMethodName();
        request.getTextParams().put("format", format);
        request.getTextParams().put("charset", Constants.CHARSET_UTF8);
        request.getTextParams().put("timeStamp", request.getTimestamp() + "");
        request.getTextParams().put("randomValue", (int)(Math.random()*100000+10000) + "");
        request.getTextParams().put("appOAuthID", appOAuthID);
        request.getTextParams().put("accessToken", session);
        request.getTextParams().put("uin", uin);
        
        request.getTextParams().put("pureData", "1");
        
        String sign = PaiPaiUtils.makeSign(method, secret, request.getApiMethodName(), request.getTextParams(), Constants.CHARSET_UTF8);
        
        request.getTextParams().put("sign", sign);
        

        String response = "";//
        try {
            // 是否需要上传文件
            if (request instanceof PaiPaiUploadRequest) {
                PaiPaiUploadRequest<T> uRequest = (PaiPaiUploadRequest<T>) request;
                Map<String, FileItem> fileParams = PaiPaiUtils.cleanupMap(uRequest.getFileParams());
                response = WebUtils.doPost(url, request.getTextParams(), fileParams,Constants.CHARSET_UTF8, connectTimeout, readTimeout,request.getHeaderMap());
            } else {
                response = WebUtils.doPost(url, request.getTextParams(),Constants.CHARSET_UTF8, connectTimeout, readTimeout,request.getHeaderMap());
            }
        } catch (IOException e) {
            throw new ApiException(e);
        }
 
        PaiPaiParser<T> parser = null;
        if (Constants.FORMAT_XML.equals(this.format)) {
            parser = new ObjectXmlParser<T>(request.getResponseClass());
        } else {
            parser = new ObjectJsonParser<T>(request.getResponseClass());
        }
        
         return parser.parse(response);
    }
    
}
