package com.kodilla.abstracts.homework;

public class Lekarz extends Job {


    public Lekarz(int salary, String responsibilities) {

        super(1800, "leczenie");
    }


    @Override
    public void giveResp() {
        System.out.println("Lekarz zarabia  " + getSalary());

    }

    @Override
    public void giveSalary() {

        System.out.println("Do obiowiązków Lekarza należy  " + getResp());
    }
}