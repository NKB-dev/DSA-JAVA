import java.util.Arrays;
import java.util.Scanner;
public class atrialarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5};
        int[] array=new int[8];
        Scanner h= new Scanner(System.in);



        for(int i =0;i<array.length;i++){
            array[i] =  h.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
