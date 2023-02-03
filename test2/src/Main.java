import java.util.Random;

public class Main {
    public static void main(String[] args) {
        randomize(arrInit(100));
    }

    public static int[] arrInit(int howlong) {
        int[] pole1 = new int[howlong];

        for (int i=0; i <=99; i++) {
            pole1[i] = i+1;
        }

        for (int i=0; i <=99; i++) {
            System.out.print(pole1[i] + " ");
        }
        return pole1;
    }

    public static void randomize (int[] poleToRand) {
        Random rand = new Random();
        System.out.println();
        int[] polevole = new int[poleToRand.length];
        int randomIndex; // the randomly selected index each time through the loop
        int randomValue;
        int temp=0;
        for (int i=0; i< poleToRand.length; i++) {
            randomIndex = rand.nextInt(poleToRand.length);
            temp = poleToRand[i];
            poleToRand[i] =poleToRand[randomIndex];
            poleToRand[randomIndex] = temp;

        }
        for (int i=0; i< poleToRand.length; i++) {
            System.out.print(poleToRand[i] + " ");
        }


        }


    }

