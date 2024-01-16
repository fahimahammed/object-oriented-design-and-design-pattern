package Problem7;

public interface State {
    public void insertDoller(VendingMachine vendingMachine);

    public void ejectMoney(VendingMachine vendingMachine);

    public void dispense(VendingMachine vendingMachine);
}
