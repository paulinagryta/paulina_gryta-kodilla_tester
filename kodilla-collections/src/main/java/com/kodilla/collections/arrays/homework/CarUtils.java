package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Toyota;


public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());

    }

    private static String getCarName(Car car) {
        if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Honda)
            return "Honda";
        else
            return "Unknown car name";
    }
}
