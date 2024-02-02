class A4 {

    static  int x = m1();
    static  int m1(){
         System.out.println("A m1");
            x =  50;
            return 60;
    }
}


  class B4 extends A4 {

       static int y = m1();
       static  int m1(){
            System.out.println("B m1");
                   x = 70;
                  return 80;
        }
 }

 class Test4 {
   
  public static void main(String [ ]args) {

       B4 b = new B4();

           

         System.out.println("x: "+b.x);
         System.out.println("y: "+b.y);
    }
}
      