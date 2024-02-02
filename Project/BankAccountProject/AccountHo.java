import java.util.Scanner;
import java.util.InputMismatchException;

 public class AccountHo {

     public static void main(String [ ] args) {
 
           BankAccount acc1 = new BankAccount();
 
           Scanner scn = new Scanner(System.in);
 
          while(true) {

               try {
           
                       System.out.print("\nEnter amount: ");
                       double balance = scn.nextDouble();
                                                       scn.nextLine();
                       acc1.setBalance(balance);
                       System.out.println("Current balance : " + acc1.getBalance());
                       break;
                    } catch (InputMismatchException e) {
                       System.out.println("Enter only number");   
                           scn.nextLine();
                   } catch(IllegalArgumentException e) {
                       System.out.println(e.getMessage());
                  } 
                    
                        
             }
      }
 }
        
           

             