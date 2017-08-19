package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] tab = {12,34,45,65,76,87,56,4,3,2,8,8,8,9};
        int temp;
        int change = 1;

        while(change > 0){
            change = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    change++;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }
    }

