public class tablica {
    public static void main(String[] args) {


        ;

        String[] movies = new String[]{"Harry Potter", "Lord of the Rings", "Forrest Gump"};
        String movie = movies[2];
        System.out.print(movie);


        System.out.println("   to mój ulubiony film");
        String[] kwiaty = new String[5];
        kwiaty[0] = "Róza";
        kwiaty[1] = "Fiołek";
        kwiaty[2] = "Chortensja";
        kwiaty[3] = "Tulipan";
        kwiaty[4] = "Surfinia";
        String kwiat = kwiaty[4];
        System.out.print(kwiat);
        System.out.println("    ma piękny kolor");

        String[] filmy = new String[]{"Harry Potter", "Lord of the Rings", "Forrest Gump"};
        int numberOfElements = filmy.length;
        if (numberOfElements == 1) {
            System.out.print("Moja filmografia zawiera  ");
            System.out.print(numberOfElements);
            System.out.println("element");
        } else if (numberOfElements == 0) {
        System.out.println("Moja filmografia jest pusta :(");
        } else{

        System.out.print("Moja filmografia zawiera  ");
        System.out.print(numberOfElements);
        System.out.println(" elementy");
    }

    }
}
