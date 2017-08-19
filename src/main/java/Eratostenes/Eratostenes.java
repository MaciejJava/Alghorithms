package Eratostenes;

import java.util.Scanner;

public class Eratostenes {



    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        int range;
        double sqrt;
        int tab[] = new int[1000];

        System.out.println("Podaj zakres ");
        range = myScanner.nextInt();



        sqrt = Math.sqrt(range);

        for (int i=1; i<=range; i++) tab[i]=i;

        for (int i=2; i<=sqrt; i++) {
            if (tab[i] != 0) {
                int j = i+i;
                while (j<=range) {
                    tab[j] = 0;
                    j += i;
                }
            }
        }

        System.out.println("Liczby pierwsze z zakresu od 1 do " + range);
        for (int i=2; i<=range; i++) if (tab[i]!=0) System.out.print(i + ", ");
    }
}