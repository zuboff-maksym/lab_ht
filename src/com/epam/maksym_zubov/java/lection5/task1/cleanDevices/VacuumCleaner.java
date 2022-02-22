package com.epam.maksym_zubov.java.lection5.task1.cleanDevices;

import com.epam.maksym_zubov.java.lection5.task1.Device;

public class VacuumCleaner extends Device {
    private String name;

    //constructor for Vacuum Cleaners
    public VacuumCleaner(String name, String brand, int power) {
        super(brand, power);
        this.name = name;
    }

    //method Clean
    public void clean() {
        if (getIsOn()) {
            System.out.println(name+" "+brand+" cleans");
        } else {
            System.out.println("No current");
        }
    }
}
