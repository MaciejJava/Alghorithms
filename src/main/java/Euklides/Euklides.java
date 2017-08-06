package Euklides;

import java.util.Scanner;

public class Euklides {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Podaj a");
        a = myScanner.nextInt();
        System.out.println("Podaj b");
        b = myScanner.nextInt();

        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println("Wspolny dzielnik to " + a);




    }
}



