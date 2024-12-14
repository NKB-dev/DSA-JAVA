public class revnum {
    public static void main(String[] args) {
        int ans = rev(89791);
        System.out.println(ans);

    }
    static int rev(int n){
       int revn = 0;
        while(n!=0){
            int d = n%10;
            revn= revn *10 + d;
            n = n/10;
        }
        return  revn;
    }
}
