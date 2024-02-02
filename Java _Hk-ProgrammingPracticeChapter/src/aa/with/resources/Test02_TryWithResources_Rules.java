package aa.with.resources;
import java.beans.Statement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Test02_TryWithResources_Rules {
	
	// private static final String PrintStream = null;

	public static void main(String[]args) throws Exception, IOException  {
		

	//#1.resource's variable and object must be 
	// Autocloseble type else ce:
		
		// try(PrintStream ps = new PrintStream(System.out)){
		//	ps.println("hello"); }
		// ps bloct not required check exception 	
		// bcz ps close() metode PrintSteam in not throws IOException 
		
		// try(String s = "hi"){  ce:i.c.t
		//try(Object obj = new PrintStream(System.out)){ // does not implement ce:i.c.t
		 
		// try(AutoCloseable ae = new PrintStream(System.out)){ }  //not ce but ioException is required
				
	//#2.if resource's close() method throwing checked exception by handle it
	// using catch block or main method decleration(or reporthing in main method).
		try(FileOutputStream fos = new FileOutputStream("a.txt")){ }
			catch(FileNotFoundException e) { }
		//	catch(IOException e) { }
		// here FileNotFoundException throws construcuctor
	   // FileOutputStream throws IOException
		
	//#3.we canot jus decleare the veriable in try block
		// it must be intialised by using object or method()call or atleast null;
		// that returns Autocloseable object
		
		//try(PrintStream ps){ 
		//	System.out.println("ps try 1"); } // ce:= veriable initializer
		
		/*try(PrintStream ps = null){
			System.out.println("in ps try2");
		}
		try (PrintStream ps = new PrintStream(System.out)){
			System.out.println("in ps try3");
		} */
		
	 //#4.also we not create object withour veriable
		// else get ce:
		// try(new PrintStream(System.out)){ }
	    // for calling close() compiler required above object 
		
	//#5.we canot assigning new object/null inside try  block
		// resource's object must final or efectivelly final
		// will get ce : bez original object cannot close() at end of try 
		// ref.vaar is pointing other null or object 
		
		try (PrintStream ps = new PrintStream(System.out)) {
		//	ps = null;
		//	ps = new PrintStream("bbc.txt");
		}
		
	//#6.by declearing object before try we can not assigninig int try unward 8v.
		// try-with-resource's resource mut be declare inside try block
		
		// PrintStream ps;
		// try(ps= new PrintStream("aab.txt")){ }  
		
	//#7.we can not use veriable decleared  before try-with-resource's 
		// ce: 
		
		PrintStream ps5 = new PrintStream("bea.txt");
		// try(ps5) { } veriable resource is not avialable upto 8 v. but 9 v is allowed
		 
		// but if you want use  before try-with-resource object creation 
		// then used local variable that assigning object then try local 
		FileOutputStream fos1 = new FileOutputStream("ffh.txt");
		try(FileOutputStream fos2 = fos1){ } // 8v style
		
        FileOutputStream fos3 = new FileOutputStream("abc.txt");
      //  try(fos3) {  
      //   fos3.write('a'); } here not allowed but upto 8 vbut allowed 9v onwrds
        
    //#8.we can not use local veriable after try block will not grt ce:
        // but runtime error IOException 
        
         //   fos1.write('c');  runtime error IOException 
         //   fos2.write('a'); // fillnotfoundexception or ioexception
         //  fos3.write('b');  // here also IOE but this orsion is 8v,9v unward
        
   //#9.inside try if we want to multiple resources use(;) to sepreate them  not (,)
        	
		try(PrintStream ps = new PrintStream(System.out)){} 
		
		try (FileOutputStream fos4 = new FileOutputStream("df.txt");){ }
		
		try (
				FileOutputStream fos5 = new FileOutputStream("hh.txt") ;
				FileOutputStream fos6 = new FileOutputStream("jj.txt");
				FileOutputStream fos7 = new FileOutputStream("hj.txt")
			){
		}
	//#10.in try() we cannot place logic else complier throw error 
		// only try{ } block logic is allowed 
		
		// in try() only AutoCloseable type veriable decleariation or intializer
		// we can initialize resource variable with either new key,constructor 
		// calling method() or with null;
		
		try (PrintStream ps = new PrintStream(System.out);
			  //	ps.println("hi");
				
			FileOutputStream fos8 = new FileOutputStream("hj.txt");
			// int a = fos8.read();
			//	fos8.write('n');
				
			Connection con = DriverManager.getConnection(null,null,null);
		    java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("");
		     
		    //  boolean bo = rs.next();
		  )
		{
			ps.println("hi kk");
			rs.next();
			
		 }
		}
		
  }

