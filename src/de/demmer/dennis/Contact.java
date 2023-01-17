package de.demmer.dennis;

public class Contact implements Comparable<Contact>{
	
	int phoneNumber;
	int houseNumber;
	String adress;
	String name;
	
	public Contact(int phoneNumber, int houseNumber, String adress, String name) {
		super();
		this.phoneNumber = phoneNumber;
		this.houseNumber = houseNumber;
		this.adress = adress;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", houseNumber=" + houseNumber + ", adress=" + adress + ", name="
				+ name + "]";
	}


	@Override
	public int compareTo(Contact otherContact) {
		return name.compareTo(otherContact.name);
	}
	
	
	


}
