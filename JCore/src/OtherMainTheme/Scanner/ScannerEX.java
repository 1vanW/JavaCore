package OtherMainTheme.Scanner;

import java.util.Scanner;

public class ScannerEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Введите 2 числа");
//
//        int x = scan.nextInt();
//
//        int y = scan.nextInt();
//
//        System.out.println("Частное = " + x/y);
//        System.out.println("Остаток = " + x%y);

        System.out.println("Напишите пару слов");

        String str = scan.nextLine();

        System.out.println("Вы написали " + str);
    }
}
