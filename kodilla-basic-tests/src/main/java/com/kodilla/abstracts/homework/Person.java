package com.kodilla.abstracts.homework;

import javax.print.attribute.standard.JobName;

public class Person {
    String firstName;
    int age;
    String Job;

    public static void main(String[] args) {

        Hydraulik hydraulik = new Hydraulik(500, "aaaa");

       hydraulik.giveSalary();
       hydraulik.giveResp();


       Dyrektor dyrektor = new Dyrektor(3500, "aaaaa");
       dyrektor.giveSalary();
       dyrektor.giveResp();

        Lekarz lekarz = new Lekarz(1800, "leczenie");
        lekarz.giveSalary();
        lekarz.giveResp();
    }
}
