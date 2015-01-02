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

import org.yy.paipai.api.PaiPaiResponse;
import org.yy.paipai.api.PaiPaiUploadRequest;
import org.yy.paipai.util.FileItem;

/**
* 拍拍基础请求封装
* 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public abstract class AbstractPaiPaiUploadRequest<T extends PaiPaiResponse> extends
    AbstractPaiPaiRequest<T> implements PaiPaiUploadRequest<T> {
    
    protected Map<String, FileItem> fileParams = new HashMap<String, FileItem>();
    
    /**
     * 获取所有的Key-Value形式的文件请求参数集合。其中：
     * <ul>
     * <li>Key: 请求参数名</li>
     * <li>Value: 请求参数文件元数据</li>
     * </ul>
     * 
     * @return 文件请求参数集合
     */
    public Map<String, FileItem> getFileParams() {
        return fileParams;
    }
}
