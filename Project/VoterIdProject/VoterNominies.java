import java.util.Scanner;

   public class VoterNominies {

        public static void main(String [] args) {

              Scanner scn = new Scanner (System.in);

              Voter v1 = new Voter();

              System.out.print("Enter age : ");
 
              int c= scn.nextInt();
              v1.setAge(c);
               v1.getAge(); 

             System.out.print("enter name:");

              String s = scn.nextLine();
 
              v1.setName(s);
  
             v1.getName();
   }
}
 
             