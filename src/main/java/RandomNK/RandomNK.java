package RandomNK;

import java.util.Random;
import java.util.Scanner;

public class RandomNK {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczbe elementow tablicy ");
        int size = scanner.nextInt();

        System.out.println("Podaj liczbe losowan ");
        int k = scanner.nextInt();

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element numer " + i);
            inputArray[i] = scanner.nextInt();

        }
        int[] result = randomNK(inputArray, k);

        for (int i = 0; i < result.length; i++){
            System.out.println("Wylosowny elemet to: " + result[i]);
        }

    }

    public static int[] randomNK(int[] inputArray, int k){
        int[] result = new int [k];
        int index = inputArray.length-1;
        Random random = new Random();
        while(k > 0) {
            int r = random.nextInt(index);
           // int tempVar = inputArray[r];
            result[k-1] = inputArray[r];
            inputArray[k] = inputArray[index];
            index--;
           // inputArray[r] = inputArray[index];
           // inputArray[index] = tempVar;
            k--;
        }


        return result;
    }

}
