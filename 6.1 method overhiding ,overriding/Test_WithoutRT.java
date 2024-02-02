class Persone{
 
      String name = "hk";
}

 class Student extends Persone {

   String baranch = "Java";
  }

 class Facultey extends Persone {
   
      double sal = 10000;
 }

 class Collage {
 
   Persone getPersone(){
      return new Persone();
   }
}

  class Exam extends Collage{

     Persone getPersone() {
       return new Student();
      }
   }

class Test_WithoutRT {

   public static void main(String [ ] args ) {

       Exam e = new Exam();
      //  Student s = e.getPersone();
     //      System.out.println(s);          incompaible type persone can not be converted to student type

       Persone p = e.getPersone();
        System.out.println(p.name);
      //   System.out.println(p.baranch);   cannot find symbol bec p pointing Persone class only

       if(p instanceof Student){
      Student s1 = (Student)p;
       System.out.println(s1.baranch);  // 3. parblome this access bcz CCE when pass Faculty object 5ttgbv
     }
  }
}