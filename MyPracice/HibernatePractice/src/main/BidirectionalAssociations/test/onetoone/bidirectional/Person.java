/**
 * 
 */
package test.onetoone.bidirectional;

/**
 * @author ASanyal
 *
 */
public class Person {

	Integer personID;
	String personName;
	Address address;

	/**
	 * @return the personID
	 */
	public Integer getPersonID() {
		return personID;
	}

	/**
	 * @param personID
	 *            the personID to set
	 */
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName
	 *            the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
