<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>model</title>
</head>
<body>
<pre>
/*
* 文 件 名:  ${data.className}.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  ${data.classDesc} 
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  &lt;修改内容&gt;
*/

import org.yy.paipai.api.PaiPaiObject;

/**
* 
* ${data.classDesc} 
* @author  zhouliang 
* @version  [0.1, 2014年11月27日]
* @since  [paipai-base/0.1] 
*/
public class ${data.className} extends PaiPaiObject {
   
    
    <c:forEach var="item" items="${data.fieldName }" varStatus="status">
    /**
     * <c:out value="${data.fieldDesc[status.index]}" />
     */
    private <c:out value="${data.fieldType[status.index]}" /> ${item};
    </c:forEach> 
	<c:forEach var="item" items="${data.fieldName }" varStatus="status">
    /**
    * <c:out value="${data.fieldDesc[status.index]}" />
    */
    public <c:out value="${data.fieldType[status.index]}" /> get${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}() {
        return  ${item};
    }
    
    /**
    */
    public void set${fn:toUpperCase(fn:substring(item,0,1))}${fn:substring(item,1,100)}(<c:out value="${data.fieldType[status.index]}" /> ${item}) {
        this.${item} = ${item};
    }
    </c:forEach> 
  
}
</pre>
</body>
</html>