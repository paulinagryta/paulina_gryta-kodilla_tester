public class LeapYear {
    /**
     * aaaaa
     */
    public static void main(String[] args) {
        int rok = 20;
        int a = 3;
        int b = 4;
        int c = 100;
        int d = 400;
/*
  dlaczego
 */

        if ((przezCztery(2020, 4) == 0)) {

            if ((przezSto(4005, 100) == 0)) {

                if ((przez400(400, 400) == 0)) {

                    System.out.println("Przestepny");
                }
            } else {
                System.out.println("nie przestepny");
            }
        }
    }

    private static int przezCztery(int rok, int liczba) {
        int result = rok % liczba;
        System.out.println(result);
        return result;
    }


    private static int przezSto(int rok, int liczba) {
        int result = rok % liczba;
        System.out.println(result);
        return result;
    }


    private static int przez400(int rok, int liczba) {
        int result = rok % liczba;
        System.out.println(result);
        return result;
    }

}

