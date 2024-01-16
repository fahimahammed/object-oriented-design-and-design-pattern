package Problem3;

public class Chequing implements IAccount {
    private String accountNumber;
    private int balance;

    public Chequing(int balance) {
        int accountNum = (int) (Math.random() * 1000);
        this.accountNumber = "C" + Integer.toString(accountNum);
        this.balance = balance;
    }

    @Override
    public void deposite(int amount) {
        this.balance = balance + amount;
        System.out.println("Depositing " + amount + " into Chequing account #" + accountNumber);
    }

    @Override
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            this.balance = balance - amount;
            // System.out.println("Withdrawing " + amount + " from Chequing account #" +
            // accountNumber);

            return true;
        } else {
            System.out.println("Insuficient Balance!");
            return false;
        }
    }

    @Override
    public void transfer(int amount) {
        System.out.println("Transferring " + amount + " from Chequing account #" + accountNumber);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
