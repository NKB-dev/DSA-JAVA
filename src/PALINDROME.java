public class PALINDROME {
    public static void main(String[] args) {
        String name="abcdefedcbx";
        System.out.println(PD(name));

    }
    static String PD(String A){
        A= A.toLowerCase();
       int s = 0;
       int e = A.length()-1;
        while(s<=e){
            if(A.charAt(s)==A.charAt(e)){
                s++;
                e--;
            }
            else{
                return "not a palindrome";
            }

        }
        return "its a palindrome";

    }
}
