public class recursion2 {
    public static void main(String[] args) {
       recf(8);
    }
    static void recf(int n){
        if (n==0){

            return ;
        }
        else{
            System.out.println(n);
             recf(--n);

        }
    }
}
