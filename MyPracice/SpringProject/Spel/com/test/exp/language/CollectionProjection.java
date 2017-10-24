package com.test.exp.language;

import java.util.List;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class CollectionProjection {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext(
				new Inventor());
		context.setVariable("cityName", "India");
		// Projection doesnot need a bollean expression rather it needs the
		// property name only which will return a list of cities from the
		// collection inventors1.
		List cities = (List) parser.parseExpression("inventors1.![city]")
				.getValue(context);
		System.out.println(cities);
		
		//Trying to use template 
		System.out.println("...Using Template ......");
		System.out.println(parser.parseExpression("The number is : #{T(Math).random()}",new TemplateParserContext()).getValue());

	}
}
