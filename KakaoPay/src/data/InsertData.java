package data;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class InsertData {
	
 //public static void main(String[] args) throws ClassNotFoundException {
	
	/**
	 * 
	 * @param couponNum
	 * @param name
	 * @param phoneNum
	 * @throws ClassNotFoundException
	 */
	public int execute (String couponNum, String name, String phoneNum) throws ClassNotFoundException {
		int code = 99;
		
		if (99 != createTable()) { // Table생성
			code = 0;
		} else {
			//data insert
			if (99 != dataInsert(couponNum, name, phoneNum)) {
				code = 0;
			}
		}
		
		return code;
	}
	
	
	/**
	 * Create Table
	 * 
	 * @return 정상생성:99 / 이외 오류
	 * @throws ClassNotFoundException
	 */
	public int createTable () throws ClassNotFoundException {
	   int code = 0;
	   
	   Class.forName("org.sqlite.JDBC");
	
	   Connection connection = null;
	   
	   try {
	      // create a database connection
	      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
	
	      Statement statement = connection.createStatement();
	      statement.setQueryTimeout(30);  // set timeout 30 sec.

	      statement.executeUpdate("DROP TABLE IF EXISTS master");
	      statement.executeUpdate("CREATE TABLE COUPON (COUPON_NUM STRING PRIMARY KEY, NAME STRING, PHONE_NUM STRING, CREATE_YM STRING, USE_YN STRING)");
	      connection.commit();
	      connection.close();
	      code = 99;  
      
	  } catch(SQLException e){
		  code = e.getErrorCode();
		 //System.err.println(e.getMessage()); 
	         
	  } finally {
		  try {
			  if(connection != null) {
				  connection.close();
	          }
	      } catch(SQLException e) {  // Use SQLException class instead.   
	    	  code = e.getErrorCode();
	            //System.err.println(e); 
	      }
	  }
	   
	   return code;
 	}
	
	
	/**
	 * 쿠폰번호 및 정보 insert
	 * 
	 * @param couponNum
	 * @param name
	 * @param phoneNum
	 * @return 쿠폰번호
	 * @throws ClassNotFoundException
	 */
	public int dataInsert(String couponNum, String name, String phoneNum) throws ClassNotFoundException {
		int result = 99;
		Class.forName("org.sqlite.JDBC");
		
		   Connection connection = null;
		   
		   try {
		      // create a database connection
		      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
		      Statement statement = connection.createStatement();
		      statement.setQueryTimeout(30);  // set timeout 30 sec.
		      
		      Calendar cal = Calendar.getInstance();
		      SimpleDateFormat sdf = new SimpleDateFormat();
		      String strDate = sdf.format(cal.getTime());
		      ResultSet resultSet = statement.executeQuery("SELECT * FROM COUPON");
		      statement.executeUpdate("INSERT INTO COUPON values(' "+couponNum+"', '"+name+"', '"+phoneNum+"', '"+strDate+"', 'n')");
		      
		      result = 99;  
		      
		      
		       while(resultSet.next()){
		          // iterate & read the result set
		          System.out.println("COUPHON_NUM = " + resultSet.getString("COUPON_NUM"));
		          System.out.println("NAME = " + resultSet.getString("NAME"));
		          System.out.println("PHONE_NUM = " + resultSet.getString("PHONE_NUM"));
		          System.out.println("CREATE_YM = " + resultSet.getString("CREATE_YM"));
		          System.out.println("USE_YN = " + resultSet.getString("USE_YN"));
		          //System.out.println("NAME = " + resultSet.getString("NAME"));
		       }
	      
		  } catch(SQLException e){
			  result = e.getErrorCode();
			 //System.err.println(e.getMessage()); 
		         
		  } finally {
			  try {
				  if(connection != null) {
					  connection.close();
		          }
		      } catch(SQLException e) {  // Use SQLException class instead.   
		    	  result = e.getErrorCode();
		            //System.err.println(e); 
		      }
		  }
		
		return result;
	}
         
}