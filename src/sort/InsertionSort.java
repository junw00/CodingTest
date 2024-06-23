package sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 선택 데이터
            int key = arr[i];
            //비교 데이터
            int j = i - 1;

            // 이전의 원소가 더 크다면 데이터는 하나씩 밀려난다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1}; //, 8, 6 ,5, 10};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
