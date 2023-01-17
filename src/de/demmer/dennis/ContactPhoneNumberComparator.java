package de.demmer.dennis;

import java.util.Comparator;

public class ContactPhoneNumberComparator implements Comparator<Contact>{

	
	
	
	@Override
	public int compare(Contact o1, Contact o2) {
		
		if(o1.phoneNumber > o2.phoneNumber) {
			return 1;
		}
		
		if(o1.phoneNumber < o2.phoneNumber) {
			return -1;
		}
		
		return 0;
	}
	
	
	

}
