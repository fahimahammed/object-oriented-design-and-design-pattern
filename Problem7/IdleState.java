package Problem7;

public class IdleState implements State {
    @Override
    public void insertDoller(VendingMachine vendingMachine) {
        System.out.println("Doller inserted...");
        vendingMachine.setState(vendingMachine.getHasOneDollarState());
    };

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return");
    };

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Payment required");
    };
}
