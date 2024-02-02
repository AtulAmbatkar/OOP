public class C {

     static int a = 30;
     
       static {

            System.out.println("In C SB");
            System.out.println(" a: "+a);
            System.out.println(" b: "+D.b);
      }

       public static void main(String [ ] args) {

            System.out.println("\nIn C MM");
            System.out.println(" a:"+a);
            System.out.println(" b:"+D.b);
       }
 }
             