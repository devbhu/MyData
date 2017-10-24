package com.test.exp.language;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

class TestSpel {

	/**
	 * @return the booleanList
	 */
	public List<Boolean> getBooleanList() {
		return booleanList;
	}

	private List<Boolean> booleanList = new ArrayList<Boolean>();

}

public class TestSpelSpring {
	private static final String RESOURCES = "com/test/resources/appCtx-context-spel.xml";
	public static void main(String[] args) {

		// System.setProperty("ANT_HOME", "E:\\Compressed\\apache-ant-1.9.2");

		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'");

		System.out.println(exp.getValue());
		Expression exp1 = parser.parseExpression("'Hello World'.bytes");
		System.out.println(exp1.getValue());// returns the byte array.

		Inventor inv = new Inventor("Nikola Tesla", new Date("30/10/1988"));
		Inventor inv2 = new Inventor("Nikola Tesla 3", new Date("30/10/1988"));
		Inventor1 inv1 = new Inventor1("Nikola Tesla", new Date("30/10/1988"),"German");

		Expression expre = parser.parseExpression("dateOfBirth");
		Expression expre1 = parser.parseExpression("name == 'Nikola Tesla'");
		StandardEvaluationContext context = new StandardEvaluationContext();
		List<Inventor1> inventors1 = new ArrayList<Inventor1>();
		
		// inv.setInventors1(inventors1);

		context.setRootObject(inv);

		System.out.println(" Name : " + expre1.getValue(context));
		context.setRootObject(inv2);
		System.out.println(" Name : " + expre.getValue(context));

		TestSpel testSpel = new TestSpel();
		testSpel.getBooleanList().add(true);
		context.setRootObject(testSpel);
		Expression expression = parser.parseExpression("booleanList[0]");
		expression.setValue(context, false);
		System.out.println(testSpel.getBooleanList());

		ApplicationContext appCtx = new ClassPathXmlApplicationContext(
				RESOURCES);
		Inventor inventor = appCtx.getBean("inventor", Inventor.class);
		System.out.println("Inventor Values : " + inventor.getValues());
		System.out.println("Inventor Values : " + inventor.getValues1());
		System.out.println("Inventor system properties Values : "
				+ inventor.getSystemProp());
		System.out
				.println("Name from map : "
						+ appCtx.getBean("inventor1", Inventor1.class)
								.getNameFromMap());
		Expression obj = parser.parseExpression("-4930.178");

		System.out.println(obj.getValue());

		System.out.println("Using arrays and lists !!");
		context.setRootObject(inv);
		System.out.println(parser.parseExpression("Inventors1[2].Name1")
				.getValue(context));
		// I'm setting a different name
		parser.parseExpression("Inventors1[2].Name1").setValue(context,
				"Morrison");
		System.out.println(inv.getInventors1().get(2).getName1());

		System.out.println("Using maps !!!");

		System.out.println(parser.parseExpression(
				"InvntorsMap['inventorsmap'][0].name1").getValue(context));

		System.out.println("creating constant list !!");

		System.out.println("Creating an empty list : "
				+ parser.parseExpression("{}").getValue()); // No need to add
															// context since we
															// are not getting
															// the property from
															// any root object.
															// It's constant
															// list.
		System.out.println("Creating an constant list : "
				+ parser.parseExpression("{1,2,3,4,5}").getValue(context)); 
		
		System.out.println("Invoking methods on expression ");
		
		System.out.println(" Method on string "+parser.parseExpression("'abc'.substring(0,2)").getValue());
		
		System.out.println(" Method on root object "+parser.parseExpression("fun('arindam')").getValue(context));
		
		System.out.println("Relational Operators !!!!");
		
		System.out.println(parser.parseExpression("fun('arindam') instanceof T(java.lang.String)").getValue(context));

		System.out.println(parser.parseExpression("fun1('arindam') instanceof T(com.test.exp.language.Inventor)").getValue(context));
     
		System.out.println(parser.parseExpression("fun('arindam') == fun('arindam')").getValue(context));
 
		 

	}
}
