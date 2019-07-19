import java.util.*;

public class StaffSystem {

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println(
		"[1] Add new contact\n" +
		"[2] Edit contact\n" + 
		"[3] Find contact\n" +
		"[4] Assign a contact's flight\n" +
		"[5] Cancel a contact's flight\n" +
		"[6] View all available flights");
		
		int choice = input.nextInt();
		
		String fName = null, lName = null, age = null, pNumber = null, email = null, phone = null;
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
		+ age + "], Phone: [" + phone + "], Email: [" + email + "]");
				
		break;
		
		}
	}
}