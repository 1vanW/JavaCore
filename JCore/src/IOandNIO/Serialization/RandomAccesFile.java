package IOandNIO.Serialization;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class RandomAccesFile {
    public static void main(String[] args) {

        try(RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt","rw");){


            String s = randomAccessFile.readLine();
            String str = new String(s.getBytes("ISO-8859-1"),"UTF-8");

            System.out.println(str);

            randomAccessFile.seek(0);

            randomAccessFile.writeBytes();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
