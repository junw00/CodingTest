package sort;

import java.util.Arrays;

public class QuickSort {

    public static void swapElement(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int partition(int[] arr, int start, int end) {
        int s = start;
        int b = start;
        int pivot = end;

        for(int i = start; i < end; i++) {
            if(arr[i] <= arr[end]){
                swapElement(arr, s, b);
                b += 1;
            }
            s += 1;
        }
        swapElement(arr, b, pivot);
        pivot = b;
        return pivot;
    }

    public static void quickSort(int[] arr, int start, int end){
        //base case
        if(end - start < 1) {
            return;
        }

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
    public static void main(String[] args) {
        int[] arr = {128, 13, 9, 30, 1, 48, 5, 7, 15};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
