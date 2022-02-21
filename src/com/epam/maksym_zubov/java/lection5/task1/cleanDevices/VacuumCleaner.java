package com.epam.maksym_zubov.java.lection5.task1.cleanDevices;

import com.epam.maksym_zubov.java.lection5.task1.Device;

public class VacuumCleaner extends Device {
    private String name;

    public VacuumCleaner(String name, String brand, int power) {
        super(brand, power);
        this.name = name;
    }

    public void clean() {
        if (getIsOn() == true) {
            System.out.println(name+" "+brand+" cleans");
        } else {
            System.out.println("No current");
        }
    }
}
