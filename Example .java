import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {
    public static void main(String[] args) {
        // Assuming user provides input for database connection
        String userInput = args[0];

        // Vulnerable code - constructing connection string using user input
        String connectionString = "jdbc:mysql://localhost:3306/" + userInput;

        try {
            // Attempt to establish a connection using the constructed string
            Connection connection = DriverManager.getConnection(connectionString, "username", "password");

            // Execute some SQL query (just an example)
            Statement statement = connection.createStatement();
            // ...

            // Close resources
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
