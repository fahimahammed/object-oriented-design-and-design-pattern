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

                if (currentStock > 0) {
                    Order wareHouseOrder = new Order();
                    wareHouseOrder.itemList.add(item);
                    ordersToShip.add(wareHouseOrder);
                    itemFulfilled = true;
                    warehouse.stock.put(item.name, currentStock - 1);
                    break;
                }
            }

            if (!itemFulfilled) {
                System.out.println("Item " + item.name + " is out of stock in all warehouses.");
            }
        }
        for (Order warehouseOrder : ordersToShip) {
            sendOrderToWareHouse(warehouseOrder);
        }
    }

    public void sendOrderToWareHouse(Order order) {
        System.out.println("successfully order fulfilled " + order.itemList.size());
    }
}
