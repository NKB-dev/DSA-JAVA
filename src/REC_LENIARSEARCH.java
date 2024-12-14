import java.util.ArrayList;

import java.util.ArrayList;

public class REC_LENIARSEARCH {
    public static void main(String[] args) {
        int[] arr = {12, 35, 677, 8, 677,9, 73};    ;
        int t = 677;
        int n = 0;

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(ls(arr, t, n, list));
    }

    static ArrayList<Integer> ls(int[] arr, int t, int n, ArrayList<Integer> list) {
        if (n > arr.length - 1) {
            return list;
        } else if (t == arr[n]) {
            list.add(n);
        }
        return ls(arr, t, n + 1, list);
    }
}
