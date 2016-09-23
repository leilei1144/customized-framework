package com.customized.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
/**
 * 
 * @author 谷明锋
 * 重写了spring的SimpleMappingExceptionResolver类中的doResolveException方法，
 * 只是简单的将系统抛出的异常写入error文件中。
 * getExceptionAllinformation 方法自定义了exception的输出格式，将excetion的栈内容装换成字符串返回。
 *
 */
public class AisinoMappingExceptionResolver extends SimpleMappingExceptionResolver {
	private static Logger logger = LoggerFactory.getLogger(AisinoMappingExceptionResolver.class);
	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		logger.error(getExceptionAllinformation(ex));
		return super.doResolveException(request, response, handler, ex);
	}
	private static String getExceptionAllinformation(Exception ex){
        String sOut = "\t\r\n" + ex.toString() + "\r\n";
        StackTraceElement[] trace = ex.getStackTrace();
        for (StackTraceElement s : trace) {
            sOut += "\tat " + s + "\r\n";
        }
        return sOut;
	}

}
