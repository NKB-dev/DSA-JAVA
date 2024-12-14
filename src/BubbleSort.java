//BINARY SEARCH
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[]y = {1,2,3,4,6,7};
     Bubblort(y);
        System.out.println(Arrays.toString(y));
    }


    static void Bubblort(int[] arr) {
        for(int i =0; i<arr.length;i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }

            }
        }


    }
}