package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCDE ABCDF ABCDJ";
//
//        Pattern pattern1 = Pattern.compile("ABCD");

//        String s1 = "abcd abcde abc5abcg";
//
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");


//        String s1 = "abcd abcde abc5abcg";
//
//       Pattern pattern1 = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abcde abc5abcg";
//
//        Pattern pattern1 = Pattern.compile("abc.");

//        String s1 = "abcd abcde abc5abcg";
//
//        Pattern pattern1 = Pattern.compile("g$");

//        String s1 = "abcd abcde abc5abc6g";
//
//        Pattern pattern1 = Pattern.compile("\\w"); [A-Za-z0-9]

//        String s1 = "abcd abcde abc5abc6g";
//
//        Pattern pattern1 = Pattern.compile("\\w+");

//        String s1 = "abcd1?abcde====== +++abc5abc6g";
//
//        Pattern pattern1 = Pattern.compile("\\W");

//        String s1 = "poka abc vano dom kino abstract ";

//        Pattern pattern1 = Pattern.compile("\\w{4}");
//       Pattern pattern1 = Pattern.compile("\\w\\S+\\w");

//        String s1 = "ABCABCABC";
//
//       Pattern pattern1 = Pattern.compile("(AB)[2-3]");


//        String s1 = "BACBACACABCACNBC";
//
//        Pattern pattern1 = Pattern.compile("(AC)");

        String s1 = "abcd abcde abc5abc6g";

       Pattern pattern1 = Pattern.compile("!g\\Z");










        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()){
            System.out.println("position : " + matcher.start() + " " + matcher.group());
        }
    }
}
