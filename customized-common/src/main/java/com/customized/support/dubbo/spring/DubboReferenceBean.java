package com.customized.support.dubbo.spring;



import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.customized.support.dubbo.spring.annotation.DubboReference;

@SuppressWarnings("serial")
public class DubboReferenceBean<T> extends ReferenceBean<T> {

	public DubboReferenceBean() {
		super();
	}

	public DubboReferenceBean(DubboReference reference) {
		appendAnnotation(DubboReference.class, reference);
	}
}
