package org.MessageHandler;

import org.Employes.Chief;
import org.Employes.DeliveryPerson;
import org.Employes.Employee;
import org.Orders.Order;
import org.Pizza.Pizza;
import org.TimeStamp.TimeStamp;

public class MessageHandler {
    private static String tabLvl1 = "\t\t\t";
    public static String sendNewOrderMessage(Order order){
        StringBuilder sb = new StringBuilder();
        for(Pizza pizza : order.getPizzas()){
            sb.append(tabLvl1 + "Name: " + pizza.getName() + "\n");
        }
        sb.append(tabLvl1 + "Total cooking time: " + order.getCookingTime());
        return (TimeStamp.getTimeStamp() + " Generated new order: " + "\n" + sb);
    }

    public static String startWorkMessage(Employee employee){
        return TimeStamp.getTimeStamp() + " " + employee.getClass().getSimpleName() + " " + employee.getId() + " start work!";
    }

    public static String takeOrderMessage(Employee employee,Order order){
        String template = TimeStamp.getTimeStamp() + " " + employee.getClass().getSimpleName() + " " + employee.getId() + " take order number: " + order.getOrderId();
        if(employee instanceof DeliveryPerson){
            return  template + "\n" + tabLvl1 + "Delivery distance: " + order.getDeliveryDistance();
        } else if(employee instanceof Chief){
            return template + "\n" + tabLvl1 + "Cooking time: " + order.getCookingTime();
        } else {
            return "type of this employee is not defined";
        }
    }

    public static String finishOrderMessage(Employee employee, Order order){
        return TimeStamp.getTimeStamp() + " " + employee.getClass().getSimpleName() + " " + employee.getId() + " finish order: " + order.getOrderId();
    }
}
