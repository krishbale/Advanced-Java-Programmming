import javax.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Rowset {
        public static void main(String args[])  throws Exception{
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

            Class.forName("com.mysql.cj.jdbc.Driver");

            rowSet.setUrl("jdbc:mysql://localhost:3306/jdbctest");
            rowSet.setUsername("root");
            rowSet.setPassword("");
            rowSet.setCommand("SELECT * FROM STUDENTS");
            rowSet.execute();
            rowSet.last();
                System.out.println("-----Last Row------");
                System.out.print(rowSet.getInt("ID")+rowSet.getString("NAME"));
                rowSet.first();
                System.out.println("-----First Row------");
                System.out.print(rowSet.getInt("ID")+rowSet.getString("NAME"));
            
        }    
}
