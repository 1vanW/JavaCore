package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx5 {
    public static void main(String[] args) {
            String text = "12334456676754380912456;";


        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");

        Matcher matcher = pattern.matcher(text);

//        String newString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//
//        System.out.println(newString);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
