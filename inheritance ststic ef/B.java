public class B extends A {
 
       static int b= 20;

        static  {

           System.out.println(" SB B is executed");
           System.out.println("a: " +a);
           System.out.println("b: "+b);
           System.out.println("B.b : " + B.b);
           System.out.println("get : " + getB());
      }

     static int getB() {
        return b;
     }
  
     public static void main(String [ ] args) {
            System.out.println("MM");
            System.out.println(" b : "+  a);
            System.out.println(" a : " + b);
    }
 }