package de.demmer.dennis;

import java.util.Arrays;

public class Application {
	
	
	public static void main(String[] args) {
		
		Contact c1 = new Contact(44654564, 11, "Musterstrasse", "Dennis");
		Contact c2 = new Contact(3745832, 3, "Erstestrasse", "Klaus");
		Contact c3 = new Contact(47777, 1, "Zweitestrasse", "Claudia");
		Contact c4 = new Contact(977452, 9, "Drittestrasse", "Verena");
		Contact c5 = new Contact(742744, 15, "Viertestrasse", "Günther");

		Contact[] contacts = {c1,c2,c3,c4,c5};
		
		
		Arrays.sort(contacts);
		c1.compareTo(c2);
		
		
		
		ContactPhoneNumberComparator cpnmc = new ContactPhoneNumberComparator();
		Arrays.sort(contacts, cpnmc);
		cpnmc.compare(c1, c2);
		
	}


}
