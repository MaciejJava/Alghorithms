package Check_ID;

import java.util.Scanner;

public class IdCheck {

    public static void main(String[] args) {

        String idNumber = getStringFromUser("Podaj numer seryjny dowodu ");
        checkId(idNumber);
    }

    public static boolean validateID(String idNumber){
        boolean isCorrect = false;

        if (idNumber.length() != 9 ){
            return isCorrect;
        }
        for (int i = 0; i < 3; i++) {
            int temp = idNumber.charAt(i);
            if (temp < 65 && temp > 90){
                return false;
            }
        }
        for (int i = 3; i < 9; i++){
            int temp = idNumber.charAt(i);
            temp -= 48;
            if(temp < 0 && temp > 9) {
                return false;
            }
        }
        return true;
    }

    public static String getStringFromUser(String info){
        System.out.println(info);
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public static void printInt(int n) {
        System.out.println(n);
    }



    public static void checkId(String idNumber){
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int sum = 0;
        int sum1 = 0;

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

        for (int i = 4; i < 9 ; i++) {
            int temp = idNumber.charAt(i);
            temp -=48;

            switch (i){

                case 4:
                    sum += temp * 7;
                    break;
                case 5:
                    sum += temp * 3;
                    break;
                case 6:
                    sum += temp;
                    break;
                case 7:
                    sum += temp * 7;
                    break;
                case 8:
                    sum += temp * 3;
                    break;
            }
        }

        int mod = sum %10;
        int temp = idNumber.charAt(3);
        temp -= 48;
        if (mod == temp) {
            printInt(1);
        }
        else {
            printInt(0);

        }

    }

}
