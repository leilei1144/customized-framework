package com.customized.util;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;
/**
 * 
 * @author 谷明锋
 * 自定义log4j的appender类。用于日志输出时的区分所用。
 *
 */
public class HxlcDailyRollingFileAppender extends DailyRollingFileAppender {

	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		//只判断是否相等，而不判断优先级  
		return this.getThreshold().equals(priority);  
	}
}
