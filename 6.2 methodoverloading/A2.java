//CASE#1 : when overload method is super and sub type parameter then passed argument is mathch ,sub class parameter meth is executed.

//fdCASE #2  : when method overloaded is sibling passed arg.is mathed both parameter then CE: ambiguous.

 class A2 {

    void m1(Example e){
           System.out.println("Example-arg: "+e);
    }

   void m1(Test t) {
         System.out.println("Test-arg: "+t);
   }

  public static void main(String [ ] args) {
  
      A2 a = new A2();
     
      a.m1(new Example());
      a.m1(new Sample());
      // a.m1("abc");                    no suitable method found for m1(String)
      a.m1(new Test());

      System.out.println();
   //   a.m1(null);                        ambiguous error: to method m1 is same no one is sub?

     a.m1((Sample)null);
     a.m1((Test)null);
   }
}
   