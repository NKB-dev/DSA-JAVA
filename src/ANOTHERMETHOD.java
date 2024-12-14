import com.sun.jdi.PathSearchingVirtualMachine;

public class ANOTHERMETHOD {
    public static void main(String[] args) {
        int num = 6;
        int n = 1;
        int f=1;
        fat(num,n,f);


    }
    static int  fat(int num, int n, int f){
        if(n==num+1){
            return f;
        }
        else{
            f=f*n;
            System.out.println(f);
            return fat(num,n+1,f);
        }
    }
}
