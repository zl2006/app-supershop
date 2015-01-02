package org.yy.paipai.util;

import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.yy.paipai.api.ApiException;

/**
 * 系统工具类。
 * 
  * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public abstract class PaiPaiUtils {
    
    private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
    
    private static String localIp;
    
    private PaiPaiUtils() {
    }
    
    /* 生成签名
     * @param method HTTP请求方法 "get" / "post"
     * @param url_path CGI名字, 
     * @param params URL请求参数
     * @param secret 密钥
     * @return 签名值
     * @throws OpensnsException 不支持指定编码以及不支持指定的加密方法时抛出异常。
     */
    public static String makeSign(String method, String secret, String apiPath, Map<String, String> params,
        String charset)
        throws ApiException {
        String sig = "";
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(charset), mac.getAlgorithm());
            mac.init(secretKey);
            String mk = makeSource(method, apiPath, params, charset);
            //System.out.println("用于计算sign的源串："+mk);
            byte[] hash = mac.doFinal(mk.getBytes(charset));
            sig = new String(Base64Coder.encode(hash));
            //            sig = encodeUrl(sig);
        }
        catch (Exception e) {
            throw new ApiException(ApiException.MAKE_SIGNATURE_ERROR, e);
        }
        return sig;
    }
    
    /* 
     * URL编码 (符合FRC1738规范)
     * @param input 待编码的字符串
     * @return 编码后的字符串
     * @throws OpenApiException 不支持指定编码时抛出异常。
     */
    private static String encodeUrl(String input, String charset)
        throws ApiException {
        try {
            return URLEncoder.encode(input, charset).replace("+", "%20").replace("*", "%2A");
        }
        catch (UnsupportedEncodingException e) {
            throw new ApiException(ApiException.MAKE_SIGNATURE_ERROR, e);
        }
    }
    
    /* 生成签名所需源串
     * @param method HTTP请求方法 "get" / "post"
     * @param url_path CGI名字, 
     * @param params URL请求参数
     * @return 签名所需源串
     */
    private static String makeSource(String method, String url_path, Map<String, String> params, String charset)
        throws ApiException, UnsupportedEncodingException {
        Object[] keys = params.keySet().toArray();
        Arrays.sort(keys);
        StringBuilder buffer = new StringBuilder(128);
        buffer.append(method.toUpperCase()).append("&").append(encodeUrl(url_path, charset)).append("&");
        StringBuilder buffer2 = new StringBuilder();
        for (int i = 0; i < keys.length; i++) {
            buffer2.append(keys[i]).append("=").append(params.get(keys[i]));
            if (i != keys.length - 1) {
                buffer2.append("&");
            }
        }
        //System.out.println("请求的所有参数："+buffer2);
        buffer.append(encodeUrl(buffer2.toString(), charset));
        return buffer.toString();
    }
    
    /**
     * 获取文件的真实后缀名。目前只支持JPG, GIF, PNG, BMP四种图片文件。
     * 
     * @param bytes 文件字节流
     * @return JPG, GIF, PNG or null
     */
    public static String getFileSuffix(byte[] bytes) {
        if (bytes == null || bytes.length < 10) {
            return null;
        }
        
        if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
            return "GIF";
        }
        else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
            return "PNG";
        }
        else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
            return "JPG";
        }
        else if (bytes[0] == 'B' && bytes[1] == 'M') {
            return "BMP";
        }
        else {
            return null;
        }
    }
    
    /**
     * 获取文件的真实媒体类型。目前只支持JPG, GIF, PNG, BMP四种图片文件。
     * 
     * @param bytes 文件字节流
     * @return 媒体类型(MEME-TYPE)
     */
    public static String getMimeType(byte[] bytes) {
        String suffix = getFileSuffix(bytes);
        String mimeType;
        
        if ("JPG".equals(suffix)) {
            mimeType = "image/jpeg";
        }
        else if ("GIF".equals(suffix)) {
            mimeType = "image/gif";
        }
        else if ("PNG".equals(suffix)) {
            mimeType = "image/png";
        }
        else if ("BMP".equals(suffix)) {
            mimeType = "image/bmp";
        }
        else {
            mimeType = "application/octet-stream";
        }
        
        return mimeType;
    }
    
    /**
     * 清除字典中值为空的项。
     * 
     * @param <V> 泛型
     * @param map 待清除的字典
     * @return 清除后的字典
     */
    public static <V> Map<String, V> cleanupMap(Map<String, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        
        Map<String, V> result = new HashMap<String, V>(map.size());
        Set<Entry<String, V>> entries = map.entrySet();
        
        for (Entry<String, V> entry : entries) {
            if (entry.getValue() != null) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        
        return result;
    }
    
    /**
     * 把JSON字符串转化为Map结构。
     * 
     * @param body JSON字符串
     * @return Map结构
     */
    //	public static Map<?, ?> parseJson(String body) {
    //		JSONReader jr = new JSONValidatingReader();
    //		Object obj = jr.read(body);
    //		if (obj instanceof Map<?, ?>) {
    //			return (Map<?, ?>) obj;
    //		} else {
    //			return null;
    //		}
    //	}
    
    /**
     * 把JSON字符串解释为对象结构。
     * 
     * @param <T> API响应类型
     * @param json JSON字符串
     * @param clazz API响应类
     * @return API响应对象
     */
    //	public static <T extends TaobaoResponse> T parseResponse(String json, Class<T> clazz) throws ApiException {
    //		ObjectJsonParser<T> parser = new ObjectJsonParser<T>(clazz);
    //		T rsp = parser.parse(json);
    //		rsp.setBody(json);
    //		return rsp;
    //	}
    
    /**
     * 获取本机的网络IP
     */
    public static String getLocalNetWorkIp() {
        if (localIp != null) {
            return localIp;
        }
        try {
            Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip = null;
            while (netInterfaces.hasMoreElements()) {// 遍历所有的网卡
                NetworkInterface ni = (NetworkInterface)netInterfaces.nextElement();
                if (ni.isLoopback() || ni.isVirtual()) {// 如果是回环和虚拟网络地址的话继续
                    continue;
                }
                Enumeration<InetAddress> addresss = ni.getInetAddresses();
                while (addresss.hasMoreElements()) {
                    InetAddress address = addresss.nextElement();
                    if (address instanceof Inet4Address) {// 这里暂时只获取ipv4地址
                        ip = address;
                        break;
                    }
                }
                if (ip != null) {
                    break;
                }
            }
            if (ip != null) {
                localIp = ip.getHostAddress();
            }
            else {
                localIp = "127.0.0.1";
            }
        }
        catch (Exception e) {
            localIp = "127.0.0.1";
        }
        return localIp;
    }
    
    public static String parseDate(Date date){
        return df.format(date);
    }
    
    public static Date toDate(String date){
        try {
            return df.parse(date);
        }
        catch (ParseException e) {
            return null;
        }
    }
    
}
