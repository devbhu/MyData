package com.test.exp.language;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class RegisteringFunction {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		ExpressionParser exp  = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setVariable("param", "Steve Jobs");
		context.registerFunction("callback", Inventor.class.getDeclaredMethod("fun", String.class));
		
		System.out.println(exp.parseExpression("#callback(#param)").getValue(context));
     
		System.out.println(exp.parseExpression("T(com.test.exp.language.Inventor).fun('vickey')").getValue());
       
		System.out.println("Trying to call a method from the property!!!");
		context.setRootObject(new Inventor());
		
		System.out.println(exp.parseExpression("Inventors1[0].value1()").getValue(context));
		
	}
	
}
