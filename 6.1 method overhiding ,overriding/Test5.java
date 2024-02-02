class A5 {
   
       static int a = 10;
                  int x = 20;

       static void m1(){
             System.out.println("A m1");
        }
       void m2() {
            System.out.println("A m2");
         }
        void m3() {
            System.out.println("A m3");
            
            System.out.println("A: "+a);
            System.out.println("A.x: "+x);
            m1();
            m2();
     }
}

   class B5 extends A5 {

         static int a = 50;
                    int x = 60;

         static void m1() {
              System.out.println("B m1");
          }
         void m2() {
             System.out.println("B m2");
          
             System.out.println("B.a: "+a);
             System.out.println("B.x: "+x);
         }
        void m4(){
                super.a = a-10;
                super.x = x-10;
       }
}

  class Test5 {
        public static void main(String [ ] args) {
       
             B5 b1 = new B5();
             B5 b2 = new B5();
             A5 a1 = new A5();

             b1.a = 15;    b1.x = 16;
             b2.a = 18;    b2.x = 19;
           
             b1.m4();     b2.m4();
           
             b1.m3();
             System.out.println();
             b2.m3();
             System.out.println();

            System.out.println(b1.a);
            System.out.println(a1.a);

            System.out.println(b1.x);
            System.out.println(a1.x);
       }
}
    
  