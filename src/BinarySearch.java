//question to find whether a given target value is present in the array if present return the index of the target in array
//else if target not found return the smallest element that is greater that the traget from array

import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 9, 11, 22, 55, 100};
        int ans = bs(arr, 15); // Target element
        System.out.println(ans);
    }

    static int bs(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2; // Calculate middle in each iteration

            if (t < arr[m]) {
                e = m - 1;
            } else if (t > arr[m]) {
                s = m + 1;
            } else {
                return m; // Target found at index m
            }
        }
        return arr[s]; // Target not found when we ask to return the arr[start] here ,
        // since the target is not in the array it return the number just greater than target in array
        //similarly if we ask to return arr[end] here we get the element just less than the target in
        //the given array
    }
}
