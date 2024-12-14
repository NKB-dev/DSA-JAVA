import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Scanner hen = new Scanner(System.in);
        System.out.println("Enter the vlaues");

        int[][] array = new int[3][2];
        for(int row=0; row<array.length;row++){
            for(int col=0;col<array[row].length; col++){
                array[row][col]=hen.nextInt();
            }
        }
        System.out.println("Multidimensional array is " + Arrays.deepToString(array));


        //Enchanced for loop for printing the array
        for (int[] a: array){
            System.out.println(Arrays.toString(a));
        }
    }


}
