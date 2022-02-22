package com.epam.maksym_zubov.java.lection5.task1.kitchenDevices;

import com.epam.maksym_zubov.java.lection5.task1.Device;

public class CoffeeMachine extends Device {
    private String name;

    //constructor
    public CoffeeMachine(String name, String brand, int power) {
        super(brand, power);
        this.name = name;
    }

    //method make Coffee
    public void makeCoffee() {
        if (getIsOn()) {
            System.out.println(name+" "+brand+" is making");
        } else {
            System.out.println("No current");
        }
    }
}
