import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost/mydb";
            String username = "user";
            String password = "password";
            conn = DriverManager.getConnection(url, username, password);

            // Create a statement object
            stmt = conn.createStatement();

            // Execute the SQL query
            String sql = "SELECT * FROM users WHERE age > 30";
            rs = stmt.executeQuery(sql);

            // Process the results of the query
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the ResultSet, Statement, and Connection objects
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
