package com.epam.maksym_zubov.java.lection5.task1;

public abstract class Device {
    protected String brand;
    private int power;
    private boolean isOn = false;
    private static int counterTurnedOn;

    //constructor
    public Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    //method plug in the socket with optional counter how many devices is ON
    public void plugIntoSocket() {
        System.out.println("Device is ON");
        this.isOn = true;
        counterTurnedOn++;
    }

    //method unplug with counter
    public void unplugFromSocket() {
        if (isOn == true) {
            System.out.println("Device is OFF");
            this.isOn = false;
            counterTurnedOn--;
        }
    }

    //public method to get isON
    public boolean getIsOn() {
        return isOn;
    }

    //get counter of turned ON devices
    public static int getCounterTurnedOn() {
        return counterTurnedOn;
    }

    //method to get Power
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", isOn=" + isOn +
                '}';
    }
}
