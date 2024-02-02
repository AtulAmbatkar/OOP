class Example2 {

   void testProcess() {
       System.out.println("Example method");
     }
 }

 class Sample2 extends Example2 {

      @O‎verride
     void testprocess() {
         System.out.println("Sample method");
    }
}

  class Test6 {

     public static void main(String [ ] args) {

        Example2 e1 = new Example2();
        e1.testProcess();
    }
 }