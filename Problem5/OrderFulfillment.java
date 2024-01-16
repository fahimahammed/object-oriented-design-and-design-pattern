package Problem5;

import java.util.ArrayList;
import java.util.List;

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
        List<Order> ordersToShip = new ArrayList<>();

        for (Item item : order.itemList) {
            boolean itemFulfilled = false;

            for (Warehouse warehouse : warehouses) {
                int currentStock = warehouse.currentInventory(item);
                // System.out.println("WareHouse: " + warehouse);

                if (currentStock > 0) {
                    Order wareHouseOrder = new Order();
                    wareHouseOrder.itemList.add(item);
                    warehouse.fulfillOrder(wareHouseOrder);
                    itemFulfilled = true;
                    break;
                }
            }

            if (!itemFulfilled) {
                System.out.println("Item " + item.name + " is out of stock in all warehouses.");
            }
        }
    }
}
