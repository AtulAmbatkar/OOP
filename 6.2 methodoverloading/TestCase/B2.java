class A2 {

 /*  static void m1(Object obj) {
        System.out.println("A2 Object-arg");
   } */

     static void m1(Character obj) {
        System.out.println("A2 Number-arg");
   }

  /*  static void m1(Integer obj) {
        System.out.println("A2 Integer-arg");
   }  */
};

  class B2 extends A2 {

     static void m1(Object s) {
          System.out.println("B2 Object-arg");
     }
 
    static void m1(String obj) {
        System.out.println("B2 String-arg");
   }  
 /* static void m1(Integer obj) {
        System.out.println("B2 Integer-arg");
   } */

   public static void main(String [ ] args) {
 
          B2.m1("a");
          B2.m1(10);
 
          System.out.println();
        //  A2.m1("a");
          A2.m1('c');
     }
}