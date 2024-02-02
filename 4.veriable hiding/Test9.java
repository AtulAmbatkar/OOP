class R {

   static int x = 40;
     
   static {
      System.out.println("Hi");
   }
}

  class T extends R {
  
        static int y= 50;

        static {
              System.out.println("hello");
        }
  }

  class Test9 {

    public static void main(String [ ] args) {

      System.out.println(T.y);
    }
}