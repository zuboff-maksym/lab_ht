package com.epam.maksym_zubov.java.lection5.task1;

import java.nio.channels.spi.AbstractSelectableChannel;

public class Container {
    private int size = 10;
    Device[] element = new Device[size];
    private int pointer = 0;

    //initialize default size of container
    public void setSize(int size) {
        this.size = size;
    }

    //add element and span if needed
    public void add(Device device) {
        if (pointer == element.length - 1) {
            Device[] elementCopy = element;
            size = 2*size;
            element = new Device[size];
            element = elementCopy;
        }
        element[pointer++] = device;
    }

    //method to get element
    public Device get(int index) {
        return element[index];
    }

    //method to get size
    public int getSize() {
        return element.length;
    }

    //method to achieve Total Power of devices in container
    public int countTotalPower() {
        int totalPower = 0;
        for (int i=0; i<pointer; i++) {
            totalPower = totalPower + element[i].getPower();
        }
        return totalPower;
    }

    //method to achieve Power of turned ON devices
    public int countConsumedPower() {
        int totalPower = 0;
        for (int i=0; i<pointer; i++) {
            if (element[i].getIsOn()) {
                totalPower = totalPower + element[i].getPower();
            }
        }
        return totalPower;
    }

    //method to sort devices by Power
    public void sortByPower() {
        for(int i=pointer-1; i>0; i--){
            for(int j=0 ; j<i ; j++){
                if(element[j].getPower()>element[j+1].getPower()){
                Device tmp = element[j];
                element[j] = element[j+1];
                element[j+1] = tmp;
            }
        }
    }
    }

    //method to print elements in container
    public void print() {
        for (int i=0; i<pointer; i++) {
            System.out.println(element[i].toString());
        }
    }
}
