package com.test.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class TestBeanPostProcessor3 implements BeanPostProcessor, Ordered{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(" Post process 3 before initialization"+beanName);
		System.out.println(" Post process 3 before initialization object : "+bean);
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println(" Post process 3 after initialization"+beanName);
		System.out.println(" Post process  3 after initialization object : "+bean);
		
		
		return bean;
	}

	@Override
	public int getOrder() {
		
		return 3;
	}

	
	
	
}
