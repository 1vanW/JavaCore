package IOandNIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx {
    public static void main(String[] args) {
        try ( FileInputStream fileInputStream =
                      new FileInputStream("C:\\Users\\vinev\\Desktop\\pejzazhi-priroda-trava-xolmy-svet-utro-oblako-oblaka.jpg");
              FileOutputStream fileOutputStream = new FileOutputStream("java_pic.jpeg");

        ){
            int i;

            while((i = fileInputStream.read()) !=-1){
                fileOutputStream.write(i);
            }

            System.out.println("done!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
