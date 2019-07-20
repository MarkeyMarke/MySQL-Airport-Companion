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
}
