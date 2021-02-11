public class Loop {
    /**
     * ta metoda
     * a) wyświetla cyfry z zakresu
     * b) podaje ilośc elementów tabeli
     * c) wyswitla elementy tabeli
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        int numberOfElements = names.length;
        System.out.print("moja tablica zawiera ");
        System.out.print(numberOfElements);
        System.out.println(" elementy");

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(names[i]);

        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
