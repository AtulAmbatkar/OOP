class A14
{
   void m1(float f) {
          System.out.println("A float-arg");
   }      
}

  class B14 extends A14 {

      void m1(int i) {
           System.out.println("B int-arg");
      }

      void m1(long i) {
           System.out.println("B long-arg");
      }
  
     void m1(float i) {
           System.out.println("A float-arg");
      }
}

  class Test14 {

      public static void main(String [] args) {
 
            B14 b = new B14();

                   b.m1(50);
                   b.m1('a');
                   b.m1(50L);

          A14 a = new A14();
          System.out.println();
                  a.m1(50);
                  a.m1('a');
                 a.m1(50L);  
    }
}