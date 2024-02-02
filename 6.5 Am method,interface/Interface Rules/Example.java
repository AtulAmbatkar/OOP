 
                                                            // 1.must be decleare as interface keyw as class
                                                           //  2.modifier is only public and default is accept.
 interface Example {
          
         //   public static final int x  ;            Rule.8 variable must be intiliesed
           public static final int x  = 10;
                                                                       // 3.allowed 
           public abstract  void m1();            // Rule 5. private,def,protected not for abstract methos & veriable..

           public static class A {

               }

           default void m2(){   }                // 8 v allowed  : only static,default ky are allowed.for implementing  Rule.6
          static void m3() {     }

           private static void m4() {  }       // 9 v allowed 
           private void m5() {   }
           
        // static  {  }                                  Rule 4. not allowed 
        //    { }                                                          not intialisation here 
        //  Example( ) {  }  
                         
  }

    // Rule.9  we cano not intialised inerface we can use interface as rev.ver.type 
    // Rule.10 interface AM is Public..we can not applies it has private,def,protected
   
 //  class Sample extends Example {         Rule.11 diriving class from interface we must declare it has implements existing class.

     class Sample implements Example {

 }

  12. deriving interface from an interface we must decleare as extends ky
  13. all abstract method must be implemented in implementation class
         else declared it class as abstract class
  14.  we must use public to implement interface method

