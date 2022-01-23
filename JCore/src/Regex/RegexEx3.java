package Regex;

import java.util.Arrays;

public class RegexEx3 {
    public static void main(String[] args) {
        String text = "Hohryakov Ivan , Russia , Izhevsk, 50 let Pioneri, 35-70 "+
                "vinevega99@gmail.com, postcode: 420430, phone number: +79124574689"+
                " Hohryakova Anna , Russia , Izhevsk, 50 let Pioneri, 35-70 "+
                "annahohrakova@gmail.com, postcode: 420430, phone number: +79124476009";

        String s2 = "annahohrakova@gmail.com";

        boolean result =  s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] arr = text.split(" ");

        System.out.println(Arrays.toString(arr));
    }
}
