package sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 선택 데이터
            int temp = arr[i];
            //비교 데이터
            int idx = i - 1;

            // 이전의 원소가 더 크다면 데이터는 하나씩 밀려난다.
            while (idx >= 0 && arr[idx] > temp) {
                arr[idx + 1] = arr[idx];
                idx--;
            }
            arr[idx + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 6 ,5, 10};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
