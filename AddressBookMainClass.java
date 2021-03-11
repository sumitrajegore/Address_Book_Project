package addressBookFellowship;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AddressBookMainClass {

	public static void main(String[] args) {
		
		String FilePath = "F:\\Users\\sumit\\eclipse-workspace\\Assignments\\src\\addressBookFellowship\\Write.csv";
		Write(FilePath);
		System.out.print(FilePath);
	}
	public static void Write(String filePath) {
		
		List<ContactPerson> employeelist = new ArrayList<ContactPerson>();
		
		ContactPerson emp2 = new ContactPerson();
		emp2.setFirstName("samadh");
		emp2.setLaastName("rajeg");
		emp2.setPhone(9822654118L);
		emp2.setCity("nandednhf");
		emp2.setState("maharashtratgf");
		emp2.setZip(431604654);
		emp2.setEmail("sumitrajegore@gmail.com");		employeelist.add(emp2);
		
		ContactPerson emp1 = new ContactPerson();
	    emp1.setFirstName("sama");
		emp1.setLaastName("raje");
		emp1.setPhone(9822654119L);
		emp1.setCity("nanded");
		emp1.setState("maharashtra");
		emp1.setZip(431604);
		emp1.setEmail("sumitrajegore111@gmail.com");
		employeelist.add(emp1);
		
		
		
		FileWriter filewriter = null;
		try {
			filewriter = new FileWriter(filePath);
			filewriter.append("firstname,lastname,phone,city,state,zip,email");
			filewriter.append("\n");
			   
			for (ContactPerson employee : employeelist ) {
				
				filewriter.append(String.valueOf(ContactPerson.getFirstName()));
				filewriter.append(",");
				filewriter.append(ContactPerson.getLaastName());
				filewriter.append(",");
				filewriter.append(String.valueOf(ContactPerson.getPhone()));
				filewriter.append(",");
				filewriter.append(ContactPerson.getCity());
				filewriter.append(",");
				filewriter.append(ContactPerson.getState());
				filewriter.append(",");
				filewriter.append(String.valueOf(ContactPerson.getZip()));
				filewriter.append(",");
				filewriter.append(ContactPerson.getEmail());
				filewriter.append("\n");

		    }
			
  		} catch (Exception e) { 
  			
  			e.printStackTrace();
			
		} finally {
			
			try {
				
				filewriter.flush();
				filewriter.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}		
	}
}