package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    private int speed;

    public Fiat(int speed) {
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
       return (3 * increaseSpeed() + 2 * decreaseSpeed());
    }

    @Override
    public int increaseSpeed() {
         return speed + 50;
    }

    @Override
    public int decreaseSpeed() {
         return speed - 80;
    }
}
