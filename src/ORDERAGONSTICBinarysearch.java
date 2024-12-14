public class ORDERAGONSTICBinarysearch {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 8, 9, 11, 22, 55, 100};
        int[]arr={100,55,22,11,9,8,4,3,2,1};
        if (arr[0]<arr[arr.length-1]) {


            int ans = Abs(arr, 11); // Target element
            System.out.println(ans);
        }
        else{
            int ans = Dbs(arr, 11); // Target element
            System.out.println(ans);
        }
    }

    static int Abs(int[] arr, int t)// Ascending array
    {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;  //or  mid = start + (end - start)/2   Calculate middle in each iteration

            if (t < arr[m]) {
                e = m - 1;
            } else if (t > arr[m]) {
                s = m + 1;
            } else {
                return m; // Target found at index m
            }
        }
        return -1; // Target not found
    }

    static int Dbs(int[] arr, int t)// DESCENDING array
    {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;  //or  mid = start + (end - start)/2   Calculate middle in each iteration

            if (t < arr[m]) {
                s = m + 1;
            } else if (t > arr[m]) {
                e = m - 1;
            } else {
                return m; // Target found at index m
            }
        }
        return -1; // Target not found
    }
}
