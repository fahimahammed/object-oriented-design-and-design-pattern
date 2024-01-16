package Problem3;

public interface IAccount {
    public void deposite(int amoount);

    public boolean withdraw(int amount);

    public void transfer(int amount);

    public String getAccountNumber();

    public int getBalance();
}