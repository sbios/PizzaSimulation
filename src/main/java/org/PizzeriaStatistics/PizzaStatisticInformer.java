package org.PizzeriaStatistics;

import org.MessageHandler.MessageHandler;
import org.ProjectProperties.ProjectProperties;

import java.util.concurrent.TimeUnit;

public class PizzaStatisticInformer implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println(MessageHandler.printStatistic());
            try {
                TimeUnit.MINUTES.sleep(ProjectProperties.FREQUENCY_INFORMATION_DISPLAY_IN_MILS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
