package IOandNIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\vinev\\Desktop\\x");

        Path destination = Paths.get("C:\\Users\\vinev\\Desktop\\copyHere");

        Files.walkFileTree(path,new MyFileVisitor2(path, destination));
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public MyFileVisitor2(Path source,Path destination){
        this.source = source;
        this.destination = destination;

    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir,newDestination,StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file,newDestination);
        return FileVisitResult.CONTINUE;
    }

}
