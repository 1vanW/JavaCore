public class reverseString {
    public static void main(String[] args) {

        String str ="Ivan";

        System.out.println(reverseStr(str));



    }

    public static String reverse(String  s){
        char [] charRev = s.toCharArray();
        String reverse ="";
        for (int i = s.length()-1; i>=0;i--){
            reverse = reverse + charRev[i];

        }

        return reverse;

    }


    public static StringBuilder reverseStr(String s){

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse();
    }
}
