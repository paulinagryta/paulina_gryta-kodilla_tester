import java.util.Scanner;

public class PaletaBarw {



    public static String getUserSelection() {           // metoda wyboru działania matematyczneo przez uzytkownika
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz kolor (c, z, n, b):");
            String kolor = scanner.nextLine().trim().toUpperCase();         // [1]

            switch (kolor) {
                case "N":
                    return "niebieski";
                case "Z":
                    return "zielony";
                case "C":
                    return "czerwony";
                case "B":
                    return "bialy";
                default:
                    System.out.println("Nie ma takiego koloru. Try again.");
            }

        }
    }
}

