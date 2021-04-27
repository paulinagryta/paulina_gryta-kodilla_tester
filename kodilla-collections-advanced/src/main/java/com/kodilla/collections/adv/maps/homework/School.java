package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Class> school = new ArrayList<>();
    public void addClass(Class numerklasy) {
        school.add(numerklasy);
    }
public int getSum() {
    int sum = 0;
    for (Class klasa : school)
        sum += klasa.getNumberOfStudents();
    return sum;
}

    public static void main(String[] args) {
        School szkola = new School();
     //   szkola1.addClass(new Class("Klasa 1A  liczba uczniow:", 55));
    //    School szkola2 = new School();
     //   szkola2.addClass(new Class("Klasa 1B  liczba uczniow:", 8));
     //   School szkola3 = new School();
     //   szkola3.addClass(new Class("Klasa 1C  liczba uczniow:", 23));
    }

}

