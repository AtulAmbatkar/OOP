class C {

      static int a = 10;
                 int x = 20;
   }

 class D extends C {

         static int a = 30;
         static int b = 40;
                    int y = 50;
                    int x = 60;
  
         void m1() {

             System.out.println(this.a+" "+super.a);
             System.out.println(this.x+" "+super.x);
             System.out.println(this.b+" "+this.y);
       //      System.out.println(super.b+" "+super.y);           CE: can not find sysmbol bec,ver.(b&y) not available in super class 
     }
}

   class Test {
 
      public static void main(String [ ] args) {

          D d1 =new D();
               d1.m1();
     }
 }