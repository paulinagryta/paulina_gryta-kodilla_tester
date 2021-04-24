package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Toyota(50));
        cars.add(new Fiat(100));
        cars.add(new Honda(85));
        cars.add(new Mazda(60));
        cars.add(new BMW(110));

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.displayCarInfo(car);
        }

        cars.remove(2);
        cars.remove(new Mazda(60));

        System.out.println(cars.size());

        for (Car car : cars) {
            CarUtils.displayCarInfo(car);
    }




    }
}
