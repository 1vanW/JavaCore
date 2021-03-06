package IOandNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\vinev\\Desktop\\m");
        Path anotherPath = Paths.get("C:\\Users\\vinev\\Desktop\\m\\n\\z\\test20.txt");

        System.out.println("-----");

        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());

        System.out.println("-----");

        System.out.println(filePath.getParent());
        System.out.println(directoryPath.getParent());

        System.out.println("-----");

        System.out.println(filePath.getRoot());
        System.out.println(directoryPath.getRoot());

        System.out.println("-----");

        System.out.println(filePath.isAbsolute());
        System.out.println(directoryPath.isAbsolute());
        System.out.println("-----");

        System.out.println(filePath.toAbsolutePath());
        System.out.println(directoryPath.toAbsolutePath());

        System.out.println("-----");

        System.out.println(filePath.toAbsolutePath().getParent());

        System.out.println(directoryPath.toAbsolutePath().getParent());

        System.out.println("-----");

        System.out.println(directoryPath.relativize(anotherPath));

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        if (!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
        }

        System.out.println("-----");


        System.out.println(Files.isReadable(filePath));

        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));

        Path pathFile = Paths.get(filePath.toFile().getAbsolutePath());
        System.out.println("-----");
        System.out.println(Files.isSameFile(filePath,pathFile));

        System.out.println("-----");
        System.out.println(Files.size(filePath));


        System.out.println("-----");
        System.out.println(Files.getAttribute(filePath,"size"));

        System.out.println("-----");

        Map<String,Object> attributes = Files.readAttributes(filePath,"*");

        for (Map.Entry<String,Object> entry: attributes.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }




    }

}
