package org.example;

import org.Employes.Chief;
import org.Employes.DeliveryPerson;
import org.OrdersGenerator.OrdersGenerator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        int chiefsCount = 5;
        int deliverersCount = 5;


        Thread[] chiefs = new Thread[chiefsCount];
        for (int i = 0; i < chiefs.length; i++) {
            chiefs[i] = new Thread(new Chief());
            chiefs[i].start();
        }

        Thread[] deliverers = new Thread[deliverersCount];
        for (int i = 0; i < deliverers.length; i++) {
            deliverers[i] = new Thread(new DeliveryPerson());
            deliverers[i].start();
        }

        Thread.sleep(2000);

        Thread generator = new Thread(new OrdersGenerator());
        generator.start();
        generator.join();
    }
}