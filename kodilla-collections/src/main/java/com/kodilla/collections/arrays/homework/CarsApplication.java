package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[14];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        double speed = random.nextDouble() * 100 + 1;
        double increaseSpeed = random.nextDouble() * 100 + 1;
        double decreaseSpeed = random.nextDouble() * 100 + 1;
        if (drawnCarKind == 0)
            return new Toyota((int) speed);
        else if (drawnCarKind == 1)
            return new Fiat((int) speed);
        else if (drawnCarKind == 2)
            return new Honda((int) speed);
        return null;
    }
}

