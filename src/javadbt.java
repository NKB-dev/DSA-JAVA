public class javadbt {
    public static void main(String[] args) {
//
        num(3);

    }
    static void num(int n){
        if(n<0){
            return;
        }
        else {

            num(n-1);
            System.out.println(n);

            num(n-2);
            System.out.println(n);
        }
    }
}
