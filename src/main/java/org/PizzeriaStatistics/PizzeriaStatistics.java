package org.PizzeriaStatistics;

import org.Orders.Order;

import java.text.DecimalFormat;

public class PizzeriaStatistics {
    private static DecimalFormat df = new DecimalFormat("0.00");


    private static int CookedOrders = 0;
    private static int TotalCookingTime = 0;
    private static double AverageCookingTime = 0.00;
    public static void addCookedOrder(Order order){
        CookedOrders ++;
        TotalCookingTime += order.getCookingTime();
        AverageCookingTime = (double) TotalCookingTime /CookedOrders;
    }

    public static int getCookedOrders() {
        return CookedOrders;
    }

    public static int getTotalCookingTime() {
        return TotalCookingTime;
    }

    public static double getAverageCookingTime() {
        return AverageCookingTime;
    }

    private static int OrdersDelivered = 0;
    private static int TotalDeliveryTime = 0;
    private static double AverageDeliveryTime = 0.00;
    public static void addDeliveredOrder(Order order){
        OrdersDelivered++;
        TotalDeliveryTime += order.getDeliveryDistance();
        AverageDeliveryTime = (double) TotalDeliveryTime /OrdersDelivered;
    }

    public static int getOrdersDelivered() {
        return OrdersDelivered;
    }

    public static int getTotalDeliveryTime() {
        return TotalDeliveryTime;
    }

    public static double getAverageDeliveryTime() {
        return AverageDeliveryTime;
    }
}
