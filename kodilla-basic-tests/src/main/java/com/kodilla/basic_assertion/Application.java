package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int squaredAResult = calculator.squaredA(a);
        int squaredBResult = calculator.squaredB(b);


        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);

    }


        boolean correct3 = ResultChecker.assertEquals(25, squaredAResult);
        if (correct3) {
            System.out.println("Metoda potęgi dla liczby " + a + " działa poprawnie" );
        } else {
            System.out.println("Metoda potęgi dla liczby " + a + " nie działa poprawnie" );

        }



        boolean correct4 = ResultChecker.assertEquals(66, squaredBResult);
        if (correct4) {
            System.out.println("Metoda potęgi dla liczby " + b + " działa poprawnie" );
        } else {
            System.out.println("Metoda potęgi dla liczby " + b + " nie działa poprawnie" );

        }


}
}
