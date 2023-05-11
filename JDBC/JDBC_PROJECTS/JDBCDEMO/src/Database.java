import java.sql.*;

public class Database{
    public static void main(String args[]) {
        try {
            //1.Register the 
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.Open the connection 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "");
            
            System.out.println("Connection successfull");

            //Creating statement
            Statement stmt = conn.createStatement();
            //
        
            //   String sql = "CREATE TABLE STUDENTS(ID INTEGER PRIMARY KEY,NAME VARCHAR(255) NOT NULL, ROLL INT)";
          
            // stmt.executeUpdate(sql);


            //2. Insert data
            // String sql = "INSERT INTO STUDENTS VALUES(11,'DAVID',25)";
            // stmt.executeUpdate(sql);

            String sql = "SELECT * FROM STUDENTS";
            ResultSet  rs = stmt.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString("NAME");
                int id = rs.getInt("ID");
                System.out.println("Name and ID "+ id +" "+name);
            }

            System.out.println("update successfull");

            conn.close();
             

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        


        
    }
}