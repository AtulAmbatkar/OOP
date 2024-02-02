package aa.collection.serialziable.student;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_WithStudent {
     public static void main(String[] args) {
		
    	 ArrayList<Student> al = new ArrayList<>();
    	 
    	 Student s1 = new Student();
    	 Student s2 = new Student();
    	 Student s3 = new Student();
    	 Student s4 = new Student();
    	 Student s5 = new Student(103,"rushi","oracle",2500);
    	 
    	 Student s6= new Student(101,"Data","html",5000);
    	 Student s7= new Student(103,"j=cja","CJ",4000);
    	 Student s8 = new Student(108,"kaja","Spring",8000);
    	 
    	 s1.setSname("joky");
    	 s1.setSno(101);
    	 s1.setCourse("Adv.java");
    	 s1.setFees(2500);
    	 
    	 s2.setSno(102);
    	 s2.setSname("Rocky");
    	 s2.setCourse("javaScript");
    	 s2.setFees(2500);
    	 
    	 s3.setSno(103);
    	 s3.setSname("Soky");
    	 s3.setCourse("CJ");
    	 s3.setFees(2500);
    	 
    	 s4.setSno(104);
    	 s4.setSname("moky");
    	 s4.setCourse("oracle");
    	 s4.setFees(2500);
    	 
    	 al.add(s1);
    	 al.add(s2);
    	 al.add(s3);
    	 al.add(s4);
    	 al.add(s5);
    	 al.add(s6);
    	 al.add(s7);
    	 al.add(s8);
    	 
    	 System.out.println(al.size());
    	 System.out.println(al);
    	 System.out.println();
    	 
    	System.out.println(al.contains(new Student(103,"CJ")));
    	
    	int index=al.indexOf(new Student(105,"CJ"));
    	System.out.println(index);
    	if(index>=0) {
    		 Student student =al.get(index);
    		System.out.println(student.getSno()+" student paid "+student.getFees()+" amount for "+student.getCourse());
    	}
    	else {
    		System.out.println("this student  is not Found");
    	}
    
    	 
//    	 s3.setCourse("Oracle")
//    	 
//    	 Object obj = al.indexOf(s3);
//    	 System.out.println(obj);
//    	 
//    	 Student s = (Student) al.get((int)obj);
//    	 
//    	 System.out.println(s.getSno());
    	
     }
}
