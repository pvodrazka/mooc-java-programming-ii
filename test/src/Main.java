import java.util.Random;

public class Main {
    public static void main(String[] args) {

        array2(array1());
    }

    public static int[] array1() {
        int[] pole = new int[100];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = i + 1;
            System.out.print(pole[i] + ",");
        }
        return pole;

    }

    public static void array2(int[] ar) {

        System.out.println();
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;

            System.out.print(ar[i] + ",");
        }
    }
}
