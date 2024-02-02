class Calleelmpl{
       public void foo(Object o) {
                           System.out.println("Object paramrter");
      }
 
      public void foo(String s) {
                         System.out.println("String parameter");
     }
  
    public void foo(Integer i) {
                       System.out.println("Integer parameter");
    }
}

  public class MOVL2Mystery{
       public static void main(String [ ] args){

              Calleelmpl cl = new Calleelmpl();

               Object obj1 = new Object();
               Object obj2 = "HariKrishna";
               Object obj3 = new Integer(7279);
 
                cl.foo(obj1);
                cl.foo(obj2);
                cl.foo(obj3);
       
                System.out.println();
                cl.foo("hk");
                cl.foo(8585);

                System.out.println();
                cl.foo((String)obj2);
                cl.foo((Integer)obj3);

                System.out.println();
            //     cl.foo((String)onj1);             RE CCE : bcz obj1 veriable new object is stored
            /*   if(cl instanceof String) {       CE: used isatnceof opr.  incompatible types: class Calleelmpl cannot be converted to String
                   cl.foo((String)obj1); 
               }    */
           //   cl.foo((Integer)obj1);              RE : CCE same .

          /*    cl.foo((String)obj3);               Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be                                                                                   cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base                                                                                  of loade 'bootstrap')
                                                                        at MOVL2Mystery.main(MOVL2Mystery.java:43) */

           /*    cl.foo((Integer)obj2);            Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast                                                                         to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of                                                                         loader 'bootstrap')
                                                                        at MOVL2Mystery.main(MOVL2Mystery.java:45)  */;
      }
}