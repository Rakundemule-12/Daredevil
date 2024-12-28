package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Update_Record {
    public static void main(String[] args) {
        try {
            // Step 1: Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nydb", "root", "root");
            System.out.println("Connection established: " + con);

            // Step 2: Prepare the query with placeholders
            String query = "UPDATE employee SET name = ? WHERE id = ?";

            // Step 3: Use PreparedStatement
            PreparedStatement preparedStatement = con.prepareStatement(query);

            // Step 4: Set the values for the placeholders
            preparedStatement.setString(1, "MS DHONI"); // Set the name
            preparedStatement.setInt(2, 1);            // Set the ID

            // Step 5: Execute the update query
            int rowsAffected = preparedStatement.executeUpdate(); // Use executeUpdate for INSERT, UPDATE, DELETE
            System.out.println("Rows affected: " + rowsAffected);

            // Step 6: Close the resources
            preparedStatement.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
