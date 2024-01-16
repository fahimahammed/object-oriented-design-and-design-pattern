package Problem7;

public class VendingMachine {
    private int count;
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;

    public VendingMachine(int count) {
        this.idleState = new IdleState();
        this.hasOneDollarState = new HasOneDollarState();
        this.outOfStockState = new OutOfStockState();

        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            this.count = 0;
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public int getCount() {
        return count;
    }

    public void doReturnMoney() {
        // Implement logic to return money
        System.out.println("Money returned");
    }

    public void doReleaseProduct() {
        // Implement logic to release product
        System.out.println("Product released");
        count--;
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3);

        System.out.println("===========================================");
        vendingMachine.currentState.insertDoller(vendingMachine);
        vendingMachine.currentState.dispense(vendingMachine);
        vendingMachine.currentState.ejectMoney(vendingMachine);

        System.out.println("===========================================");
        vendingMachine.currentState.dispense(vendingMachine);
        vendingMachine.currentState.ejectMoney(vendingMachine);

        System.out.println("===========================================");
        vendingMachine.currentState.insertDoller(vendingMachine);
        vendingMachine.currentState.dispense(vendingMachine);
        // vendingMachine.currentState.ejectMoney(vendingMachine);

        System.out.println("===========================================");
        // vendingMachine.currentState.insertDoller(vendingMachine);
        vendingMachine.currentState.dispense(vendingMachine);
        vendingMachine.currentState.ejectMoney(vendingMachine);
    }
}
