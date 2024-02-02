abstract class Example2 {

      abstract void m1();
   
      static int a = m2();
      static int m2() {
                 System.out.println("Ex class SV:");
                  return 20;
       }

      static {
              System.out.println("Ex class SB:");
      }
 
      static void m3(){
             System.out.println("Ex class sm:");
      }

      public static void main(String [ ] args ) {

            System.out.println("Ex mm");
            System.out.println(a);
            m3();
          //  Example2 e1 = new Example2();
     }
    
       int x = m4();
       int m4() {
           System.out.println("Ex Nsv:");
            return 20;
       }
      
       {
         System.out.println("Nsb");
       }
 
      Example2() {
          System.out.println("constructor");
      }

     void m5() {
              System.out.println("Example2 class m5:");
     }
}
  class Sample2 extends Example2{
           
     void m1() {
            System.out.println("m1 exe from sample");
     } 
 }

  class Test2 {

        public static void main(String [] args) {
 
               Example2 e1 ;

                          // e1 = new Example2(); 
                             e1 = new Sample2();
                             e1.m1();
                             e1.m3();
                             e1.m5();
         }
}

    