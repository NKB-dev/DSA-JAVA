import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Scanner hen = new Scanner(System.in);
//        System.out.println("Enter the no of element  of array");
//
//        int[]arr=new int[5];
//
//        for (int i=0; i<arr.length;i++ ){
//            arr[i]= hen.nextInt();
//        }
////        for (int i=0; i<arr.length;i++ ){
////            System.out.print(arr[i] + " " );
////
//        for (int num :arr){
//            System.out.println(num + " "); //ENCHANCED FOR LOOP FOR ABOVE ARRAY PRINTING LOOP

//
//        //}
//   int[][] arr= new int[2][2];
//   arr[0][0]=1;
//   arr[0][1]=16;
//   arr[1][0]=17;
//   arr[1][1]=51;
//        System.out.println((arr[1]));
//        int[][] ad = {{1,2,3},
//                       {2,3,4}
//        };
//        System.out.println(ad[1]);
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the array size(rows)");
        int arl = hi.nextInt();
        System.out.println("Enter the array size(cols)");
        int col= hi.nextInt();
        int[][]arr=new int[arl][col];

        for (int i=0; i<arl;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=hi.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(arr));

        int[] rr ;
        rr = new int[3];
        rr[0]=3;


    }
}