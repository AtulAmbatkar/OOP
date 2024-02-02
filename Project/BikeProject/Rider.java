import java.util.Scanner;

  public class Rider{

     public static void main(String [] args) {

            Scanner scn = new Scanner(System.in);
  
            Bike_Gear b1= new Bike_Gear() ;

            System.out.print("Enter gear nu.: ");
  
            int b = scn.nextInt();
           
            b1.setGear(b);
      
            b1.getGear();
 

    }
}