public class HelloWord {
    public static void main(String[] args) {         // [2]

        System.out.println("Hello Word!");
        System.out.println("Paulina");
        System.out.println(12);
        System.out.println('G');

        int a = 1;
        int b = 1;
        int c = 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        suma(a, b, c);
        sumaA(a, b, c);


    }
    private static void suma(int a, int b , int c) {
            int wynik = a + b + c;
        System.out.println(wynik);


    }
    private static void sumaA(int a, int b , int c) {
        int wynik2 = a - b - c;
        System.out.println(wynik2);


    }
}

