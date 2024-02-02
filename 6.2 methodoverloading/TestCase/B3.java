class A3 {

    int x = m1();
     int m1(){
         System.out.println("A m1");
          x=50;   return 60;
    }
}


  class B3 extends A3 {

       int y = m1();
       int m1(){
            System.out.println("B m1");
             x = 70;      return 80;
        }
   
  public static void main(String [ ]args) {

       B3 b = new B3();

       System.out.println("x: "+b.x);
       System.out.println("y: "+b.y);
    }
}
      