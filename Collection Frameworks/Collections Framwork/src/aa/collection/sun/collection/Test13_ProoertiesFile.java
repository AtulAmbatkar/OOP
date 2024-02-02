package aa.collection.sun.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Properties;

public class Test13_ProoertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		p.setProperty("Sname","atul");
		p.setProperty("id", "101");
		p.setProperty("institute", "Naresh it Technologies");
		p.setProperty("course","coreJava");
		
		System.out.println(p);
		
		p.store(new FileWriter("studnt.properties"), "student details");
		System.out.println("file stored Successfully");
		
		 System.out.println("File stored successfully at: " + new File("student.properties").getAbsolutePath());
	
	}

}
