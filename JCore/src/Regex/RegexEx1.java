package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
        String text = " Hohryakov Ivan , Russia , Izhevsk, 50 let Pioneri, 35-70 "+
                "vinevega99@gmail.com, postcode: 420430, phone number: +79124574689"+
                " Hohryakova Anna , Russia , Izhevsk, 50 let Pioneri, 35-70 "+
                "annahohrakova@gmail.com, postcode: 420430, phone number: +79124476009";

//        Pattern pattern = Pattern.compile("\\w+");

//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");

//        Pattern pattern = Pattern.compile("\\+\\d{9}");

//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");

        Pattern pattern = Pattern.compile("\\w\\s+\\w");

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
