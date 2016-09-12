package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String user = "root";
		String pass = "awi421";
		
		try{
			System.out.println("Connecting to database");
			Connection mycon = DriverManager.getConnection(jdbcUrl,user,pass);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
