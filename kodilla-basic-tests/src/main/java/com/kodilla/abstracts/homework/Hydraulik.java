package com.kodilla.abstracts.homework;

public class Hydraulik extends Job {
    public Hydraulik(int salary, String responsibilities){

      super(500, "naprawa rur");
}


    @Override
    public void giveResp(){
        System.out.println("Hydraulik  zarabia  " + getSalary());
        System.out.println("   ");
    }

    @Override
    public void giveSalary(){
        System.out.println("Do obiowiązków hydraulika należy  "  +getResp());

    }
}