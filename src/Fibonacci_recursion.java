public class Fibonacci_recursion {
    public static void main(String[] args) {
        System.out.println(feb(5));

    }

    static int feb(int n){
        if(n<=1){
            return n;
        }
        else {
            return feb(n - 1) + feb(n - 2);
        }
    }
}
