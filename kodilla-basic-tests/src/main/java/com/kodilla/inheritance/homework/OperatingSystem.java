package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
        System.out.println("OperatingSystem");

    }

    public void turnOn() {
        System.out.println("System was turned on  " + year);
    }

    public void turnOff() {
        System.out.println("System was turned off  " + year);
    }

    public int getYear() {
        return year;

    }
}