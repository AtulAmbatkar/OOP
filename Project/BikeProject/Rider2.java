import java.util.Scanner;
import java.util.InputMismatchException;

  public class Rider2 {
 
        public static void main(String [] args) {

           Scanner scn = new Scanner(System.in);

           Bike2 bi = new Bike2();
  
           while(true) {

                 try {
                             System.out.print("\nEnter Gear: ");
                             int bk = scn.nextInt();
                             bi.setGear(bk);
                             bi.currentgear();
                             break;            
               } catch (InputMismatchException e) {
                             System.out.println("Enter only gear");
                             scn.nextLine();
              } catch (IllegalArgumentException e ){
                            System.out.println(e.getMessage());
              }
         }
    }
}

           