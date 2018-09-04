package Arraysort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array [] = new int[30];
        Random random = new Random();
        for(int i= 0; i< array.length;i++)
        {
            array[i] = random.nextInt(100);
        }
        for (int x: array) {
            System.out.print(x + " ");

        }
        System.out.println();
        for (int y:bubbleSort(array)) {
            System.out.print(y + " ");
        }
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = arr.length - 1; i >= 0 ;--i)
        {
            for(int j = 0;j < i;j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
