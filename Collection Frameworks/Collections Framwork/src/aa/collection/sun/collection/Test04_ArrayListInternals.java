package aa.collection.sun.collection;

import java.util.ArrayList;

public class Test04_ArrayListInternals
{
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
// #1.operation adding element in collection 
		
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('p');
		al.add(true);
		al.add(null);
		al.add(new Ex(5,6));
		al.add(new Sa(6,7));
		al.add("a");
		al.add(5);
	
// #2.counting the object to in collection 
		System.out.println(al.size());
		
// #3.printing the objeject	
		System.out.println(al);
		System.out.println();
		
// #4.searching for object  .finding object is comparison with equals() method
		
		System.out.println(al.contains("a")); // "a".equals("a") data comparison
		System.out.println(al.contains(new String("a")));  // "a" first check in scpa is available or not 
		                                      // and equals methosd is overriden in 
		                                      // String & wraper class so "Data Comparison";
		
		System.out.println(al.contains(5)); // Integer bez all element are aun Integer class
		                                 // ((Integer)5).equals("a") ->Flase
		                                 // ((Integer)5).equals("b") ->Flase
		                                 // ((Integer)5).equals(5) -> true
		
		System.out.println(al.contains(new Integer(5))); // data comprison
 		                                 
		System.out.println(al.contains(new Ex(5,6))); // referanse comparison
		                               //(new Example(5,6).equals("ele:"+"a")-->false
		                               //(new Example(5,6).equals("ele:"+"b")-->false
		                               //(new Example(5,6).equals("ele:"+5)-->false
		                               //(new Example(5,6).equals("ele:"+6.7)-->false
		                               //(new Example(5,6).equals("ele:"+'p')-->false
		                               //(new Example(5,6).equals("ele:"+true)-->false
		                               //(new Example(5,6).equals("ele:"+null)-->false
		                               //(new Example(5,6).equals("ele:"+Ex(5,6)-->false
		                               //(new Example(5,6).equals("ele:"+new Sa(5,6)-->false
		                               //(new Example(5,6).equals("ele:"+"a")-->false
		                               //(new Example(5,6).equals("ele:"+5)-->false
		
		System.out.print(al.contains(new Sa(6,7)));// equals method Overriden-->true 
		                               
		System.out.println("\n"+al.contains(null)); // comparios == oper !equals()
		System.out.println();
		
//	#5.searching object with index number // searching and getting index number 
		
		System.out.println(al.indexOf("a")); //0
		System.out.println(al.indexOf("A")); //-1
		System.out.println(al.indexOf(new String("a"))); // comparioson with data internl call ewuals ()
		
		System.out.println(al.indexOf("b"));
		System.out.println();
		
		System.out.println(al.indexOf(5));
		System.out.println(al.indexOf((Integer)5));
		
		System.out.println(al.indexOf(null));
		System.out.println(al.indexOf(new Ex(5,6))); // data comparioson not equals() in example class
		
		System.out.println(al.indexOf(new Sa(6,7)));
		System.out.println();
		
		System.out.println(al.lastIndexOf("a"));
		System.out.println(al.lastIndexOf(5));
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.indexOf(new Ex(5,6)));
		System.out.println(al.indexOf(new Sa(6,7)));
		System.out.println(al.indexOf("A"));
		System.out.println();
		
//  #6.retrieving object from given index (>0 && size() )
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(5));
//		System.out.println(al.get(-1));
		System.out.println(al.get(10));
//		System.out.println(al.get(11));
		System.out.println();
		
//		String s = al.get(0);   can get() method to direct ano assingn
//		                        get() method return type is Object
		
		Object obj = al.get(0);
		System.out.println(obj);
//		System.out.println(obj.toUpperCase()); // searching in Object class 
//		                                       toUpperCase() is available in String class
		
		
		if(obj instanceof String s1) { // java 14v features
		System.out.println(s1.toUpperCase());
		}
		
//		for(int i=0; i<=al.size(); i++) {
//		   for(int i=0; i<=al.size()-1; i++) {
		    for(int i=0; i<al.size(); i++) {
			 System.out.print(al.get(i)+" ");
		}
		 System.out.println();
		 
		 Sa s2 = (Sa)al.get(8);  // static way
		 System.out.println(s2);
		 
		 int index = al.indexOf(new Sa(7,7));
		 if(index>=0) {
			 Sa s3 = (Sa)al.get(index);
			 System.out.println(s3.getX()+" "+s3.getY());
			 s3.setX(s3.getX()+10);
			 s3.setY(s3.getY()+10);
			 System.out.println(s3);
		 }
		 
		 System.out.println(al);
		 System.out.println();
		 
//	#7.removing of object hiven index
		 
		 System.out.println(al.remove("a"));
		 System.out.println(al);
		 System.out.println(al.remove("B")); // euals method ovveriden-->false
		 System.out.println(al);
		 System.out.println(al.remove(new String("a")));
		 System.out.println(al);
		 
		 System.out.println(al.remove(5));
		 System.out.println(al);
		 
		 System.out.println(al.remove((Integer)5));
		 System.out.println(al);
		 
//		 System.out.println(al.remove('p')); IOOBE cahracter convert into integer
		 System.out.println(al.remove((Character)'p'));
		 System.out.println(al);
		 
		 System.out.println(al.remove(6.7));
		 System.out.println(al);
		 
		 System.out.println(al.remove(new Ex(5,6)));  // searching bagground equals method
		 System.out.println(al);
		 
		 System.out.println(al.remove(new Sa(6,7)));
		 System.out.println(al);
		 System.out.println(al.remove(new Sa(16,17)));
		 System.out.println(al);
		 
		 
		ArrayList<Object> al2 = new ArrayList<>();
		
		al2.add("a");
		al2.add(1);
		al2.add("b");
		al2.add(2);
		al2.add("c");
		al2.add(3);
		
		System.out.println(al2.remove(2));
//		System.out.println(al2);
		
		System.out.println(al2);
		
		for(int i=0; i<al2.size(); i++) {
			Object ele =al2.get(i);
			 al2.remove(ele);
			 i--;
			 System.out.println(ele);
		}
		System.out.println();
		
	   ArrayList<Object> al3 = new ArrayList<>();
	   
	   for(int i1=1; i1<=10; i1++) {
		   al3.add(i1*10);
	   }
	   System.out.println(al3);
	   al3.remove(1);
	   al3.remove(2);
	   System.out.println(al3);
	   
	   System.out.println(al3.add(4));
	   
	   al3.add(5,"x");
	   System.out.println(al3);
	   
	   System.out.println(al3.set(3, "i"));
	   System.out.println(al3);
		
  }
}
