public class Driver {
    /**
     * Remember to call methods on an object, use <ObjectName>.<MethodName>(parameters list)
     * For example:
     *  Math.sin(3.141598)
     *  alice.getBalance()
     */
    public static void main(String[] args){
        /**
         * Test out the checking account
         */
        CheckingAccount alice = new CheckingAccount(500.0);

        //6. Withdraw $120 from alice's account
        //Insert code here

        assert(alice.getBalance() == 380.0);

        //Note: bob's account will start out empty
        CheckingAccount bob = new CheckingAccount();

        //7. Deposit $20 into bob's account
        //Insert code here

        assert(bob.getBalance() == 20.0);

        //8. check that alice has more funds in her account than bob

        assert(alice.getBalance() > bob.getBalance());
    }
}
