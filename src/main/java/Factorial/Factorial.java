package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int n;
        int silnia = 1;

        System.out.println("Wprowadź liczbę: ");
        n = myScanner.nextInt();
        while (n > 1)
        {
            silnia = silnia * n;
            n -= 1;
        }


        System.out.println("Silnia to: " + silnia);


    }
}
