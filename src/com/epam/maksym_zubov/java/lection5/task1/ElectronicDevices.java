package com.epam.maksym_zubov.java.lection5.task1;

import com.epam.maksym_zubov.java.lection5.task1.cleanDevices.VacuumCleaner;
import com.epam.maksym_zubov.java.lection5.task1.kitchenDevices.CoffeeMachine;
import com.epam.maksym_zubov.java.lection5.task1.laundryDevices.Iron;

public class ElectronicDevices {
    public static void main(String[] args) {
        CoffeeMachine bosch = new CoffeeMachine("Coffee machine", "Braun", 110);
        Iron tefal = new Iron("Iron", "Tefal" , 1500);
        VacuumCleaner xiaomi = new VacuumCleaner("Vacuum cleaner", "Xiaomi", 200);
        tefal.plugIntoSocket();
        bosch.plugIntoSocket();
        tefal.toIron();
        //tefal.unplugFromSocket();
        tefal.toIron();
        System.out.println(tefal.getCounterTurnedOn());
        Container deviceContainer = new Container();
        deviceContainer.add(tefal);
        deviceContainer.add(bosch);
        deviceContainer.add(xiaomi);
        System.out.println(deviceContainer.get(1).toString());
        System.out.println(deviceContainer.get(2).getIsOn());
        System.out.println(deviceContainer.countTotalPower());
        deviceContainer.sortByPower();
        deviceContainer.print();
    }
}
