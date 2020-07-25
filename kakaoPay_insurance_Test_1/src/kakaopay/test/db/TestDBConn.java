package kakaopay.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDBConn {
	
 public static void main(String[] args) throws ClassNotFoundException {
	 
   // load the sqlite-JDBC driver using the current class loader
   Class.forName("org.sqlite.JDBC");

   Connection connection = null;
   
   try {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.

/*
      statement.executeUpdate("DROP TABLE IF EXISTS master");
      statement.executeUpdate("CREATE TABLE COUPHONE22 (COUPHON_NUM STRING, NAME STRING, PHONE_NUM STRING, CREATE_YM STRING, USE_YN STRING)");

      
      String couphonNum = "1234567890";
      String name = "테스트";
      String phoneName = "01099999999";
      String createYm = "2018-09-09 12:33:33";
      String useYn = "n";
      
      statement.executeUpdate("INSERT INTO COUPHONE22 values(' "+couphonNum+"', '"+name+"', '"+phoneName+"', '"+createYm+"', '"+useYn+"')");   */
      
//      int ids [] = {1,2,3,4,5};
//      String names [] = {"1234567890","테스트","01099999999", "2018-09-09 12:33:33", "N"};

//      for(int i=0;i<ids.length;i++){
//           statement.executeUpdate("INSERT INTO COUPHONE values(' "+ids[i]+"', '"+names[i]+"')");   
//      }

   //   statement.executeUpdate("UPDATE person SET name='Peter' WHERE id='1'");
   //   statement.executeUpdate("DELETE FROM person WHERE id='1'");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM COUPHONE22");
        
        while(resultSet.next()){
           // iterate & read the result set
           System.out.println("COUPHON_NUM = " + resultSet.getString("COUPHON_NUM"));
           System.out.println("NAME = " + resultSet.getString("NAME"));
        }
        
	  } catch(SQLException e){  
		  System.err.println(e.getMessage()); 
	         
	  } finally {
		  try {
			  if(connection != null) {
				  connection.close();
	          }
	      } catch(SQLException e) {  // Use SQLException class instead.          
	            System.err.println(e); 
	      }
	  }
 	}
         
}