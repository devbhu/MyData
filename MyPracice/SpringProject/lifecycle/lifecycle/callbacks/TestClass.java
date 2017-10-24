package lifecycle.callbacks;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestClass
		implements
			InitializingBean,
			DisposableBean,
			ApplicationContextAware,
			BeanNameAware {

	private static String beanName;

	public static String getBeanName() {
		return beanName;
	}

	public void setTestClass1(TestClass1 class1) {

	}

	public void setValue(String value) {

		System.out.println("set Value called !!!" + value);
	}

	public TestClass() {

		System.out.println("Constructor for TestClass called !!!");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Test Class destroyed !!!");

	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("After Properties set called !!!");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {

		System.out
				.println("Application context aware for TestClass called !!!");

	}

	public void init() {

		System.out.println("init method called!!");
	}
	@PostConstruct
	public void initialization() {

		System.out.println("initialization method called !!!");
	}

	public void clear() {

		System.out.println("clear method called!!");
	}

	@Override
	public void setBeanName(String name) {

		this.beanName = name;
	}

}
