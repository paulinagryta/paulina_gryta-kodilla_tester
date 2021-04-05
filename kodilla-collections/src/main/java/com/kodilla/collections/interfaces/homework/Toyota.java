package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {

    private int speed;

    public Toyota(int speed) {
        this.speed = speed;

    }

    @Override
    public int getSpeed() {
        return (3 * increaseSpeed() + 2 * decreaseSpeed());
    }

    @Override
    public int increaseSpeed() {
        return speed + 100;
    }

    @Override
    public int decreaseSpeed() {
       return speed - 10;
    }
}