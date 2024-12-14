import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {23, 67, 8, 9, 12, 44};
        SS(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SS(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int l = arr.length - i - 1;
            int maxIndex = max(arr, l);

            // Swap the maximum element found with the element at the current last position
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[l];
            arr[l] = temp;
        }
    }

    static int max(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
