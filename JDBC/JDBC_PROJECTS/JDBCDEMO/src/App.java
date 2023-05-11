import java.sql.*;
public class App{
    public static void main(String args[]) {
        try {


            ///1 . Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Open the JDBC connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

                System.out.println("connection created");


            conn.close();
            System.out.println("Connection closed");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}