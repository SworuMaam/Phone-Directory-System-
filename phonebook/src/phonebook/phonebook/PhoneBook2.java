package phonebook;

import java.io.Serializable;


@SuppressWarnings("serial")
public class PhoneBook2 implements Serializable {

	private String name;
	private String address;
	private String phoneNumber;
	private PhoneBook2 next;
	
	
	// create instance of PhoneBook2 and set next to 'null'
	public PhoneBook2() {
		//data = -1;
		next = null;
	}

	/**
	 * create setters and getters for name, email, phone number, and PhoneBook2
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String email) {
		this.address = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneBook2 getNext() {
		return next;
	}

	public void setNext(PhoneBook2 next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Address = " + address + ", Phone Number = "
				+ phoneNumber;
	}
}