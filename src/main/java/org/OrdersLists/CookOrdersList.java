package org.OrdersLists;

import org.Orders.Order;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CookOrdersList {
    public static final BlockingQueue<Order> CookOrders = new LinkedBlockingQueue<>();
}
