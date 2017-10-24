package com.test.autowiring.beans;

import java.util.List;

import com.test.pojos.Inter;

public class Customer {

	private Inter person;
	
	private List<String> games;
	private Integer value;
	private int[] array;
	String name;
	public String getName() {
		return name;
	}

/*	public void setName(String name) {
		this.name = name;
	}*/

	public int[] getArray() {
		return array;
	}

/*	public void setArray(int[] array) {
		this.array = array;
	}*/

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	/*public List<String> getGames() {
		return games;
	}*/
/*
	public void setGames(List<String> games) {
		this.games = games;
	}
*/
	public Customer(Inter person) {
		
		this.person = person;
	}
	
public Customer() {
		
		
	}

	public Inter getPerson() {
		return person;
	}

/*	public void setPerson(Inter person) {
		//System.out.println(person);
		this.person = person;
	}*/
	
	@Override
	public String toString() {
		
		return "[" + person + "]";
	}
}
