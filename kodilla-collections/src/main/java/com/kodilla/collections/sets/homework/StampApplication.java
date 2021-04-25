package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new com.kodilla.collections.sets.homework.Stamp("Meksyk",5,6,"czysty"));
        stamps.add(new Stamp("Anglia", 4, 4, "stempel"));
        stamps.add(new Stamp("Rocznica xxx", 5, 5, "czysty"));
        stamps.add(new Stamp("Anglia", 4, 4, "stempel"));
        stamps.add(new Stamp("Boliwia", 4, 4, "stempel"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
        }
    }

