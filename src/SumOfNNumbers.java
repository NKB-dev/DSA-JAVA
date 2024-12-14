public class SumOfNNumbers {
    public static void main(String[] args) {
        int num=100;
        int sum = 0;
        int n=1;
//        for(int i=1;i<=n;i++){
//            sum = sum+a;
//            a++;
//
//        }
//        System.out.println(sum);
        System.out.println( sumn(n,sum,num));


    }
    static int sumn(int n,int sum, int num){
        if( n==num+1){
            return sum;
        }
        else{
           // System.out.println( sum=sum+n);
            sum = sum+n;
            return sumn(n+1,sum,num);
        }
    }
}