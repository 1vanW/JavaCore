package Regex;

import java.util.regex.Pattern;

public class CheckIP {
    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "192.202.91.05";

        CheckIP checkIP = new CheckIP();
        checkIP.checkIp(ip1);
        checkIP.checkIp(ip2);




    }

   void checkIp(String ip){
        String regex = "((25[0-5]|2(0-4)\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is ok " + Pattern.matches(regex,ip));


    }
}
