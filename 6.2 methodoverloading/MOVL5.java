class MOVL5{

     void m1(byte b) {
           System.out.println("byte-arg: "+b);   
      }

   /*  void m1(char ch) {
           System.out.println("char-arg: "+ch);
     } */

    /* void m1(long l) {
           System.out.println("long-arg: "+l);
     }  */

  void m1(double da) {
           System.out.println("double-arg: "+da);
     }

 public static void main(String [ ] args) {
 
      MOVL5 e1 = new MOVL5();

     /* e1.m1(10);              this ARE  foe long method
      e1.m1('a');
      e1.m1((short)10);
      e1.m1((byte)10);
      e1.m1(45L);
    //   e1.m1(4.5f);                CE: no souitable method found */

  /*  //  e1.m1(10);                    CE: no souitable method found bcz;;; int is more than char,short,byte  
     e1.m1('a');
     e1.m1((char)90);    // Z 
   //  e1.m1("hk");          CE: no souitable method found for string */


   e1.m1(10);                // 10.0
   e1.m1('a');                //  97.0
   e1.m1(54L);             //  54.0
   e1.m1(46.0432f);   //  46.0432014465332
   e1.m1(568.954);    // 568.954 
   e1.m1(true);           //  no suitable method found for m1(boolean)

     
    }
}