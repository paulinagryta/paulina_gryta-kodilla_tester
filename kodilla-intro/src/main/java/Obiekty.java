public class Obiekty {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 105, 2012);
        System.out.println("Pierwszy notebook waży:" + notebook.weight + " gr   kosztuje: " + notebook.price  + " złoty. Rok produkckji: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkTheBest();
        System.out.println();


        Notebook heavyNotebook = new Notebook(1000, 1000, 2020);
        System.out.println("Drugi notebook waży:" + heavyNotebook.weight + " gr   kosztuje: " + heavyNotebook.price  + " złoty. Rok produkckji: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkTheBest();
        System.out.println();


        Notebook oldNotebook = new Notebook(1100, 588, 2018);
        System.out.println("Trzeci notebook waży:" + oldNotebook.weight + " gr   kosztuje: " + oldNotebook.price  + " złoty. Rok produkckji: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkTheBest();

    }
}
