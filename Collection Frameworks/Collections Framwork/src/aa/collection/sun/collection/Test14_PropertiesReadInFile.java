package aa.collection.sun.collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test14_PropertiesReadInFile {
	public static void main(String[] args) throws IOException  {
		
		
		Properties p = new Properties();
		
		p.load(new FileReader("studnt.properties"));
		System.out.println(p);
		
		String sno = p.getProperty("Sname");
		System.out.println(sno);
		
		String id = p.getProperty("id");
		System.out.println(id);
		
		String course = p.getProperty("course");
		System.out.println(course);
		
		p.setProperty("fees","2500");
		System.out.println(p);
	}

}

