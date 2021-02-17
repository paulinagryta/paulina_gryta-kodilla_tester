public class Dziennik {
    public static void main(String[] args) {
        Grades oceny = new Grades();  // obiekt na podstawie klasy grades

        // te oceny zostaya dodana do tablicy grades w obiekcie typu grades
        // to jest miejsce do wpisywania ocen z ktorymi beda robione dzialania w klasie Grades
        // jezeli wpisze wiecej ocen a mamy limit tablicy to nadmiarowe oceny nie zostana dodane do tablicy
        oceny.add(5);
        oceny.add(4);
        oceny.add(3);
        oceny.add(3);




// nie wiem dla czego zawsze otrzymuje wynik 0
        int ostatnia = oceny.ostatniaOcena();
        System.out.println(ostatnia);

// ta wartość nie jest wymagana w zadaniu
        int suma = oceny.sumaWGrades();
        System.out.println(suma);

        int srednia = oceny.sredniaWGrades();
        System.out.println(srednia);
    }
}
