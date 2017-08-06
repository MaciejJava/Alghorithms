package SumArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow tablicy ");
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++){
            System.out.println("Podaj element numer " + i);
            array.add(scanner.nextInt());
        }

        System.out.println("Wynik: " + getArraySum(array));
    }

    public static int getArraySum(ArrayList<Integer> array){
        int result = 0;
        for(int i = 0; i < array.size(); i++){
            result += array.get(i);
        } return result;
    }
}
