class A {

    int x = 10;
    int y = 20;
  }

 class B extends A {

    int x = 30;
    int y = 40;
 }

 class Test {

   public static void main (String [ ] args ) {

         B b1 = new B();
         A a1 = new B();

        System.out.println(b1.x+" "+b1.y);
        System.out.println(a1.x+" " +a1.y);
        System.out.println();

        b1.x = 5;
        a1.x = 6;

        System.out.println(b1.x+" "+b1.y);
        System.out.println(a1.x+" "+a1.y);
        System.out.println();
    }
 }