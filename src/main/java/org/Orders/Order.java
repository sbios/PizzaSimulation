package org.Orders;

import org.Pizza.Pizza;

public class Order implements Comparable<Order> {

    private static int id = 1;
    private int OrderId;

    private int CookingTime;
    private int ItemsCount;
    private int DeliveryDistance;

    private Pizza[] pizzas;


    public Order(int DeliveryDistance,Pizza[] pizzas){
        this.OrderId = id++;
        this.ItemsCount = pizzas.length;
        this.DeliveryDistance = DeliveryDistance;
        this.pizzas = pizzas;
        for(Pizza pizza : pizzas){
            this.CookingTime += pizza.getCookingTime();

        }
    }

    public int getDeliveryDistance() {
        return DeliveryDistance;
    }

    public int getOrderId() {
        return OrderId;
    }
    public Pizza[] getPizzas() {
        return pizzas;
    }

    public int getCookingTime() {
        return CookingTime;
    }

    public int compareTo(Order otherOrder) {
        return Integer.compare(this.CookingTime, otherOrder.CookingTime);
    }


}
