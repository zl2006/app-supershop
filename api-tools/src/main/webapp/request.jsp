<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request</title>
</head>
<body>
<pre>
/*
* 文 件 名:  ${data.className}Request.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  ${data.classDesc }请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  &lt;修改内容&gt;
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;

/**
* ${data.classDesc }请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class ${data.className }Request extends AbstractPaiPaiRequest&lt;<c:choose><c:when test="${data.useResponse == 'use' }">${data.className }Response</c:when><c:otherwise>PaiPaiResponse</c:otherwise></c:choose>&gt; {
    
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "${data.methodName}";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class&lt;<c:choose><c:when test="${data.useResponse == 'use' }">${data.className }Response</c:when><c:otherwise>PaiPaiResponse</c:otherwise></c:choose>&gt; getResponseClass() {
        return <c:choose><c:when test="${data.useResponse == 'use' }">${data.className }Response</c:when><c:otherwise>PaiPaiResponse</c:otherwise></c:choose>.class;
    }
    <c:forEach var="item" items="${data.fieldName }" varStatus="status">
    <c:choose>
    	<c:when test="${data.fieldType[status.index] eq 'Long' }">
    /**
    * <c:out value="${data.fieldDesc[status.index]}" />
    */
    public Long get${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}() {
        return Long.valueOf(textMap.get("${item }"));
    }
    
    /**
     * 
    */
    public void set${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}(Long ${item}) {
        textMap.put("${item }", String.valueOf(${item }));
    }
    	</c:when>
    	<c:when test="${data.fieldType[status.index] == 'Date' }">
    /**
     * <c:out value="${data.fieldDesc[status.index]}" />
    */
    public Date get${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}() {
        return PaiPaiUtils.toDate(textMap.get("${item }"));
    }
    
    /**
    *
    */
    public void set${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}(Date ${item}) {
        textMap.put("${item }", PaiPaiUtils.parseDate(${item }));
    }
    	</c:when>
    	<c:otherwise>
    /**
    *<c:out value="${data.fieldDesc[status.index]}" />
    */
    public <c:out value="${data.fieldType[status.index]}" /> get${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}() {
        return textMap.get("${item }");
    }
    
    /**
    *
    */
    public void set${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}(<c:out value="${data.fieldType[status.index]}" /> ${item}) {
        textMap.put("${item }", ${item });
    }
    	</c:otherwise>
    </c:choose>
    </c:forEach> 
    
    
    
}
</pre>
</body>
</html>