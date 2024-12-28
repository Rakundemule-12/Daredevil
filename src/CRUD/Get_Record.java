package CRUD;
import java.sql.*;

public class Get_Record {
    public static void main(String[] args) {
        try {
            // Step 1: Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nydb", "root", "root");
            System.out.println("Connection established: " + con);

            // Step 2: Prepare the query using a placeholder
            String query = "SELECT * FROM employee WHERE name = ?";

            // Step 3: Use PreparedStatement
            PreparedStatement preparedStatement = con.prepareStatement(query);

            // Step 4: Set the value for the placeholder
            preparedStatement.setString(1, "MS DHONI");

            // Step 5: Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 6: Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                float salary = resultSet.getFloat("salary");
                String address = resultSet.getString("address");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age
                        + ", Salary: " + salary + ", Address: " + address);
            }

            // Step 7: Close the resources
            resultSet.close();
            preparedStatement.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
