class A {

    void m1(Example e) {
         System.out.println("Example -arg: "+e);
   }

    void m1(Sample s) {
         System.out.println("Sample -arg: "+s);
   }

  public static void main(String [ ] args) {

    A a = new A();
       
        a.m1(new Example());
        a.m1(new Sample());
       //  a.m1("abc");                  not suitale method found for m1(String)
       // a.m1(new Test());
      
          Example e1 = new Example();
          Example e2 = new Sample();
          Sample   s1 = new Sample();
          Example e3 = null;
          Sample   s2 = null;
 
         a.m1(null);    a.m1((Example)null);   
          a.m1(e1);    a.m1(e2);    a.m1(s1);
          a.m1(e3);      a.m1(s2);
         
    }
}
