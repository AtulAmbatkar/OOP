class A2 { 
 
   static int a = 10;
              int x = 20;

     static {
                System.out.println("A is loaded");
        }
  }

  class B2 extends A2 {

     static int b = 30;
                int x = 40;

     static {
                System.out.println("B is loaded");
        }
  }

  class C2 extends A2{

       static int c = 50;
                  int z = 60;

       static {
                System.out.println("C is loaded");
        }
 }

  class Test2 {

      static {
                System.out.println(" Test2 is loaded");
        }
 
   public static void main(String [ ] args) {

    /*   B2 b1 = new B2();
       A2 a1 = new B2();

      System.out.println(b1.a+" "+b1.x);
      System.out.println(a1.a+" "+a1.x);
      System.out.println(B2.a+" "+A2.a);
      System.out.println();

     b1.a = 5;
     a1.a = 6;
 
     System.out.println(b1.a+" "+b1.x);
     System.out.println(a1.a+" "+a1.x);
     System.out.println(B2.a+" "+A2.a); */

    System.out.println("Test main");
  
    B2 b1 = new B2();
    C2 c1 = new C2();

    b1.a = 15;
    b1.x = 16;

     System.out.println("b1.a: "+ b1.a);
     System.out.println("c1.a: "+c1.a);

     System.out.println("b1.x: "+b1.x);
     System.out.println("c1.x: "+c1.x);
   
 
   
  }
}