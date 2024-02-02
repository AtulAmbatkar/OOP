import java.util.Scanner;
import java .util.InputMismatchException;

  public class VoterRogOffice {

        public static void main(String [] args ) {
 
           Scanner scn = new Scanner(System.in);
            
            while (true) {
 
                     Voter1 v1 = new Voter1();
                      System.out.print("\nEnter Name: ");
                      v1.setName(scn.nextLine());
                      v1.getName();
        
              try {
                      System.out.print("\nEnter age: ");
                      v1.setAge(scn.nextInt());
                      
                      System.out.println("\nHi " + v1.getName() + " Your details is saved ");
                      System.out.println("please collect your voter card " );
                      System.out.println("After 30 days visit eseva");
                       break;
      
            } catch (InputMismatchException e) {
                     System.out.println("Enter Only Int Format age:");
           } catch (IllegalArgumentException e) {
                     System.out.println(e.getMessage());
          }
      }
  }
}
                      