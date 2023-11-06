package org.PizzasList;

import org.Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pizzas {
    private List<Pizza> pizzaList;
    private Random random;

    public Pizzas() {
        pizzaList = new ArrayList<>();
        random = new Random();

        // Инициализируйте список пицц по вашему выбору
        pizzaList.add(new Pizza("Маргарита", 15));
        pizzaList.add(new Pizza("Пепперони", 20));
        pizzaList.add(new Pizza("Гавайская", 18));
        pizzaList.add(new Pizza("Четыре сыра", 22));
        pizzaList.add(new Pizza("Вегетарианская", 17));
    }

    public Pizza getRandomPizza() {
        int randomIndex = random.nextInt(pizzaList.size());
        return pizzaList.get(randomIndex);
    }
}
