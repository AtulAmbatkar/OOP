class A1 {

      private void m1() {
      System.out.println("\nA m1");
      }

   void m2() {
       System.out.println("A m2");
        m1();
   }
}

   class B1 extends A1 {

          void m1(){
          System.out.println("B m1");
       }

      public static void main(String [ ] args){
     
            B1 b1 = new B1();
                b1.m1(); 
                b1.m2();
         
           A1 a1 = new B1();
               //  a1.m1();            private methode not accessed in diffirent class 
                 a1.m2();             // we can access private member in same class that access in non privte method access ..

       }
}