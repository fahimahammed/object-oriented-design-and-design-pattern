package Problem7;

public class OutOfStockState implements State {
    @Override
    public void insertDoller(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot insert money");
    };

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return");
    };

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot dispense product");
    };
}
