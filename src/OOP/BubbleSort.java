package OOP;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {7, 2, 19, 2, 4, 28};

        for (int i = arr.length - 1; i > 0; i--) { // количество проходов по массиву

            for (int j = 0; j < i; j++) { // сравнение пар
                if (arr[j] > arr[j + 1]) {

                    //  swap(arr , j);
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        for (int i = 0; i != arr.length; i++) {
            System.out.println(i + " = " + arr[i] + " ");
        }
    }

}


