class A12 
{
   void m1(float f) {
          System.out.println("A float-arg");
   }
}

  class B12 extends A12 {

      void m1(int i) {
           System.out.println("B int-arg");
      }
}

  class Test12 {

      public static void main(String [] args) {
 
            B12 b = new B12();

                   b.m1(50);
                   b.m1('a');
                   b.m1(50L);

          A12 a = new A12();
          System.out.println();
                  a.m1(50);
                  a.m1('a');
                  a.m1(50L);
    }
}