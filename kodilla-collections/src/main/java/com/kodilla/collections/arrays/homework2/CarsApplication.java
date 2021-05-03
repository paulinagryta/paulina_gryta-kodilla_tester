package com.kodilla.collections.arrays.homework2;

import com.kodilla.collections.interfaces.homework2.Car;
import com.kodilla.collections.interfaces.homework2.Mazda;
import com.kodilla.collections.interfaces.homework2.Polonez;
import com.kodilla.collections.interfaces.homework2.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
    }

    private static Car drawCar() {
        Random random = new Random();
        int wylosowanySamochod = random.nextInt(4);

        if (wylosowanySamochod == 0)
            return new Toyota(15);
        if (wylosowanySamochod == 1)
            return new Mazda(20);
        if (wylosowanySamochod == 2)
            return new Polonez(30);
        if (wylosowanySamochod == 4)
            return null;
    }
}

