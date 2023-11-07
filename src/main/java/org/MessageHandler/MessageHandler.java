package org.MessageHandler;

import org.Employes.Chief;
import org.Employes.DeliveryPerson;
import org.Employes.Employee;
import org.Names.NamesList;
import org.Orders.Order;
import org.Pizza.Pizza;
import org.PizzeriaStatistics.PizzeriaStatistics;
import org.TimeStamp.TimeStamp;

public class MessageHandler {
    private static String tabLvl1 = "\t\t\t";
    public static String sendNewOrderMessage(Order order){
        StringBuilder sb = new StringBuilder();
        for(Pizza pizza : order.getPizzas()){
            sb.append(tabLvl1 + "Name: " + pizza.getName() + "\n");
        }
        sb.append(tabLvl1 + "Total cooking time: " + order.getCookingTime());
        return (TimeStamp.getTimeStamp() + " " + NamesList.getRandomFullName() + " made a new order: " + "\n" + sb);
    }

    public static String startWorkMessage(Employee employee){
        return TimeStamp.getTimeStamp() + " " + employee.getClass().getSimpleName() + " " + employee.getFirstName() + " " + employee.getLastName() + " start work!";
    }

    public static String takeOrderMessage(Employee employee,Order order){
        String template = TimeStamp.getTimeStamp() + " " + employee.getClass().getSimpleName() + " " + employee.getFirstName() + " " + employee.getLastName() + " take order number: " + order.getOrderId();
        if(employee instanceof DeliveryPerson){
            return  template + "\n" + tabLvl1 + "Delivery distance: " + order.getDeliveryDistance();
        } else if(employee instanceof Chief){
            return template + "\n" + tabLvl1 + "Cooking time: " + order.getCookingTime();
        } else {
            return "type of this employee is not defined";
        }
    }

    public static String finishOrderMessage(Employee employee, Order order){
        return TimeStamp.getTimeStamp() + " " + employee.getClass().getSimpleName() + " " + employee.getFirstName() + " " + employee.getLastName() + " finish order: " + order.getOrderId();
    }

    public static String printStatistic(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n\n" + TimeStamp.getTimeStamp() + "\nTotal cooked orders: " + PizzeriaStatistics.getCookedOrders()+"\n" +
                  "Average coking time: " + PizzeriaStatistics.getAverageCookingTime() + "\n" +
                  "Total delivered orders: " + PizzeriaStatistics.getOrdersDelivered() + "\n" +
                  "Average delivery time: " + PizzeriaStatistics.getAverageDeliveryTime()+ "\n\n");
        return sb.toString();
    }
}
