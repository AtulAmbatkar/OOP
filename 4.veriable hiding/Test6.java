class A5 {
 
    static int a = 10;
               int x = 20;

      static {
            System.out.println("\nClass A is loaded");
      }
  }

 class B5 extends A5 {

      static int b = 30;
                 int y = 40;
   
      static{
           System.out.println("Class B is loaded");
      }
  }

 class C5 extends A5 {

        static int c = 60;
                   int z = 70;
  
        static {
            System.out.println("Class C is loaded");
        }
   }

  class Test6 {

      static {
           System.out.println("Test6 is loaded");
       }

   public static void main(String [ ] args) {

       System.out.println("Test6 main ");
      
       B5 b1 = new B5();
       C5 c1 = new C5();

       b1.a = 15;
       b1.x = 16;

       System.out.println("\nb1.a: "+b1.a);
       System.out.println("c1.a: "+c1.a);

       System.out.println("\nb1.x: "+b1.x);
       System.out.println("c1.x: "+c1.x);
    }
}