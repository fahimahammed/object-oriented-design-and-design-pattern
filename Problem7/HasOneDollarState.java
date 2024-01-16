package Problem7;

public class HasOneDollarState implements State {
    @Override
    public void insertDoller(VendingMachine vendingMachine) {
        System.out.println("Already have one doller...");
    };

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Returning money");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    };

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Releasing product");
        if (vendingMachine.getCount() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getHasOneDollarState());
        } else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    };
}
