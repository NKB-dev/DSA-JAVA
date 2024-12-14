
//Question Find start and end index of an element in Array

import java.util.Arrays;
public class StartendIndex {
    public static void main(String[] args) {
        int[]arr={1,3,5,6,6,6,7,9};

      int sp=  search(arr,6,true);
      int ep= search(arr,6,false);
         int []ans={sp,ep};
        System.out.println(Arrays.toString(ans));

    }

    static int search(int[] arr, int t, boolean isl) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = (s + e) / 2; // Calculate middle in each iteration

            if (t < arr[m]) {
                e = m - 1;
            } else if (t > arr[m]) {
                s = m + 1;
            } else {
                ans=m;
                if(isl){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
               // Target found at index m
            }
        return ans;
        }
}
