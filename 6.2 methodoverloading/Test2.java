class Example2 {

     void add(int a,int b) {
          System.out.println("Exmple int,int: ");
      }
 
     void add(String s, float f) {
        System.out.println("Exmple String,float");
    }
  
   int add(String s1,String s2) {
         System.out.println("Example String,String");
         return 10;
   }
}

 class Sample2 extends Example2 {

   void add(int a,int b) {
       System.out.println("Sample int,int");
   } 

  float add(float a,int b) {
        System.out.println("Sample float,int");
        return a+b;
   }

   String add(String s1,double d) {
       System.out.println("Sample String,double");
       return s1+d;
   }
}

  class Test2 {

      public static void main(String [ ] args) {
          Sample2 s1 = new Sample2();
  
          s1.add(10,20);
          s1.add("abc",20);
          s1.add("abc","xyz");
          s1.add("10",20.0);
       //   s1.add(10,20.0f);         no suitable method found for add(int,float)
    }
}
  