package sort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int temp = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++) {
            int idx = i;

            for(int j = i; j < arr.length; j++) {
                if(temp >= arr[j]) {
                    temp = arr[j];
                    idx = j;
                }
            }
            arr[idx] = arr[i];
            arr[i] = temp;
            temp = Integer.MAX_VALUE;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 6, 5 ,4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
