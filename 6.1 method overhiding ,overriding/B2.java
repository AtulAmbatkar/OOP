class A2 {
 
      static void m1(){
            System.out.println("A2 m1 static");
       }

    /*  void m1(){
         System.out.println("A2 m1");
       }  */
  
     void m2() {
       System.out.println("\nA2 m2");
     }

    void m3() {
     System.out.println("A2 m3");
    }
}
 
  class B2 extends A2 {
 
      static void m1(){
         A2.m1();
        System.out.println("B2 m1 static");
      }

   /*  void m1() {
        System.out.println("B2 m1");
     } */

     void m2() {
         super.m2();
       System.out.println("B2 m2");
    }

   public static void main(String [ ] args) {
 
      B2 s = new B2();
      
         s.m1();
         s.m2();
         s.m3();
    }
}