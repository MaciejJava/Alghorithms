package HowMuch;

import java.util.Scanner;

public class HowMuch {
    public static void main(String[] args) {
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow tablicy ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element numer " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Podaj liczbe jaka szukasz i chcesz policzyc  " );
        int exist = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (array[i] == exist) {
                counter++;

            }
        }

        System.out.println("Liczba " + exist + " wystepuje " + counter + " razy");

    }
}


