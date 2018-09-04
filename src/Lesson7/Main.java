package Lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int [7];
        int [] evenArray = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length; i++ )
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
            {
                evenArray[i] = arr[i];
            }
        }
        Arrays.sort(evenArray);
        for (int s: evenArray) {
            if (s != 0) {
                System.out.println(s);
            }
        }

    }
}