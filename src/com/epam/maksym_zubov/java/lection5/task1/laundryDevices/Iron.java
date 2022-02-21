package com.epam.maksym_zubov.java.lection5.task1.laundryDevices;

import com.epam.maksym_zubov.java.lection5.task1.Device;

public class Iron extends Device {
    private String name;

    public Iron(String name, String brand, int power) {
        super(brand, power);
        this.name = name;
    }

    public void toIron() {
        if (getIsOn() == true) {
            System.out.println(name+" "+brand+" irons");
        } else {
            System.out.println("No current");
        }
    }



}
