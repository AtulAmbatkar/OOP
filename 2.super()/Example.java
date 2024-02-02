class Sample {

   {

    System.out.println("Non static block Sample is executed");
  }

   Sample () {              
 
        System.out.println("Sample constructor is executed");
    }
}

   class Example extends Sample {

        {
         //  super();
           System.out.println("\nExample class Non Static block is Executed");
       }

      Example() {

             super();
             System.out.println("Example constructor is executed");
      }

   public static void main(String [ ] args) {

       Example e1 = new Example();
    }
}