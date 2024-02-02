class A {
 
    static void m1(int f) {
          System.out.println("A int-arg");B
     }

     static void m1(Long f) { 
             System.out.println("A Float Auto-Boxing");      // auto-boxing is applicable for the thet type name not any others lead CE:
    }

   /* static void m1(char ch) {
       System.out.println("A char-arg");
    }  */
};

 class B extends A {

   /*  static void m1(int i) {
         System.out.println("B int-arg");
      }

     static void m1(long ch) {
         System.out.println("B long-arg");
      } */
  
      static void m1(float ch) {
         System.out.println("B float-arg");
      }

   public static void main(String [ ] args) {

          B.m1(50);
          B.m1('a');
          B.m1(50L); 
 
          System.out.println();
          A.m1(50);
          A.m1('a');
         // A.m1(50L);         Possible lossy conversion
         A.m1(50L);
    }
}
