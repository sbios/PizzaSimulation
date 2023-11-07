package org.example;

import org.Employes.Chief;
import org.Employes.DeliveryPerson;
import org.OrdersGenerator.OrdersGenerator;
import org.PizzeriaStatistics.PizzaStatisticInformer;
import org.ProjectProperties.ProjectProperties;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Thread[] chiefs = new Thread[ProjectProperties.CHIEFS_NUMBER];
        for (int i = 0; i < chiefs.length; i++) {
            chiefs[i] = new Thread(new Chief());
            chiefs[i].start();
        }

        Thread[] deliverers = new Thread[ProjectProperties.COURIERS_NUMBER];
        for (int i = 0; i < deliverers.length; i++) {
            deliverers[i] = new Thread(new DeliveryPerson());
            deliverers[i].start();
        }

        Thread.sleep(2000);

        Thread statisticInformer = new Thread(new PizzaStatisticInformer());
        statisticInformer.start();

        Thread generator = new Thread(new OrdersGenerator());
        generator.start();
        generator.join();
    }
}