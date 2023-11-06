package org.Employes;

import org.OrdersLists.CookOrdersList;
import org.MessageHandler.MessageHandler;
import org.Orders.Order;
import org.OrdersLists.DeliveryOrdersList;
import org.TimeStamp.TimeStamp;

import java.util.concurrent.TimeUnit;

public class Chief extends Employee implements Runnable{
    private static int id = 1;

    private static int generateId(){
        return id++;
    }

    public Chief(){
        super(generateId());
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.getClass().getSimpleName() + " " + getId());
        System.out.println(MessageHandler.startWorkMessage(this));
        while (true){
            try {
                Order order = CookOrdersList.CookOrders.take();
                System.out.println(MessageHandler.takeOrderMessage(this,order));
                TimeUnit.SECONDS.sleep(order.getCookingTime());
                System.out.println(MessageHandler.finishOrderMessage(this,order));
                DeliveryOrdersList.DeliveryOrders.put(order);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
