package IOandNIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test10.txt");
        File folder = new File("C:\\Users\\vinev\\Desktop\\x");
        File file2 = new File("C:\\Users\\vinev\\Desktop\\x\\test20.txt");
        File folder2 = new File("C:\\Users\\vinev\\Desktop\\x\\z");


        System.out.println("Путь : " + file.getAbsolutePath());

        System.out.println("Путь : " + folder.getAbsolutePath());
        System.out.println("----");

        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());

        System.out.println("----");


        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());

        System.out.println("----");

        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println(file2.exists());

        System.out.println("----");

        System.out.println(file2.createNewFile());
        System.out.println(folder2.mkdir());

        System.out.println("----");
        System.out.println(file2.length());
        System.out.println("----");

        System.out.println(file2.delete());
        System.out.println(folder2.delete());

        System.out.println("----");

        File[] files = folder.listFiles();

        System.out.println(Arrays.toString(files));


        System.out.println("----");



    }
}
