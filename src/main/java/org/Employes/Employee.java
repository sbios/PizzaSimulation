package org.Employes;

import org.Names.NamesList;

import java.util.Random;

public class Employee {
    private int Id;
    private String firstName;
    private String lastName;

    public Employee(int Id){
        this.Id = Id;
        this.firstName = NamesList.getRandomFirstName();
        this.lastName = NamesList.getRandomLastName();
    }
    public Employee(int Id, String firstName, String lastName){
        this.Id = Id;
        if(!firstName.isEmpty() && !lastName.isEmpty()){
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public int getId(){
        return this.Id;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
