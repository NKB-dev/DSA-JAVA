public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 4, 1};
        int t = 3; // target value
        int p = Peak(arr); // Find peak index
        int a = bsA(arr, t, p); // Search in ascending part
        int b = Dbs(arr, t, p); // Search in descending part

        if (a != -1) {
            System.out.println("Target found at index: " + a);
        } else if (b != -1) {
            System.out.println("Target found at index: " + b);
        } else {
            System.out.println("Target not found in the array.");
        }

    }
    // Method to find the peak of the bitonic array
    static int Peak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = (s + e) / 2;
            if (arr[m] > arr[m + 1]) {
                e = m; // Peak is in the left half
            } else {
                s = m + 1; // Peak is in the right half
            }
        }
        return s; // Peak index
    }

    // Binary search for the target in the ascending part
    static int bsA(int[] arr, int t, int p) {
        int s = 0;
        int e = p;
        while (s <= e) {
            int m = (s + e) / 2;
            if (t < arr[m]) {
                e = m - 1;
            } else if (t > arr[m]) {
                s = m + 1;
            } else {
                return m; // Target found
            }
        }
        return -1; // Target not found
    }

    // Binary search for the target in the descending part
    static int Dbs(int[] arr, int t, int p) {
        int s = p;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (t < arr[m]) {
                s = m + 1;
            } else if (t > arr[m]) {
                e = m - 1;
            } else {
                return m; // Target found
            }
        }
        return -1; // Target not found
    }
}
