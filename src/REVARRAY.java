import java.util.Arrays;
public class REVARRAY {
    public static void main(String[]args){
        int[]xx={1,2,3,5,7,89,2};
        revarray(xx,0,xx.length-1);
       // System.out.println(Arrays.toString(xx));
        for(int i =0; i<xx.length;i++){
            System.out.print(xx[i]+" ");
        }
    }
    static int[] revarray(int[]arr,int s,int e){
        while(s<e){
            int temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }
        return arr;

    }

}
