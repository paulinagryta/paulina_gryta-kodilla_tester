package com.kodilla.collections.adv.maps.homework;



import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal kowalski = new Principal("Kowalski");
        Principal konopacka = new Principal("Konopacka");
        Principal nockowski = new Principal("Nockowski");
        Principal kozina = new Principal("Kozina");

        School szkola1 = new School();
        szkola1.addClass(new Class("Klasa 1A  liczba uczniow:", 55));
        szkola1.addClass(new Class("Klasa 1A  liczba uczniow:", 55));
        School szkola2 = new School();
        szkola2.addClass(new Class("Klasa 1A  liczba uczniow:", 8));
        szkola2.addClass(new Class("Klasa 1A  liczba uczniow:", 8));
        szkola2.addClass(new Class("Klasa 1A  liczba uczniow:", 8));
        School szkola3 = new School();
        szkola3.addClass(new Class("Klasa 1C  liczba uczniow:", 23));
        szkola3.addClass(new Class("Klasa 1C  liczba uczniow:", 23));
        szkola3.addClass(new Class("Klasa 1C  liczba uczniow:", 23));
        School szkola4 = new School();
        szkola4.addClass(new Class("Klasa 1D  liczba uczniow:", 27));
        szkola4.addClass(new Class("Klasa 1D  liczba uczniow:", 27));
        szkola4.addClass(new Class("Klasa 1D  liczba uczniow:", 27));

        schoolDirectory.put(kowalski, szkola1);
        schoolDirectory.put(konopacka, szkola2);
        schoolDirectory.put(nockowski, szkola3);
        schoolDirectory.put(kozina,szkola4);

        for (Map.Entry<Principal, School> pracaEntry : schoolDirectory.entrySet())
            System.out.println(pracaEntry.getKey().getPrincipal() + "  jest dyrektorem szkoły, w której uczy się " +
                    pracaEntry.getValue().getSum() + " uczniów.");

    }
}