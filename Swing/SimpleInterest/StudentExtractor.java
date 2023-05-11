import java.sql.*;

public class StudentExtractor {

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
            
            // Create a statement
            Statement stmt = conn.createStatement();
            
            // Execute the query to extract the names of students who live in Kathmandu district
            String sql = "SELECT name FROM students WHERE district='Kathmandu'";
            ResultSet rs = stmt.executeQuery(sql);
            
            // Iterate over the result set and print the names of the students
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }
            
            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database.");
            e.printStackTrace();
        }
    }
}
