package com.test.beanpostprocessor;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import com.test.pojos.TestBeanPojo2;

public class TestBeanPostProcessor implements BeanPostProcessor, Ordered{
    
	private  Properties prop;
	
	private String RESOURCE_NAME = "Custom.properties";
	
	private Properties getProperties(){
		
		if(prop==null){
			 prop = new Properties();
			 InputStream is = this.getClass().getResourceAsStream(RESOURCE_NAME);
			 
			 try {
				prop.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return prop;
		
	}

	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(" Post process 0 before initialization"+beanName);
		System.out.println(" Post process 0 before initialization object : "+bean);
		
		getProperties();
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		try{
		Class baseClass = bean.getClass();
	
		if(prop!=null && prop.containsKey(beanName)){
			
			
		   Class customClass = Class.forName(prop.getProperty(beanName),true,this.getClass().getClassLoader());
			
		    Object customObject = customClass.newInstance();
			for(Field field : baseClass.getDeclaredFields()){
				
			  //customClass.getField(field.getName()).set(customObject,field.get(bean));				
			//	customClass.getDeclaredField(field.getName()).set(customObject,field.get(bean));
				
				String methodName = "set"+ String.valueOf(field.getName().charAt(0)).toUpperCase() + field.getName().substring(1);
			    String getter = "get"+ String.valueOf(field.getName().charAt(0)).toUpperCase() + field.getName().substring(1);
			        for(Method method :baseClass.getDeclaredMethods()){
			        	
			        	if(method.getName().equals(methodName)){
			        		
			        		Method customMethod = customClass.getMethod(methodName, method.getParameterTypes());
							
			        		Method getMethod = baseClass.getDeclaredMethod(getter, null); 
			        		
			        		Object baseValue = getMethod.invoke(bean, null);
                            			        		
							customMethod.invoke(customObject, baseValue);
			        		break;
			        		
			        	}
			        	
			        }
				    
					
					
				}
			
			bean = customObject;
			}
			
			
		
		
		
		
      //  field[0].
		
		//bean = new TestBeanPojo2();
		
		System.out.println(" Post process 0 after initialization"+beanName);
		System.out.println(" Post process  0 after initialization object : "+bean);
		} catch(Exception ex){
			
			ex.printStackTrace();
		}
		
		return bean;
	}

	@Override
	public int getOrder() {
		
		return 0;
	}

	
	
	
}
