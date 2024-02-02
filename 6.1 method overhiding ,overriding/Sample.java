class Example {

     public static void main(String [ ] args){

              System.out.println("Example class");

    }     
}

  class Sample extends Example {

      public static void main(String [ ] args) {
             Example.main(args);
             System.out.println("Sample class");
             
    }
}