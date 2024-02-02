class Example2 {
  
    void m1(int i , float f) {
            System.out.println("int,float method: "+i+" "+f); 
     }

   void m1(float f , int i) {
           System.out.println("float,int method: "+f+" "+i);
    }
}

  class Sample2 {

      public static void main(String [ ] args) {
                      
            Example2 e1 = new Example2();
      
            e1.m1(10,20.235f);
            e1.m1(20.235f,10);
 
            e1.m1(10,10);
     }
}