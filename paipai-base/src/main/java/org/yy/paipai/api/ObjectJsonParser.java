package org.yy.paipai.api;

import com.alibaba.fastjson.JSONObject;

/**
 * 单个JSON对象解释器。
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class ObjectJsonParser<T extends PaiPaiResponse> implements PaiPaiParser<T> {
    
    private Class<T> clazz;
    
    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }
    
    public T parse(String rsp)
        throws ApiException {
        //从结果中获取正确的json串
        /*
        StringBuilder sb = new StringBuilder(rsp);
        int begin = sb.indexOf("\n", 5);
        int end = sb.lastIndexOf("\n", rsp.length() - 5);
        String jsonStr = sb.substring(begin, end).replace("\r", "").replace("\n", "");*/
        
        String jsonStr = rsp;
        //字符串转成PaiPaiResponse对象
        T resultObj = null;
        try {
            resultObj = clazz.newInstance();
            resultObj = JSONObject.parseObject(jsonStr, clazz);
        }
        catch (Exception e) {
            //e.printStackTrace();
            throw new ApiException("数据转换异常", e);
        }
        resultObj.setBody(rsp);
        return resultObj;
    }
    
    public Class<T> getResponseClass() {
        return clazz;
    }
    
}
