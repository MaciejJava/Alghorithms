package Check_ID;

import java.util.Scanner;

public class IdCheck {

    public static String getStringFromUser(String info){
        System.out.println(info);
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public static void printInt(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {

        String idNumber = getStringFromUser("Podaj numer seryjny dowodu ");
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < alphabet.length; j++ ) {
               if(idNumber.charAt(i) == alphabet[j]) {
                   int charValue = j+10;
                   switch (i){
                       case 0:
                           sum += charValue * 7;
                           break;
                       case 1:
                           sum += charValue * 3;
                           break;
                       case 2:
                           sum += charValue;
                           break;
                   }
               }
            }
        }

        printInt(sum);

    }

}
