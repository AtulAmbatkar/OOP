class BankAccount {

     private double balance;

 
     public void setBalance ( double balance) throws IllegalArgumentException {

         if(balance == 0)

             throw new IllegalArgumentException("Do not pass zero");
         
        if(balance < 0) 
            throw new IllegalArgumentException("Do not pass  -amount");

        this.balance = balance;
     }

     public double getBalance() {
 
      return balance;
    }
}


  