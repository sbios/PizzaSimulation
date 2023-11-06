package org.Pizza;

public class Pizza {
    private String Name;
    private int CookingTime;
    public Pizza(String Name,int CookingTime){
        this.Name = Name;
        this.CookingTime = CookingTime;
    }

    public int getCookingTime() {
        return CookingTime;
    }

    public String getName() {
        return Name;
    }
}
