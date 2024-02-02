class A {

   static void m1() {
      System.out.println("\nA m1");
   }

   void m2() {
       System.out.println("A m2");
        m1();
   }
}

   class B extends A {

       static void m1(){
          System.out.println("B m1");
       }

      public static void main(String [ ] args){
     
            B b1 = new B();
                b1.m1(); 
                b1.m2();
 
           A a1 = new B();
               a1.m1();
               a1.m2();

       }
}