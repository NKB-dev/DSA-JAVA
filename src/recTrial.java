public class recTrial {
    public static void main(String[] args) {
        rec(0);

    }

    static void rec(int n){
        if(n==21){
            return;
        }else {
            System.out.println(n);
            rec(n + 1);
        }

    }
}
