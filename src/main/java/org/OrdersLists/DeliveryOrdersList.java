package org.OrdersLists;

import org.Orders.Order;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DeliveryOrdersList {
    public static final BlockingQueue<Order> DeliveryOrders = new LinkedBlockingQueue<>();
}
