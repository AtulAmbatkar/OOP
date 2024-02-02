import java.util.Scanner;
class BankAccount{

   private double balance;
   private double diposite;
   private double withdraw;

   public void setBalance(double balance) {
           this.balance = balance;
   }

  public double getBalance() {
        return balance;
 }

 public void setDiposite(double diposite) {
       this.diposite = diposite;
       balance  = diposite + balance;
       System.out.println("You are amount is updated : " + diposite);
 }

 public double getDiposite() {
     return diposite;
 }

  public void setWithdraw(double withdraw) {
       this.withdraw = withdraw;
      if(withdraw <= balance) {
             System.out.println("withdraw : "+ withdraw + " amount is successfully ");
              balance = balance - withdraw;
      }else {
             System.out.println("you cannot not withdarw");
      }
    System.out.println("Available balance: " + balance);
  }

  public double getWithdraw() {
    return withdraw;
 }


   public static void main(String [] args) {

       BankAccount bk = new BankAccount();

       // Scanner scn = new Scanner(System.in);
        bk.setBalance(2000);
        double b = bk.getBalance();
       System.out.println("Current balance is : " + b);

        bk.setWithdraw(400);
        double v = bk.getWithdraw();
         // System.out.println(v);

       bk.setDiposite(1500);
       double am = bk.getBalance();
       System.out.println("Available balance is : " + am);
         
    }
}   