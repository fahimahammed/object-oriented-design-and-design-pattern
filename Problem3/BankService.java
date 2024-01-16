package Problem3;

import java.util.Hashtable;

public class BankService {
    private Hashtable<String, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<String, IAccount>();
    }

    public IAccount createNewAccount(String type, int initialAmount) {
        IAccount newAccount = null;

        switch (type) {
            case "chequing":
                newAccount = new Chequing(initialAmount);
                break;
            case "saving":
                newAccount = new Saving(initialAmount);
                break;
            case "investment":
                newAccount = new Investment(initialAmount);
                break;
            default:
                System.out.println("Invalid account type!");
                break;
        }

        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount;
        }

        return null;
    }

    public void transferMoney(String to, String from, int amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);

        boolean balanceStatus = fromAccount.withdraw(amount);
        if (balanceStatus) {
            toAccount.deposite(amount);
            System.out.println("====Successfully Transfered====");
        } else {
            System.out.println("===Balance transfer failed===");
        }
    }
}
