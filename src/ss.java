import java.util.Arrays;
public class ss{
    public static void main(String[] args) {
        int[]arr={12,3,5,66,8888,2334,55,66,77,112};

        int answer=difcount(arr);
        System.out.println(answer);

    }
    static int difcount(int[]a){
        int count =0;
        for (int i = 0; i<a.length;i++){
            int dig=String.valueOf(a[i]).length();
            if(dig%2==0){
                count++;
            }
        }

       return count;


    }
}
