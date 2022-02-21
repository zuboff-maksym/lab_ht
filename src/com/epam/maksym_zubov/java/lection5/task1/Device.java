package com.epam.maksym_zubov.java.lection5.task1;

public abstract class Device {
    protected String brand;
    private int power;
    private boolean isOn = false;
    private static int counterTurnedOn;

    public Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public void plugIntoSocket() {
        System.out.println("Device is ON");
        this.isOn = true;
        counterTurnedOn++;
    }

    public void unplugFromSocket() {
        if (isOn == true) {
            System.out.println("Device is OFF");
            this.isOn = false;
            counterTurnedOn--;
        }
    }

    public boolean getIsOn() {
        return isOn;
    }

    public static int getCounterTurnedOn() {
        return counterTurnedOn;
    }

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
