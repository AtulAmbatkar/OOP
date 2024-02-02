class A {

 /*A() {
 
    System.out.println("A constructer ");
  }  */

   A(int x) {

        System.out.println(x);
        System.out.println("A consturcter 2 nd exe");
     } 

     int x = 10;

    void m1() {

       System.out.println("m1 is execute from class A");
    }
 }


 class B extends A {

     B () {
           super(1);
           System.out.println(super.x);
          m1();
       }
  public static void main(String [ ] args) {

    B b1 = new B();

    }
}