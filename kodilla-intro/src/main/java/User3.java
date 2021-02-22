public class User3 {
    int wiek;
    String imie;
    int suma;

    public void main(String[] args) {
        User2 Kazik = new User2("Kazik", 105);
        User2 Jola = new User2("Jola", 15);
        User2 Michal = new User2("Michal", 10);
        User2 Bartek = new User2("Bartek", 41);
        User2 Ola = new User2("Ola", 35);

       int lata = (Jola.wiek + Bartek.wiek + Michal.wiek + Ola.wiek);
       System.out.println("Razem mają  " + lata + " lat");
       int srednia = (lata/4);
       System.out.println("Srednia wieku wynosi  " + srednia + "lat");
       int suma;
        suma = User2.Ssuma();

        //    User2[] usersi = {Jola, Michal, Bartek, Ola};
   //     int result = 0;
   //     for (int i = 0; i < usersi.length; i++) {
   //         result += usersi[i];
   //     }
   //     int wiek = User2.this.wiek;
    //    int wiek = 0;
        while (wiek <= srednia) {
            System.out.println(imie);
            this.wiek++;
        }
 //   if{
 //   lata > srednia;
 //           System.out.println(User2.imie +   "Srednia wieku wynosi  ");
 //       }

    }

}