	
	package ppppp;
	
	import java.util.*;
	

	import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
	import java.sql.DriverManager;
    import java.sql.PreparedStatement;


	public class I {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","atul");
				
				
				 while(true)
				    {
				
			    PreparedStatement psmt=(PreparedStatement)con.prepareStatement("INSERT INTO YH VALUES(?,?)");
			    
			   
			    System.out.println("Enter Name : ");
			    String name=br.readLine();
			    System.out.println("Eneter no : ");
			    int id=Integer.parseInt(br.readLine());
			    
			    psmt.setString(2, name);
			    psmt.setInt(1, id);
			    
			    
			    
			    int cnt=psmt.executeUpdate();
			    
			    if(cnt>0)
			    {
			    	System.out.println("RECORD IS INSERTED IN TABLE "+cnt);
			    }
			    
			    System.out.println("DO YOU WANT TO MORE RECORD iNSERTED [YES / NO ]");
			    
			    
			    String ch=br.readLine();
			   
			    if(ch.equalsIgnoreCase("no")) break;
			    
			    
			    
			    }
			    
				
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}

	}

