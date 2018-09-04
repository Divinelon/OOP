package OOP;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        System.out.println(4 + 4 + '4' + 4 + 4); //68
//        System.out.println(4 + 4 + (int)'4'+ 4 + 4); //68
//        System.out.println(4 + 4 + "4" + 4 + 4);//8444
//        System.out.println(4 + 4 + "4" + 4 + 4 +'4'+ 4 + 4);//8444444
//        System.out.println(4 + 4 + "4" +4 + 4 +(int)'4' + 4 + 4);//84445244

        int arr [] = {0,1,2,3,4,5,6,7,8,9};
        if(binarySearch(arr,6)){
            System.out.println("Found 6 int list");
        }
        if(!binarySearch(arr,200)){
            System.out.println("Didn't find 200 in list");
        }

    }

    private static boolean binarySearch(int [] arr,int key){
        int first = 0;
        int last = arr.length - 1;
        int middle = (first + last) /2;
        while(first <= last)
        {
            if(arr[middle] < key){
                first = middle + 1;
            }
            else if(arr[middle] == key){
                return true;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return false;
    }




}