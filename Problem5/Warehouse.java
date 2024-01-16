package Problem5;

import java.util.Hashtable;

import Problem3.IAccount;

public class Warehouse implements IOrder {
    public Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.address = address;
        this.stock = new Hashtable<String, Integer>();
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            if (stock.containsKey(item.name)) {
                int currentStock = stock.get(item.name);
                if (currentStock > 0) {
                    stock.put(item.name, currentStock - 1);
                    System.out.println("Item name: " + item.name + " Warehouse: " + this.getWarehouseAddress()
                            + "\t #Successfull!");
                } else {
                    System.out.println("Item " + item.name + " is out of stock.");
                }
            } else {
                System.out.println("Item " + item.name + " not found in inventory.");
            }
        }
    };

    public int currentInventory(Item item) {
        if (stock.containsKey(item.name)) {
            return stock.get(item.name).intValue();
        }
        return 0;
    }

    public String getWarehouseAddress() {
        return this.address;
    }
}
