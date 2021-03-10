package addressBookFellowship;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMainClass {
	
	public enum IOService {
		
		CONSOLE_IO,FILE_IO,DB_IO,REST_IO;
	}
	private List<ContactPerson> emppayrollList;
	
	public AddressBookMainClass(List <ContactPerson> emppayrollList) {

		this.emppayrollList = emppayrollList;
	}
	public static void main(String[] args) {
		
		ArrayList <ContactPerson> emppayrollList =  new ArrayList<>();
		AddressBookMainClass empPayrollServise = new AddressBookMainClass(emppayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		empPayrollServise.readEmpPayrollData(consoleInputReader);
		empPayrollServise.writeEmpPayrollData();
	}
	private void readEmpPayrollData(Scanner consoleInputReader) {	
		
        System.out.println("Enter Employee firstname: ");
        String firstName = consoleInputReader.nextLine();
        System.out.println("Enter Employee lastname: ");
        String laastName = consoleInputReader.nextLine();
        System.out.println("Enter Employee mob no :");
        String phone = consoleInputReader.nextLine();
        System.out.println("Enter Employee city: ");
        String city = consoleInputReader.nextLine();
        System.out.println("Enter Employee state: ");
        String state = consoleInputReader.nextLine();
        System.out.println("Enter Employee zip:");
        String zip = consoleInputReader.nextLine();
        System.out.println("Enter Employee email: ");
        String email = consoleInputReader.nextLine();
        
        emppayrollList.add(new ContactPerson(firstName, laastName, phone, city, state, zip, email));
    }
    private void writeEmpPayrollData() {
    	
        System.out.println("\nWriting Employee Payroll Roaster to Console...\n" + emppayrollList);
    }
}
