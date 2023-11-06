package org.OrdersGenerator;

import org.OrdersLists.CookOrdersList;
import org.MessageHandler.MessageHandler;
import org.Orders.Order;
import org.Pizza.Pizza;
import org.PizzasList.Pizzas;

import java.util.Random;

public class OrdersGenerator implements Runnable{
    private int count = 1;
    @Override
    public void run() {
        Thread.currentThread().setName(this.getClass().getSimpleName() + " " + count);
        count++;
        Random random = new Random();
        Pizzas pizzasList = new Pizzas();
        while (true){
            Pizza[] pizzas = new Pizza[random.nextInt(1,5)];
            for (int i = 0; i < pizzas.length; i++) {
                pizzas[i] =  pizzasList.getRandomPizza();
            }
            Order order = new Order(random.nextInt(10,40),pizzas);
            try {
                CookOrdersList.CookOrders.put(order);
                System.out.println(MessageHandler.sendNewOrderMessage(order));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
