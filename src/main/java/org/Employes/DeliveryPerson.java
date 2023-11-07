package org.Employes;

import org.MessageHandler.MessageHandler;
import org.Orders.Order;
import org.OrdersLists.DeliveryOrdersList;
import org.PizzeriaStatistics.PizzeriaStatistics;

import java.util.concurrent.TimeUnit;

public class DeliveryPerson extends Employee implements Runnable {

    private static int id = 1;

    private static int generateId(){
        return id++;
    }

    public DeliveryPerson() {
        super(generateId());
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.getClass().getSimpleName() + " " + getId());
        System.out.println(MessageHandler.startWorkMessage(this));
        while (true){
            try {
                Order order = DeliveryOrdersList.DeliveryOrders.take();
                System.out.println(MessageHandler.takeOrderMessage(this,order));
                TimeUnit.SECONDS.sleep(order.getDeliveryDistance());
                System.out.println(MessageHandler.finishOrderMessage(this,order));
                PizzeriaStatistics.addDeliveredOrder(order);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
