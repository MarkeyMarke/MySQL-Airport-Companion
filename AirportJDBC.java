import java.sql.*;

import com.sun.org.apache.xpath.internal.operations.Bool;
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

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return null;
        }

        return persons;
    }

    public static boolean checkCustomerExists(int id)
    {
        ResultSet rs = null;
        Connection connection = dbConnection();
        if (connection == null)
            return false;

        try {
            CallableStatement cs = connection.prepareCall("{CALL checkPersonExists(?,?)};");
            cs.setInt("personID",id);
            cs.registerOutParameter("personExists", Types.BOOLEAN);
            boolean hasResult = cs.execute();
            return cs.getBoolean("personExists");

        } catch (SQLException e) {
            System.out.println("Query Failed! Check output console");
            e.printStackTrace();
            return false;
        }
    }
}
