package com.kodilla.abstracts.homework;

public class Dyrektor extends Job{

  public Dyrektor(int salary, String responsibilities){

    super(3500, "dyrektorowanie");
}


    @Override
    public void giveResp(){
        System.out.println("Dyrektor zarabia  " + getSalary());
        System.out.println("   ");
    }

    @Override
    public void giveSalary(){

      System.out.println("Do obiowiązków Dyrektora należy  "  +getResp());

    }
}
