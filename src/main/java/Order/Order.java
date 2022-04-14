package Order;

import Order.value_object.Count;
import book.value_object.Din;

import java.util.GregorianCalendar;
import java.util.UUID;

public class Order {
    private UUID orderId;
    private Din price;
    private GregorianCalendar purchaseTime;
    private Count count;
}
