package com.kodilla.abstracts.homework;


public class DrugiKwadrat extends Shape {



    public DrugiKwadrat(int LenghtSide, int NumberSide) {
        super(3,4);
    }

    @Override
    public void giveScore() {
        System.out.println("Pole powierzchni figury o boku =  " + getLenghtSide() + " wynosi  " + ShapeCircuit());
        System.out.println("Obwód figury mającej  " +  getNumberSide() + "  boków o długości =  " + getLenghtSide() + " wynosi  " + ShapeSurfaceArea());
    }



}