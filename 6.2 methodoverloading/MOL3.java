class MOL3 {
   static void m1(int a) {
                 System.out.println("int -arg: "+a);
    }

   static void m1(float f) {
                   System.out.println("float-arg: "+f);
   }

   public static void main(String [ ] args) {

        m1(10);
        m1('a');
        m1(50L);

       long L = 50;
       m1(L);

    //  m1(50.34);   not suitable method found for m1?  bez m1 arg.given value is double;; double is last PD type...
                             //  then not convert to it's larger data..like that above (50L) long is not foud then is convert is large data then found Flot.
   }
}