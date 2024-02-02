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
        System.out.println(a instanceof Object);
   }
}