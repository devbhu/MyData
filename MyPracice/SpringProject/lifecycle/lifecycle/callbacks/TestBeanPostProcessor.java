package lifecycle.callbacks;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		
	System.out.println("Bean post processor before init called !!");
	return bean;	
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("Bean Post Processor called after init !!!");
		
		
		return bean;
	}

	

}
