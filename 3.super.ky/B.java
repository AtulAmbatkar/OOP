class A {

      int x = 10;
  }

 
class B extends A { 
  
     int x = 50;
  
   void m1 () {

     System.out.println(x);                        // Local preparance algorithem
     System.out.println(this.x);                 //  current class and super class
     System.out.println(super.x);             //  super class always
   
  }

public static void main(String [  ] args) {

     B b = new B();

       b.m1();
   }
}