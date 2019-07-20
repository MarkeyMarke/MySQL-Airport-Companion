import java.text.ParseException;
import java.text.SimpleDateFormat;
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

		//TODO: Turn every case into a method
		//TODO: Turn these variables into local variable
		//TODO: Turn age and id into an int
		String fName = null, lName = null, age = null, pNumber = null, email = null, phone = null;
		String contactId = null, flightId = null, date = null;
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

		AirportJDBC.insertPerson(fName,lName,Integer.parseInt(age),phone,email);
		System.out.println("Contact [" + fName + ", " + lName + "] successfully stored with Age: [" 
		+ age + "], Phone: [" + phone + "], Email: [" + email + "]\n");
				
		break;
		
		case 2:
			String isExist = "1000";//testing purpose
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

			AirportJDBC.updatePerson(Integer.parseInt(contactId),fName,lName,Integer.parseInt(age),phone,email);
			System.out.println("Contact [" + fName + ", " + lName + "] successfully updated with Age: ["
			+ age + "], Phone: [" + phone + "], Email: [" + email + "]\n");
					
			break;
			
		case 3:
			
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
			ArrayList<Customer> matchingCustomers = AirportJDBC.selectPersons(fName,lName);
			if(matchingCustomers == null || matchingCustomers.isEmpty())
			{
				System.out.println("Cannot find the contact.\n");
			}
			else
			{
				for(Customer c: matchingCustomers) {
					System.out.println("[ID: " + c.getContactId() + ", Age: " + c.getAge() + ", Phone: " + c.getPhone() + ", Email: " + c.getEmail() + "]");
				}
			}

			break;
		
		case 4: 
			String idExist = "1234";//testing purpose 
			String flightExist = "5678";//testing purpose
			do {
				correctInput = true;
				try {
					System.out.println("Enter Contact ID: ");
					contactId = input.next();
					if(!contactId.matches("[0-9_]+"))
						throw new Exception();
					try {
						System.out.println("Checking...");
						if(!contactId.equals(idExist))//testing purpose, should be function call idExist(contactId)
							throw new Exception();
					}
					catch(Exception e1)
					{
						System.out.println("Contact ID does not exist.");
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
					System.out.println("Enter Flight ID: ");
					flightId = input.next();
					if(!flightId.matches("[0-9_]+"))
						throw new Exception();
					try {
						System.out.println("Checking...");
						if(!flightId.equals(flightExist))//testing purpose, should be function call flightExist(flightId)
							throw new Exception();
					}
					catch(Exception e1)
					{
						System.out.println("Flight ID does not exist.");
						correctInput = false;
					}
				}
				catch(Exception e)
				{
					System.out.println("Invalid FLight ID. Please re-enter valid FLight ID.");
					correctInput = false;
				}
			} while(!correctInput);
			
			do {
				correctInput = true;
				try {
						System.out.println("Is passenger registered as first class? [T/F]");
						String ans = input.next();
						if(!ans.equalsIgnoreCase("T")&&!ans.equalsIgnoreCase("F"))
							throw new Exception();
					}
					catch(Exception e)
					{
						System.out.println("Invalid. Please enter T/F.");
						correctInput = false;
					}
			} while(!correctInput);
			
			System.out.println("Flight successfully assigned!\n");
			
			break;	
		
		case 5:	
			idExist = "1234";//testing purpose 
			flightExist = "5678";//testing purpose
			do {
				correctInput = true;
				try {
					System.out.println("Enter Contact ID: ");
					contactId = input.next();
					if(!contactId.matches("[0-9_]+"))
						throw new Exception();
					try {
						System.out.println("Checking...");
						if(!contactId.equals(idExist))//testing purpose, should be function call idExist(contactId)
							throw new Exception();
					}
					catch(Exception e1)
					{
						System.out.println("Contact ID does not exist.");
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
					System.out.println("Enter Flight ID: ");
					flightId = input.next();
					if(!flightId.matches("[0-9_]+"))
						throw new Exception();
					try {
						System.out.println("Checking...");
						if(!flightId.equals(flightExist))//testing purpose, should be function call flightExist(flightId)
							throw new Exception();
					}
					catch(Exception e1)
					{
						System.out.println("Flight ID does not exist.");
						correctInput = false;
					}
				}
				catch(Exception e)
				{
					System.out.println("Invalid FLight ID. Please re-enter valid FLight ID.");
					correctInput = false;
				}
			} while(!correctInput);
			
		System.out.println("Flight successfully cancelled!\n");	
		break;	
		
		case 6:
			//Testing purpose
			List<Flights> available = new ArrayList<Flights>();
			available.add(new Flights("123", "Eva", "San Francisco", "Taipei", "2019-01-21", "2019-01-22"));
			available.add(new Flights("456", "Japan", "San Francisco", "Kyoto", "2019-01-21", "2019-01-22"));
			available.add(new Flights("123", "Korean Air", "San Jose", "Seoul", "2019-01-21", "2019-01-22"));
			
			do {
				correctInput = true;
				try {
						System.out.println("Enter date with format YYYY-MM-DD: ");
						date = input.next();
						if(!isValid(date))
							throw new Exception();
					}
				catch(Exception e)
					{
						System.out.println("Invalid date. PLease re-enter the date.");
						correctInput = false;
					}
			} while(!correctInput);
			
			//Testing purpose
			int yes = 0;
			for(Flights f: available)
			{
				if(date.equals(f.getDeparture()))
						{
							System.out.println("[FlightID: " + f.getFlightId() + ", Airlines: " + f.getAirline() + ", From: " + f.getFrom() + ", To: " + f.getTo() 
							+ ", Departure Date: " + f.getDeparture() + ", Arrival Date: " + f.getArrival() + "]");
							yes = 1;
						}
			} 		
			if(yes==0)
			{
				System.out.println("No available flights on the selected date.\n");
			}
			break;
		
		case 7: System.out.println("Exiting Application...");
				System.exit(0);
				break;
		}	
		}
	}
	
private static boolean isValid(String date){
		
		if (date.trim().equals(""))
		{
		    return true;
		}
		else {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		
		try {	
		Date d = sdf.parse(date);	
		} catch (ParseException e) {
		return false;
		}
		return true;
	} }
}
