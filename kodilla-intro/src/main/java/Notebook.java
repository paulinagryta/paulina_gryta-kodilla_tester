public class Notebook {
   // to sa zmienne
    int weight;
    int price;
    int year;

    // to jest konstruktor który stworzył obiekt
    public Notebook(int weight , int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    // to są metody działajace na ten obiekt

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price < 1000){
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("Ten komp jest leciutki");
        } else if (this.weight >= 600 && this.weight < 1000){
            System.out.println("Dasz rade go unieść");
        } else {
            System.out.println("Ciężki egzemplarz");
        }
    }
    public void checkTheBest() {
        if (this.price < 600 && this.year < 2015) {
            System.out.println("nadaje sie dla dzieci do zabawy");
        } else if (this.price >= 100 && this.price < 1000 && this.year >= 2018){
            System.out.println("świetna cena");
        } else if (this.price >= 1500 && this.year >= 2020){
            System.out.println("Drogi bo nowy");
        } else {
            System.out.println("nie kupuj!");
        }
    }

}
