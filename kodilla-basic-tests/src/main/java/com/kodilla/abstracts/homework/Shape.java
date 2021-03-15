package com.kodilla.abstracts.homework;

public abstract class Shape<add> {

    private int LenghtSide;
    final int NumberSide ;
    private int circuit;
    private int SurfaceArea;
    private int Circuit;


    public Shape(int LenghtSide, int NumberSide) {

        this.LenghtSide = LenghtSide;
        this.NumberSide = 4;

        System.out.println("Wymiary figury");

        System.out.println("Długość boku  " + LenghtSide + "   liczba boków  " + this.NumberSide);
        System.out.println("          ");
    }

    public int getLenghtSide() {
        return LenghtSide;
    }

    public int getNumberSide() {
        return this.NumberSide;
    }

    public int ShapeCircuit() {
            this.Circuit = this.LenghtSide * this.LenghtSide;

        return this.Circuit;
    }
    public int ShapeSurfaceArea() {
        this.SurfaceArea = this.LenghtSide * this.NumberSide;

        return this.SurfaceArea;
    }

    public abstract void giveScore();


}


