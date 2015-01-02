package demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 文 件 名:  MakeApi.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/

/**
* 
* @author  zhouliang
* @version  [版本号, 2014年11月28日]
* @since  [产品/模块版本]
*/
public class MakeApi extends HttpServlet {
    /**
    * 注释内容
    */
    private static final long serialVersionUID = -2934543556344702177L;
    
    /** {@inheritDoc} */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String type = request.getParameter("type");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("className", request.getParameter("className"));
        params.put("classDesc", request.getParameter("classDesc"));
        params.put("fieldName", request.getParameterValues("fieldName"));
        params.put("fieldDesc", request.getParameterValues("fieldDesc"));
        params.put("fieldType", request.getParameterValues("fieldType"));
        params.put("methodName", request.getParameter("methodName"));
        params.put("useResponse", request.getParameter("useResponse"));
        
        request.setAttribute("data", params );
        if ("request".equals(type)) {
            request.getRequestDispatcher("request.jsp").forward(request, response);
        }
        else if ("model".equals(type)) {
            request.getRequestDispatcher("model.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("response.jsp").forward(request, response);
        }
    }
    
    /** {@inheritDoc} */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        doPost(req, resp);
    }

    
}
