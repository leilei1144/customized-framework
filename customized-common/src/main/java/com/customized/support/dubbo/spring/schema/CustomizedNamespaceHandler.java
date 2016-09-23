package com.customized.support.dubbo.spring.schema;

import com.alibaba.dubbo.config.spring.schema.DubboBeanDefinitionParser;
import com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler;
import com.customized.support.dubbo.spring.AnnotationBean;

/**
 * @author gu
 * @version 2016年5月20日 下午3:19:19
 */
public class CustomizedNamespaceHandler extends DubboNamespaceHandler {
	public void init() {
		super.init();
		System.out.println("进入handler");
		registerBeanDefinitionParser("annotation", new DubboBeanDefinitionParser(AnnotationBean.class, true));
	}

}
