package Problem5;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse("Dhaka");
        Warehouse warehouse2 = new Warehouse("Khulna");

        warehouse1.stock.put("ItemA", 2);
        warehouse1.stock.put("ItemB", 1);
        warehouse2.stock.put("ItemB", 1);

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(warehouse1);
        warehouses.add(warehouse2);

        IOrder orderFulfillment = new OrderFulfillment(warehouses);

        Order order = new Order();
        order.itemList.add(new Item("ItemA"));
        order.itemList.add(new Item("ItemB"));
        order.itemList.add(new Item("ItemB"));
        order.itemList.add(new Item("ItemB"));
        orderFulfillment.fulfillOrder(order);
    }
}
