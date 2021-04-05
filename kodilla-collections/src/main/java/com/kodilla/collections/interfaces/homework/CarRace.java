package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Honda honda = new Honda(50);
        doRace(honda);
        Toyota toyota = new Toyota(50);
        doRace(toyota);

        Fiat fiat = new Fiat(50);
        doRace(fiat);
    }

    private static void doRace(Car car) {
        System.out.println(car.getSpeed());

    }
}