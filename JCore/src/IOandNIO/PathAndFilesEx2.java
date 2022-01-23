package IOandNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\vinev\\Desktop\\m");

        Path directoryXPath = Path.of("C:\\Users\\vinev\\Desktop\\m\\test15.txt");

        System.out.println("-----");


//        Files.copy(filePath,directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
////        Files.copy(filePath,directoryPath.resolve("test16.txt"));
//        System.out.println("Done");
//
//        System.out.println("-----");
//
//        Files.copy(directoryXPath, directoryPath.resolve("B"));
//
//        System.out.println("Done");

        System.out.println("-----");

//        Files.move(filePath,directoryPath.resolve("test15.txt"));

//        System.out.println("-----");

//        Files.move((Paths.get("test10.txt")),(Path.of("test11.txt")) );


//        Files.delete(Path.of("test5.txt"));

        Files.delete(directoryXPath);
        Files.delete(directoryPath);



    }
}
