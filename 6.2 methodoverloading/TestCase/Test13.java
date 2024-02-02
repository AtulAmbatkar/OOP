class A13
{
   void m1(int f) {
          System.out.println("A int-arg");
   } 
      void m1(char i) {
           System.out.println("A char-arg");
      }
}

  class B13 extends A13 {

      void m1(float i) {
           System.out.println("B float-arg");
      }

      void m1(char i) {
           System.out.println("B char-arg");
      }
}

  class Test13 {

      public static void main(String [] args) {
 
            B13 b = new B13();

                   b.m1(50);
                   b.m1('a');
                   b.m1(50L);

          A13 a = new A13();
          System.out.println();
                  a.m1(50);
                  a.m1('a');
                 // a.m1(50L);  //PLC
    }
}