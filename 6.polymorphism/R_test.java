class E {

    void m1() {
        System.out.println("E m1");
    }
 
   void m2(){
      System.out.println("E m2");
   }
}
  
     class F extends E {

         void m1(){
             System.out.println("F m1");
         }
         
    }

  class R_test {
   
       public static void main(String [] args) {

          E e1 = new F();
    
              e1.m1();
              e1.m2();
        }
  }