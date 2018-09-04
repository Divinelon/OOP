package Binary_and_linear_searches;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array [] = new int[1000];

        for (int i = 0; i < array.length ; i++) {
            array[i] = i;
        }
        Random random = new Random();
        int key = random.nextInt(1000);
        System.out.println(key );

        linearSearch(array,key);
        binarySearch(array,key);

    }
//Linear search
    private static boolean linearSearch(int [] arr , int key){
        int counter = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("This key was found with " + counter + " attemp");
                    return true;
                } else {
                    counter++;
                    continue;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
            return false;
    }
//Binary search
    private static boolean binarySearch(int [] array , int key){
        int min = 0 , max = array.length - 1 , mid = (min + max)/2, counter = 0;
        while (min <= max){
            if(array[mid] < key){
                min = mid + 1;
                counter++;
            }
            else if(array[mid] == key)
            {
                System.out.println("The element was found in " + counter + "(st|th) attempt");
                return true;
            }
            else{
                max = mid - 1;
                counter++;
            }
            mid = (min + max)/2;
        }
        return false;
    }
}
