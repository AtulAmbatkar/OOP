class MOVL4{

  /* static void m1(byte b) {
                   System.out.println("byte-arg: "+b);
   }  */ 
  
  static void m1(short s) {
                   System.out.println("short-arg: "+s);
   }


  public static void main(String [ ] args) {

    //  m1(50);        Possible lossy conversion int to byte

         m1((byte)50);

         byte b = 20;                 // we can assign upto -128 tob 127 
         m1(b);

 //       m1(50);     Possible lossy conversion int to short

      short s = 15151;
      m1(s);
   }
}