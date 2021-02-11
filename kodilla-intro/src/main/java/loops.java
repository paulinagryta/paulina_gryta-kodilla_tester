public class loops {
    public static void main(String[] args) {
        int liczby[] = new int[]{12, 23, 25, 66, 78, 44,};
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        System.out.print("Suma liczb tablicy równa sie:");
        System.out.print(suma);

    }
    }

