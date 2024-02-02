  public class D extends C {

     static int b = 40;
 
     static {

            System.out.println("\nIn D SB ");
            System.out.println(" a:"+a);
            System.out.println(" b:"+b);
     }

     public static void main(String [ ] args) {

           System.out.println("\nIn D MM");
           System.out.println(" a:"+a);
           System.out.println(" b:"+b);
     
             C.main(new String [0]);
     }
 }