package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetData {
	
 //public static void main(String[] args) throws ClassNotFoundException {
	
	/**
	 * 
	 * @param couponNum
	 * @param name
	 * @param phoneNum
	 * @throws ClassNotFoundException
	 */
	public String execute (String name, String telNo) throws ClassNotFoundException {
		int code = 99;
		String abc = "";
		getData(name, telNo);
		
		return abc;
	}
	
	
	/**
	 * 쿠폰번호 및 정보 insert
	 * 
	 * @param name
	 * @param telNo
	 * @param phoneNum
	 * @return 쿠폰번호
	 * @throws ClassNotFoundException
	 */
	public String[] getData(String name, String telNo) throws ClassNotFoundException {
		String[] result = new String[5];
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // set timeout 30 sec.
			ResultSet resultSet = statement.executeQuery("SELECT * FROM COUPON WHERE NAME = "+name+" and PHONE_NUM = "+telNo);
			
			System.out.println("GetData.getData()");
		    System.out.println(resultSet);
		      
		    while(resultSet.next()){
		    	// iterate & read the result set
		        System.out.println("COUPHON_NUM = " + resultSet.getString("COUPON_NUM"));
		        System.out.println("NAME = " + resultSet.getString("NAME"));
		        System.out.println("PHONE_NUM = " + resultSet.getString("PHONE_NUM"));
		        System.out.println("CREATE_YM = " + resultSet.getString("CREATE_YM"));
		        System.out.println("USE_YN = " + resultSet.getString("USE_YN"));
		        //System.out.println("NAME = " + resultSet.getString("NAME"));
		          
		        result[0] = resultSet.getString("COUPON_NUM");
		        result[1] = resultSet.getString("NAME");
		        result[2] = resultSet.getString("PHONE_NUM");
		        result[3] = resultSet.getString("CREATE_YM");
		        result[4] = resultSet.getString("USE_YN");
		    }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		     
		
		return result;
	}
         
}