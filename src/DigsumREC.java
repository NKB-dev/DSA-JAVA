public class DigsumREC {

    static int rev = 0;
    static int dsum(int n){

        if(n==0){
            return n;
        }
        else{
            int d = n%10;
            rev = rev *10 + d;
            return dsum(n/10) ;
        }
    }
    public static void main(String[] args) {
        dsum(5932);
        System.out.println(rev);


    }
}
