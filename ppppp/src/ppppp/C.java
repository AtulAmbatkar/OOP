package ppppp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class C {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:orcl","system","atul");
			
		    Statement smt= (Statement) con.createStatement();
		   smt.executeUpdate("create table yh(sbno Number(4),sbname Varchar2(10))");
		    
		    
		    System.out.println("Table is cretaed successfully");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}