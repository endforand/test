package kakaoPay_insurance_Test_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;



public class KakaoPay_Main {

	
	/**
	 * 난수 생성 기능 구현
	 * @return
	 */
	public void getNumber() {
		int couponSize = 1;

		final char[] possibleCharacters =

				{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F',

						'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',

						'V', 'W', 'X', 'Y', 'Z'};

		final int possibleCharacterCount = possibleCharacters.length;

		String[] arr = new String[couponSize];

		Random rnd = new Random();

		int currentIndex = 0;

		int i = 0;

		while (currentIndex < couponSize) {

			StringBuffer buf = new StringBuffer(18);

			for (i= 18; i > 0; i--) {
				buf.append(possibleCharacters[rnd.nextInt(possibleCharacterCount)]);

			}

			String password = buf.toString();

			System.out.println(password);
			//System.out.println("쿠폰번호 생성 ::  " + password.substring(0, 4) + "-" + password.substring(5,11) + "-" + password.substring(12, 20));

			arr[currentIndex] = password;

			currentIndex++;

		}

	}
	
	
	public void insertDB () {
		// load the sqlite-JDBC driver using the current class loader
		   Class.forName("org.sqlite.JDBC");

		   Connection connection = null;
		   
		   try {
		      // create a database connection
		      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

		      Statement statement = connection.createStatement();
		      statement.setQueryTimeout(30);  // set timeout to 30 sec.


		      statement.executeUpdate("DROP TABLE IF EXISTS person");
		      statement.executeUpdate("CREATE TABLE person (id INTEGER, name STRING)");

		      int ids [] = {1,2,3,4,5};
		      String names [] = {"Peter","Pallar","William","Paul","James Bond"};

		      for(int i=0;i<ids.length;i++){
		           statement.executeUpdate("INSERT INTO person values(' "+ids[i]+"', '"+names[i]+"')");   
		      }

		      statement.executeUpdate("UPDATE person SET name='Peter' WHERE id='1'");
		      statement.executeUpdate("DELETE FROM person WHERE id='1'");

		        ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
		        
		        while(resultSet.next()){
		           // iterate & read the result set
		           System.out.println("name = " + resultSet.getString("name"));
		           System.out.println("id   = " + resultSet.getInt("id"));
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

	
	/**
	 * 난수 생성 기능 구현
	 * @return
	 */
	public void getRunNumber() {
		int couponSize = 1000;

		final char[] possibleCharacters =

				{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F',

						'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',

						'V', 'W', 'X', 'Y', 'Z'};

		final int possibleCharacterCount = possibleCharacters.length;

		String[] arr = new String[couponSize];

		Random rnd = new Random();

		int currentIndex = 0;

		int i = 0;

		while (currentIndex < couponSize) {

			StringBuffer buf = new StringBuffer(20);

			for (i= 19; i > 0; i--) {

				buf.append(possibleCharacters[rnd.nextInt(possibleCharacterCount)]);

			}

			String num = buf.toString();

			System.out.println("쿠폰번호 생성 ::  " + num.substring(0, 4) + "-" + num.substring(5,11) + "-" + num.substring(12, 20));

			arr[currentIndex] = num;

			currentIndex++;

		}

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KakaoPay_Main aaaa = new KakaoPay_Main();
		//aaaa.getRunNumber();
		
		KakaoPay_Main aaaa = new KakaoPay_Main();
		aaaa.getNumber(); //번호 생성 
		//aaaa.getRunNumber();

	}

}
