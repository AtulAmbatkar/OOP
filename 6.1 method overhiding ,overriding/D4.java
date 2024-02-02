class A4 {
     static  void m1() {
            System.out.println("A3 m1");
        }
      static void m2(){
            System.out.println("A3 m2");
             m1();
       }
 }

 class B4 extends A4 {
      static  void m1(){
            System.out.println("B3 m1");
         }
        void m3() {
           System.out.println("B3 m3");
           m1();
           super.m2();
        }
 }

  class C4 extends B4 {
        static void m2() {
            System.out.println("C3 m2");
           // m4();    can not find symbol
        }
 }

  class D4 extends C4 {
      static void m1() {
                System.out.println("D3 m1");
         }
       static void m2() {
               System.out.println("D3 m2");
         } 
        static void m4() {
                //  super.m2();                                          non-static variable super cannot be referenced from a static context
              System.out.println("D3 m4");
         }
     public static void main(String [ ] args ){
     
               D4 d1 = new D4();
                d1.m1();
                d1.m2();
                d1.m3();
                d1.m4();
         }
}
        