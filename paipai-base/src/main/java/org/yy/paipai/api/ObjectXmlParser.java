package org.yy.paipai.api;

/**
 * 单个XML对象解释器。
 * 
 * @author  zhouliang
 * @version  [0.1, 2014年11月27日]
 * @since  [paipai-base/0.1]
 */
public class ObjectXmlParser<T extends PaiPaiResponse> implements PaiPaiParser<T> {

	private Class<T> clazz;

	public ObjectXmlParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	//TODO 单个XML对象解释器。
	public T parse(String rsp) throws ApiException {
		throw new ApiException("xml对象解释器开发中...");
	}

	public Class<T> getResponseClass() {
		return clazz;
	}

}
