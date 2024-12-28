package CRUD;
import java.sql.*;
import java.sql.PreparedStatement;

public class Delete_Record {
    public static void main(String[] args) {
        try {
            // Step 1: Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nydb", "root", "root");
            System.out.println("Connection established: " + con);

            // Step 2: Prepare the DELETE query with placeholders
            String query = "DELETE FROM employee WHERE id = ?";

            // Step 3: Use PreparedStatement
            PreparedStatement preparedStatement = con.prepareStatement(query);

            // Step 4: Set the value for the placeholder
            preparedStatement.setInt(1, 1); // Replace 1 with the ID of the employee you want to delete

            // Step 5: Execute the DELETE query
            int rowsAffected = preparedStatement.executeUpdate(); // Use executeUpdate for non-SELECT queries
            System.out.println("Rows deleted: " + rowsAffected);

            // Step 6: Close the resources
            preparedStatement.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
