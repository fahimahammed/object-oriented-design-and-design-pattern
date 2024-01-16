package Problem3;

public class Customer {
    public static void main(String[] args) {
        BankService myBankService = new BankService();

        System.out.println("========Create Account==========");
        IAccount mySavings = myBankService.createNewAccount("saving", 5000);
        IAccount myInvestment = myBankService.createNewAccount("investment", 1000);

        System.out.println("\n========Balance==========");
        System.out.println("Current Balance(Savings): " + mySavings.getBalance());
        System.out.println("Current Balance(Investment): " + myInvestment.getBalance());

        mySavings.deposite(500);
        mySavings.withdraw(50);

        System.out.println("\n========Balance==========");
        System.out.println("Current Balance(Savings): " + mySavings.getBalance());
        System.out.println("Current Balance(Investment): " + myInvestment.getBalance());

        String mySavingsAccountNum = mySavings.getAccountNumber();
        String myInvestmentAccountNum = myInvestment.getAccountNumber();

        myBankService.transferMoney(mySavingsAccountNum, myInvestmentAccountNum, 500);

        System.out.println("\n========Balance==========");
        System.out.println("Current Balance(Savings): " + mySavings.getBalance());
        System.out.println("Current Balance(Investment): " + myInvestment.getBalance());
    }
}
