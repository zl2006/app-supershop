package org.yy.paipai.api;

import java.util.Map;

import org.yy.paipai.util.FileItem;

/**
 * TOP上传请求接口，支持同时上传多个文件。
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public interface PaiPaiUploadRequest<T extends PaiPaiResponse> extends PaiPaiRequest<T> {

	/**
	 * 获取所有的Key-Value形式的文件请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数文件元数据</li>
	 * </ul>
	 * 
	 * @return 文件请求参数集合
	 */
	public Map<String, FileItem> getFileParams();

}
