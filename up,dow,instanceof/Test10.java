class A {

  }

 class B extends A {

   }

  class C extends B {

   }

  class D {


  }

  class Test10 {

    public static void main(String [] args) {

        A a = new B();
        System.out.println(a instanceof Object);    // true 
        System.out.println(a instanceof A);             // true 
        System.out.println(a instanceof B);             // true
        System.out.println(a instanceof C);             // false 
     //   System.out.println(a instanceof D);             // incompatible type :: because D class is sibling class A Not a inheritance class 

        Object obj = new B();
         System.out.println("\n"+a instanceof Object);  // true
         System.out.println(obj instanceof A);                // true 
         System.out.println(obj instanceof B);                // true
         System.out.println(obj instanceof C);               // false
         System.out.println(obj instanceof D);               // false 

       //   D d1 = (D) a;                                 incompatible type :: because D class is sibling class A Not a inheritance class 

   }
}