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
		"[1]  Add customer\n" +
		"[2]  Edit cusomer information\n" + 
		"[3]  Find customers by name\n" +
		"[4]  Add flight\n" +
		"[5]  Edit flight\n" +
		"[6]  Delete flight\n" +
		"[7]  Book flight\n" +
		"[8]  Cancel flight\n" +
		"[9]  View all flights starting from a particular day\n" +
		"[10] Archive flights\n" + 
		"[11] View list of airtport locations\n" +
		"[12] View all flights available starting today and how many seats are left\n" +
		"[13] View all flight from a particular airline\n" +
		"[14] View all currently active airlines\n" +
		"[15] View the passengers of a certain flight\n" +
		"[16] View all planes and their specs\n" +
		"[17] Exit application");
		
		
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
			do {
				correctInput = true;
				try {
					System.out.println("Enter Contact ID: ");
					contactId = input.next();
					if(!contactId.matches("[0-9_]+"))
						throw new Exception();
					try {
						System.out.println("Checking...");
						if(!AirportJDBC.checkCustomerExists(Integer.parseInt(contactId)))
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
		
		case 7:
				bookFlight();				
				break;
			
		case 8: 
				cancelFlight();
				break;
				
		case 9:
				
				break;
				
		case 10:
				archiveFlights();
				break;
				
		case 11:
			
				break;
			
		case 12:
			
				break;
			
		case 13:
			
				break;
			
		case 14:
			
				break;
			
		case 15:
			
				break;
			
		case 16:
			
				break;
		
		case 17: 
				System.out.println("Exiting Application...");
				System.exit(0);
				break;
		}	
		}
	}
	
	private static boolean isValid(String date)
	{
		
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
	} 
	}

	public static void bookFlight()
	{
		boolean userInput = true;
		Scanner input = new Scanner(System.in);
		
		do 
		{
			try 
			{
				System.out.println("Enter flight ID: ");
				String fID = input.next();
				if(!fID.matches("[0-9_]+"))
					throw new Exception();
				try 
				{
					if(!AirportJDBC.checkFlightExists(Integer.parseInt(fID)))	
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Flight ID doesn't exist.");
					userInput = false;
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid flight ID. Please re-enter valid flight ID.");
				userInput = false;
			}
		} 
		while(!userInput);
		
		do 
		{
			userInput = true;
			
			try 
			{
				System.out.println("Enter person ID: ");
				String pID = input.next();
				if(!pID.matches("[0-9_]+"))
					throw new Exception();
				try 
				{
					if(!AirportJDBC.checkCustomerExists(Integer.parseInt(pID)))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Person ID doesn't exist.");
					userInput = false;
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid person ID. Please re-enter valid person ID.");
				userInput = false;
			}
		} 
		while(!userInput);
		input.close();
		//NOT DONE
	}
	
	public static void cancelFlight()
	{
		boolean userInput;
		Scanner input = new Scanner(System.in);
		
		do 
		{
			userInput = true;
			try 
			{
				System.out.println("Enter flight ID: ");
				String fID = input.next();
				if(!fID.matches("[0-9_]+"))
					throw new Exception();
				try 
				{
					if(!AirportJDBC.checkFlightExists(Integer.parseInt(fID)))	
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Flight ID doesn't exist.");
					userInput = false;
				}
			}
			catch(Exception ee)
			{
				System.out.println("Invalid flight ID. Please re-enter valid flight ID.");
				userInput = false;
			}
		} 
		while(!userInput);
		
		do 
		{
			userInput = true;
			try 
			{
				System.out.println("Enter person ID: ");
				String pID = input.next();
				if(!pID.matches("[0-9_]+"))
					throw new Exception();
				try 
				{
					if(!AirportJDBC.checkCustomerExists(Integer.parseInt(pID)))
						throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("Person ID doesn't exist.");
					userInput = false;
				}
			}
			catch(Exception ee)
			{
				System.out.println("Invalid person ID. Please re-enter valid person ID.");
				userInput = false;
			}
		} 
		while(!userInput);
		
		System.out.println("Flight successflly unbooked\n");
	}
	
	public static void archiveFlights()
	{
		boolean userInput;
		Scanner input = new Scanner(System.in);
		String date = null;
		
		do 
		{
			userInput = true;
			try 
			{
				System.out.println("Enter date with format YYYY-MM-DD: ");
				date = input.next();
				if(!isValid(date))
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Invalid date. PLease re-enter the date.");
				userInput = false;
			}
		} 
		while(!userInput);
		
		AirportJDBC.archiveFlights(date);
		System.out.println("Archiving was a success\n");
	}
}
