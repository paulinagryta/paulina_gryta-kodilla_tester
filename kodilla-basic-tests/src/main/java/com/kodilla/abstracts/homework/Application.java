package com.kodilla.abstracts.homework;


public class Application {
   public static void main(String[] args) {
       Kwadrat kwadrat = new Kwadrat(5,6);
       kwadrat.giveScore();
       DrugiKwadrat drugiKwadrat = new DrugiKwadrat(2,4);
       drugiKwadrat.giveScore();
   }
}
