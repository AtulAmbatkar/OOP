// definnig multiple constructor in a class with diff,parameter type or list or order is called as ovl constructor

// why ovl constructor ?
// if we want to intialize object with user given values we should use ovrl constructor.they are no arg & parametrised constructor

//1.to exec same intialising loging with by taking input values in diff types.
// cons chainin?
// calling one constructor to another constructor by using super(),this() without creating other new obj.is called cons.ovld

class SuperClass {

   SuperClass () {
          
               this(10);
               System.out.println("superclass no-arg");
        }

   SuperClass (int a) {

              this("a");
              System.out.println("superclass int -arg");
      }

  SuperClass (String s) {

            System.out.println("superclass string-args");
   }
}


 class SubClass extends SuperClass {

          SubClass () {
                    this(10);
                    System.out.println("Subclass no-arg");
                //    this(10);                                                         1.we must can place in first statment.CE: to must be in first state
            }

           SubClass (int a) {
                  //   this("a");                                                       2.3. only one super() or this() in first state.
                     this("a");
                     System.out.println("subclass int-arg");
            }

            SubClass (String s) {
                 //        this();                                                                   4. we can clal not same constructor in multiple time .CE: recursive constructor violation 
                       System.out.println("subclass string-arg");
           }

  public static void main(String [ ] args) {

             new SubClass();

             System.out.println();
             new SubClass(10);

             System.out.println();
             new SubClass("S");
   }
}