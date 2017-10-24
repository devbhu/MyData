package com.test.exp.language;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Inventor {

	private String name;
	private Date dateOfBirth;
	@Value("#{T(com.test.exp.language.Inventor1).value()}")
	private Double values;
	/**
	 * @return the inventors1
	 */
	public List<Inventor1> getInventors1() {
		return inventors1;
	}

	/**
	 * @param inventors1 the inventors1 to set
	 */
	public void setInventors1(List<Inventor1> inventors1) {
		this.inventors1 = inventors1;
	}
	private Double values1;
	@Value(value="#{systemProperties['user.name']}")
	private String systemProp;
	
	static List<Inventor1> inventors1;

	static Map invntorsMap;
	
	static{
		    inventors1 = new ArrayList<Inventor1>();
		    invntorsMap = new HashMap();
			inventors1.add(new Inventor1("Vickey",new Date("30/10/1988"),"India"));
			inventors1.add(new Inventor1("Ron",new Date("30/12/1988"),"German"));
			inventors1.add(new Inventor1("Dan",new Date("30/11/1988"),"German"));
			inventors1.add(new Inventor1("Arindam",new Date("30/11/1988"),"India"));
			inventors1.add(new Inventor1("Dan",new Date("30/09/1988"),"USA"));
			inventors1.add(new Inventor1("Dan",new Date("30/07/1988"),"Cannada"));
			invntorsMap.put("inventorsmap", inventors1);
			//invntorsMap.put(inventors1, inventors1);
	}

    	
	/**
	 * @return the invntorsMap
	 */
	public Map getInvntorsMap() {
		return invntorsMap;
	}

	/**
	 * @param invntorsMap the invntorsMap to set
	 */
	public void setInvntorsMap(Map invntorsMap) {
		this.invntorsMap = invntorsMap;
	}

	/**
	 * @return the systemProp
	 */
	public String getSystemProp() {
		return systemProp;
	}

	/**
	 * @param systemProp the systemProp to set
	 */
	public void setSystemProp(String systemProp) {
		this.systemProp = systemProp;
	}

	public Inventor(Double values1){
		System.out.println("inventor  initialized ");
		this.values1 = values1;
		
	}
	
	/**
	 * @return the values1
	 */
	public Double getValues1() {
		return values1;
	}



	/**
	 * @return the values
	 */
	public Double getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(Double values) {
		this.values = values;
	}

	public Inventor(String name, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Inventor() {
		System.out.println("inventor  initialized ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Inventor)obj).getName());
	}
	
	public static  String fun(String value){
		
		return value;
	}
	
   public Inventor fun1(String value){
		
		return new Inventor();
	}
	
}
