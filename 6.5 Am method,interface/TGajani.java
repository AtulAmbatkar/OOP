abstract class Gajani {
 
            abstract  void m1();
}
 
  class TumariGajani extends Gajani {

             void m1() {
                System.out.println("Sample class");
   }
}

  class TGajani {

        public static void main(String [ ] args) {
 
            Gajani g ;
                               //= new Gajani();

                  g = new TumariGajani();

 
       }
}