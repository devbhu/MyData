package com.test.exp.language;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class CollectionSelection {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext(new Inventor());
		context.setVariable("cityName", "India");
		List<Inventor1>inventors1 =  (List<Inventor1>)parser.parseExpression("inventors1.?[city==#cityName]").getValue(context);
		System.out.println(inventors1);
		
		System.out.println("Finding out the first match");
		
		Inventor1 firstMatch =  (Inventor1)parser.parseExpression("inventors1.^[city==#cityName]").getValue(context);
		System.out.println(firstMatch);
		
	    System.out.println("Finding out the Last match");
		
		Inventor1 lastMatch =  (Inventor1)parser.parseExpression("inventors1.$[city==#cityName]").getValue(context);
		System.out.println(lastMatch);
		
		System.out.println("Finding out instances from map");
		
		Inventor1 inv1 = new Inventor1();
		inv1.setCity("India");
		Set<Inventor1> list = new HashSet<Inventor1>();
		list.add(inv1);
		context.setVariable("cityName", "India");
		context.setVariable("objList", list);
		//we need to have literal(constant) value in key/value not object .so the below is not working as expected
		Object obj  = parser.parseExpression("invntorsMap.?[value==#objList]").getValue(context);
		
		System.out.println(obj);
		
		
	}
	
}
