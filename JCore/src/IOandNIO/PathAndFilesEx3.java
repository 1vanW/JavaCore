package IOandNIO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//
//        String dialog ="- Hello" +
//                " How are you?" +
//                " I`m ok";
//
//        Files.write(filePath,dialog.getBytes());

       List<String> str = Files.readAllLines(filePath);

        for(String s: str){
            System.out.println(s);
        }



    }
}
