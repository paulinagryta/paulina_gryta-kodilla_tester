public class Grades {
    // to są zmienne w klasie grades
    private int[] grades;   // ptivate czyli dostepne tylko w tej klasie
    private int size;
    private int suma;
    private int ocena;
    private int srednia;

    public Grades() {   //to jest konstruktor klasy grades
        this.grades = new int[10];
        this.size = 0;
        this.suma = 0;
        this.ocena = 0;
        this.srednia = 0;

    }


    public void add(int value) {  // to value jest to wartosc tymczasowa
        if (this.size == 10) {  // zawsze musimy dodac ten warunek by nie przekroczyc wielkosci tablicy
            return;
        }
        this.grades[this.size] = value; //  this.grades[1]   -  to jest dodanie oceny do tablicy pod okreslonym indeksem
        this.size++;

    }



    public int ostatniaOcena() {
        return this.grades[this.size];
    }

    public int sumaWGrades() {
        for (int i = 0; i <= 9; i++) {
            this.suma += grades[i];
        }
        return this.suma;

    }

    // saume za pomoca petli for i ja zwrocic
    public int sredniaWGrades() {
        for (int i = 0; i <= 9; i++) {
            this.srednia = this.suma / this.size;
        }
        return this.srednia;
    }
}
