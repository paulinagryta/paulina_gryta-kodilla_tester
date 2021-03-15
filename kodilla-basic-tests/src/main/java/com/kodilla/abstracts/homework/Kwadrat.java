package com.kodilla.abstracts.homework;


public class Kwadrat extends Shape {



    public Kwadrat(int LenghtSide, int NumberSide) {
        super(5, 6);
    }

    @Override
    public void giveScore() {
        System.out.println("Pole powierzchni figury o boku  " + getLenghtSide() + " =  " + ShapeCircuit());
        System.out.println("  ");
        System.out.println("Obwód figury mającej  " +  getNumberSide() + "  boków o długości   " + getLenghtSide() + " =  " + ShapeSurfaceArea());
    }



}


