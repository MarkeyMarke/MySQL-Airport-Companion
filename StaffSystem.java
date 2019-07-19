import java.util.*;

public class StaffSystem {

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\tAIRLINE STAFF'SYSTEM\n");
		
		while(true)
		{
		System.out.println(
		"[1] Add new contact\n" +
		"[2] Edit contact\n" + 
		"[3] Find contact\n" +
		"[4] Assign a contact's flight\n" +
		"[5] Cancel a contact's flight\n" +
		"[6] View all available flights\n" +
		"[7] Quit");
		
		int choice = input.nextInt();
		
		String fName = null, lName = null, age = null, pNumber = null, email = null, phone = null;
		String contactId = null;
		boolean correctInput;
		
		switch(choice)
		{
		case 1: 
		do {
			correctInput = true;
			try {
					System.out.println("Enter first name: ");
					fName = input.next();
					if(!fName.matches("[a-zA-Z_]+"))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Invalid first name. Please re-enter first name.");
					correctInput = false;
				}
		} while(!correctInput);
		
		do {
			correctInput = true;
			try {
				System.out.println("Enter last name: ");
				lName = input.next();
				if(!lName.matches("[a-zA-Z_]+"))
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Invalid last name. Please re-enter last name.");
				correctInput = false;
			}
		} while(!correctInput);
				
		do	{
			correctInput = true;
			try {
				System.out.println("Enter age: ");
				age = input.next();
				if(!age.matches("[0-9_]+"))
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Invalid age. Please re-enter an integer.");
				correctInput = false;
			}
		} while(!correctInput);
		
		do {
			correctInput = true;
			try {
				System.out.println("Enter phone number: ");
				pNumber = input.next();
				if(!pNumber.matches("[0-9_]+"))
					throw new Exception();
				else
					phone = pNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
			}
			catch(Exception e)
			{
				System.out.println("Invalid phone number. Please re-enter phone number.");
				correctInput = false;
			}
		} while(!correctInput);
				
		do {
			correctInput = true;
			try {
				System.out.println("Enter email: ");
				email = input.next();
				if(!email.matches( "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Invalid email. Please re-enter email");
				correctInput = false;
			}
		} while(!correctInput);
		
		System.out.println("Contact [" + fName + ", " + lName + "] successfully stored with Age: [" 
		+ age + "], Phone: [" + phone + "], Email: [" + email + "]\n");
				
		break;
		
		case 2:
			String isExist = "1234";//testing purpose 
			do {
				correctInput = true;
				try {
					System.out.println("Enter Contact ID: ");
					contactId = input.next();
					if(!contactId.matches("[0-9_]+"))
						throw new Exception();
					try {
						System.out.println("Checking...");
						if(!contactId.equals(isExist))//testing purpose, should be function call isExist(contactId)
							throw new Exception();
					}
					catch(Exception e1)
					{
						System.out.println("ID does not exist.");
						correctInput = false;
					}
				}
				catch(Exception e)
				{
					System.out.println("Invalid Contact ID. Please re-enter valid Contact ID.");
					correctInput = false;
				}
			} while(!correctInput);
			
			do {
				correctInput = true;
				try {
						System.out.println("Enter new first name: ");
						fName = input.next();
						if(!fName.matches("[a-zA-Z_]+"))
							throw new Exception();
					}
					catch(Exception e)
					{
						System.out.println("Invalid new first name. Please re-enter new first name.");
						correctInput = false;
					}
			} while(!correctInput);
			
			do {
				correctInput = true;
				try {
					System.out.println("Enter new last name: ");
					lName = input.next();
					if(!lName.matches("[a-zA-Z_]+"))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Invalid new last name. Please re-enter new last name.");
					correctInput = false;
				}
			} while(!correctInput);
					
			do	{
				correctInput = true;
				try {
					System.out.println("Enter new age: ");
					age = input.next();
					if(!age.matches("[0-9_]+"))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Invalid new age. Please re-enter an age.");
					correctInput = false;
				}
			} while(!correctInput);
			
			do {
				correctInput = true;
				try {
					System.out.println("Enter new phone number: ");
					pNumber = input.next();
					if(!pNumber.matches("[0-9_]+"))
						throw new Exception();
					else
						phone = pNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
				}
				catch(Exception e)
				{
					System.out.println("Invalid new phone number. Please re-enter new phone number.");
					correctInput = false;
				}
			} while(!correctInput);
					
			do {
				correctInput = true;
				try {
					System.out.println("Enter new email: ");
					email = input.next();
					if(!email.matches( "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Invalid new email. Please re-enter new email");
					correctInput = false;
				}
			} while(!correctInput);
			
			System.out.println("Contact [" + fName + ", " + lName + "] successfully stored with Age: [" 
			+ age + "], Phone: [" + phone + "], Email: [" + email + "]\n");
					
			break;
			
		case 3: 
			
			//Testing purpose
			List<Customer> test = new ArrayList<Customer>();
			test.add(new Customer("aaa", "aaa", "1", "123", "3123124", "dasda@dadhad.com"));
			test.add(new Customer("bbb", "ccc", "2", "345", "3213123", "dasda@dadhad.com"));
			test.add(new Customer("aaa", "aaa", "3", "678", "5363643", "dasda@dadhad.com"));
			
			do {
				correctInput = true;
				try {
						System.out.println("Enter first name: ");
						fName = input.next();
						if(!fName.matches("[a-zA-Z_]+"))
							throw new Exception();
					}
					catch(Exception e)
					{
						System.out.println("Invalid first name. Please re-enter first name.");
						correctInput = false;
					}
			} while(!correctInput);
			
			do {
				correctInput = true;
				try {
					System.out.println("Enter last name: ");
					lName = input.next();
					if(!lName.matches("[a-zA-Z_]+"))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Invalid last name. Please re-enter last name.");
					correctInput = false;
				}
			} while(!correctInput);
			
			//Testing purpose
			int yes = 0;
			for(Customer c: test)
			{
				if(fName.equals(c.getfName())&&lName.equals(c.getlName()))
						{
							System.out.println("[ID: " + c.getContactId() + ", Age: " + c.getAge() + ", Phone: " + c.getPhone() + ", Email: " + c.getEmail() + "]");
							yes = 1;
						}
			} 		
			if(yes==0)
			{
				System.out.println("Cannot find the contact.\n");
			}
		
			break;
		
		case 7: System.out.println("Exiting Application...");
				System.exit(0);
				break;
		}
		}
	}
}
