//package org.yy.paipai.base;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * 用户鉴权拦截器
//    <mvc:interceptors>
//        <mvc:interceptor> <!-- 可以增加多个拦截器 -->
//            <mvc:mapping path="/admin/**" /> <!-- 需要拦截的,指后台管理端 -->
//            <mvc:exclude-mapping path="/" />  <!-- 不需要拦截的，指前台广播 -->
//            <mvc:exclude-mapping path="/client/**" />   <!--前台微淘插件页面-->
//            <mvc:exclude-mapping path="/common/**" />
//            <bean class="org.yy.paipai.shop.interceptor.AuthHandlerInterceptor">
//                <constructor-arg index="0" value="http://fuwu.paipai.com/my/app/authorizeGetAccessToken.xhtml?responseType=access_token&appOAuthID=700218304"></constructor-arg>
//            </bean>
//        </mvc:interceptor>
//    </mvc:interceptors>
// * 
// * @author zhouliang
// * @version [1.0, 2014年5月20日]
// * @since [paipai-base/1.0]
// */
//public class AuthHandlerInterceptor implements HandlerInterceptor {
//    
//    //此链接是授权入口，当用户失效时也可以定位到此处
//    // http://fuwu.paipai.com/my/app/authorizeGetAccessToken.xhtml?responseType=access_token&appOAuthID=700218304
//    //授权后会请求http://www.ppshop（应用配置的url）.com:8080/?access_token=a9935adcda584f874cc43f2954fbeb22&useruin=18723351&app_oauth_id=700218304&sign=kXkXAFR4cEOItkoGyinMhY1tK4c%3D&g_tk=186228628&g_ty=lk&
//    private String loginUrl = ""; // 登录地址
//    
//    /**
//     * 未授权时的登录地址
//     * 
//     * @param loginUrl
//     *            登录地址
//     */
//    public AuthHandlerInterceptor(String loginUrl) {
//        this.loginUrl = loginUrl;
//    }
//    
//    // 最终拦截
//    public void afterCompletion(HttpServletRequest httpReq, HttpServletResponse httpRep, Object obj, Exception ex)
//        throws Exception {
//    }
//    
//    // 后置拦截
//    public void postHandle(HttpServletRequest httpReq, HttpServletResponse httpRep, Object obj, ModelAndView mav)
//        throws Exception {
//    }
//    
//    // 前置拦截,
//    public boolean preHandle(HttpServletRequest httpReq, HttpServletResponse httpRep, Object obj)
//        throws Exception {
//        
//        /*Token token = (Token)httpReq.getSession().getAttribute(TaobaoConstants.SELLER_TOKEN_KEY);
//        
//        if (token == null) {
//            httpRep.sendRedirect(loginUrl);
//            return false;
//        }*/
//        
//        return true;
//    }
//    
//}
