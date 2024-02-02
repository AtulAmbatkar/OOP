class Example{
   
    void m1(int i) {
         System.out.println("int-arg: "+ i);
    }

     void m1(byte b) {
          System.out.println("byte-arg: "+b);
    }
}  

  class Sample extends Example {

      public static void main(String [ ] args) {
 
           byte  b = 10;
          short s = 15;
          char ch= 'a';
          int       i = 20;

          Example e = new Example();
      
          e.m1(b);   e.m1(s);  e.m1(ch);  e.m1(i);
       
          System.out.println();
          e.m1(10);  e.m1(15);  e.m1('b');  e.m1(20);
         
         System.out.println();
         e.m1((byte)10);  e.m1(35);   e.m1('a');  e.m1(60);
      }
}