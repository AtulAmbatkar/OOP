class A4 {

    int x = 10;
    int y = 20;
  
    void m1() {
       System.out.println(x);
       System.out.println(y);
    }
 }

 class B4 extends A4 {

    int x = 30;
    int y = 40;

    void m2() {
        System.out.println(x);
        System.out.println(y);
   }
}

 class Test4 {

   public static void main(String [ ] args) {

       B3 b1 = new B3();

      B3 b2 = new B3();
        

      b1.m1();
      b1.m2();
      System.out.println();

      b2.m1();
      b2.m2();
   }
}