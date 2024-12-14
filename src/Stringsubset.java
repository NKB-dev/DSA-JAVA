public class Stringsubset {
    public static void main(String[] args) {
        String str = "abc";
        substr("x",str);


    }
    static void substr(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);

            return;
        }
        else{
            char ch = up.charAt(0);
            System.out.println(p);
            System.out.println(up);
            substr(p+ch, up.substring(1));
            substr(p, up.substring(1));





        }

    }
}
