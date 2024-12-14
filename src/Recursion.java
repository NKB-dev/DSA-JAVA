public class Recursion {
    public static void main(String[] args) {
       m(0);

    }

    static void m(int n) {
        if(n==5) {
            return;
        }
        else{

        System.out.println(n);
        m(n+1);


       }

    }
//
//    static void m2() {
//        System.out.println("hello world");
//        m3();
//    }
//
//    static void m3() {
//        System.out.println("hello world");
//        m4();
//    }
//
//    static void m4() {
//        System.out.println("hello world");
//
//    }
}
