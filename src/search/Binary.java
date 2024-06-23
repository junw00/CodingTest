package search;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 9, 10};
        System.out.println(binarySearch(arr, 6));
    }

    public static int binarySearch(int[] arr, int element){
        int startIdx = 0;
        int endIdx = arr.length - 1;

        while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;

            if(element == arr[midIdx]) {
                return midIdx;
            }else if(element > arr[midIdx]) {
                startIdx = midIdx + 1;
            }else if(element < arr[midIdx]) {
                endIdx = midIdx - 1;
            }
        }

        return -1;
    }
}
