package test.onetoone.unidirectional.using.foreignkey;

public class Address {

	Integer addressID;
	
	String city;
	String state;
	String country;
	
	//Person person;

	/**
	 * @return the addressID
	 */
	public Integer getAddressID() {
		return addressID;
	}

	/**
	 * @param addressID the addressID to set
	 */
	public void setAddressID(Integer addressID) {
		this.addressID = addressID;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

/*	*//**
	 * @return the person
	 *//*
	public Person getPerson() {
		return person;
	}

	*//**
	 * @param person the person to set
	 *//*
	public void setPerson(Person person) {
		this.person = person;
	}*/
	
	Person personrr;

	/**
	 * @return the personrr
	 */
	public Person getPersonrr() {
		return personrr;
	}

	/**
	 * @param personrr the personrr to set
	 */
	public void setPersonrr(Person personrr) {
		this.personrr = personrr;
	}
	
}
