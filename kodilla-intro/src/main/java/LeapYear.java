public class LeapYear {

    public static void main(String[] args) {
        int year = 2021;
        int a = 3;
        int b = 4;
        int c = 100;
        int b = 400;

        if (przezCztery(2020,4) == 0) {
            System.out.println("Przestepny");
        } else{
            System.out.println("nie przestepnyr");
        }
    }

        private static int przezCztery(int rok, int liczba){
            int result = rok % liczba;
            System.out.println(result);
            return result;
        }




        private static void przez100(int year, int b){
            int result = year % b;
            System.out.println(result);
        }
        private static void przez400(int year, int c){
            int result = year % c;
            System.out.println(result);
        }
        private static void przez3(int year, int d){
            int result = year % d;
            System.out.println(result);
        }
}

