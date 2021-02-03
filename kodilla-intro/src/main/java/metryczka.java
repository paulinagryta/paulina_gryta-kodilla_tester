public class metryczka {
     public metryczka() {
     }

     public static void main(String[] args) {
          String myName = "Paulina";
          String example = sayHello();
          String exampleDwa = kodowanie();



          int myAge = 41;

          double height = 1.66;
          char carClass = 'A';
          boolean isGoodProgrammer = true;
          int plus = sum();
          int minus = sumAndDisplay();
          int firstNumber = 11;
          int secondNumber = 22;
          int yourAge = 30;



          System.out.println(myName);
          System.out.println(isGoodProgrammer);
          System.out.println(myAge);
          System.out.println(height);
          System.out.println(carClass);
          System.out.println(example);
          System.out.println(exampleDwa);
          System.out.println("Helloo from Hell!");
          System.out.println("          dodawanie");
          System.out.println(plus);
          System.out.println("          odejmowanie");
          System.out.println(minus);


          if (sum() > sumAndDisplay()) {
               System.out.println("Niesamowite! dodawanie jest większe niż odejmowanie !!!");

          }
          if (sum() < sumAndDisplay()) {
               System.out.println("mylisz się!!!");

               System.out.println(" dodawanie jest mniejsze niż odejmowanie !!!");

          }


          System.out.println(firstNumber);
          System.out.println(secondNumber);

          if (firstNumber > secondNumber) {
               subtractAndDisplay(firstNumber, secondNumber);
          } else {
               sumAndDisplay(firstNumber, secondNumber);
          }

          if (yourAge < 10){
               System.out.println("Dzieciak");
          }
          else if (yourAge > 10 && yourAge < 18) {
               System.out.println("Młodzieniaszek");
          }
          else if (yourAge > 18 && yourAge < 50) {
               System.out.println("W kciecie wieku " + yourAge);
          }
          else {
               System.out.println("Staruszek");
          }
     }

     private static String sayHello() {
          String text = "Malinka!";

          return text;
     }
     private static String kodowanie() {
          String text = "Chyba nic nie umiem. A może umiem,       kto to wie?";

          return text;
     }

     private static int sumAndDisplay() {
          int c = 100;
          int d = 20;
          int result = c - d;


          return result;
     }
     private static int sum() {
          int a = 1;
          int b = 20;
          int ww = a + b;
          return ww;
     }
     private static void sumAndDisplay(int a, int b) {
          String result = ("hahaha");

          System.out.println(result);
     }

     private static void subtractAndDisplay(int a, int b) {
          int result = a - b;

          System.out.println(result);
     }



}




