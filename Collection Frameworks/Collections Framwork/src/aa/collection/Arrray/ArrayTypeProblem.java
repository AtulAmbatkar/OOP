package aa.collection.Arrray;

public class ArrayTypeProblem {

	public static void main(String[] args) {
		
		int[] ia = new int[10];
		
		ia[0] =10;
		ia[0] ='a';
//		ia[0] =10L;
//		ia[0] =10.5;
//		ia[1] = true;
//		ia[0] = "hi";
		
		double[] d = new double[10];
		
		d[0] = 10.5;
		d[0] = 10L;
		d[0] = 10.5f;
		d[0] = 10;
		d[0] = 'b';
//		d[0] = true;
//		d[0] = "ytri";
		
		Student[] sa = new Student[10];
		
		sa[0] = new Student(5,6);
		sa[1] = new Student(5,6);
//		sa[1] = new Person();
//		sa[1] = new Faculty();
		
		Person[] pa = new Person[10];
		
		pa[0] = new Faculty();
		pa[0] = new Admin();
//		pa[1] = new Lion();
		
		Lion[] li = new Lion[10];
		
		li[0] = new Lion();
//		li[0] = new Animal();
//		li[0] = new Tiger();
		
		Animal[] an = new Animal[10];
		
		an[0] = new Animal();
		an[0] = new Lion();
		an[0] = new Tiger();
//		an[0] = new Student();
//		an[0] = new Person();
		
		
		Object[] obj = new Object[10];
		
		obj[0] = 5;
		obj[0] = 5.5;
		obj[0] = 5f;
		obj[0] = true;
		obj[0] = "dhf";
		obj[0] = new Student(5,6);
		obj[0] = new Lion();
		obj[0] = new Animal();
		obj[0] = new Person();

		
	}
	  
};
