import java.sql.*;
import org.javatuples.*;
import java.util.*;

public class AirportJDBC {

    private static Connection dbConnection()
    {
        Connection connection;
        try {
            String dbURL = "jdbc:mysql://localhost:3306/AIRLINE_RESERVATION?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";
            String jdbcUser = "root";
            String jdbcPass = "KenneTH1997";
            connection = DriverManager.getConnection(dbURL, jdbcUser, jdbcPass);

        } catch (SQLException e) {
            System.out.println("DB Connection Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        return connection;
    }

    public static void insertPerson(String firstName, String lastName, int age, String phone, String email)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("INSERT INTO Person\n" +
                "VALUES (DEFAULT, '%s', '%s', %d, '%s', '%s');",firstName,lastName,age,phone,email);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static void updatePerson(int id, String firstName, String lastName, int age, String phone, String email)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("UPDATE Person\n" +
                "SET pFirst = '%s', pLast = '%s', pAge = %d, phoneNum = '%s', email = '%s'\n" +
                "WHERE pID = %d;",firstName,lastName,age,phone,email,id);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static ArrayList<Customer> selectPersons(String firstName, String lastName)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<Customer> persons = new ArrayList<>();

        String query = String.format("SELECT *\n" +
                "FROM Person\n" +
                "WHERE pFirst = '%s' AND pLast = '%s';",firstName,lastName);

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next())
            {
                String id = Integer.toString(rs.getInt("pID"));
                String fname = rs.getString("pFirst");
                String lname = rs.getString("pLast");
                String age = Integer.toString(rs.getInt("pAge"));
                String phoneNum = rs.getString("phoneNum");
                String email = rs.getString("email");
                persons.add(new Customer(fname,lname,age,id,phoneNum,email));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }

        return persons;
    }

    public static boolean checkCustomerExists(int id)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return false;

        try {
            CallableStatement cs = connection.prepareCall("{CALL checkPersonExists(?,?)};");
            cs.setInt("personID",id);
            cs.registerOutParameter("personExists", Types.BOOLEAN);
            cs.execute();
            boolean personExists = cs.getBoolean("personExists");
            connection.close();
            return personExists;

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return false;
        }
    }

    public static void insertFlight(int planeID, int departAirportID , int arriveAirportID, String departure, String arrival)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("INSERT INTO Flight\n" +
                "VALUES (DEFAULT, %d, %d, %d, '%s', '%s', DEFAULT);",planeID,departAirportID,arriveAirportID,departure,arrival);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static boolean checkFlightExists(int flightID)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return false;

        try {
            CallableStatement cs = connection.prepareCall("{CALL checkFlightExists(?,?)};");
            cs.setInt("fID",flightID);
            cs.registerOutParameter("flightExists", Types.BOOLEAN);
            cs.execute();
            boolean flightExists = cs.getBoolean("flightExists");
            connection.close();
            return flightExists;

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return false;
        }
    }

    public static void updateFlight(int flightID, int planeID, int departAirportID, int arriveAirportID, String departDate, String arriveDate)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("UPDATE Flight\n" +
                "SET planeID = %d, departAirportID = %d, arriveAirportID = %d, departDate = '%s', arriveDate = '%s'\n" +
                "WHERE flightID = %d;",planeID,departAirportID,arriveAirportID,departDate,arriveDate,flightID);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static void deleteFlight(int flightID)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("DELETE FROM Flight\n" +
                "WHERE flightID = %d;",flightID);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static void bookFlight(int fID, int pID, boolean firstClass)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("INSERT INTO Passenger\n" +
                "VALUES (%d, %d, %b);",fID,pID,firstClass);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static void cancelFlight(int flightID, int pID)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        String query = String.format("DELETE FROM Passenger\n" +
                "WHERE flightID = %d AND pID = %d;",flightID, pID);

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
        }
    }

    public static ArrayList<Septet<String,String,String,String,String,String,String>> viewAllFlightsFromDay(String date)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<Septet<String,String,String,String,String,String,String>> flights = new ArrayList<>();

        String query = String.format("SELECT\n" +
                "\tflightID,\n" +
                "\tplaneID,\n" +
                "    A1.name AS 'From', \n" +
                "    A2.name AS 'To',\n" +
                "    departDate,\n" +
                "    arriveDate,\n" +
                "    totalPassengers\n" +
                "FROM\n" +
                "\tFlight, Airport A1, Airport A2\n" +
                "WHERE\n" +
                "\tFlight.departAirportID = A1.idAirport AND\n" +
                "    Flight.arriveAirportID = A2.idAirport AND\n" +
                "    departDate > '%s';",date);

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next())
            {
                String fID = Integer.toString(rs.getInt("flightID"));
                String pID = Integer.toString(rs.getInt("planeID"));
                String from = rs.getString("From");
                String to = rs.getString("To");
                String departDate = rs.getString("departDate");
                String arriveDate = rs.getString("arriveDate");
                String totalPass = Integer.toString(rs.getInt("totalPassengers"));
                flights.add(Septet.with(fID,pID,from,to,departDate,arriveDate,totalPass));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }

        return flights;
    }

    public static boolean checkPlaneExists(int planeID)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return false;

        try {
            CallableStatement cs = connection.prepareCall("{CALL checkPlaneExists(?,?)};");
            cs.setInt("pID",planeID);
            cs.registerOutParameter("planeExists", Types.BOOLEAN);
            cs.execute();
            boolean planeExists = cs.getBoolean("planeExists");
            connection.close();
            return planeExists;

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return false;
        }
    }

    public static boolean checkAirportExists(int airportID)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return false;

        try {
            CallableStatement cs = connection.prepareCall("{CALL checkAirportExists(?,?)};");
            cs.setInt("aID",airportID);
            cs.registerOutParameter("airportExists", Types.BOOLEAN);
            cs.execute();
            boolean planeExists = cs.getBoolean("airportExists");
            connection.close();
            return planeExists;

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return false;
        }
    }

    public static void archiveFlights(String date)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return;

        try {
            CallableStatement cs = connection.prepareCall("{CALL archiveFlights(?)};");
            cs.setDate("cutoff", java.sql.Date.valueOf(date));
            cs.execute();
            connection.close();

        } catch (Exception e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return;
        }
    }

    public static ArrayList<Quartet<String,String,String,String>> viewAirportLocations()
    {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<Quartet<String,String,String,String>> airports = new ArrayList<>();

        String query = "SELECT A.idAirport, A.name, loc.city, loc.country\n" +
                "FROM Airport A, Locations loc\n" +
                "WHERE A.locID = loc.locID;";

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next())
            {
                String aID = rs.getString("idAirport");
                String name = rs.getString("name");
                String city = rs.getString("city");
                String country = rs.getString("country");
                airports.add(Quartet.with(aID,name,city,country));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }

        return airports;
    }

    public static ArrayList<Septet<String,String,String,String,String,String,String>> viewAllFlightsFromToday()
    {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<Septet<String,String,String,String,String,String,String>> flights = new ArrayList<>();

        String query = "SELECT\n" +
                "\tflightID,\n" +
                "    Flight.planeID,\n" +
                "    A1.name AS 'From',\n" +
                "    A2.name AS 'To',\n" +
                "    departDate,\n" +
                "    arriveDate,\n" +
                "    M.capacity - totalPassengers AS 'SeatsLeft'\n" +
                "FROM Flight, Airport A1, Airport A2, Plane P, PlaneModel M\n" +
                "WHERE\n" +
                "\tFlight.departAirportID = A1.idAirport AND\n" +
                "    Flight.arriveAirportID = A2.idAirport AND\n" +
                "    Flight.planeID = P.planeID AND\n" +
                "    P.idModel = M.idModel AND\n" +
                "    departDate >= curdate();";

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next())
            {
                String fID = Integer.toString(rs.getInt("flightID"));
                String pID = Integer.toString(rs.getInt("planeID"));
                String from = rs.getString("From");
                String to = rs.getString("To");
                String departDate = rs.getString("departDate");
                String arriveDate = rs.getString("arriveDate");
                String seatsLeft = Integer.toString(rs.getInt("SeatsLeft"));
                flights.add(Septet.with(fID,pID,from,to,departDate,arriveDate,seatsLeft));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }

        return flights;
    }

    public static ArrayList<Septet<String,String,String,String,String,String,String>> viewAllFlightFromAirline(String airline) {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<Septet<String, String, String, String, String, String, String>> flights = new ArrayList<>();

        String query = String.format("SELECT\n" +
                "\tflightID,\n" +
                "    Flight.planeID,\n" +
                "    A1.name AS 'From',\n" +
                "    A2.name AS 'To',\n" +
                "    departDate,\n" +
                "    arriveDate,\n" +
                "    totalPassengers\n" +
                "FROM Flight, Airport A1, Airport A2, Plane P, Airline AR\n" +
                "WHERE\n" +
                "\tFlight.departAirportID = A1.idAirport AND\n" +
                "    Flight.arriveAirportID = A2.idAirport AND\n" +
                "\tFlight.planeID = P.planeID AND\n" +
                "    P.idAirline = AR.idAirline AND\n" +
                "    AR.name = '%s';", airline);

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                String fID = Integer.toString(rs.getInt("flightID"));
                String pID = Integer.toString(rs.getInt("planeID"));
                String from = rs.getString("From");
                String to = rs.getString("To");
                String departDate = rs.getString("departDate");
                String arriveDate = rs.getString("arriveDate");
                String totalPass = Integer.toString(rs.getInt("totalPassengers"));
                flights.add(Septet.with(fID, pID, from, to, departDate, arriveDate, totalPass));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        return flights;
    }

    public static ArrayList<String> viewAllAirlines()
    {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<String> airlines = new ArrayList<>();

        String query = "SELECT name FROM Airline;";

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                String name = rs.getString("name");
                airlines.add(name);
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        return airlines;
    }

    public static ArrayList<Sextet<String,String,String,String,String,String>> viewAllCustomersInFlight(int flightID)
    {
        Connection connection = dbConnection();
        if (connection == null)
            return null;

        ArrayList<Sextet<String,String,String,String,String,String>> customers = new ArrayList<>();

        String query = String.format("SELECT *\n" +
                "FROM Person\n" +
                "WHERE pID IN (\n" +
                "\tSELECT pID\n" +
                "    FROM Passenger\n" +
                "    WHERE flightID = %d\n" +
                ");", flightID);

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                String id = rs.getString("pID");
                String first = rs.getString("pFirst");
                String last = rs.getString("pLast");
                String age = Integer.toString(rs.getInt("pAge"));
                String phoneNum = rs.getString("phoneNum");
                String email = rs.getString("email");
                customers.add(Sextet.with(id,first,last,age,phoneNum,email));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        return customers;
    }

    public static void main(String[] args)
    {
        /*String date = "2000-01-01";
        System.out.println("Here are the flights starting from " + date);
        ArrayList<Septet<String,String,String,String,String,String,String>> flights = viewAllFlightsFromDay(date);
        for(Septet<String,String,String,String,String,String,String> flight : flights)
        {
            String fID = flight.getValue0();
            String pID = flight.getValue1();
            String from = flight.getValue2();
            String to = flight.getValue3();
            String depart = flight.getValue4();
            String arrive = flight.getValue5();
            String totalPass =flight.getValue6();
            String row = String.format("fID: %s, pID: %s, From: %s, To: %s, Depart: %s, Arrive: %s, Total Passengers: %s",fID,pID,from,to,depart,arrive,totalPass);
            System.out.println(row);
        }*/

        /*System.out.println("Here are all the airports and their locations!");
        ArrayList<Quartet<String,String,String,String>> airports = viewAirportLocations();
        for(Quartet<String,String,String,String> airport : airports)
        {
            String id = airport.getValue0();
            String name = airport.getValue1();
            String city = airport.getValue2();
            String country = airport.getValue3();
            String row = String.format("ID: %s, name: %s, city: %s, country: %s",id,name,city,country);
            System.out.println(row);
        }*/

        /*System.out.println("Here are the flights starting from today");
        ArrayList<Septet<String,String,String,String,String,String,String>> flights = viewAllFlightsFromToday();
        for(Septet<String,String,String,String,String,String,String> flight : flights)
        {
            String fID = flight.getValue0();
            String pID = flight.getValue1();
            String from = flight.getValue2();
            String to = flight.getValue3();
            String depart = flight.getValue4();
            String arrive = flight.getValue5();
            String seatsLeft  =flight.getValue6();
            String row = String.format("fID: %s, pID: %s, From: %s, To: %s, Depart: %s, Arrive: %s, Seats Left: %s",fID,pID,from,to,depart,arrive,seatsLeft);
            System.out.println(row);
        }*/

        /*String airline = "Frontier";
        System.out.println("Here are the flights from " + airline + " airlines:");
        ArrayList<Septet<String,String,String,String,String,String,String>> flights = viewAllFlightFromAirline(airline);
        for(Septet<String,String,String,String,String,String,String> flight : flights)
        {
            String fID = flight.getValue0();
            String pID = flight.getValue1();
            String from = flight.getValue2();
            String to = flight.getValue3();
            String depart = flight.getValue4();
            String arrive = flight.getValue5();
            String totalPass =flight.getValue6();
            String row = String.format("fID: %s, pID: %s, From: %s, To: %s, Depart: %s, Arrive: %s, Total Passengers: %s",fID,pID,from,to,depart,arrive,totalPass);
            System.out.println(row);
        }*/

        /*
        System.out.println("Here are all the airlines:");
        ArrayList<String> airlines = viewAllAirlines();
        for (String name : airlines)
            System.out.println(name);*/

        int flightID = 1033;
        System.out.println("Here is everyone from flight:  " + flightID);
        ArrayList<Sextet<String,String,String,String,String,String>> people = viewAllCustomersInFlight(flightID);
        for(Sextet<String,String,String,String,String,String> person : people)
        {
            String pID = person.getValue0();
            String first = person.getValue1();
            String last = person.getValue2();
            String age = person.getValue3();
            String phone = person.getValue4();
            String email = person.getValue5();
            String row = String.format("ID: %s, First: %s, Last: %s, Age: %s, Phone: %s, Email: %s",pID,first,last,age,phone,email);
            System.out.println(row);
        }

    }
}
