package addressBookFellowship;
import java.util.Scanner;

public class AddressBook {
	
		private String firstName;
		private String lastName;
		private String email;
		private String city;
		private String state;
		private long  zip;
		private long phone;
        
		public AddressBook(String firstName, String lastName, String email, String city, String state, 
				String gmail, long zip, long phone) {
			
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phone = phone;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public long getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}
		
		public void printcontact() {
			
	    	System.out.println("Name: " +firstName+" "+lastName);
			System.out.println("Phone: " +phone);
			System.out.println("City: "+city);
			System.out.println("Email: " +email);
			System.out.println("State: "+state);
			System.out.println("Zip: "+zip);
		}
		
	public static void main(String[] args) {
		
		System.out.println("welcome to address book problem");
		AddressBook addressBook = new AddressBook("sumit", "rajegore", "sumit@gmail.com", "nanded", "maharashtra", "nanded", 431605, 9822654119l);
		addressBook.printcontact();
		System.out.println("\nwe are Adding one more contact to our address book.\n");
	    Scanner stdin = new Scanner(System.in);
	    	        System.out.print("Enter First name: ");
			    	String firstName = stdin.next();
	        		System.out.print("Enter Last name: ");
		    		String lastName = stdin.next();
		    		stdin.nextLine();
			    	System.out.print("Enter City name: ");
			    	String city = stdin.next();
			    	System.out.print("Enter gmail id : ");
			    	String email = stdin.next();
			    	System.out.print("Enter State name: ");
			    	String state = stdin.next();
			    	System.out.print("Enter Phone number: ");
			    	long phone = stdin.nextLong();
				    System.out.print("Enter Zip Code: ");
		    		long zip = stdin.nextLong();
		    		AddressBook addressBook1 = new AddressBook(firstName, lastName, city, state, email, state, phone, zip);
		    		System.out.println(" ");
		    		addressBook.printcontact();
		    		System.out.println(" ");
		    		addressBook1.printcontact();
					System.out.println("\ntwo contact is added succesfully\n");
	}
}
