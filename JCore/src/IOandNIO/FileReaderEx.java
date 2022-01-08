package IOandNIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {


        try ( FileReader fileReader = new FileReader("C:\\Users\\vinev\\Desktop\\test.txt") ){
            int character;
            while((character = fileReader.read()) != -1){
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
