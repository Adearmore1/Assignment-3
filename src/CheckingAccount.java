
public class CheckingAccount {
    /**
     * 1. Store the amount money in the account
     */
    private double balance;
    


    public CheckingAccount(){

        this(0.0);
    }

    public CheckingAccount(Double amount){
        /**
         * 2. Set the amount of money in the account to amount
         */
        balance=amount;
    }

    public void deposit(Double amount){
        /**
         * 3. Deposits amount into the account
         */
        balance += amount;
    }

    public double withdraw(Double amount){
        /**
         * 4. Checks that the user has enough money in their account
         * if they have enough, deduct it from their account
         * if they don't, execute the following code
         throw new RuntimeException("Sorry, you don't have enough money in your account");
         */


        if (balance >= amount) {
            balance -= amount;
        }
        else
        {
            throw new RuntimeException("Sorry, you don't have enough money in your account.");
        }
        return amount;
    }

    public double getBalance(){
        /**
         * 5. Return the current balance of the account
         */
        return balance;
    }
}
