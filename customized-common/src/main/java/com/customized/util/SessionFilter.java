package com.customized.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;


/**
 * @author chenmengfei
 *
 */

public class SessionFilter extends OncePerRequestFilter{
	
	@Override
	
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String noFilter="/customized-web/";
        // 请求uri
        String uri = request.getRequestURI();
        if(uri.equals(noFilter)||uri.equals("/customized-web/freemarker")||uri.contains("/customized-web/reset")||uri.equals("/customized-web/exit")||uri.equals("/customized-web")||uri.contains("/customized-web/static/")||uri.equals("/customized-web/login")||uri.contains("/customized-web/image.jpg")){
        	filterChain.doFilter(request, response);
        }
        else{
        	// 获取session中的值，如果为空，进行处理
                Object obj = request.getSession().getAttribute("user");
                if(null==obj){
                		response.setCharacterEncoding("utf-8");
                		response.setContentType("text/html;charset=utf-8");
                		PrintWriter out=response.getWriter();
                		out.print("<script>$.Hxlc.AllAlert('超时提示','登录超时,请重新登录!',function(){window.location.href='/customized-web';});</script>");
                }else{
                    // session中存在值，
                	filterChain.doFilter(request, response);
               }
            } 
        }
}


