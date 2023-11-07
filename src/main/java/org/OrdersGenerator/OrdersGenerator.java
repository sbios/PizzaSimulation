package org.OrdersGenerator;

import org.OrdersLists.CookOrdersList;
import org.MessageHandler.MessageHandler;
import org.Orders.Order;
import org.Pizza.Pizza;
import org.PizzasList.Pizzas;
import org.ProjectProperties.ProjectProperties;

import java.util.Random;

public class OrdersGenerator implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName(this.getClass().getSimpleName());
        Random random = new Random();
        Pizzas pizzasList = new Pizzas();
        while (true){
            Pizza[] pizzas = new Pizza[random.nextInt(ProjectProperties.MIN_NUMBER_DISHES,ProjectProperties.MAX_NUMBER_DISHES)];
            for (int i = 0; i < pizzas.length; i++) {
                pizzas[i] =  pizzasList.getRandomPizza();
            }
            Order order = new Order(random.nextInt(ProjectProperties.MIN_DELIVERY_DISTANCE,ProjectProperties.MAX_DELIVERY_DISTANCE),pizzas);
            try {
                CookOrdersList.CookOrders.put(order);
                System.out.println(MessageHandler.sendNewOrderMessage(order));
                Thread.sleep(ProjectProperties.FREQUENCY_ORDER_GENERATION_IN_MILS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
