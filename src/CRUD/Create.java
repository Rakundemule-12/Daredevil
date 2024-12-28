package CRUD;

import java.sql.*;

public class Create {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nydb", "root", "root");
            System.out.println(con);

            Statement statement = con.createStatement();

            // Step 4: Execute a query
            String query = "SELECT * FROM employee";
            ResultSet resultSet = statement.executeQuery(query);

            // Step 5: Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                float salary = resultSet.getFloat("salary");
                String address = resultSet.getString("address");
                System.out.println("ID: " + id + ", Name: " + name + "," +
                        "Age: "+age+", Salary: " + salary+",Address: "+address);
            }

            // Step 6: Close the connection
            resultSet.close();
            statement.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
