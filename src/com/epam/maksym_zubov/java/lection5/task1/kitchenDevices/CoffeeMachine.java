package com.epam.maksym_zubov.java.lection5.task1.kitchenDevices;

import com.epam.maksym_zubov.java.lection5.task1.Device;

public class CoffeeMachine extends Device {
    private String name;

    public CoffeeMachine(String name, String brand, int power) {
        super(brand, power);
        this.name = name;
    }

    public void makeCoffee() {
        if (getIsOn() == true) {
            System.out.println(name+" "+brand+" is making");
        } else {
            System.out.println("No current");
        }
    }
}
