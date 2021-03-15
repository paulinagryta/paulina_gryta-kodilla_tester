package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    public String responsibilities;


        public Job(int salary, String responsibilities){
        this.salary= salary;
        this.responsibilities = responsibilities;
       // System.out.println("wypłata   " + salary);
      //  System.out.println("obowiązki  " + responsibilities);
    }

    public int getSalary() {

        return salary;
    }

    public String getResp() {

        return responsibilities;

    }
    public abstract void giveResp();

    public abstract void giveSalary();
}
