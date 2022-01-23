package Regex;

public class RegexEx4 {
    public static void main(String[] args) {
        String s1 = "Privet,    moi drug! Kak idet izuchenie     JAVA      ?";

        System.out.println(s1);

        s1= s1.replaceFirst("\\bi\\w+","4444");



        System.out.println(s1);
    }
}
