package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Car;

public class SystemYear {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(15);
        system.turnOff();

        NewSystem newSystem = new NewSystem(10);
        newSystem.turnOff();

        OldSystem oldSystem = new OldSystem(60);
        oldSystem.turnOff();


    }
}
