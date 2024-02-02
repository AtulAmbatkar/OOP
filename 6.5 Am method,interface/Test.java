abstract class Example {

   abstract void m1();
   abstract void m2();
}

abstract class Sample extends Example {

    void m1() {
          System.out.println("Sample is exe: "+ this + " object");
    }

    abstract void m3();
}

 class XYZ extends Sample {

     void m2() {
          System.out.println("XYZ is executed m2");
          m3();
          m4();
     }

     void m3() {
           System.out.println("XYZ is executed m3");
    }

   void m4() {
           System.out.println("XYZ is executed m4");
   }
}

/*class PQR extends Example {
  
     void m2() {
           System.out.println("PQR is executed m2");
    }
}  */
 
   class Test {
 
           public static void main(String [ ] args) {
           
                  Example e1;
                    //      e1 = new Example();
                    //       e1 = new Sample();

                             e1 = new XYZ();
                             e1.m1();
                             e1.m2();
 
                           //  e1.m3();
                           //  e1.m4();

                               ((Sample)e1).m3();              // chanse of CCE
                           //    ((Sample)e1).m4();
                               ((XYZ)(Sample)e1).m4();    // chanse CCE this not LC  & this Static binding != dynamic binding
          
                          /*   System.out.println();  
                             e1 = new PQR();
                             e1.m1();
                             e1.m2();  */
                 
     }
}