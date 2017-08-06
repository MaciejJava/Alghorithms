package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;
        int result;

        System.out.println();
        System.out.println("Podaj liczbe ciagu ");
        number = myScanner.nextInt();
        result = fibonacci(number);
        System.out.println("Wynik fibonacci to " + result);
    }

    public static int fibonacci(int number) {
        if (number <= 1) return number;
        else return fibonacci(number-1) + fibonacci(number-2);
    }
}

